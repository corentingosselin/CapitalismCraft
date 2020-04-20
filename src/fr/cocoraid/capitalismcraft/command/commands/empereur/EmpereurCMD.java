package fr.cocoraid.capitalismcraft.command.commands.empereur;

import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EmpereurCMD implements CommandExecutor {


    public EmpereurCMD() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) return false;

        Player p = (Player) sender;
        if(!p.hasPermission("cc.empereur")) return false;
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(p);
        if (args.length == 0) {
            p.sendMessage("§3Les commandes dédiées à §cl'empereur: ");
            p.sendMessage(" §bActiver/désactiver l'aggro des monstres: §f/emp aggro ");
        } else {
            if(args[0].equalsIgnoreCase("aggro")) {
                if(cp.isEmperorCanBeTargetedByMonsters()) {
                    cp.setEmperorTargetedByMonsters(false);
                    p.sendMessage("§cLes monstres ne vous attaquerons plus !");
                } else {
                    cp.setEmperorTargetedByMonsters(true);
                    p.sendMessage("§cLes monstres viennent désormais vous attaquer !");
                }
            }
        }
        return false;
    }
}
