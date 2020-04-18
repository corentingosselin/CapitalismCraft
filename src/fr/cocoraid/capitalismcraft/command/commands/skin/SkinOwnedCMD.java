package fr.cocoraid.capitalismcraft.command.commands.skin;

import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.inventory.GenderInventory;
import fr.cocoraid.capitalismcraft.skin.inventory.YourSkinsInventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SkinOwnedCMD implements CommandExecutor {


    public SkinOwnedCMD() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) return false;

        Player p = (Player) sender;
        if (args.length > 0) {
            p.sendMessage("§3Les commandes pour la gestion des skins: ");
            p.sendMessage(" §bAfficher sa collection: §f/skins");
            p.sendMessage(" §bAcheter un skin: §f/skin shop");
        } else {
            //open skin shop inventory
            CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(p);
            if (cp.getPlayerdata().getGender() == Gender.UNDETERMINED) {
                cp.getPlayer().closeInventory();
                GenderInventory.INVENTORY.open(cp.getPlayer());
                return false;
            }
            YourSkinsInventory.INVENTORY.open(p);

        }
        return false;
    }
}