package fr.cocoraid.capitalismcraft.timeismoney.listeners;

import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import fr.cocoraid.capitalismcraft.timeismoney.TimeMoneyMachine;
import fr.cocoraid.capitalismcraft.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.*;

public class InteractWithMachine implements Listener {


    private TimeIsMoney timeIsMoney;
    public InteractWithMachine(TimeIsMoney timeIsMoney) {
        this.timeIsMoney = timeIsMoney;
    }


    @EventHandler
    public void machineLoadProfile(PlayerInteractEvent e) {
        if(e.getClickedBlock() == null) return;
        Player p = e.getPlayer();
        if(e.getAction() == Action.PHYSICAL) {
            loadProfile(p,e.getClickedBlock());
            resetProfile(p,e.getClickedBlock());
        } else if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            getMoney(p,e.getClickedBlock());
        }
    }




    private Map<UUID, BukkitTask> tasks = new HashMap<>();
    private void loadProfile(Player p, Block b) {
        if(b.getType() != Material.STONE_PRESSURE_PLATE) return;
        TimeMoneyMachine machine = timeIsMoney.findMachine(TimeIsMoney.DirectionSide.LOADER ,b.getLocation());
        if(machine != null) {
            //busy machine
            if(machine.getProfile() != null) {
                Player profile = machine.getProfile();
                if(profile != null && !profile.equals(p)
                        && profile.getLocation().getBlock().equals(machine.getPressureplateLoad()))
                    Utils.sendActionBar(p,"§4Un joueur utilise déjà la Time Money Machine !");
                return;
            }

            int money = timeIsMoney.getTracker().getTime().get(p.getUniqueId());
            machine.loadProfile(p,money);
            if(tasks.containsKey(p.getUniqueId())) {
                tasks.get(p.getUniqueId()).cancel();
            }
            tasks.put(p.getUniqueId(),new BukkitRunnable() {
                @Override
                public void run() {

                    if(machine.getProfile() != null) {
                        if (machine.getProfile().equals(p)) {
                            Player profile = machine.getProfile();
                            if (profile.equals(p)) {
                                machine.resetProfile();
                                if (p.isOnline()) {
                                    if (p.getLocation().getBlock().equals(b)) {
                                        Utils.bumpEntity(p, machine.getSign().getLocation(), 2, 0.3);
                                        Utils.sendActionBar(p, "§cVous avez été trop long pour prendre une décision");
                                        p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                                    }
                                }
                            }
                        }
                    } else {
                        //player left without reset
                        machine.resetProfile();

                    }
                    tasks.remove(p.getUniqueId());
                }
            }.runTaskLater(timeIsMoney.getInstance(),20*10));
        }
    }

    private void resetProfile(Player p, Block b) {
        if(b.getType() != Material.STONE_PRESSURE_PLATE) return;
        TimeMoneyMachine machine = timeIsMoney.findMachine(TimeIsMoney.DirectionSide.RESET,b.getLocation());
        if(machine != null) {
            if(!machine.isNeedClean()) return;
            if(machine.getProfile() == null || machine.getProfile().equals(p)) {
                machine.resetProfile();
                if(tasks.containsKey(p.getUniqueId()))
                    tasks.get(p.getUniqueId()).cancel();
                tasks.remove(p.getUniqueId());
            }
        }

    }

    private void getMoney(Player p, Block b) {
        if(b.getType() != Material.STONE_BUTTON) return;
        TimeMoneyMachine machine = timeIsMoney.findMachine(b.getLocation());
        if(machine == null) return;
        if(machine.getProfile() == null) return;
        int min = timeIsMoney.getTracker().getTime().get(p.getUniqueId());
        machine.giveMoney(min);
        timeIsMoney.getTracker().getTime().put(p.getUniqueId(),0);
    }


}
