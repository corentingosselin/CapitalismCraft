package fr.cocoraid.capitalismcraft.area;

import fr.cocoraid.capitalismcraft.area.event.AreaEnterEvent;
import fr.cocoraid.capitalismcraft.area.event.AreaQuitEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class AreaManager extends BukkitRunnable  {


    private List<Area> areaList = new ArrayList<>();

    public AreaManager() {


    }


    @Override
    public void run() {

        if(!Bukkit.getOnlinePlayers().isEmpty() && !areaList.isEmpty()) {
            areaList.forEach(area -> {

                Bukkit.getOnlinePlayers().stream().filter(cur -> cur.getWorld().equals(area.getCuboid().world)).forEach(cur -> {
                    if(area.getCuboid().isIn(cur.getLocation()) && !area.getEntered().contains(cur.getUniqueId())) {
                        area.addEntered(cur.getUniqueId());
                        AreaEnterEvent event = new AreaEnterEvent(area,cur);
                        Bukkit.getPluginManager().callEvent(event);
                    }

                    if(!area.getCuboid().isIn(cur.getLocation()) && area.getEntered().contains(cur.getUniqueId())) {
                        area.removeEntered(cur.getUniqueId());
                        AreaQuitEvent event = new AreaQuitEvent(area,cur);
                        Bukkit.getPluginManager().callEvent(event);
                    }
                });

            });
        }
    }


    public List<Area> getAreaList() {
        return areaList;
    }
}
