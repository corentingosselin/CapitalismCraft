package fr.cocoraid.capitalismcraft;

import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.listeners.KeepExpEvent;
import fr.cocoraid.capitalismcraft.listeners.KillRewardEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CapitalismCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();


        if (!EconomyBridge.setupEconomy()) {
            setEnabled(false);
            getLogger().warning("Vault with a compatible economy plugin was not found!");
        }


        Bukkit.getPluginManager().registerEvents(new KeepExpEvent(),this);
        Bukkit.getPluginManager().registerEvents(new NaturalSpawnEvent(),this);
        Bukkit.getPluginManager().registerEvents(new KillRewardEvent(),this);
    }


    @Override
    public void onDisable() {
        super.onDisable();
    }
}
