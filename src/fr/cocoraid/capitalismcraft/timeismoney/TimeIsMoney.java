package fr.cocoraid.capitalismcraft.timeismoney;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.database.LocalDatabase;
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
import java.util.*;
import java.util.logging.Level;

public class TimeIsMoney extends LocalDatabase {

    private CapitalismCraft instance;
    private TimeTracker tracker;
    public TimeIsMoney(CapitalismCraft instance) {
        super(instance,"timeismoney");
        this.instance = instance;
        this.tracker = new TimeTracker();
        tracker.runTaskTimerAsynchronously(instance,0,20 * 60);
        registerEvents();
        loadDatabase();
    }

    private List<TimeMoneyMachine> machines = new ArrayList<>();
    public TimeMoneyMachine findMachine(Location loc) {
        return machines.stream().filter(m -> m.getSign().getLocation().equals(loc)
                || m.getPressureplateLoad().getLocation().equals(loc)
        || m.getPressureplateReset().getLocation().equals(loc)
        || m.getButtons()[0].getLocation().equals(loc)
        || m.getButtons()[1].getLocation().equals(loc)).findAny().orElse(null);
    }

    public TimeMoneyMachine findMachine(DirectionSide type, Location loc) {
        return machines.stream().filter(m -> (type == DirectionSide.LOADER && m.getPressureplateLoad().getLocation().equals(loc))
                || (type == DirectionSide.RESET && m.getPressureplateReset().getLocation().equals(loc))).findAny().orElse(null);
    }

    public List<TimeMoneyMachine> getMachines() {
        return machines;
    }

    public boolean registerMachine(Player p, Block sign) {
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


    private void sendMessage(Player p, String msg) {
        if(p == null) {
            Bukkit.getServer().getLogger().log(Level.WARNING,msg);
        } else {
            p.sendMessage(msg);
        }
    }

    public boolean loadTimeMachine(@Nullable Player p, Block block) {
        Directional sign = (Directional) block.getBlockData();
        Block buttonLeft = getButton(block,DirectionSide.LEFT,sign.getFacing());
        if(buttonLeft == null || buttonLeft.getType() != Material.STONE_BUTTON) {

            sendMessage(p,"§cLe boutton gauche est manquant pour la TimeIsMoney machine");
            return false;
        }
        Block buttonRight = getButton(block,DirectionSide.RIGHT,sign.getFacing());
        if(buttonRight == null || buttonRight.getType() != Material.STONE_BUTTON) {
            sendMessage(p,"§cLe boutton droit est manquant pour la TimeIsMoney machine");
            return false;
        }
        Block loader = getPressurePlate(block,DirectionSide.LOADER,sign.getFacing());
        if(loader == null || loader.getType() != Material.STONE_PRESSURE_PLATE) {
            sendMessage(p,"§cLa plaque de pression A est manquante pour la TimeIsMoney machine");
            return false;
        }
        Block reset = getPressurePlate(block,DirectionSide.RESET,sign.getFacing());
        if(reset == null || reset.getType() != Material.STONE_PRESSURE_PLATE) {
            sendMessage(p,"§cLa plaque de pression B est manquante pour la TimeIsMoney machine");
            return false;
        }

        if(p != null) {
            p.sendMessage("§bLa Time is Money Machine est maintenant activée !");
        }
        Block[] locs = new Block[] {buttonLeft,buttonRight};
        TimeMoneyMachine machine = new TimeMoneyMachine(machines.size(),block,loader,reset,locs);
        machines.add(machine);
        return true;



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


    public enum DirectionSide {
        RIGHT,LEFT,LOADER,RESET;
    }
    private Block getButton(Block sign, DirectionSide directionSide, BlockFace face) {
        if(face == BlockFace.NORTH) {
            if(directionSide == DirectionSide.RIGHT) {
                return sign.getRelative(BlockFace.EAST);
            } else if(directionSide == DirectionSide.LEFT)
                return sign.getRelative(BlockFace.WEST);
        } else if(face == BlockFace.SOUTH) {
            if(directionSide == DirectionSide.RIGHT) {
                return sign.getRelative(BlockFace.WEST);
            } else if(directionSide == DirectionSide.LEFT)
                return sign.getRelative(BlockFace.EAST);
        }
        return null;
    }


    private Block getPressurePlate(Block sign,DirectionSide directionSide, BlockFace face) {
        Location l = sign.getLocation();
        l.subtract(0,1,0);
        if(directionSide == DirectionSide.LOADER)
            return l.getBlock().getRelative(face);
        if(directionSide == DirectionSide.RESET)
            return l.getBlock().getRelative(face).getRelative(face);
        return null;
    }

    public CapitalismCraft getInstance() {
        return instance;
    }
}
