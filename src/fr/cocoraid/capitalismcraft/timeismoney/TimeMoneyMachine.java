package fr.cocoraid.capitalismcraft.timeismoney;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.utils.Utils;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class TimeMoneyMachine {


    private int id;
    private Player profile;

    private Block[] buttons;
    private Block pressureplateLoad;
    private Block pressureplateReset;

    private Block sign;

    public TimeMoneyMachine(int id, Block sign, Block pressureplateLoad, Block pressureplateReset,Block[] buttons) {
        //load time machine
        this.sign = sign;
        this.pressureplateLoad = pressureplateLoad;
        this.pressureplateReset = pressureplateReset;
        this.buttons = buttons;
        this.id = id;
    }


    public void loadProfile(Player profile, int min) {
        int money = min * 10;
        this.profile = profile;
        //update sign
        Sign wallsign = (Sign) getSign().getState();
        wallsign.setLine(2,profile.getName());
        wallsign.setLine(3, "§2" + String.valueOf(money) + " $");
        wallsign.update();
        profile.playSound(profile.getLocation(), Sound.BLOCK_END_PORTAL_FRAME_FILL,1,0);
        Utils.sendActionBar(profile, "§3Cliquez sur un boutton pour obtenir l'argent");
    }

    public void resetProfile() {
        Sign wallsign = (Sign) getSign().getState();
        wallsign.setLine(0,"§2§lTimeIsMoney");
        wallsign.setLine(2,"§cEn attente");
        wallsign.setLine(3,"§cd'un joueur");
        wallsign.update();
        this.profile = null;
        this.needClean = false;
    }


    private boolean needClean = false;
    public void giveMoney(int min) {
        int money = min * 10;
        EconomyBridge.giveMoney(profile,money);
        profile.playSound(profile.getLocation(), Sound.ITEM_ARMOR_EQUIP_CHAIN,1,0);
        Player tempProfile = profile;
        new BukkitRunnable() {
            @Override
            public void run() {
                if(tempProfile.isOnline()) {
                    tempProfile.playSound(tempProfile.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, 1, 2);
                    Utils.sendActionBar(tempProfile, "§3Vous obtenez " + money + " $ !");
                }
            }
        }.runTaskLater(CapitalismCraft.getInstance(),10);
        Sign wallsign = (Sign) getSign().getState();
        wallsign.setLine(0,"§2§lTimeIsMoney");
        wallsign.setLine(2,"§cTransaction");
        wallsign.setLine(3,"§cterminée");
        wallsign.update();
        this.profile = null;
        this.needClean = true;
    }

    public boolean isNeedClean() {
        return needClean;
    }

    public Player getProfile() {
        return profile;
    }

    public int getId() {
        return id;
    }



    public Block getPressureplateLoad() {
        return pressureplateLoad;
    }

    public Block getPressureplateReset() {
        return pressureplateReset;
    }

    public Block[] getButtons() {
        return buttons;
    }

    public Block getSign() {
        return sign;
    }
}
