package fr.cocoraid.capitalismcraft.warzone;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.utils.Utils;
import fr.cocoraid.capitalismcraft.warzone.event.EnterSafezoneEvent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class TagDetectEvent implements Listener {


    /*
    damager obtient slowness en quittant la zone
on peut taper avec la flèche depuis la zone
Afficher un msg quand on entre dans la zone pop
le message, vous entrez en mode pvp s’affiche tous les x temps
     */

    private String world = "build";

    private CapitalismCraft instance;
    public TagDetectEvent(CapitalismCraft instance) {
        this.instance = instance;
        new RecentHitResetTask().runTaskTimerAsynchronously(instance,0,20*4);
        new Safezone().runTaskTimer(instance,0,10);
    }



    //prevent teleport when tagged
    @EventHandler(priority = EventPriority.LOWEST)
    public void teleport(PlayerTeleportEvent e) {

    }

    /**
     * Check if players and in warzone -> add both to the tag list
     * if safezone cancel, if player hitted is contained in the tagged list and the damager has the kit, add it
     *
     * check distance, if distance is small don't cancel tag
     *
     * @param e
     */
    @EventHandler
    public void damage(EntityDamageByEntityEvent e) {
        if(!e.getEntity().getWorld().getName().equalsIgnoreCase(world)) return;
        if(e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            Player damager = (Player) e.getDamager();
            Player victim = (Player) e.getEntity();
            CapitalistPlayer victimCapitalist = CapitalistPlayer.getCapitalistPlayer(victim);
            CapitalistPlayer damagerCapitalist = CapitalistPlayer.getCapitalistPlayer(damager);
            //Prevent victim to be damaged by a player if safe zone or without kit :)
            if((!victimCapitalist.isTagged() && !Safezone.getEnteredPVPZonePlayers().contains(victim.getUniqueId()))) {
                e.setCancelled(true);
                return;
            }
            damagerCapitalist.setRecentHit(true);
            victimCapitalist.setRecentHit(true);
            //If victim is tagged -> allow damage
            if(victimCapitalist.isTagged()) return;

            //Apply tag for both
            victimCapitalist.setTagged(true);
            if(!damagerCapitalist.isTagged()) {
                damagerCapitalist.setTagged(true);
                removeTagLater(damager,true);
            }
            removeTagLater(victim, true);
        }

    }

    @EventHandler
    public void quitTagged(PlayerQuitEvent e) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
        if(cp.isTagged()) {
            //Recompense pour ceux qui ont tapés
        }
    }



    @EventHandler
    public void enterSafe(EnterSafezoneEvent e) {
        if(CapitalistPlayer.getCapitalistPlayer(e.getPlayer()).isTagged()) {
            e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW,20 * 3, 3, true,true));
            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_ITEM_BREAK,1,0);
        }
    }


    public void removeTagLater(Player p, boolean actionbar) {
        if(actionbar) {
            //send msg player is tagged
            Utils.sendActionBar(p,ChatColor.RED + " Vous entrez en mode pvp !");
        }
        CapitalistPlayer tagged = CapitalistPlayer.getCapitalistPlayer(p);
        new BukkitRunnable() {
            public void run() {
                if(tagged.getPlayer().isOnline()) {
                    if (tagged.isTagged()) {
                        if(tagged.hasRecentHit()) {
                            removeTagLater(tagged.getPlayer(), true);
                            return;
                        }
                        tagged.setRecentHit(false);
                        tagged.setTagged(false);

                        //si encore dans la zone
                        if (Safezone.getEnteredPVPZonePlayers().contains(p.getUniqueId())) {


                        } else {
                            //OldSchoolPvp.getInstance().getNametag().setPvpTeam(p);
                        }

                        Utils.sendActionBar(p,ChatColor.AQUA + " Vous n'êtes plus en pvp ");
                    }
                }
            }
        }.runTaskLater(instance, 20 * 20);
    }

}
