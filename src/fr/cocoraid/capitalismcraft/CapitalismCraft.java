package fr.cocoraid.capitalismcraft;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.bridges.WorldGuardBridge;
import fr.cocoraid.capitalismcraft.listeners.JoinLeaveEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import fr.cocoraid.capitalismcraft.utils.Cuboid;
import fr.cocoraid.capitalismcraft.warzone.Safezone;
import org.bukkit.Bukkit;
import org.bukkit.Location;
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

        //set pvp area cuboid
        Safezone.setCuboid(new Cuboid(new Location(Bukkit.getWorld("build"),31,52,41,0,0),
                new Location(Bukkit.getWorld("build"),-30,74,136,0,0) ));
        new TimeIsMoney(this);


        Bukkit.getPluginManager().registerEvents(new JoinLeaveEvent(this),this);
        Bukkit.getPluginManager().registerEvents(new NaturalSpawnEvent(),this);

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
