package fr.cocoraid.capitalismcraft.ranks.habitant;

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

public class KillRewardListener implements Listener {


    @EventHandler
    public void reward(PlayerDeathEvent e) {
        Player dead = e.getEntity();
        if(dead.hasMetadata("NPC")) return;
        if(e.getEntity().getKiller().hasMetadata("NPC")) return;
        Player killer = e.getEntity().getKiller();
        if(killer instanceof Player) {
            if(killer.hasPermission("cc.mercenaire")) return;
                int randomNum = ThreadLocalRandom.current().nextInt(0, 3000 + 1);
                if(EconomyBridge.takeMoneySilent(dead, randomNum)) {
                    dead.sendMessage("§cVous perdez §2" + randomNum + " §c$ pour avoir été tué par §3" + dead.getName());
                    EconomyBridge.giveMoney(killer, randomNum);
                    killer.sendMessage("§bVous recevez §2" + randomNum + " §b$ pour avoir tué §3" + dead.getName());
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
            Utils.sendActionBar(killer,"§2+" + randomNum + " $");
        } else if(e.getEntity() instanceof Animals) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20 + 1);
            EconomyBridge.giveMoney(killer, randomNum);
            Utils.sendActionBar(killer,"§2+" + randomNum + " $" );
        }

    }



}
