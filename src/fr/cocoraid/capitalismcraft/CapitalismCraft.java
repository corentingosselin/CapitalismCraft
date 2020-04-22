package fr.cocoraid.capitalismcraft;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import fr.cocoraid.capitalismcraft.area.AreaManager;
import fr.cocoraid.capitalismcraft.bridges.ChatBridge;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.bridges.WorldGuardBridge;
import fr.cocoraid.capitalismcraft.command.CommandManager;
import fr.cocoraid.capitalismcraft.listeners.ChatEvent;
import fr.cocoraid.capitalismcraft.listeners.JoinLeaveEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import fr.cocoraid.capitalismcraft.mention.MentionManager;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.player.PlayerDatabase;
import fr.cocoraid.capitalismcraft.ranks.RankRegisterer;
import fr.cocoraid.capitalismcraft.shop.ShopManager;
import fr.cocoraid.capitalismcraft.skin.loader.SkinManager;
import fr.cocoraid.capitalismcraft.task.SceneEffectTask;
import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import fr.cocoraid.capitalismcraft.wanted.WantedManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CapitalismCraft extends JavaPlugin {

    private final static boolean TEST_MODE = false;

    private static CapitalismCraft instance;
    private WorldGuardBridge worldGuardBridge;
    private PlayerDatabase database;

    private SkinManager skinManager;
    private ShopManager shopManager;
    private AreaManager areaManager;
    private MentionManager mentionManager;
    private WantedManager wantedManager;

    private SceneEffectTask sceneEffectTask;

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


       /* if(!ChatBridge.setupChat()) {
            setEnabled(false);
            getLogger().warning("Vault with a compatible chat plugin was not found!");
        }*/

        if(Bukkit.getPluginManager().getPlugin("WorldGuard") != null) {
            this.worldGuardBridge = new WorldGuardBridge(this, (WorldGuardPlugin) Bukkit.getPluginManager().getPlugin("WorldGuard"));
        }


        this.mentionManager = new MentionManager(this);
        this.wantedManager = new WantedManager(this);
        this.areaManager = new AreaManager();
        areaManager.runTaskTimer(this,0,0);
        this.shopManager = new ShopManager();

        if(!TEST_MODE) {
            this.sceneEffectTask = new SceneEffectTask();
            sceneEffectTask.runTaskTimerAsynchronously(instance, 0, 0);
        }

        //Bukkit.getPluginManager().registerEvents(new TagDetectEvent(this),this);
        new TimeIsMoney(this);
        new RankRegisterer(this);

        new CommandManager(this);

        Bukkit.getPluginManager().registerEvents(new ChatEvent(),this);
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

        wantedManager.saveDatabase();

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
        }
        return true;
    }

    public WantedManager getWantedManager() {
        return wantedManager;
    }

    public MentionManager getMentionManager() {
        return mentionManager;
    }

    public SceneEffectTask getSceneEffectTask() {
        return sceneEffectTask;
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
