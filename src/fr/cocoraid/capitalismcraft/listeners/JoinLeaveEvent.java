package fr.cocoraid.capitalismcraft.listeners;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.CapitalistPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveEvent implements Listener {


    private CapitalismCraft instance;
    public JoinLeaveEvent(CapitalismCraft instance) {
        this.instance = instance;
    }


    @EventHandler
    public void join(PlayerJoinEvent e) {
        new CapitalistPlayer(e.getPlayer());
    }

    @EventHandler
    public void leave(PlayerQuitEvent e) {
        CapitalistPlayer.getCapitalistPlayers().remove(e.getPlayer().getUniqueId());

    }

}
