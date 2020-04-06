package fr.cocoraid.capitalismcraft.utils.nms.entity;



import fr.cocoraid.capitalismcraft.utils.Utils;
import net.minecraft.server.v1_15_R1.*;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_15_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PacketArmorStand extends PacketEntity {

    private Location location;
    private EntityArmorStand armorStand;
    private PacketPlayOutEntityEquipment equip;
    private ItemStack head;
    private String title;


    public PacketArmorStand(Player p, Location location) {
        super(p,location);
        this.location = location;
        this.p = p;
        armorStand = new EntityArmorStand(EntityTypes.ARMOR_STAND,((CraftWorld)location.getWorld()).getHandle());
        armorStand.setLocation(location.getX(),location.getY(),location.getZ(),location.getYaw(),location.getPitch());
        this.entity = armorStand;
    }

    public PacketArmorStand(List<Player> viewers, Location location) {
        super(viewers,location);
        this.location = location;
        this.p = p;
        armorStand = new EntityArmorStand(EntityTypes.ARMOR_STAND,((CraftWorld)location.getWorld()).getHandle());
        armorStand.setLocation(location.getX(),location.getY(),location.getZ(),location.getYaw(),location.getPitch());
        this.entity = armorStand;
    }

    public PacketArmorStand setAsNameDisplayer(String displayName) {
        this.title = displayName;
        armorStand.setCustomName(new ChatComponentText(displayName));
        armorStand.setCustomNameVisible(true);
        armorStand.setInvisible(true);
        return this;
    }

    public PacketArmorStand setAsItemDisplayer(ItemStack item) {
        armorStand.setInvisible(true);
        armorStand.setSmall(true);
        this.head = item;
        equip = new PacketPlayOutEntityEquipment(armorStand.getId(), EnumItemSlot.HEAD, CraftItemStack.asNMSCopy(item));
        return this;
    }

    public void rotate(float yaw) {
        PacketPlayOutEntity.PacketPlayOutEntityLook rotate = new PacketPlayOutEntity.PacketPlayOutEntityLook(armorStand.getId(), Utils.toPackedByte(yaw),(byte)0,true);
        sendPacket(rotate);
        this.location.setYaw(yaw);
    }

    public void updateName(String name) {
        armorStand.setCustomName(new ChatComponentText(name));
        PacketPlayOutEntityMetadata meta = new PacketPlayOutEntityMetadata(armorStand.getId(),armorStand.getDataWatcher(),true);
        sendPacket(meta);
    }

    public void updateHead(ItemStack item) {
        this.head = item;
        equip = new PacketPlayOutEntityEquipment(armorStand.getId(),EnumItemSlot.HEAD, CraftItemStack.asNMSCopy(item));
        sendPacket(equip);
    }


    @Override
    public void spawn() {
        super.spawn();
        if(equip != null)
            sendPacket(equip);
    }

    public EntityArmorStand getArmorStand() {
        return armorStand;
    }

    public String getTitle() {
        return title;
    }

    public ItemStack getHead() {
        return head;
    }

    public boolean isSmall() {
        return armorStand.isSmall();
    }
}
