package fr.cocoraid.capitalismcraft.shop.shops.wood;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.area.Area;
import fr.cocoraid.capitalismcraft.area.event.AreaEnterEvent;
import fr.cocoraid.capitalismcraft.area.event.AreaQuitEvent;
import fr.cocoraid.capitalismcraft.shop.Shop;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.EvokerFangs;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class WoodShop extends Shop implements Listener {



    private static final World WORLD = Bukkit.getWorld("build");
    private static final Location WOODCUTTER = new Location(WORLD,-40 + 0.5,61 + 0.5,-21 + 0.5);



    private Area area;
    public WoodShop() {
        this.area = new Area(new Location(WORLD,-24,61,-18)
                , new Location(WORLD,-46,72,-40));


    }

    private BukkitTask task;
    private void init() {
        task = new BukkitRunnable() {
            @Override
            public void run() {
                if(!area.getEntered().isEmpty()) {
                    EvokerFangs ef = WORLD.spawn(WOODCUTTER,EvokerFangs.class);
                    ef.getWorld().playSound(ef.getLocation(), Sound.ITEM_AXE_STRIP,0.1F,0);
                    ef.setSilent(true);
                } else {
                    cancel();
                    task = null;
                }
            }
        }.runTaskTimer(CapitalismCraft.getInstance(),0,2);

    }


    @EventHandler
    public void enterShop(AreaEnterEvent e) {
        if(!e.getArea().equals(area)) return;
        if(task == null)
            init();
    }


    @EventHandler
    public void exitShop(AreaQuitEvent e) {
        if(!e.getArea().equals(area)) return;

    }


    public Area getArea() {
        return area;
    }

}


