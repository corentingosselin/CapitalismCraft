package fr.cocoraid.capitalismcraft.skin.inventory.select;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinManager;
import fr.cocoraid.capitalismcraft.utils.Heads;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import fr.minuskube.inv.content.Pagination;
import fr.minuskube.inv.content.SlotIterator;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkinsInventory implements InventoryProvider {

    private static SkinManager skinManager = CapitalismCraft.getInstance().getSkinManager();

    public static SmartInventory getInventory(Rank rank) {
        return SmartInventory.builder()
                .provider(new SkinsInventory(rank))
                .size(6, 9)
                .title("§7Collection de skin " + rank.getName())
                .build();
    }

    private Rank rank;
    public SkinsInventory(Rank rank) {
        this.rank = rank;
    }


    @Override
    public void init(Player player, InventoryContents contents) {

        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        Pagination pagination = contents.pagination();
        Gender gender =  cp.getPlayerdata().getGender();
        List<Skin> skins = Skin.getSkins().stream()
                .filter(s -> s.getRank() == rank)
                .filter(s -> player.hasPermission("cc.admin")
                        || s.getRarity() == SkinRarity.DEFAULT
                        || cp.getPlayerdata().getSkinsPurchased().contains(s.getId()))
                .filter(s -> s.getId() != cp.getPlayerdata().getCurrentSkin())
                .filter(s -> s.getGender() == gender)
                .collect(Collectors.toList());
        ClickableItem[] items = new ClickableItem[skins.size()];
        for (int i = 0; i < items.length; i++) {
            Skin skin = skins.get(i);
            ItemStack item = skin.getHeadDisplay().clone();
            ItemMeta meta = item.getItemMeta();
            meta.setLore(Arrays.asList("§3Vous possédez ce skin"));
            item.setItemMeta(meta);

            items[i] = ClickableItem.of(item, e -> {
                player.closeInventory();
                if(System.currentTimeMillis() < (cp.getLastTimeSkinChanged() + (1000 * 60 * 30)) && cp.getLastTimeSkinChanged() != 0) {
                    player.sendMessage("§4Erreur: §cNous somme navré, le changement de skin n'est autorisé que toutes les 30 minutes...");
                    return;
                }
                if(!player.hasPermission("cc.admin"))
                    cp.setLastTimeSkinChanged(System.currentTimeMillis());

                cp.getPlayerdata().setCurrentSkin(skin.getId());
                skinManager.setSkin(skin,player);
                skinManager.updatePlayerSkin(player);
                player.sendMessage("§3Votre skin a été modifié avec succès !");

            });

        }




        pagination.setItems(items);
        pagination.setItemsPerPage(14);

        SlotIterator si = contents.newIterator(SlotIterator.Type.HORIZONTAL, 1, 1);
        si.blacklist(1,8);
        si.blacklist(2,0);
        pagination.addToIterator(si);


        if(!pagination.isFirst()) {
            contents.set(4, 2, ClickableItem.of(Heads.ARROW_LEFT,
                    e -> getInventory(rank).open(player, pagination.previous().getPage())));
        } else {
            contents.set(4, 2, ClickableItem.of(Heads.ARROW_LEFT,
                    e -> cp.getPreviousInventory().open(player,cp.getLastPage())));
        }

        if(cp.getPlayerdata().getCurrentSkin() != -1) {
            ItemStack item = Skin.getSkins().get(cp.getPlayerdata().getCurrentSkin()).getHeadDisplay().clone();
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName("§2Vous portez ce skin");
            meta.setLore(null);
            item.setItemMeta(meta);
            contents.set(4,4, ClickableItem.empty(item));
        }



        if(!pagination.isLast()) {
            contents.set(4, 6, ClickableItem.of(Heads.ARROW_RIGHT,
                    e -> getInventory(rank).open(player, pagination.next().getPage())));
        }

    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }

}

