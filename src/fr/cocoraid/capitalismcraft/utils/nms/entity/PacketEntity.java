package fr.cocoraid.capitalismcraft.utils.nms.entity;

import net.minecraft.server.v1_15_R1.*;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class PacketEntity {


    protected List<Player> viewers = new ArrayList<>();

    protected EntityLiving entity;
    protected Location location;
    protected Player p;
    public PacketEntity(Player p, Location location) {
        this.location = location;
        this.p = p;
    }

    public PacketEntity(List<Player> viewers, Location location) {
        this.location = location;
        this.viewers = viewers;
    }

    public void teleport(Location location) {
        this.location = location;
        fakeTeleport(location);
    }

    public void fakeTeleport(Location location) {
        entity.setLocation(location.getX(),location.getY(),location.getZ(),location.getYaw(),location.getPitch());
        PacketPlayOutEntityTeleport teleport = new PacketPlayOutEntityTeleport(entity);
        sendPacket(teleport);
    }



    public void spawn() {
        PacketPlayOutSpawnEntityLiving spawn = new PacketPlayOutSpawnEntityLiving(entity);
        sendPacket(spawn);
    }

    public void remove() {
        PacketPlayOutEntityDestroy destroy = new PacketPlayOutEntityDestroy(entity.getId());
        sendPacket(destroy);
    }

    protected void sendPacket(Packet packet) {
        if(p != null)
            ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
        if(!viewers.isEmpty())
            viewers.stream().filter(cur -> cur.getWorld().equals(location.getWorld())).forEach(cur -> {
                ((CraftPlayer)cur).getHandle().playerConnection.sendPacket(packet);
            });
    }

    public Location getLocation() {
        return location;
    }
}
