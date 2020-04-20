package fr.cocoraid.capitalismcraft.nms;

import fr.cocoraid.capitalismcraft.utils.nms.Reflection;
import net.minecraft.server.v1_15_R1.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.event.vehicle.VehicleUpdateEvent;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;

public class CustomMinecartFurnace extends EntityMinecartFurnace {

    private static final Reflection.FieldAccessor aoField = Reflection.getField(EntityMinecartAbstract.class,boolean.class,0);

    private static final Reflection.FieldAccessor aqField = Reflection.getField(EntityMinecartAbstract.class,int.class,0);
    private static final Reflection.FieldAccessor arField = Reflection.getField(EntityMinecartAbstract.class,double.class,0);
    private static final Reflection.FieldAccessor asField = Reflection.getField(EntityMinecartAbstract.class,double.class,1);
    private static final  Reflection.FieldAccessor atField = Reflection.getField(EntityMinecartAbstract.class,double.class,2);
    private static final Reflection.FieldAccessor auField = Reflection.getField(EntityMinecartAbstract.class,double.class,3);
    private static final Reflection.FieldAccessor avField = Reflection.getField(EntityMinecartAbstract.class,double.class,4);

    private static final Reflection.FieldAccessor eField = Reflection.getField(Reflection.getMinecraftClass("EntityMinecartFurnace"),int.class,0);




    private Entity last;
    private Vec3D lastMot;
    private float lastYaw;
    private float lastPitch;

    private List<EntityMinecartAbstract> minecarts = new ArrayList<>();



    public CustomMinecartFurnace(Location loc) {
        super(EntityTypes.FURNACE_MINECART,((CraftWorld)loc.getWorld()).getHandle());
        eField.set(this,9999);
        this.noclip = true;
    }

    public  void spawn(Location loc) {
        setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
        ((CraftWorld)loc.getWorld()).getHandle().addEntity(this);
    }


    @Override
    public void collide(Entity entity) {
        if(!minecarts.contains(entity)) {
            if(entity instanceof EntityMinecartAbstract && !(entity instanceof EntityMinecartFurnace))
                minecarts.add((EntityMinecartAbstract)entity);
        }
        super.collide(entity);

    }

    @Override
    protected void i() {

    }

    @Override
    protected double getMaxSpeed() {
        return 0.6D;
    }

    @Override
    public Vector getDerailedVelocityMod() {
        return new Vector(0, 0, 0);
    }

    @Override
    public void setDerailedVelocityMod(Vector derailed) {

    }

    @Override
    public void tick() {



        int aq = (int) aqField.get(this);
        double ar = (double) arField.get(this);
        double as = (double) asField.get(this);
        double at = (double) atField.get(this);
        double au = (double) auField.get(this);
        double av = (double) avField.get(this);
        boolean ao = (boolean) aoField.get(this);

        int e = (int) eField.get(this);

        double prevX = locX();
        double prevY = locY();
        double prevZ = locZ();
        float prevYaw = this.yaw;
        float prevPitch = this.pitch;
        if (getType() > 0)
            c(getType() - 1);
        if (getDamage() > 0.0F)
            setDamage(getDamage() - 1.0F);
        if (locY() < -64.0D)
            af();
        if (this.world.isClientSide) {
            if (aq > 0) {
                double d0 = locX() + (ar - locX()) / aq;
                double d1 = locY() + (as - locY()) / aq;
                double d2 = locZ() + (at - locZ()) / aq;
                double d3 = MathHelper.g(au - this.yaw);
                this.yaw = (float)(this.yaw + d3 / aq);
                this.pitch = (float)(this.pitch + (av - this.pitch) / aq);
                aqField.set(this,aq--);
                setPosition(d0, d1, d2);
                setYawPitch(this.yaw, this.pitch);
            } else {
                Z();
                setYawPitch(this.yaw, this.pitch);
            }
        } else {
            if (!isNoGravity())
                setMot(getMot().add(0.0D, -0.04D, 0.0D));
            int i = MathHelper.floor(locX());
            int j = MathHelper.floor(locY());
            int k = MathHelper.floor(locZ());
            if (this.world.getType(new BlockPosition(i, j - 1, k)).a(TagsBlock.RAILS))
                j--;
            BlockPosition blockposition = new BlockPosition(i, j, k);
            IBlockData iblockdata = this.world.getType(blockposition);
            if (iblockdata.a(TagsBlock.RAILS)) {
                this.b(blockposition, iblockdata);
                if (iblockdata.getBlock() == Blocks.ACTIVATOR_RAIL) {
                    this.a(i, j, k, true);
                }
            }
            else {
                //this.i();
            }
            checkBlockCollisions();
            this.pitch = 0.0F;
            double d4 = this.lastX - locX();
            double d5 = this.lastZ - locZ();
            if (d4 * d4 + d5 * d5 > 0.001D) {
                this.yaw = (float)(MathHelper.d(d5, d4) * 180.0D / Math.PI);
                if (ao)
                    this.yaw += 180.0F;
            }
            double d6 = MathHelper.g(this.yaw - this.lastYaw);
            if (d6 < -170.0D || d6 >= 170.0D) {
                this.yaw += 180.0F;
                aoField.set(this, !ao);

            }
            setYawPitch(this.yaw, this.pitch);
            CraftWorld craftWorld = this.world.getWorld();
            Location from = new Location(craftWorld, prevX, prevY, prevZ, prevYaw, prevPitch);
            Location to = new Location(craftWorld, locX(), locY(), locZ(), this.yaw, this.pitch);
            Vehicle vehicle = (Vehicle)getBukkitEntity();
            this.world.getServer().getPluginManager().callEvent(new VehicleUpdateEvent(vehicle));
            if (!from.equals(to))
                this.world.getServer().getPluginManager().callEvent(new VehicleMoveEvent(vehicle, from, to));

            aC();

            if (!this.world.p_()) {
                if (e > 0)
                    //eField.set(this,e--);
                    if (e <= 0) {
                        this.b = 0.0D;
                        this.c = 0.0D;
                    }
                n((e > 0));
            }
            if (v() && this.random.nextInt(4) == 0)
                this.world.addParticle(Particles.LARGE_SMOKE, locX(), locY() + 0.8D, locZ(), 0.0D, 0.0D, 0.0D);
        }



       /* Vec3D v = getLookDirection();
        for (int i = 0; i < minecarts.size(); i++) {
            final Entity entity = minecarts.get(i);
            Vec3D mot = entity.getMot();
            if(lastMot != null) {
                entity.move(EnumMoveType.SELF, lastMot);
                entity.yaw = lastYaw;
                entity.pitch = lastPitch;
            }

            last = entity;
            lastMot = mot;
            lastYaw = yaw;
            lastPitch = pitch;
        }*/



    }
}
