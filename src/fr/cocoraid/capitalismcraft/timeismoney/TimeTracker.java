package fr.cocoraid.capitalismcraft.timeismoney;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TimeTracker extends BukkitRunnable {

    private Map<UUID, Integer> time = new HashMap<>();

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().stream().filter(cur -> time.containsKey(((Player) cur).getUniqueId())).forEach(cur -> {
            int t = time.get(cur.getUniqueId());
            time.put(cur.getUniqueId(),t + 1);
        });

    }

    public Map<UUID, Integer> getTime() {
        return time;
    }
}

