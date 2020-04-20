package fr.cocoraid.capitalismcraft.utils;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class Utils {



    private static final String DECIMAL_FORMAT = "###,###.#";
    public static String formatValue(Number value) {
        DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        formatSymbols.setDecimalSeparator('.');
        formatSymbols.setGroupingSeparator(' ');
        DecimalFormat formatter = new DecimalFormat(DECIMAL_FORMAT, formatSymbols);
        return formatter.format(value);
    }

    public static void sendMessageCommand(Player p, String msg, String cmd) {
        TextComponent message = new TextComponent(msg );
        message.setClickEvent( new ClickEvent( ClickEvent.Action.RUN_COMMAND, "/" + cmd));
        p.spigot().sendMessage( message );
    }


    public static ItemStack addLore(ItemStack item, String... lore) {
        ItemMeta meta = item.getItemMeta();
        List<String> lores = meta.getLore();
        lores.addAll(Arrays.asList(lore));
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createSkull(String displayname, List<String> lores, String url) {
        ItemStack item = skullTextured(url);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayname);
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack skullTextured( String base64) {
        ItemStack item = new ItemStack(Material.PLAYER_HEAD);
        UUID hashAsId = new UUID(base64.hashCode(), base64.hashCode());
        ItemStack newItem = Bukkit.getUnsafe().modifyItemStack(item,
                "{SkullOwner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + base64 + "\"}]}}}"
        );
        newItem.setItemMeta(item.getItemMeta());
        return newItem;
    }

    public static void sendActionBar(Player p, String msg) {
        p.spigot().sendMessage(ChatMessageType.ACTION_BAR,new TextComponent(msg));
    }

    public static List<Block> getSquare(Location location, int radius) {
        List<Block> blocks = new ArrayList<>();
        for(int x = location.getBlockX() - radius; x <= location.getBlockX() + radius; x++) {
            for(int z = location.getBlockZ() - radius; z <= location.getBlockZ() + radius; z++) {
                blocks.add(location.getWorld().getBlockAt(x,location.getBlockY(),  z));
            }
        }
        return blocks;
    }

    public static List<Block> getSquareRotation(Location loc, BlockFace face) {
        List<Block> blocks = getSquare(loc,2);
        if(face == BlockFace.UP || face == BlockFace.DOWN) {
            return blocks;
        } else {
            List<Block> rotated = new ArrayList<>();
            blocks.forEach(b -> {
                Location center = loc.clone();
                Vector v = b.getLocation().toVector().subtract(loc.toVector());
                if(face == BlockFace.NORTH || face == BlockFace.SOUTH)
                    Utils.rotateAroundAxisX(v, Math.toRadians(90));
                else
                    Utils.rotateAroundAxisZ(v, Math.toRadians(90));
                Block newBlock = center.add(v).getBlock();
                rotated.add(newBlock);
            });
            return rotated;
        }

    }


    public static Vector getBumpVector(final Entity entity, final Location from, final double power) {
        final Vector bump = entity.getLocation().toVector().subtract(from.toVector()).normalize();
        if (Double.isNaN(bump.getX())) {
            bump.setX(0);
        }
        if (Double.isNaN(bump.getZ())) {
            bump.setZ(0);
        }
        if (Double.isNaN(bump.getY())) {
            bump.setY(0);
        }
        bump.multiply(power);
        return bump;
    }

    public static boolean isSmilar(ItemStack itemA, ItemStack itemB) {
        return itemA.hasItemMeta() && itemB.hasItemMeta() && itemA.getItemMeta().getDisplayName().equals(itemB.getItemMeta().getDisplayName());
    }

    public static void bumpEntity(final Entity entity, final Location from, final double power) {
        entity.setVelocity(getBumpVector(entity, from, power));
    }

    public static void bumpEntity(final Entity entity, final Location from, final double power, final double fixedY) {
        if (entity instanceof Player && entity.hasMetadata("NPC")) {
            return;
        }
        final Vector vector = getBumpVector(entity, from, power);
        vector.setY(fixedY);
        entity.setVelocity(vector);
    }

    /**
     * Gets the BlockFace of the block the player is currently targeting.
     *
     * @param player the player's whos targeted blocks BlockFace is to be checked.
     * @return the BlockFace of the targeted block, or null if the targeted block is non-occluding.
     */
    public static BlockFace getBlockFace(Player player) {
        List<Block> lastTwoTargetBlocks = player.getLastTwoTargetBlocks(null, 100);
        if (lastTwoTargetBlocks.size() != 2 || !lastTwoTargetBlocks.get(1).getType().isOccluding()) return null;
        Block targetBlock = lastTwoTargetBlocks.get(1);
        Block adjacentBlock = lastTwoTargetBlocks.get(0);
        return targetBlock.getFace(adjacentBlock);
    }

    /**
     * Util convert
     * @return f
     */
    public static byte toPackedByte(float f) {
        return (byte) ((int) (f * 256.0F / 360.0F));
    }

    /**
     * Vecteur qui s'update autour de l'axe X avec un angle
     * @param v
     * @param angle
     * @return
     */
    public static final Vector rotateAroundAxisX(Vector v, double angle) {
        double y, z, cos, sin;
        cos = Math.cos(angle);
        sin = Math.sin(angle);
        y = v.getY() * cos - v.getZ() * sin;
        z = v.getY() * sin + v.getZ() * cos;
        return v.setY(y).setZ(z);
    }

    /**
     * Vecteur qui s'update autour de l'axe Y avec un angle
     * @param v
     * @param angle
     * @return
     */
    public static final Vector rotateAroundAxisY(Vector v, double angle) {
        double x, z, cos, sin;
        cos = Math.cos(angle);
        sin = Math.sin(angle);
        x = v.getX() * cos + v.getZ() * sin;
        z = v.getX() * -sin + v.getZ() * cos;
        return v.setX(x).setZ(z);
    }

    /**
     * Vecteur qui s'update autour de l'axe Z avec un angle
     * @param v
     * @param angle
     * @return
     */
    public static final Vector rotateAroundAxisZ(Vector v, double angle) {
        double x, y, cos, sin;
        cos = Math.cos(angle);
        sin = Math.sin(angle);
        x = v.getX() * cos - v.getY() * sin;
        y = v.getX() * sin + v.getY() * cos;
        return v.setX(x).setY(y);
    }


    public static Entity[] getNearbyEntities(Location l, int radius) {
        int chunkRadius = radius < 16 ? 1 : (radius - (radius % 16)) / 16;
        HashSet<Entity> radiusEntities = new HashSet<Entity>();
        for (int chX = 0 - chunkRadius; chX <= chunkRadius; chX++) {
            for (int chZ = 0 - chunkRadius; chZ <= chunkRadius; chZ++) {
                int x = (int) l.getX(), y = (int) l.getY(), z = (int) l.getZ();
                for (Entity e : new Location(l.getWorld(), x + (chX * 16), y, z + (chZ * 16)).getChunk().getEntities()) {
                    if (e.getLocation().distance(l) <= radius && e.getLocation().getBlock() != l.getBlock())
                        radiusEntities.add(e);
                }
            }
        }
        return radiusEntities.toArray(new Entity[radiusEntities.size()]);
    }


}
