package fr.cocoraid.capitalismcraft.ranks.empereur;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KeepExpListener implements Listener {

    @EventHandler
    public void death(PlayerDeathEvent e) {
        Player p = e.getEntity();
        if(p.hasPermission("cc.empereur")) {
            e.setKeepLevel(true);
        }
    }

}
