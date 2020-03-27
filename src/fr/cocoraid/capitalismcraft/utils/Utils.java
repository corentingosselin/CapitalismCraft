package fr.cocoraid.capitalismcraft.utils;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Utils {

    public static void sendActionBar(Player p, String msg) {
        p.spigot().sendMessage(ChatMessageType.ACTION_BAR,new TextComponent(msg));
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
}
