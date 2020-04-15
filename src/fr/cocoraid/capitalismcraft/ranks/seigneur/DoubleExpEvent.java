package fr.cocoraid.capitalismcraft.ranks.seigneur;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class DoubleExpEvent implements Listener {


    @EventHandler
    public void doubleExp(PlayerExpChangeEvent e) {
        if(e.getPlayer().hasPermission("cc.seigneur")) {
            int amount = e.getAmount() * 2;
            //e.getPlayer().setExp(amount);
        }
    }
}
