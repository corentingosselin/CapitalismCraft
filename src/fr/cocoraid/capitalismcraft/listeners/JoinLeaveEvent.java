package fr.cocoraid.capitalismcraft.listeners;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class JoinLeaveEvent implements Listener {


    private static List<String> exemptedSkinPlayers = Arrays.asList("cocoraid","Xynoss_2000");

    private CapitalismCraft instance;
    public JoinLeaveEvent(CapitalismCraft instance) {
        this.instance = instance;
    }


    @EventHandler
    public void join(PlayerJoinEvent e) {
        new CapitalistPlayer(e.getPlayer());
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
        instance.getPlayerDatabase().registerPlayer(e.getPlayer());
        if(cp.getPlayerdata().getLastKnownName() == null) {
            cp.getPlayerdata().setLastKnownName(e.getPlayer().getDisplayName());
        } else {
            //player has changed name
            if(!cp.getPlayerdata().getLastKnownName().equals(e.getPlayer().getName())) {
                cp.getPlayerdata().addPreviousName(cp.getPlayerdata().getLastKnownName());
                cp.getPlayerdata().setLastKnownName(e.getPlayer().getName());
                //1 week
                cp.getPlayerdata().setTimeLeftNotify(System.currentTimeMillis() + 168 * 3600 * 1000);
                e.getPlayer().sendMessage("§c[§4NOUVEAU PSEUDO§c] Nous avons détecté que vous avez changé de pseudo minecraft");
                e.getPlayer().sendMessage("§cPar conséquent, les joueurs en seront notifiés pendant 1 semaine, merci de votre compréhension !");
            } else {
                if(System.currentTimeMillis() > cp.getPlayerdata().getTimeLeftNotify()) {
                    //no need to notify more than 1 week :)
                    cp.getPlayerdata().setTimeLeftNotify(-1);
                } else {
                    e.setJoinMessage("§8(§7Anciennement " + cp.getPlayerdata().getNameHistory().getLast() + "§8) " + e.getJoinMessage());
                }
            }
        }

        if(exemptedSkinPlayers.contains(e.getPlayer().getName())) {
            return;
        }
        if(cp.getPlayerdata().getCurrentSkin() <= -1) {
            if(cp.getPlayerdata().getSkinsPurchased().isEmpty()) {
                List<Skin> skins = Skin.getSkins().stream().filter(s -> s.getRarity() == SkinRarity.DEFAULT).collect(Collectors.toList());
                Random rand = new Random();
                Skin randomElement = skins.get(rand.nextInt(skins.size()));

            instance.getSkinManager().setSkin(randomElement,e.getPlayer());
            }
            return;
        }
        Skin skin = Skin.getSkins().get(cp.getPlayerdata().getCurrentSkin());
        instance.getSkinManager().setSkin(skin,e.getPlayer());
    }

    @EventHandler
    public void leave(PlayerQuitEvent e) {
        CapitalistPlayer.getCapitalistPlayer(e.getPlayer()).unregister();
        CapitalistPlayer.getCapitalistPlayers().remove(e.getPlayer().getUniqueId());
    }

}
