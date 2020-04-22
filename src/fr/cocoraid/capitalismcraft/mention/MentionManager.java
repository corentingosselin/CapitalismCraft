package fr.cocoraid.capitalismcraft.mention;

import com.google.common.collect.Lists;
import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.utils.Utils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MentionManager {




    private CapitalismCraft instance;
    public MentionManager(CapitalismCraft instance) {
        this.instance = instance;
        registerEvents();
    }

    public void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new ChatMentionListener(this),instance);
    }


    private List<UUID> antiSpam = new ArrayList<>();

    public String mention(Player mentioner, String message, boolean isCancelled) {


        if(message.startsWith("/"))  return message;


        //everything concerning the sender....
        if(isCancelled && !mentioner.hasPermission("prodigymention.chatmuted.bypass"))  return message;

        boolean everyone = false;
        List<Player> targets;
        if(StringUtils.containsIgnoreCase(message.toLowerCase(),"@everyone") && mentioner.hasPermission("prodigymention.everyone")) {
            targets = Bukkit.getOnlinePlayers().stream()
                    .filter(cur -> !cur.equals(mentioner))
                    .collect(Collectors.toList());
            everyone = true;
        } else
            targets = Bukkit.getOnlinePlayers().stream()
                    .filter(cur -> !cur.equals(mentioner))
                    .filter(cur ->  StringUtils.containsIgnoreCase(message.toLowerCase(), cur.getName().toLowerCase())) //check name
                    .collect(Collectors.toList());

        if(targets.isEmpty()) return message;

        //just send message if the player has spammed
        if(!mentioner.hasPermission("prodigymention.antispam.bypass") && antiSpam.contains(mentioner.getUniqueId())) {
            return message;
        }


        if(!antiSpam.contains(mentioner.getUniqueId()))
            antiSpam.add(mentioner.getUniqueId());
        new BukkitRunnable() {
            public void run() {
                antiSpam.remove(mentioner.getUniqueId());
            }
        }.runTaskLaterAsynchronously(instance, 20L * 5);


        String finalMessage = message;
        //transform message into colored message


        if(everyone) {
            finalMessage = "§c" + finalMessage;
        } else {
            for (Player t : targets) {
                finalMessage = finalMessage.replace(t.getName(), ChatColor.GOLD + t.getName() + ChatColor.RESET);
            }
        }

        if(targets.size() > 1) {
            Utils.sendActionBar(mentioner,"§6Vous avez mentionné §2plusieurs joueurs");
        } else
            Utils.sendActionBar(mentioner,"§6Vous avez mentionné §2" + targets.get(0).getName());

        //let's notify targets
        targets.forEach(t -> {

            t.getWorld().spawnParticle(Particle.NOTE,t.getLocation().add(0,1,0),10, 0.5,0.5,0.5,0.1F);
            Sound sound = Sound.BLOCK_NOTE_BLOCK_PLING;
            if(mentioner.hasPermission("cc.marshal")) {
                t.playSound(mentioner.getLocation(), Sound.ENTITY_EVOKER_CAST_SPELL, 2, 1);
                t.sendTitle("","§2 " + mentioner.getDisplayName() + " §6vous a mentionné !");
            } else {
                t.sendTitle("", "§2 " + mentioner.getName() + " §6vous a mentionné !");

            }
            t.playSound(t.getLocation(), sound, 2, 1);
            mentioner.playSound(mentioner.getLocation(), sound, 2, 2);
            new BukkitRunnable() {
                public void run() {
                    if(t.isOnline())
                        t.playSound(t.getLocation(), sound, 2, 0);
                    if(mentioner.isOnline())
                        mentioner.playSound(mentioner.getLocation(), sound, 2, 0);

                }
            }.runTaskLater(instance, 4L);


        });


        return finalMessage;

    }

}
