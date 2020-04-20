package fr.cocoraid.capitalismcraft.listeners;

import fr.cocoraid.capitalismcraft.bridges.ChatBridge;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class ChatEvent implements Listener {

    @EventHandler
    public void chat(AsyncPlayerChatEvent e) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
        if(cp.getPlayerdata().getTimeLeftNotify() != -1) {
            e.setFormat("§8(§7Ancien" + cp.getPlayerdata().getNameHistory().get(cp.getPlayerdata().getNameHistory().size() -1) + "§8) " + e.getFormat());

        }

    }

}
