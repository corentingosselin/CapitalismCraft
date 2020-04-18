package fr.cocoraid.capitalismcraft.wanted;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.database.LocalDatabase;
import fr.cocoraid.capitalismcraft.timeismoney.TimeMoneyMachine;
import fr.cocoraid.capitalismcraft.timeismoney.TimeTracker;
import fr.cocoraid.capitalismcraft.timeismoney.listeners.DetectBuildMachine;
import fr.cocoraid.capitalismcraft.timeismoney.listeners.InteractWithMachine;
import fr.cocoraid.capitalismcraft.timeismoney.listeners.RegisterTimeEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Directional;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class Wanted extends LocalDatabase {

    private CapitalismCraft instance;
    public Wanted(CapitalismCraft instance) {
        super(instance,"wanted");
        this.instance = instance;
       // registerEvents();
        loadDatabase();
    }


    /*public boolean registerWanted(Player p) {
        if(loadTimeMachine(p,sign)) {
            data.set("machines." + String.valueOf(machines.size() - 1),sign.getLocation());
            saveData();
            return true;
        } else return false;
    }

    public void unregisterMachine(TimeMoneyMachine machine) {
        data.set("machines." + machine.getId(),null);
        saveData();
        machines.remove(machine);
    }

    @Override
    public void loadDatabase() {
        super.loadDatabase();
        Bukkit.getOnlinePlayers().forEach(cur -> {
            getTracker().getTime().putIfAbsent(cur.getUniqueId(),0);
        });
        ConfigurationSection section = data.getConfigurationSection("machines");
        if(section == null) return;
        for (String key : section.getKeys(false)) {
            Location sign = (Location) data.get("machines." + key);

            if(sign.getBlock().getType() == Material.OAK_WALL_SIGN) {
                loadTimeMachine(null, sign.getBlock());
            }
        }

    }



    @Override
    public void saveDatabase() {
        super.saveDatabase();
        int index = 0;
        for (TimeMoneyMachine machine : machines) {
            String key = "machines." + String.valueOf(index);
            data.set(key + ".sign",machine.getSign());
            index++;
        }
    }

    private void registerEvents() {
        Bukkit.getServer().getPluginManager().registerEvents(new RegisterTimeEvent(this),instance);
        Bukkit.getServer().getPluginManager().registerEvents(new InteractWithMachine(this),instance);
        Bukkit.getServer().getPluginManager().registerEvents(new DetectBuildMachine(this),instance);
    }

    public TimeTracker getTracker() {
        return tracker;
    }


    public CapitalismCraft getInstance() {
        return instance;
    }*/
}
