package fr.cocoraid.capitalismcraft.skin.inventory;

import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.utils.Heads;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import fr.minuskube.inv.content.Pagination;
import fr.minuskube.inv.content.SlotIterator;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.stream.Collectors;

public class SkinPurchaseInventory implements InventoryProvider {


    public static SmartInventory getInventory(Rank rank) {
        return SmartInventory.builder()
                .provider(new SkinPurchaseInventory(rank))
                .size(6, 9)
                .title("§7Achat des skins " + rank.getName())
                .build();
    }

    private Rank rank;
    public SkinPurchaseInventory(Rank rank) {

        this.rank = rank;
    }


    @Override
    public void init(Player player, InventoryContents contents) {

        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        Pagination pagination = contents.pagination();
        Gender gender =  cp.getPlayerdata().getGender();

        List<Skin> skins = Skin.getSkins().stream()
                .filter(s -> s.getRank() == rank || (s.getRank() == Rank.HABITANT && rank == Rank.MINEUR) || (s.getRank() == Rank.HABITANT && rank == Rank.VILLAGEOIS))
                .filter(s -> !cp.getPlayerdata().getSkinsPurchased().contains(s.getId()))
                .filter(s -> s.getGender() == gender)
                .collect(Collectors.toList());
        ClickableItem[] items = new ClickableItem[skins.size()];
        for (int i = 0; i < items.length; i++) {
            Skin skin = skins.get(i);
            items[i] = ClickableItem.of(skin.getHeadDisplay(), e -> {
                //open confirm purchase
                PurchaseConfirmInventory.getInventory(skin.getId(),skin.getRarity().getPrice(),skin.getHeadDisplay()).open(player);
            });

            pagination.setItems(items);
            pagination.setItemsPerPage(14);

            SlotIterator si =contents.newIterator(SlotIterator.Type.HORIZONTAL, 1, 1);
            si.blacklist(1,8);
            si.blacklist(2,0);
            pagination.addToIterator(si);


            if(!pagination.isFirst()) {
                contents.set(4, 3, ClickableItem.of(Heads.ARROW_LEFT,
                        e -> getInventory(rank).open(player, pagination.previous().getPage())));
            } else {
                contents.set(4, 3, ClickableItem.of(Heads.ARROW_LEFT,
                        e -> {
                            RankSkinInventory.INVENTORY.open(player);
                        }));
            }

            if(!pagination.isLast()) {
                contents.set(4, 5, ClickableItem.of(Heads.ARROW_RIGHT,
                        e -> getInventory(rank).open(player, pagination.next().getPage())));
            }
        }
    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }

}
