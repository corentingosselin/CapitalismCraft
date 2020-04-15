package fr.cocoraid.capitalismcraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.bridges.WorldGuardBridge;
import fr.cocoraid.capitalismcraft.listeners.JoinLeaveEvent;
import fr.cocoraid.capitalismcraft.listeners.NaturalSpawnEvent;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.player.PlayerDatabase;
import fr.cocoraid.capitalismcraft.ranks.RankRegisterer;
import fr.cocoraid.capitalismcraft.skin.inventory.RankSkinInventory;
import fr.cocoraid.capitalismcraft.skin.loader.SkinManager;
import fr.cocoraid.capitalismcraft.timeismoney.TimeIsMoney;
import net.minecraft.server.v1_15_R1.EntityPlayer;
import net.minecraft.server.v1_15_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_15_R1.PacketPlayOutRespawn;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class CapitalismCraft extends JavaPlugin {

    private static CapitalismCraft instance;
    private WorldGuardBridge worldGuardBridge;
    private PlayerDatabase database;


    @Override
    public void onEnable() {
        super.onEnable();

        instance = this;

        new SkinManager();

        this.database = new PlayerDatabase(this);

        if (!EconomyBridge.setupEconomy()) {
            //setEnabled(false);
            getLogger().warning("Vault with a compatible economy plugin was not found!");
        }

        if(Bukkit.getPluginManager().getPlugin("WorldGuard") != null) {
            this.worldGuardBridge = new WorldGuardBridge(this, (WorldGuardPlugin) Bukkit.getPluginManager().getPlugin("WorldGuard"));
        }

        //set pvp area cuboid
        //Safezone.setCuboid(new Cuboid(new Location(Bukkit.getWorld("build"),31,52,41,0,0),
          //      new Location(Bukkit.getWorld("build"),-31,74,135,0,0) ));

       // Safezone.setCuboid(new Cuboid(new Location(Bukkit.getWorld("world"),25,10,40,0,0),
         //       new Location(Bukkit.getWorld("world"),12,4,27,0,0) ));

        //Bukkit.getPluginManager().registerEvents(new TagDetectEvent(this),this);
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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;

            if(p.hasPermission("cc.empereur")) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("aggro")) {
                        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(p);
                        if(cp.isEmperorCanBeTargetedByMonsters()) {
                            cp.setEmperorTargetedByMonsters(false);
                            p.sendMessage("§cLes monstres ne vous attaquerons plus !");
                        } else {
                            cp.setEmperorTargetedByMonsters(true);
                            p.sendMessage("§cLes monstres viennent désormais vous attaquer !");
                        }
                    }
                }
            }

        }
        return true;
    }




    private void skin(Player p) {
        EntityPlayer ep = ((CraftPlayer)p).getHandle();
        GameProfile gp = ep.getProfile();
        PropertyMap pm = gp.getProperties();
        Property property = pm.get("textures").iterator().next();
        pm.remove("textures", property);
        String textureValue = "eyJ0aW1lc3RhbXAiOjE1ODY4MTc0MDM3NTEsInByb2ZpbGVJZCI6ImUxZDEyY2I0YzIwMzRmNDJhN2RkMzU2N2E2NjIwZDVkIiwicHJvZmlsZU5hbWUiOiJBaXJmbHkiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJmN2E4NWZhYjQzOTc5ZDgwYTM0ZDdlMzMxMzg4ZjdmOTE4NDc1NmYyZmE2YTc1ODM5NjI4OTc0NWY0ZDg1YjgifX19";
        String textureSignature = "cigS7zNcFK36ULLzbAGgiAo8ijNtBbLwF84sfdwOfBYsUvEdGOgBwpzQ4ftAVgHADBW6Ewg9w4zF3ejghm0ugXus/rDz4T3HLWje2cz+pjf8mvKj79ZFeF4cTIa9xiSaT1N5LkYbFxS3U1aWfFX+HUAr4AQPkLH6alMgwtyrNW0i230Y031PnGM9oqfKZy6yphAL47DgD9MUT/1RT0Y1YNMfd6K6NHCr5duuKLCInQ25z8I3OY8NgFfx7GGjB1OYwFEC6psUm1r1SAjxUZmxGOEUk0qHqJj4swz6hLEAaWkAU164vfj+oj6+WtoDiXZaXknmUp0L0wQBdPuBkQnH5B/S1afk6GVSoXqJjnob6fy6BMM/wMXOSr4vIBH0AraJgfEP5yadfbVRZKi4Van7qoWv0XiEG0XvUVR6z1pXhbm3JiNnla1lNuXMHmq7Iduys55PRUxsiV/pIkKG9qO/enMeaYXH3ws1Z8f0rF8sl+3WzKjc6q1AtKZujoRWkWwSa3ICfDdF53UXrPvaCwGKHoyVDGdo5iRXt8vISNVtfLZSbpGj6b5OMeRRWbIlliqcJ3qldEXdQ1c2E2rDcRLTrZt9741cury9aEbwRLmbM8mHtRhs+9sBlR+G4/TDTC7kWsWHQTuYlrvO3YVqukNkDBSzVX0Mdh2fVzb/jQmiHwY=";
        pm.put("textures", new Property("textures", textureValue, textureSignature));
        reloadSkinForSelf(p);
    }



    public final void reloadSkinForSelf(Player player) {
        final EntityPlayer ep = ((CraftPlayer) player).getHandle();
        final PacketPlayOutPlayerInfo removeInfo = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, ep);
        final PacketPlayOutPlayerInfo addInfo = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, ep);
        final Location loc = player.getLocation().clone();
        ep.playerConnection.sendPacket(removeInfo);
        ep.playerConnection.sendPacket(addInfo);
        player.teleport(new Location(Bukkit.getWorld("test"),0,70,0));
        new BukkitRunnable() {
            @Override
            public void run() {
                player.teleport(loc);
                ep.playerConnection.sendPacket(new PacketPlayOutRespawn(ep.dimension, ep.getWorld().getWorldData().getSeed(), ep.getWorld().getWorldData().getType(), ep.playerInteractManager.getGameMode()));
                player.updateInventory();
            }
        }.runTaskLater(this, 2L);
    }

    public PlayerDatabase getPlayerDatabase() {
        return database;
    }
}
