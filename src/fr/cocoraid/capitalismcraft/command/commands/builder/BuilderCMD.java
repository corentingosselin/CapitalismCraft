package fr.cocoraid.capitalismcraft.command.commands.builder;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.nms.CustomMinecartFurnace;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EvokerFangs;
import org.bukkit.entity.Player;

public class BuilderCMD implements CommandExecutor {


    private CapitalismCraft instance;
    public BuilderCMD(CapitalismCraft instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) return false;

        Player p = (Player) sender;
        if(!p.hasPermission("cc.builder")) return false;
        if (args.length == 0) {
            p.sendMessage("§3Les commandes dédiées aux builders: ");
            p.sendMessage(" §bSe rendre au monde build: §f/build go");
            p.sendMessage(" §bSpawner un minecart furnace infini: §f/build mf");
        } else {
            if(args[0].equalsIgnoreCase("go")) {
                p.teleport(new Location(Bukkit.getWorld("build"), 0, 60 , 0));
            } else  if(args[0].equalsIgnoreCase("mf")) {
                new CustomMinecartFurnace(p.getLocation()).spawn(p.getLocation());
            }


        }
        return false;
    }
}
