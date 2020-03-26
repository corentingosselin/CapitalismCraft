package fr.cocoraid.capitalismcraft.listeners;

import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.concurrent.ThreadLocalRandom;

public class KillRewardEvent implements Listener {

    @EventHandler
    public void reward(PlayerDeathEvent e) {
        Player dead = e.getEntity();
        Player killer = e.getEntity().getKiller();
        if(killer instanceof Player) {
            if(killer.hasPermission("cc.reward.mercenary")) {
                int randomNum = ThreadLocalRandom.current().nextInt(2000, 6000 + 1);
                EconomyBridge.giveMoney(killer, randomNum);
                killer.sendMessage("&bVous recevez §2" + randomNum + " §b$ pour avoir tué §3" + dead.getName());
            } else {
                int randomNum = ThreadLocalRandom.current().nextInt(300, 3000 + 1);
                EconomyBridge.giveMoney(killer, randomNum);
                killer.sendMessage("&bVous recevez §2" + randomNum + " §b$ pour avoir tué §3" + dead.getName());

            }
        }
    }


    @EventHandler
    public void mobReward(EntityDeathEvent e) {
        Player killer = e.getEntity().getKiller();
        if(killer == null) return;
        if(e.getEntity() instanceof Monster) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 50 + 1);
            EconomyBridge.giveMoney(killer, randomNum);
            killer.spigot().sendMessage(ChatMessageType.ACTION_BAR,new TextComponent("§2+" + randomNum + " $" ));
        } else if(e.getEntity() instanceof Animals) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20 + 1);
            EconomyBridge.giveMoney(killer, randomNum);
            killer.spigot().sendMessage(ChatMessageType.ACTION_BAR,new TextComponent("§2+" + randomNum + " $" ));
        }

    }

}
