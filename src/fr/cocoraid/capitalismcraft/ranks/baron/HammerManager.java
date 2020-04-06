package fr.cocoraid.capitalismcraft.ranks.baron;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class HammerManager {

    private ItemStack hammer =  new ItemStack(Material.STONE_AXE);
    {
        hammer.addUnsafeEnchantment(Enchantment.MENDING,1);
        hammer.addUnsafeEnchantment(Enchantment.DURABILITY,10);
        ItemMeta meta = hammer.getItemMeta();
        meta.setDisplayName("§cLe marteau du Baron");
        meta.setLore(Arrays.asList("§7Casse les blocks en 5x5", "Durabilité: 10000/10000"));
        hammer.setItemMeta(meta);

    }

    private CapitalismCraft instance;
    public HammerManager(CapitalismCraft instance) {
        this.instance = instance;
    }


    public void setup() {

        try {
            NamespacedKey drillerKey = new NamespacedKey(instance, "hammer");
            ShapedRecipe drillerRecipe = new ShapedRecipe(drillerKey, hammer);
            drillerRecipe.shape(
                    "OEO"
                    , " B "
                    , " B ");
            drillerRecipe.setIngredient('O', Material.OBSIDIAN);
            drillerRecipe.setIngredient('E', Material.DRAGON_HEAD);
            drillerRecipe.setIngredient('B', Material.BLAZE_ROD);
            Bukkit.addRecipe(drillerRecipe);

        } catch (IllegalStateException e) {}
        Bukkit.getPluginManager().registerEvents(new HammerListener(this),instance);
    }

    public CapitalismCraft getInstance() {
        return instance;
    }

    public ItemStack getHammer() {
        return hammer;
    }
}
