package fr.cocoraid.capitalismcraft.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KeepExpEvent implements Listener {

    @EventHandler
    public void death(PlayerDeathEvent e) {
        Player p = e.getEntity();
        if(p.hasPermission("cc.keepexp")) {
            e.setKeepLevel(true);
        }
    }

}
