package fr.cocoraid.capitalismcraft;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.bridges.WorldGuardBridge;
import fr.cocoraid.capitalismcraft.listeners.JoinLeaveEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import fr.cocoraid.capitalismcraft.ranks.RankRegisterer;
import fr.cocoraid.capitalismcraft.task.SceneEffectTask;
import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import fr.cocoraid.capitalismcraft.utils.Cuboid;
import fr.cocoraid.capitalismcraft.warzone.Safezone;
import fr.cocoraid.capitalismcraft.warzone.TagDetectEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.Random;

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
        //Safezone.setCuboid(new Cuboid(new Location(Bukkit.getWorld("build"),31,52,41,0,0),
        //      new Location(Bukkit.getWorld("build"),-31,74,135,0,0) ));

        Safezone.setCuboid(new Cuboid(new Location(Bukkit.getWorld("world"),25,10,40,0,0),
                new Location(Bukkit.getWorld("world"),12,4,27,0,0) ));

        new SceneEffectTask().runTaskTimerAsynchronously(instance,0,0);

        Bukkit.getPluginManager().registerEvents(new TagDetectEvent(this),this);
        new TimeIsMoney(this);
        new RankRegisterer(this);


        Bukkit.getPluginManager().registerEvents(new JoinLeaveEvent(this),this);
        Bukkit.getPluginManager().registerEvents(new NaturalSpawnEvent(),this);

        Bukkit.getOnlinePlayers().forEach(cur -> {
            new CapitalistPlayer(cur);
        });

    }


    @Override
    public void onDisable() {
        super.onDisable();

        Bukkit.getOnlinePlayers().forEach(cur -> {
            CapitalistPlayer.getCapitalistPlayers().remove(cur.getUniqueId());
        });
    }

    public WorldGuardBridge getWorldGuardBridge() {
        return worldGuardBridge;
    }

    public static CapitalismCraft getInstance() {
        return instance;
    }


    public static int randomRange(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
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
