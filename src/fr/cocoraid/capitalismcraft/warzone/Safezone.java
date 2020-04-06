package fr.cocoraid.capitalismcraft.warzone;

import fr.cocoraid.capitalismcraft.utils.Cuboid;
import fr.cocoraid.capitalismcraft.warzone.event.EnterSafezoneEvent;
import fr.cocoraid.capitalismcraft.warzone.event.EnterWarzoneEvent;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Safezone extends BukkitRunnable {


    private static List<UUID> entered = new ArrayList<>();
    private static Cuboid cuboid;


    @Override
    public void run() {
        if(!Bukkit.getOnlinePlayers().isEmpty() && cuboid != null) {

            Bukkit.getOnlinePlayers().stream().filter(cur -> cur.getWorld().equals(cuboid.world)).forEach(cur -> {
                if(cuboid.isIn(cur.getLocation()) && !entered.contains(cur.getUniqueId())) {
                    entered.add(cur.getUniqueId());
                    EnterWarzoneEvent event = new EnterWarzoneEvent(cur);
                    Bukkit.getPluginManager().callEvent(event);
                }

                if(!cuboid.isIn(cur.getLocation()) && entered.contains(cur.getUniqueId())) {
                    entered.remove(cur.getUniqueId());
                    EnterSafezoneEvent event = new EnterSafezoneEvent(cur);
                    Bukkit.getPluginManager().callEvent(event);

                }

            });
        }
    }

    public static List<UUID> getEntered() {
        return entered;
    }

    public static void setCuboid(Cuboid cuboid) {
        Safezone.cuboid = cuboid;
    }

    public static Cuboid getCuboid() {
        return cuboid;
    }
}
