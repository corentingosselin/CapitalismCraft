package fr.cocoraid.capitalismcraft;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CapitalistPlayer {




    private static Map<UUID, CapitalistPlayer> capitalistPlayers = new HashMap();
    private boolean tagged;
    private boolean recentHit;
    private Player lastDamager;
    private BukkitTask taskTag;
    private Player p;
    public CapitalistPlayer(Player p) {
        this.p = p;
        capitalistPlayers.put(p.getUniqueId(),this);
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

}
