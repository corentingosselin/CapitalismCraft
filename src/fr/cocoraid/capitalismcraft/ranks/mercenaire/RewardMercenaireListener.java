package fr.cocoraid.capitalismcraft.ranks.mercenaire;

import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.utils.Utils;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.concurrent.ThreadLocalRandom;

public class RewardMercenaireListener implements Listener {

    @EventHandler
    public void reward(PlayerDeathEvent e) {
        Player dead = e.getEntity();
        if(dead.hasMetadata("NPC")) return;
        if(e.getEntity().getKiller().hasMetadata("NPC")) return;
        Player killer = e.getEntity().getKiller();
        if(killer instanceof Player) {
            if(killer.hasPermission("cc.mercenaire")) {
                int randomNum = ThreadLocalRandom.current().nextInt(500, 6000 + 1);
                if(EconomyBridge.takeMoneySilent(dead, randomNum)) {
                    dead.sendMessage("§cVous perdez §2" + randomNum + " §c$ pour avoir été tué par §3" + dead.getName());
                    EconomyBridge.giveMoney(killer, randomNum);
                    killer.sendMessage("§bVous recevez §2" + randomNum + " §b$ pour avoir tué §3" + dead.getName());
                }

            }
        }
    }




}
