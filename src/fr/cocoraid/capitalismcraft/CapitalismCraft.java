package fr.cocoraid.capitalismcraft;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import fr.cocoraid.capitalismcraft.area.AreaManager;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.bridges.WorldGuardBridge;
import fr.cocoraid.capitalismcraft.command.CommandManager;
import fr.cocoraid.capitalismcraft.listeners.JoinLeaveEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.player.PlayerDatabase;
import fr.cocoraid.capitalismcraft.ranks.RankRegisterer;
import fr.cocoraid.capitalismcraft.shop.ShopManager;
import fr.cocoraid.capitalismcraft.skin.inventory.YourSkinsInventory;
import fr.cocoraid.capitalismcraft.skin.loader.SkinManager;
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

public class CapitalismCraft extends JavaPlugin {

    private final static boolean TEST_MODE = true;

    private static CapitalismCraft instance;
    private WorldGuardBridge worldGuardBridge;
    private PlayerDatabase database;

    private SkinManager skinManager;
    private ShopManager shopManager;
    private AreaManager areaManager;

    @Override
    public void onEnable() {
        super.onEnable();

        instance = this;


        this.skinManager = new SkinManager();
        this.database = new PlayerDatabase(this);

        if (!EconomyBridge.setupEconomy()) {
            setEnabled(false);
            getLogger().warning("Vault with a compatible economy plugin was not found!");
        }

        if(Bukkit.getPluginManager().getPlugin("WorldGuard") != null) {
            this.worldGuardBridge = new WorldGuardBridge(this, (WorldGuardPlugin) Bukkit.getPluginManager().getPlugin("WorldGuard"));
        }

        //set pvp area cuboid

        this.areaManager = new AreaManager();
        areaManager.runTaskTimer(this,0,0);
        this.shopManager = new ShopManager();

        if(TEST_MODE)
            Safezone.setCuboid(new Cuboid(new Location(Bukkit.getWorld("world"),25,10,40,0,0),
                    new Location(Bukkit.getWorld("world"),12,4,27,0,0) ));
        else
            new SceneEffectTask().runTaskTimerAsynchronously(instance,0,0);

        Bukkit.getPluginManager().registerEvents(new TagDetectEvent(this),this);
        new TimeIsMoney(this);
        new RankRegisterer(this);

        new CommandManager(this);

        Bukkit.getPluginManager().registerEvents(new JoinLeaveEvent(this),this);
        Bukkit.getPluginManager().registerEvents(new NaturalSpawnEvent(),this);

        Bukkit.getOnlinePlayers().forEach(cur -> {
            new CapitalistPlayer(cur);
            getPlayerDatabase().registerPlayer(cur);
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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;

            CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(p);
            if(cp.getPlayerdata().getGender() == Gender.UNDETERMINED) {
                cp.getPlayer().closeInventory();
                GenderInventory.INVENTORY.open(cp.getPlayer());
                return false;
            }
            RankSkinInventory.INVENTORY.open(p);


            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("aggro")) {
                    if(p.hasPermission("cc.empereur")) {
                        if(cp.isEmperorCanBeTargetedByMonsters()) {
                            cp.setEmperorTargetedByMonsters(false);
                            p.sendMessage("§cLes monstres ne vous attaquerons plus !");
                        } else {
                            cp.setEmperorTargetedByMonsters(true);
                            p.sendMessage("§cLes monstres viennent désormais vous attaquer !");
                        }
                    }
                } else if(args[0].equalsIgnoreCase("build")) {
                    if(p.hasPermission("cc.builder") || p.getName().equalsIgnoreCase("Pierrot529")) {
                        p.teleport(new Location(Bukkit.getWorld("build"), 0, 60 , 0));
                    }
                }
            }

        }
        return true;
    }


    public ShopManager getShopManager() {
        return shopManager;
    }

    public AreaManager getAreaManager() {
        return areaManager;
    }

    public SkinManager getSkinManager() {
        return skinManager;
    }

    public PlayerDatabase getPlayerDatabase() {
        return database;
    }
}
