package fr.cocoraid.capitalismcraft.timeismoney.listeners;

import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RegisterTimeEvent implements Listener {

    private TimeIsMoney timeIsMoney;
    public RegisterTimeEvent(TimeIsMoney timeIsMoney) {
        this.timeIsMoney = timeIsMoney;
    }

    @EventHandler
    public void join(PlayerJoinEvent e) {
        timeIsMoney.getTracker().getTime().putIfAbsent(e.getPlayer().getUniqueId(),0);
    }
}
