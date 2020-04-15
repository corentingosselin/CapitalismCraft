package fr.cocoraid.capitalismcraft.skin.inventory;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RankSkinInventory implements InventoryProvider {

    public static final SmartInventory INVENTORY = SmartInventory.builder()
            .id("myInventory")
            .provider(new RankSkinInventory())
            .size(3, 9)
            .title(ChatColor.BLUE + "My Awesome Inventory!")
            .build();



    @Override
    public void init(Player player, InventoryContents contents) {
        contents.fillBorders(ClickableItem.empty(new ItemStack(Material.BLACK_STAINED_GLASS_PANE)));

        contents.set(1, 1, ClickableItem.of(new ItemStack(Material.STONE_AXE),
                e -> player.sendMessage(ChatColor.GOLD + "You clicked on a stone axe.")));

        contents.set(1, 7, ClickableItem.of(new ItemStack(Material.BARRIER),
                e -> player.closeInventory()));
    }

    @Override
    public void update(Player player, InventoryContents contents) {
        int state = contents.property("state", 0);
        contents.setProperty("state", state + 1);

        if(state % 5 != 0)
            return;

    }

}
