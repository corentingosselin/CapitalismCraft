package fr.cocoraid.capitalismcraft.forcefield;

import fr.cocoraid.capitalismcraft.utils.Utils;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class ForcefieldPlayer extends BukkitRunnable {



    private Player player;
    public ForcefieldPlayer(Player player) {
        this.player = player;
    }


    @Override
    public void run() {


        UtilMath.getClosestPlayersFromLocation(p.getLocation(),config.radius).stream().filter(cur -> !cur.hasMetadata("NPC") &&!cur.equals(p) && !cur.hasPermission("prodigyforcefield.bypass")).forEach(cur -> {

            UtilMath.bumpEntity(cur,p.getLocation(),config.power,config.ypower);

            if(!spam.containsKey(cur)) {

                if(config.particle) {
                    for (int i = 0; i < config.particleNumber; i++) {
                        Vector vector = UtilMath.getRandomVector().multiply(config.radius);
                        vector.setY(Math.abs(vector.getY()));
                        location.add(vector);
                        p.getWorld().spawnParticle(Particle.valueOf(config.particleType), location, 1, 0, 0, 0, 0F);
                        location.subtract(vector);
                    }
                }

                if(config.sound)
                    cur.playSound(cur.getLocation(), config.soundType, config.volume, config.pitch);
                if(!config.denyMessage.equalsIgnoreCase("none"))
                    cur.sendMessage(CC.colored(config.denyMessage));
                if(!config.denyTitle.equalsIgnoreCase("none"))
                    cur.sendTitle("", CC.colored(config.denyTitle));
            }
            spam.put(cur,20);
        });
    }
});


    }
}
