package fr.cocoraid.capitalismcraft.mention;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatMentionListener implements Listener {


    private MentionManager manager;
    ChatMentionListener(MentionManager manager) {
        this.manager = manager;
    }


    @EventHandler
    public void chat(AsyncPlayerChatEvent e) {
       e.setMessage(manager.mention(e.getPlayer(),e.getMessage(),e.isCancelled()));

    }

}
