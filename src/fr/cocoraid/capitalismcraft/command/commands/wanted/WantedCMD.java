package fr.cocoraid.capitalismcraft.command.commands.wanted;

import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.inventory.GenderInventory;
import fr.cocoraid.capitalismcraft.skin.inventory.select.SkinsInventory;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class WantedCMD implements CommandExecutor {


    public WantedCMD() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) return false;

        Player p = (Player) sender;
        if (args.length == 0) {
            p.sendMessage("§3Les commandes pour mettre les tête à prix: ");
            p.sendMessage("");
            p.sendMessage(" §bMettre une tête à prix: §f/wanted add <joueur> <prix> <temps>");
            p.sendMessage(" §fInfo: Si vous mettez un prix plus élevé qu'une prime existante, elle remplace l'ancienne");
            p.sendMessage("");
            p.sendMessage(" §bAfficher la liste des joueurs recherchés: §f/wanted list");
        } else {

            if(args.length == 3) {
                if(args[0].equalsIgnoreCase("add")) {



                    if(Bukkit.getPlayer(args[1]) != null && Bukkit.getPlayer(args[1]).isOnline()) {

                    }



                }
            }

            //open skin shop inventory


        }
        return false;
    }
}