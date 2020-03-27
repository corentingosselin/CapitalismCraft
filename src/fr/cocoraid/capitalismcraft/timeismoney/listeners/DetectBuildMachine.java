package fr.cocoraid.capitalismcraft.timeismoney.listeners;

import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import fr.cocoraid.capitalismcraft.timeismoney.TimeMoneyMachine;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;

public class DetectBuildMachine implements Listener {


    private TimeIsMoney timeIsMoney;
    public DetectBuildMachine(TimeIsMoney timeIsMoney) {
        this.timeIsMoney = timeIsMoney;
    }

    @EventHandler
    public void sign(SignChangeEvent e) {
        if(e.getLine(0).equalsIgnoreCase("TimeIsMoney")) {
            Player p = e.getPlayer();
            if(!p.hasPermission("cc.admin")) return;
            Block sign = e.getBlock();
            if(timeIsMoney.registerMachine(p,sign)) {
                e.setLine(0,"§2§lTimeIsMoney");
                e.setLine(2,"§cEn attente");
                e.setLine(3,"§cd'un joueur");
                p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL,1,1);
            } else {
                e.setLine(0,"§cTimeIsMoney");
                e.setLine(2,"§4Construction");
                e.setLine(3,"§4Invalide");
            }

        }
    }



    @EventHandler
    public void signBreak(BlockBreakEvent e) {
        if(e.getBlock().getType() == Material.OAK_WALL_SIGN || e.getBlock().getType() == Material.STONE_PRESSURE_PLATE || e.getBlock().getType() == Material.STONE_BUTTON) {
            if(e.getPlayer().hasPermission("cc.admin")) {
                TimeMoneyMachine machine = timeIsMoney.findMachine(e.getBlock().getLocation());
                if(machine != null) {
                    if (machine.getSign().equals(e.getBlock())) {
                        timeIsMoney.unregisterMachine(machine);
                        e.getPlayer().sendMessage("§cLa machine a bien été supprimé !");
                    } else {
                        e.setCancelled(true);
                    }
                }
            }
        }
    }





}
