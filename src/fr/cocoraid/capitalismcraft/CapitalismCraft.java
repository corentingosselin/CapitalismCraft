package fr.cocoraid.capitalismcraft;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.bridges.WorldGuardBridge;
import fr.cocoraid.capitalismcraft.listeners.KeepExpEvent;
import fr.cocoraid.capitalismcraft.listeners.KillRewardEvent;
import fr.cocoraid.capitalismcraft.listeners.MonstersIgnoreEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import fr.cocoraid.capitalismcraft.tools.hammer.HammerManager;
import fr.cocoraid.capitalismcraft.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CapitalismCraft extends JavaPlugin {

    private static CapitalismCraft instance;
    private WorldGuardBridge worldGuardBridge;

    @Override
    public void onEnable() {
        super.onEnable();

        instance = this;

        if (!EconomyBridge.setupEconomy()) {
            setEnabled(false);
            getLogger().warning("Vault with a compatible economy plugin was not found!");
        }

        if(Bukkit.getPluginManager().getPlugin("WorldGuard") != null) {
            this.worldGuardBridge = new WorldGuardBridge(this, (WorldGuardPlugin) Bukkit.getPluginManager().getPlugin("WorldGuard"));
        }

        new TimeIsMoney(this);
        new HammerManager(this).setup();


        Bukkit.getPluginManager().registerEvents(new MonstersIgnoreEvent(),this);
        Bukkit.getPluginManager().registerEvents(new KeepExpEvent(),this);
        Bukkit.getPluginManager().registerEvents(new NaturalSpawnEvent(),this);
        Bukkit.getPluginManager().registerEvents(new KillRewardEvent(),this);
    }


    @Override
    public void onDisable() {
        super.onDisable();
    }

    public WorldGuardBridge getWorldGuardBridge() {
        return worldGuardBridge;
    }

    public static CapitalismCraft getInstance() {
        return instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage("lol");
        }
        return true;
    }
}
