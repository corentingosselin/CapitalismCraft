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
        if(!mentioner.hasPermission("prodigymention.use")) return message;


        List<Player> targets = Bukkit.getOnlinePlayers().stream()
                .filter(cur -> !cur.equals(mentioner))
                .filter(cur ->  StringUtils.containsIgnoreCase(message.toLowerCase(), cur.getName().toLowerCase())) //check name
                .filter(cur -> cur.hasPermission("prodigymention.bypass")) //check if receiver can bypass
                .collect(Collectors.toList());




        //just send message if the player has spammed
        if(!mentioner.hasPermission("prodigymention.antispam.bypass") && antiSpam.contains(mentioner.getUniqueId())) {
            return message;
        }


        String finalMessage = message;
        //transform message into colored message

        //String[] words = finalMessage.split("\\W+");
        String[] normal =  Arrays.stream(Lists.transform(targets, HumanEntity::getName).toArray()).toArray(String[]::new);
        String[] colored = Arrays.stream(normal).toArray(String[]::new);
        for (int index =0; index < colored.length; index++){
            colored[index] = colored[index].replace(colored[index], ChatColor.GOLD + colored[index] + ChatColor.RESET);
        }
        StringUtils.replaceEach(finalMessage, normal, colored);



        if(!antiSpam.contains(mentioner.getUniqueId()))
            antiSpam.add(mentioner.getUniqueId());
        new BukkitRunnable() {
            public void run() {
                antiSpam.remove(mentioner.getUniqueId());
            }
        }.runTaskLaterAsynchronously(instance, 20L * 5);



        //let's notify targets
        targets.forEach(t -> {

            t.getWorld().spawnParticle(Particle.NOTE,t.getLocation().add(0,1,0),10, 0.5,0.5,0.5,0.1F);

            Utils.sendActionBar(t,"§2 " + mentioner.getName() + " §6vous a mentionné !");

            Sound sound = Sound.BLOCK_NOTE_BLOCK_PLING;
                t.playSound(t.getLocation(), sound, 2, 1);
                mentioner.playSound(mentioner.getLocation(), sound, 2, 2);
                new BukkitRunnable() {
                    public void run() {
                        t.playSound(t.getLocation(), sound, 2, 0);
                        mentioner.playSound(mentioner.getLocation(), sound, 2, 0);

                    }
                }.runTaskLater(instance, 4L);


        });


        return finalMessage;

    }

}
