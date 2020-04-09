package fr.cocoraid.capitalismcraft.warzone;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.utils.Utils;
import fr.cocoraid.capitalismcraft.warzone.event.EnterSafezoneEvent;
import fr.cocoraid.capitalismcraft.warzone.event.EnterWarzoneEvent;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.inventivetalent.glow.GlowAPI;

import java.util.*;
import java.util.stream.Collectors;

public class TagDetectEvent implements Listener {


    //peut pvp avec une flèche meme en hors zone

    //peut toucher avec une flèche meme de l'exterieur
    //peut toucher de l'interieur vers l'exterieur
    //attention au flèche qui provienne du meme damager
    //la deconnexion n'est pas trigged


    //when players must be glowed ?
    //when they are outside and with tag
    //or when they are outside and just tagged

    //To which people we must display glow ?
    //players who are outside

    //When should we remove the glow ?
    //when the player is entering the pvp zone or when the player is no longer tagged

    //when should we hide the glow from other ?
    // when the other is entering the pvp area



    //Call this method inside damage entity event if they are both inside the pvp area
    // don't forget to remove the player from the map when slowness added
    // key = player to slow, value = last damager
    private Map<UUID,UUID> playersToSlow = new HashMap<>();
    public void updatePlayerToSlow(Player damaged, Player damager) {
        //add player to slow down when leave the area
        playersToSlow.put(damaged.getUniqueId(),damager.getUniqueId());
        //check if the damager was not a previous damaged from this victim player
        if(playersToSlow.containsKey(damager.getUniqueId()) && playersToSlow.get(damager.getUniqueId()).equals(damaged.getUniqueId())) {
            playersToSlow.remove(damager.getUniqueId());
        }
    }



    private String world = "world";

    private CapitalismCraft instance;
    public TagDetectEvent(CapitalismCraft instance) {
        this.instance = instance;
        new RecentHitResetTask().runTaskTimerAsynchronously(instance,0,20*4);
        new Safezone().runTaskTimer(instance,0,10);
    }


    //autoriser tous les damages, si le damaged est à l'intérieur
    @EventHandler(priority = EventPriority.HIGH)
    public void damage(EntityDamageEvent e) {
        if(!e.getEntity().getWorld().getName().equalsIgnoreCase(world)) return;
        if(e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            //allow pvp
            if(Safezone.getEnteredPVPZonePlayers().contains(p.getUniqueId())) {
                e.setCancelled(false);
            }
        }
    }


    public List<Player> getAllPlayersInSafeZone() {
        return Bukkit.getOnlinePlayers().stream().filter(cur ->  cur.getWorld().getName().equalsIgnoreCase(world))
                .filter(cur -> !Safezone.getEnteredPVPZonePlayers().contains(cur.getUniqueId())).collect(Collectors.toList());
    }




    public void tagPlayer(Player player, boolean resend) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        if(cp.isTagged() && !resend) {
            return;
        }
        cp.setTagged(true);
        if(!resend) {
            //si le joueur est à l'extérieur il devient rouge pour tous les joueurs en dehors de la zone pvp
            if(!Safezone.getEnteredPVPZonePlayers().contains(player.getUniqueId()))
                GlowAPI.setGlowing(player, GlowAPI.Color.RED, getAllPlayersInSafeZone());

            Utils.sendActionBar(player,"§cVous êtes désormais en mode pvp !");
        }

        //maybe could be async
        Bukkit.getScheduler().runTaskLaterAsynchronously(instance, () -> {
            if (player.isOnline()) {
                if (cp.isTagged()) {
                    if (cp.hasRecentHit()) {
                        tagPlayer(player, true);
                        return;
                    }
                    cp.setRecentHit(false);
                    cp.setTagged(false);
                    playersToSlow.remove(player.getUniqueId());
                    Utils.sendActionBar(player,"§bVous n'êtes plus en mode pvp !");
                    GlowAPI.setGlowing(player,false, Bukkit.getOnlinePlayers());

                }
            }
        }, 20 * 20);


    }


    //interdir les flèches provenant de l'exterieur
    @EventHandler(priority = EventPriority.HIGHEST)
    public void damageOther(EntityDamageByEntityEvent e) {
        if(!e.getEntity().getWorld().getName().equalsIgnoreCase(world)) return;
        if(e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            CapitalistPlayer victimCapitalist = CapitalistPlayer.getCapitalistPlayer(p);

            if(Safezone.getEnteredPVPZonePlayers().contains(p.getUniqueId())) {
                if(e.getDamager() instanceof Player) {
                    Player damager = (Player) e.getDamager();
                    //si les 2 sont dans la zone pvp
                    if (Safezone.getEnteredPVPZonePlayers().contains(damager.getUniqueId())) {
                        e.setCancelled(false);
                        updatePlayerToSlow(p, damager);
                        CapitalistPlayer damagerCapitalist = CapitalistPlayer.getCapitalistPlayer(damager);
                        //and tag the both
                        tagPlayer(p,false);
                        tagPlayer(damager,false);
                    } else {
                        //prevent damager to hit from outside
                        e.setCancelled(true);
                    }
                }
                //prevent arrow damage outside
                if(e.getDamager() instanceof Arrow) {
                    Arrow arrow = (Arrow) e.getDamager();
                    if(arrow.getShooter() instanceof Player) {
                        Player damager = (Player) arrow.getShooter();
                        if(!Safezone.getEnteredPVPZonePlayers().contains(damager.getUniqueId())) {
                            System.out.println("should cancel");
                            e.setCancelled(true);
                        }
                    }
                }
            } else {
                //if victim outside the pvp
                if(e.getDamager() instanceof Player) {
                    //tag damager if victim is tagged
                    if(victimCapitalist.isTagged()) {
                        e.setCancelled(false);
                        tagPlayer(((Player)e.getDamager()),false);
                    }
                } else if(e.getDamager() instanceof Arrow) {
                    System.out.println("triggered arrow, damaged outside pvp");
                    Arrow arrow = (Arrow) e.getDamager();
                    if(arrow.getShooter() instanceof Player) {
                        Player damager = (Player) arrow.getShooter();
                        System.out.println("damager: " + damager);
                        if(!victimCapitalist.isTagged()) {
                            System.out.println("triggered !");
                            e.setCancelled(false);
                            tagPlayer(damager, false);
                        }
                    }
                }

            }


            //update recent hit
            if(e.getDamager() instanceof Player) {
                Player damager = (Player) e.getDamager();
                CapitalistPlayer damagerCapitalist = CapitalistPlayer.getCapitalistPlayer(damager);
                if(victimCapitalist.isTagged())
                    victimCapitalist.setRecentHit(true);
                if(damagerCapitalist.isTagged())
                    damagerCapitalist.setRecentHit(true);
            } else if(e.getDamager() instanceof Arrow) {
                Arrow arrow = (Arrow) e.getDamager();
                if(arrow.getShooter() instanceof Player) {
                    Player damager = (Player) arrow.getShooter();
                    CapitalistPlayer.getCapitalistPlayer(damager).setRecentHit(true);
                }
            }


        }
    }

    @EventHandler
    public void exitPVP(EnterSafezoneEvent e) {
        List<Player> list = new ArrayList<>();

        //send other glow
        CapitalistPlayer.getCapitalistPlayers().values().stream()
                .filter(cp -> cp.isTagged() && Safezone.getEnteredPVPZonePlayers().contains(cp.getPlayer().getUniqueId()))
                .forEach(cp -> list.add(cp.getPlayer()));
        if(!list.isEmpty()) {
            GlowAPI.setGlowing(list, GlowAPI.Color.RED, e.getPlayer());
        }

        //si le joueur est taggé
        if(CapitalistPlayer.getCapitalistPlayer(e.getPlayer()).isTagged()) {
            //set glow himself
            GlowAPI.setGlowing(e.getPlayer(), GlowAPI.Color.RED, getAllPlayersInSafeZone());
            //reset the damaged
            if(playersToSlow.containsKey(e.getPlayer().getUniqueId())) {
                e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20 * 5, 3, true, true));
                e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_ITEM_BREAK, 1, 0);
                Utils.sendActionBar(e.getPlayer(),"§6Ne tentez pas de vous échapper pendant un combat !");
                UUID damagerUUID = playersToSlow.get(e.getPlayer().getUniqueId());
                if(Bukkit.getPlayer(damagerUUID) != null && Bukkit.getPlayer(damagerUUID).isOnline())
                    Utils.sendActionBar(Bukkit.getPlayer(damagerUUID),"§4" + e.getPlayer().getName() + " §6 tente de vous échapper, vous pouvez le poursuivre !");
                playersToSlow.remove(e.getPlayer().getUniqueId());

            }
        }
    }


    @EventHandler
    public void enterPvp(EnterWarzoneEvent e) {
        //si le joueur a été touché
        if(CapitalistPlayer.getCapitalistPlayer(e.getPlayer()).isTagged()) {
            GlowAPI.setGlowing(e.getPlayer(),false, Bukkit.getOnlinePlayers());
        } else {
            Utils.sendActionBar(e.getPlayer(),"§cSoyez prudent ! c'est une zone dangereuse");
        }
    }

    //prevent teleport when tagged
    @EventHandler(priority = EventPriority.LOWEST)
    public void teleport(PlayerTeleportEvent e) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
        if(cp.isTagged()) {
            e.getPlayer().sendMessage("§cLa téléportation n'est pas autorisée lorsque vous êtes en pvp !");
            e.setCancelled(true);
        }
    }


    @EventHandler
    public void join(PlayerJoinEvent e) {
        if(badplayers.containsKey(e.getPlayer().getUniqueId())) {
            UUID uuidDamager = badplayers.get(e.getPlayer().getUniqueId());
            if(Bukkit.getPlayer(uuidDamager) != null && Bukkit.getPlayer(uuidDamager).isOnline()) {
                tagPlayer(e.getPlayer(), false);
                CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
                cp.setLastDamager(Bukkit.getPlayer(uuidDamager));
                cp.setRecentHit(true);
            }
            badplayers.remove(e.getPlayer().getUniqueId());
        }
    }

    private Map<UUID, UUID> badplayers = new HashMap<>();
    @EventHandler(priority = EventPriority.HIGH)
    public void quitTagged(PlayerQuitEvent e) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
        if (cp.isTagged()) {
            if (cp.hasLastDamager()) {
                Player damager = cp.getLastDamager();
                if (damager.isOnline()) {
                    badplayers.put(e.getPlayer().getUniqueId(), damager.getUniqueId());
                    Utils.sendActionBar(damager, "§6Le joueur " + e.getPlayer().getName() + " s'est déconnecté en pvp");
                    Bukkit.getScheduler().runTaskLaterAsynchronously(instance, () -> {
                        Utils.sendActionBar(damager, "§6Il dispose de 2 minutes pour rejoindre à nouveau");
                    }, 20 * 3);

                    Bukkit.getScheduler().runTaskLater(instance, () -> {
                        if (badplayers.containsKey(e.getPlayer().getUniqueId())) {
                            Utils.sendActionBar(damager, "§6Le joueur " + e.getPlayer().getName() + " ne s'est pas reconnecté: ");
                            //call kill event
                            List<ItemStack> list = Arrays.asList(e.getPlayer().getInventory().getContents());
                            PlayerDeathEvent event = new PlayerDeathEvent(e.getPlayer(),
                                    list,e.getPlayer().getExpToLevel(),
                                    "§cLe joueur §4" + e.getPlayer().getName() + " §cest mort car il s'est déconnecté pendant un duel ");
                            Bukkit.getPluginManager().callEvent(event);
                            badplayers.remove(e.getPlayer().getUniqueId());
                        }
                    }, 20 * 60 * 2);
                }
            }
        }
    }


}
