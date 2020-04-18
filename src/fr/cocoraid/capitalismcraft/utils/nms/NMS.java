package fr.cocoraid.capitalismcraft.utils.nms;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.skin.Skin;
import net.minecraft.server.v1_15_R1.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_15_R1.CraftServer;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_15_R1.scoreboard.CraftScoreboard;
import org.bukkit.craftbukkit.v1_15_R1.util.CraftMagicNumbers;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;

public class NMS {


    public static IBlockData fromMaterial(Material m) {
        net.minecraft.server.v1_15_R1.Block nmsBlock = CraftMagicNumbers.getBlock(m);
        return nmsBlock.getBlockData();
    }


    public static void sendPackets(Player player, Packet... packets) {
        EntityPlayer ep = ((CraftPlayer)player).getHandle();
        for (Packet packet : packets) {
            ep.playerConnection.sendPacket(packet);
        }
    }

    public static void setBlockInNativeDataPalette(Material m, Block block, boolean applyPhysics) {
        int x = block.getX();
        int y = block.getY();
        int z = block.getZ();
        net.minecraft.server.v1_15_R1.World nmsWorld = ((CraftWorld) block.getWorld()).getHandle();
        net.minecraft.server.v1_15_R1.Chunk nmsChunk = nmsWorld.getChunkAt(x >> 4, z >> 4);
        IBlockData ibd = fromMaterial(m);
        ChunkSection cs = nmsChunk.getSections()[y >> 4];
        if (cs == nmsChunk.a()) {
            cs = new ChunkSection(y >> 4 << 4);
            nmsChunk.getSections()[y >> 4] = cs;
        }

        if (applyPhysics)
            cs.getBlocks().setBlock(x & 15, y & 15, z & 15, ibd);
        else
            cs.getBlocks().b(x & 15, y & 15, z & 15, ibd);
    }



    private static Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
    public static EntityPlayer spawnNPC(Player player, @Nullable  String displayName, String textureValue, String signature, Location location) {
        String name = displayName;
        if(displayName == null) {
            name = "notag";
            ScoreboardTeam scoreboardTeam = new ScoreboardTeam(((CraftScoreboard)scoreboard).getHandle(),"npcnametag");
            scoreboardTeam.setCollisionRule(ScoreboardTeamBase.EnumTeamPush.NEVER);
            scoreboardTeam.setNameTagVisibility(ScoreboardTeamBase.EnumNameTagVisibility.NEVER);
            scoreboardTeam.getPlayerNameSet().add("notag");
            PacketPlayOutScoreboardTeam team = new PacketPlayOutScoreboardTeam(scoreboardTeam,0);
            NMS.sendPackets(player,team);
        }

        MinecraftServer minecraftServer = ((CraftServer) Bukkit.getServer()).getServer();
        WorldServer worldServer = ((CraftWorld) location.getWorld()).getHandle();

        GameProfile gameProfile = new GameProfile(UUID.randomUUID(), name);
        PropertyMap promap = gameProfile.getProperties();
        promap.clear();
        promap.put("textures",new Property("textures", textureValue,signature));
        EntityPlayer entityPlayer = new EntityPlayer(minecraftServer, worldServer, gameProfile, new PlayerInteractManager(worldServer));

        entityPlayer.setLocation(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());

        PacketPlayOutPlayerInfo infoRemove = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER,entityPlayer);
        PacketPlayOutPlayerInfo infoAdd = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER,entityPlayer);
        PacketPlayOutNamedEntitySpawn spawn = new PacketPlayOutNamedEntitySpawn(entityPlayer);
        PacketPlayOutEntityMetadata meta = new PacketPlayOutEntityMetadata(entityPlayer.getId(),((CraftPlayer)player).getHandle().getDataWatcher(),true);

        NMS.sendPackets(player,infoAdd,spawn,meta);
        new BukkitRunnable() {
            @Override
            public void run() {
                NMS.sendPackets(player,infoRemove);
            }
        }.runTaskLaterAsynchronously(CapitalismCraft.getInstance(),3L);

        return entityPlayer;
    }


    public static void updateSkin(Player player,String value, String signature, EntityPlayer ep) {
        GameProfile gameProfile = ep.getProfile();
        PropertyMap promap = gameProfile.getProperties();
        promap.clear();
        promap.put("textures",new Property("textures", value,signature));

        PacketPlayOutPlayerInfo infoRemove = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER,ep);
        PacketPlayOutPlayerInfo infoAdd = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER,ep);
        PacketPlayOutEntityDestroy destroy = new PacketPlayOutEntityDestroy(ep.getId());
        PacketPlayOutNamedEntitySpawn spawn = new PacketPlayOutNamedEntitySpawn(ep);
        PacketPlayOutEntityMetadata meta = new PacketPlayOutEntityMetadata(ep.getId(),((CraftPlayer)player).getHandle().getDataWatcher(),true);

        NMS.sendPackets(player,destroy, infoAdd,spawn,meta);
        new BukkitRunnable() {
            @Override
            public void run() {
                NMS.sendPackets(player,infoRemove);
            }
        }.runTaskLaterAsynchronously(CapitalismCraft.getInstance(),3L);
    }
}
