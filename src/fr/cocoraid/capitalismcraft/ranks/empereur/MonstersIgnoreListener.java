package fr.cocoraid.capitalismcraft.ranks.empereur;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

public class MonstersIgnoreListener implements Listener {

    @EventHandler
    public void mobIgnore(EntityTargetLivingEntityEvent e) {
        if(e.getTarget() instanceof Player) {
            Player p = (Player) e.getTarget();
            if(p.hasPermission("cc.empereur")) {
                e.setCancelled(true);
            }
        }
    }

}
