package fr.cocoraid.capitalismcraft.task;

import org.bukkit.*;
import org.bukkit.scheduler.BukkitRunnable;

public class SceneEffectTask extends BukkitRunnable {

    private World world = Bukkit.getWorld("build");

    private final Location[] SMOKE_TRAIN = new Location[2];
    private final Location ELECTRIC_FAIL = new Location(world,-104 + 0.5,60,-8 + 0.5);

    {
        SMOKE_TRAIN[0] = new Location(world,68, 60,91);
        SMOKE_TRAIN[1] =   new Location(world,72, 60,90);
    }


    private int time = 0;

    @Override
    public void run() {

        for (Location l : SMOKE_TRAIN) {
            l.getWorld().spawnParticle(Particle.CAMPFIRE_COSY_SMOKE,l.clone().add(0.5,1,0.5),5,0.01,0.01,0.01,0.05F,null,true);
            l.getWorld().spawnParticle(Particle.SMOKE_LARGE,l.clone().add(0.5,1,0.5),2,0.2,0.5,0.2,0.1F,null,true);
        }


        if(time % (20 * 4) == 0) {
            if(Math.random() > 0.5) {
                ELECTRIC_FAIL.getWorld().spawnParticle(Particle.FALLING_LAVA, ELECTRIC_FAIL, 3, 0.2, 0.2, 0.2, 0.1F);
                ELECTRIC_FAIL.getWorld().spawnParticle(Particle.FLASH, ELECTRIC_FAIL, 1, 0.2, 0.5, 0.2, 0.1F);
                ELECTRIC_FAIL.getWorld().playSound(ELECTRIC_FAIL, Sound.ENTITY_EVOKER_CAST_SPELL,1,2);
                ELECTRIC_FAIL.getWorld().playSound(ELECTRIC_FAIL, Sound.ENTITY_ILLUSIONER_CAST_SPELL,0.5F,2);
            }
        }



        time++;
        time%=900;
    }


}
