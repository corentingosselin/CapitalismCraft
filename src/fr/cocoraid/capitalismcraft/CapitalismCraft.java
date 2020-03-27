package fr.cocoraid.capitalismcraft;

import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.listeners.KeepExpEvent;
import fr.cocoraid.capitalismcraft.listeners.KillRewardEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CapitalismCraft extends JavaPlugin {

    private static CapitalismCraft instance;

    @Override
    public void onEnable() {
        super.onEnable();

        instance = this;

        if (!EconomyBridge.setupEconomy()) {
            setEnabled(false);
            getLogger().warning("Vault with a compatible economy plugin was not found!");
        }

        new TimeIsMoney(this);


        Bukkit.getPluginManager().registerEvents(new KeepExpEvent(),this);
        Bukkit.getPluginManager().registerEvents(new NaturalSpawnEvent(),this);
        Bukkit.getPluginManager().registerEvents(new KillRewardEvent(),this);
    }


    @Override
    public void onDisable() {
        super.onDisable();
    }


    public static CapitalismCraft getInstance() {
        return instance;
    }
}
