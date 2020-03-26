package fr.cocoraid.capitalismcraft.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class NaturalSpawnEvent implements Listener {

    @EventHandler
    public void spawn(CreatureSpawnEvent e) {
        if(e.getLocation().getWorld().getName().equals("flatclone") || e.getLocation().getWorld().getName().equals("terrain")  || e.getLocation().getWorld().getName().equals("terrain_agricole")  || e.getLocation().getWorld().getName().equals("world")) {
            if (e.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL) {
                e.setCancelled(true);
                e.getEntity().remove();
            }
        }
    }

}
