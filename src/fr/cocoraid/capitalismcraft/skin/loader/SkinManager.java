package fr.cocoraid.capitalismcraft.skin.loader;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.skins.*;
import fr.cocoraid.capitalismcraft.utils.nms.NMS;
import net.minecraft.server.v1_15_R1.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_15_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;

import java.util.HashSet;

public class SkinManager {


    public SkinManager() {
        new HabitantVillageoisMineurSkins().loadSkins();
        new BanditSkins().loadSkins();
        new MercenaireSkins().loadSkins();
        new BourgeoisSkins().loadSkins();
        new NobleSkins().loadSkins();
        new BaronSkins().loadSkins();
        new LegionaireSkins().loadSkins();
        new SeigneurSkins().loadSkins();
        new EmperorSkins().loadSkins();
        new MarshalSkins().loadSkins();
    }

    public void setSkin(Skin skin, Player player) {
        EntityPlayer ep = ((CraftPlayer)player).getHandle();
        GameProfile profile = ep.getProfile();
        PropertyMap promap = profile.getProperties();
        promap.clear();
        promap.put("textures",new Property("textures", skin.getTextureValue(),skin.getTextureSignature()));
    }


    public void updatePlayerSkin(Player player) {

        Location l = player.getLocation();
        EntityPlayer ep = ((CraftPlayer)player).getHandle();
        net.minecraft.server.v1_15_R1.World w = ((CraftWorld)l.getWorld()).getHandle();
        World.Environment environment = player.getWorld().getEnvironment();

        int dimension = 0;
        if (environment.equals(World.Environment.NETHER))
            dimension = -1;
        else if (environment.equals(World.Environment.THE_END))
            dimension = 1;
        //send packet to player
        DimensionManager dm = DimensionManager.a(dimension);

        PacketPlayOutRespawn respawn = new PacketPlayOutRespawn(dm,w.worldData.getSeed(),w.worldData.getType(),ep.playerInteractManager.getGameMode());
        PacketPlayOutPlayerInfo infoRemove = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER,ep);
        PacketPlayOutPlayerInfo infoAdd = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER,ep);
        PacketPlayOutPosition position = new PacketPlayOutPosition( l.getX(), l.getY(), l.getZ(), l.getYaw(), l.getPitch(), new HashSet<>(), 0);
        PacketPlayOutHeldItemSlot itemSlot = new PacketPlayOutHeldItemSlot(player.getInventory().getHeldItemSlot());

        NMS.sendPackets(player,infoRemove,infoAdd,respawn);
        ep.updateAbilities();
        NMS.sendPackets(player,position,itemSlot);

        player.updateInventory();
        ((CraftPlayer) player).updateScaledHealth();
        ep.triggerHealthUpdate();





        //send packet to other
        //+ remove info and add Info
        PacketPlayOutNamedEntitySpawn spawn = new PacketPlayOutNamedEntitySpawn(ep);
        PacketPlayOutEntityDestroy destroy = new PacketPlayOutEntityDestroy(ep.getId());

        PacketPlayOutEntityMetadata meta = new PacketPlayOutEntityMetadata(ep.getId(),ep.getDataWatcher(),true);

        PacketPlayOutEntityEquipment head = new PacketPlayOutEntityEquipment(ep.getId(),EnumItemSlot.HEAD,
                CraftItemStack.asNMSCopy(player.getInventory().getHelmet()));
        PacketPlayOutEntityEquipment chest = new PacketPlayOutEntityEquipment(ep.getId(),EnumItemSlot.CHEST,
                CraftItemStack.asNMSCopy(player.getInventory().getHelmet()));
        PacketPlayOutEntityEquipment legging = new PacketPlayOutEntityEquipment(ep.getId(),EnumItemSlot.LEGS,
                CraftItemStack.asNMSCopy(player.getInventory().getHelmet()));
        PacketPlayOutEntityEquipment boots = new PacketPlayOutEntityEquipment(ep.getId(),EnumItemSlot.FEET,
                CraftItemStack.asNMSCopy(player.getInventory().getHelmet()));
        PacketPlayOutEntityEquipment mainHand = new PacketPlayOutEntityEquipment(ep.getId(),EnumItemSlot.MAINHAND,
                CraftItemStack.asNMSCopy(player.getInventory().getItemInMainHand()));
        PacketPlayOutEntityEquipment offhand = new PacketPlayOutEntityEquipment(ep.getId(),EnumItemSlot.OFFHAND,
                CraftItemStack.asNMSCopy(player.getInventory().getItemInOffHand()));


        Bukkit.getOnlinePlayers().stream()
                .filter(cur -> !cur.equals(player))
                .forEach(cur -> {
                    if(cur.getWorld().equals(player.getWorld()) && cur.canSee(player)) {

                        NMS.sendPackets(cur,
                                destroy,
                                infoRemove,
                                infoAdd,
                                spawn,
                                mainHand,
                                offhand,
                                head,
                                chest,
                                legging,
                                boots,
                                meta);
                    } else {
                        NMS.sendPackets(cur, infoRemove,infoAdd);
                    }
                });



    }




}
