package fr.cocoraid.capitalismcraft.skin.inventory.select;

import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.inventory.purchase.SkinPurchaseInventory;
import fr.cocoraid.capitalismcraft.utils.Heads;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import fr.minuskube.inv.content.Pagination;
import fr.minuskube.inv.content.SlotIterator;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RankSkinInventory implements InventoryProvider {

    public static final SmartInventory INVENTORY = SmartInventory.builder()
            .provider(new RankSkinInventory())
            .size(4, 9)
            .title(ChatColor.GRAY + "Selection des skins")
            .build();



    @Override
    public void init(Player player, InventoryContents contents) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        Pagination pagination = contents.pagination();





        ClickableItem[] items = new ClickableItem[Rank.values().length];
        for(int i = 0; i < items.length; i++) {
            Rank r = Rank.values()[i];
            Skin skin = Skin.getSkins().stream()
                    .filter(s -> s.getGender() == cp.getPlayerdata().getGender())
                    .filter(s -> s.getRank() == r).findFirst().orElse(null);
            if(skin != null) {
                ItemStack item = null;
                ItemMeta meta = item.getItemMeta();
                if(player.hasPermission(r.getPermission())
                        && Skin.getSkins().stream().filter(s ->
                                s.getRarity() == SkinRarity.DEFAULT ||
                        cp.getPlayerdata().getSkinsPurchased().contains(s.getId())).findAny().isPresent())
                item = skin.getHeadDisplay().clone();
                else {
                    item = new ItemStack(Material.GRAY_DYE);
                    meta.setDisplayName(skin.getHeadDisplay().getItemMeta().getDisplayName());
                    meta.setLore(Arrays.asList("§cVous n'avez pas accès aux skins de ce grade",
                            "§cOu vous n'avez pas de skins pour ce grade"));
                }
                int skinAmount = Skin.getSkins().stream()
                        .filter(s -> s.getRarity() == SkinRarity.DEFAULT || cp.getPlayerdata().getSkinsPurchased().contains(s.getId()))
                        .filter(s -> s.getGender() == cp.getPlayerdata().getGender())
                        .filter(s -> s.getRank() == r).collect(Collectors.toList()).size();
                meta.setLore(Arrays.asList("§3Nombre de skin: §b" + skinAmount));
                item.setItemMeta(meta);
                items[i] = ClickableItem.of(item,  e -> {
                    cp.setPreviousInventory(INVENTORY);
                    cp.setLastPage(pagination.getPage());
                    SkinsInventory.getInventory(r).open(player);
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
