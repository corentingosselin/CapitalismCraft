package fr.cocoraid.capitalismcraft.utils;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;

public class Utils {

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




}
