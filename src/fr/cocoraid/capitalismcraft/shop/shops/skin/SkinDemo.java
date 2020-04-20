package fr.cocoraid.capitalismcraft.shop.shops.skin;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.utils.Utils;
import fr.cocoraid.capitalismcraft.utils.nms.NMS;
import net.minecraft.server.v1_15_R1.*;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_15_R1.util.CraftChatMessage;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class SkinDemo {

    private EntityPlayer model;
    private EntityArmorStand[] textLines = new EntityArmorStand[4];

    private SkinShop shop;
    private Player player;
    private Skin skin;
    public SkinDemo(SkinShop shop,Player player, Skin skin) {
        this.player = player;
        this.skin = skin;
        this.shop = shop;


    }




    private BukkitTask task;

    public void init() {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        spawnText();
        demo();
        cp.setSkinDemo(this);
        this.task = new BukkitRunnable() {
            @Override
            public void run() {
                if(!player.isOnline()) {
                    task.cancel();
                    return;
                }
                model.setLocation(model.locX(),model.locY(),model.locZ(),model.yaw + 2, model.pitch);
                PacketPlayOutEntity.PacketPlayOutEntityLook look = new PacketPlayOutEntity.PacketPlayOutEntityLook(model.getId(),Utils.toPackedByte(model.yaw),Utils.toPackedByte(model.pitch),true);
                PacketPlayOutEntityHeadRotation rot = new PacketPlayOutEntityHeadRotation(model,Utils.toPackedByte(model.yaw));
                NMS.sendPackets(player,rot, look);


            }
        }.runTaskTimerAsynchronously(CapitalismCraft.getInstance(),0,0);

    }

    //habitant
    //rareté:
    //prix irl:
    //prix:
    private void spawnText() {
        WorldServer worldServer = ((CraftWorld) shop.getWORLD()).getHandle();
        Location l = shop.getSHOWCASE().clone().add(0,1.7,0);
        for(int i = 0; i < 4; i++) {
            EntityArmorStand es = new EntityArmorStand(EntityTypes.ARMOR_STAND,worldServer);
            es.setLocation(l.getX(),l.getY(),l.getZ(),l.getYaw(),l.getPitch());
            es.setInvisible(true);
            es.setSmall(true);
            es.setCustomNameVisible(true);
            textLines[i] = es;
            PacketPlayOutSpawnEntityLiving spawn =  new PacketPlayOutSpawnEntityLiving(es);
            NMS.sendPackets(player,spawn);
            l.subtract(0,0.3,0);
        }
        updateText();
    }

    private void demo() {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        if(cp.getSkinDemo() != null) {
            PacketPlayOutEntityDestroy destroy = new PacketPlayOutEntityDestroy(cp.getSkinDemo().model.getId());
            NMS.sendPackets(player,destroy);
        }
        this.model = NMS.spawnNPC(player,null,skin.getTextureValue(),skin.getTextureSignature(),shop.getSHOWCASE());
    }



    private void updateText() {
        textLines[0].setCustomName(CraftChatMessage.fromStringOrNull(skin.getDisplayName()));
        textLines[1].setCustomName(CraftChatMessage.fromStringOrNull("§3Rareté " + skin.getRarity().getDisplayname()));
        textLines[2].setCustomName(CraftChatMessage.fromStringOrNull("§6Prix IRL: §e" + skin.getRarity().getRealPrice() + " euros"));
        String price = Utils.formatValue(skin.getRarity().getPrice());
        textLines[3].setCustomName(CraftChatMessage.fromStringOrNull("§2Prix: §a" + price + " $"));
        for (EntityArmorStand text : textLines) {
            PacketPlayOutEntityMetadata meta =  new PacketPlayOutEntityMetadata(text.getId(),text.getDataWatcher(),true);
            NMS.sendPackets(player,meta);
        }



    }

    private void updateTexture() {
        NMS.updateSkin(player,skin.getTextureValue(),skin.getTextureSignature(),model);
    }

    public void updateSkin(Skin skin) {
        this.skin = skin;
        updateText();
        updateTexture();
    }


    public void exitShop() {
        task.cancel();

        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        PacketPlayOutEntityDestroy destroy = new PacketPlayOutEntityDestroy(model.getId());
        NMS.sendPackets(player,destroy);

        int[] ids = new int[textLines.length];
        int i = 0;
        for (EntityArmorStand textLine : textLines) {
            ids[i] = textLine.getId();
            i++;
        }
        PacketPlayOutEntityDestroy destroyLine = new PacketPlayOutEntityDestroy(ids);
        NMS.sendPackets(player,destroyLine);
        cp.setSkinDemo(null);
    }

    public Skin getSkin() {
        return skin;
    }
}
