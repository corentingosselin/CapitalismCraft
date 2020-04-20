package fr.cocoraid.capitalismcraft.player;

import fr.cocoraid.capitalismcraft.player.datas.ImportantData;
import fr.cocoraid.capitalismcraft.player.datas.NormalData;
import fr.cocoraid.capitalismcraft.shop.shops.skin.SkinDemo;
import fr.minuskube.inv.SmartInventory;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import java.util.*;

public class CapitalistPlayer {


    private SmartInventory previousInventory;
    private int lastPage;



    private ImportantData playerdata;
    private NormalData normalData;




    private boolean emperorTargetedByMonsters = false;

    private SkinDemo skinDemo;

    private static Map<UUID, CapitalistPlayer> capitalistPlayers = new HashMap();
    private long lastTimeSkinChanged = 0;
    private boolean tagged;
    private boolean recentHit;
    private Player lastDamager;
    private BukkitTask taskTag;
    private Player p;
    public CapitalistPlayer(Player p) {

        this.p = p;
        capitalistPlayers.put(p.getUniqueId(),this);
        //here register player in database if not exist

    }

    public void setRecentHit(boolean recentHit) {
        this.recentHit = recentHit;
    }

    public boolean hasRecentHit() {
        return recentHit;
    }

    public Player getLastDamager() {
        return lastDamager;
    }

    public void setLastDamager(Player lastDamager) {
        this.lastDamager = lastDamager;
    }

    public boolean hasLastDamager() {
        return lastDamager != null;
    }

    public void setTaskTag(BukkitTask taskTag) {
        this.taskTag = taskTag;
    }

    public BukkitTask getTaskTag() {
        return taskTag;
    }

    public static CapitalistPlayer getCapitalistPlayer(Player p) {
        if(capitalistPlayers.containsKey(p.getUniqueId())) return capitalistPlayers.get(p.getUniqueId());
        else return new CapitalistPlayer(p);
    }


    public void setEmperorTargetedByMonsters(boolean emperorTargetedByMonsters) {
        this.emperorTargetedByMonsters = emperorTargetedByMonsters;
    }

    public boolean isEmperorCanBeTargetedByMonsters() {
        return emperorTargetedByMonsters;
    }

    public void setTagged(boolean tagged) {
        this.tagged = tagged;
    }

    public boolean isTagged() {
        return tagged;
    }

    public static Map<UUID, CapitalistPlayer> getCapitalistPlayers() {
        return capitalistPlayers;
    }

    public Player getPlayer() {
        return p;
    }


    public void setSkinDemo(SkinDemo skinDemo) {
        this.skinDemo = skinDemo;
    }

    public SkinDemo getSkinDemo() {
        return skinDemo;
    }

    public void unregister() {
        //uncache not important data only
    }

    public void setLastTimeSkinChanged(long lastTimeSkinChanged) {
        this.lastTimeSkinChanged = lastTimeSkinChanged;
    }

    public long getLastTimeSkinChanged() {
        return lastTimeSkinChanged;
    }

    public void setPlayerdata(ImportantData playerdata) {
        this.playerdata = playerdata;
    }

    public ImportantData getPlayerdata() {
        return playerdata;
    }


    public void setPreviousInventory(SmartInventory previousInventory) {
        this.previousInventory = previousInventory;
    }

    public SmartInventory getPreviousInventory() {
        return previousInventory;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public int getLastPage() {
        return lastPage;
    }
}
