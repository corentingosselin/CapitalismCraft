package fr.cocoraid.capitalismcraft.skin.inventory;

import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.utils.Heads;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import fr.minuskube.inv.content.Pagination;
import fr.minuskube.inv.content.SlotIterator;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RankSkinInventory implements InventoryProvider {

    public static final SmartInventory INVENTORY = SmartInventory.builder()
            .id("rankskinInv")
            .provider(new RankSkinInventory())
            .size(4, 9)
            .title(ChatColor.GRAY + "Achat de skins")
            .build();





    @Override
    public void init(Player player, InventoryContents contents) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        Pagination pagination = contents.pagination();

        int ranksAmount = 0;
        for (Rank rank : Rank.values()) {
            if(player.hasPermission("cc." + rank.name().toLowerCase()))
                ranksAmount++;
        }

        ClickableItem[] items = new ClickableItem[ranksAmount];
        for(int i = 0; i < items.length; i++) {
            //get random skin rank
            final int index = i;
            Rank r = Rank.values()[i];
            Skin skin;
            if(r == Rank.MINEUR)
                skin = Skin.getSkins().stream()
                        .filter(s -> s.getGender() == cp.getPlayerdata().getGender())
                        .filter(s -> s.getRank() == Rank.HABITANT).collect(Collectors.toList()).get(1);
            else if(r == Rank.VILLAGEOIS)
                skin = Skin.getSkins().stream()
                        .filter(s -> s.getGender() == cp.getPlayerdata().getGender())
                        .filter(s -> s.getRank() == Rank.HABITANT).collect(Collectors.toList()).get(2);
            else
                skin = Skin.getSkins().stream()
                        .filter(s -> s.getGender() == cp.getPlayerdata().getGender())
                        .filter(s -> s.getRank() == r ).findFirst().orElse(null);
            if(skin != null) {
                ItemStack item = skin.getHeadDisplay().clone();
                ItemMeta meta = item.getItemMeta();
                if(r == Rank.VILLAGEOIS)
                    meta.setDisplayName("§6Villageois");
                int skinAmount = Skin.getSkins().stream()
                        .filter(s -> s.getGender() == cp.getPlayerdata().getGender())
                        .filter(s -> s.getRank() == r || (s.getRank() == Rank.HABITANT && r == Rank.MINEUR) || (s.getRank() == Rank.HABITANT && r == Rank.VILLAGEOIS) ).collect(Collectors.toList()).size();
                meta.setLore(Arrays.asList("§3Nombre de skin: §b" + skinAmount));
                item.setItemMeta(meta);
                items[i] = ClickableItem.of(item,  e -> {
                    SkinPurchaseInventory.getInventory(r).open(player);
                });
            }
        }

        pagination.setItems(items);
        pagination.setItemsPerPage(7);

        pagination.addToIterator(contents.newIterator(SlotIterator.Type.HORIZONTAL, 1, 1));

        if(!pagination.isFirst()) {
            contents.set(3, 3, ClickableItem.of(Heads.ARROW_LEFT,
                    e -> {
                        INVENTORY.open(player, pagination.previous().getPage());
                    }));
        }
        if(!pagination.isLast()) {
            contents.set(3, 5, ClickableItem.of(Heads.ARROW_RIGHT,
                    e -> {
                        INVENTORY.open(player, pagination.next().getPage());
                    }));
        }
    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }

}
