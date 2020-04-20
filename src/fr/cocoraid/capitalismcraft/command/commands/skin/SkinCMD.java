package fr.cocoraid.capitalismcraft.command.commands.skin;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.listeners.JoinLeaveEvent;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.shop.ShopType;
import fr.cocoraid.capitalismcraft.shop.shops.skin.SkinShop;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.inventory.GenderInventory;
import fr.cocoraid.capitalismcraft.skin.inventory.purchase.RankPuchaseSkinInventory;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;

public class SkinCMD implements CommandExecutor {


    private CapitalismCraft instance;
    public SkinCMD(CapitalismCraft instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!(sender instanceof Player)) return false;

        Player p = (Player) sender;

        if(args.length == 0 || args.length >= 2) {
            p.sendMessage("§3Les commandes pour la gestion des skins: ");
            p.sendMessage("");
            p.sendMessage(" §bAfficher sa collection: §f/skins");
            p.sendMessage(" §bSe rendre au magasin: §f/skin shop");
            p.sendMessage(" §bAcheter un skin (il faut se rendre au magasin): §f/skin buy");
        } else {
            CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(p);
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("buy")) {
                    SkinShop shop = (SkinShop) instance.getShopManager().getShop(ShopType.SKIN);
                    if(!shop.getArea().getEntered().contains(p.getUniqueId())) {
                        p.sendMessage("§cVous ne pouvez pas exécuter cette commande en dehors du magasin de costumes");
                        return false;
                    }

                    //open skin shop inventory
                    if(cp.getPlayerdata().getGender() == Gender.UNDETERMINED) {
                        cp.getPlayer().closeInventory();
                        GenderInventory.INVENTORY.open(cp.getPlayer());
                        return false;
                    }
                    RankPuchaseSkinInventory.INVENTORY.open(p);
                }     else if(args[0].equalsIgnoreCase("shop")) {
                    SkinShop shop = (SkinShop) instance.getShopManager().getShop(ShopType.SKIN);
                    p.teleport(shop.getENTER(), PlayerTeleportEvent.TeleportCause.PLUGIN);
                }    else if(args[0].equalsIgnoreCase("applyall")) {
                    if(p.hasPermission("cc.admin")) {
                        Bukkit.getOnlinePlayers().forEach(cur -> {
                            instance.getSkinManager().setSkin(JoinLeaveEvent.getDefaultSkin(),cur);
                            instance.getSkinManager().updatePlayerSkin(cur);
                            cur.sendMessage("§cUn nouveau skin vous a été attribué temporairement !");
                            cur.sendMessage("§cUtiliser /skin pour en acheter un autre");
                        });
                    }
                }
            } else if(args.length == 2) {
                 if(args[0].equalsIgnoreCase("apply") && StringUtils.isNumeric(args[1])) {
                    SkinShop shop = (SkinShop) instance.getShopManager().getShop(ShopType.SKIN);
                     if(shop.getArea().getEntered().contains(p.getUniqueId())) {
                         int i = Integer.valueOf(args[1]);
                         if(cp.getPlayerdata().getSkinsPurchased().contains(i)) {
                            Skin skin = Skin.getSkins().get(i);
                            instance.getSkinManager().setSkin(skin,p);
                            instance.getSkinManager().updatePlayerSkin(p);
                            p.sendMessage("§bVous avez maintenant une nouvelle peau !");
                         } else{
                             p.sendMessage("§4Erreur: §cVous n'avez pas ce skin pour qu'il puisse être appliqué");
                         }
                     } else {
                         p.sendMessage("§4Erreur: §cVous ne pouvez pas appliquer le skin de cette manière sans être dans le magasin de costumes");
                     }
                }
            }
        }



        return false;
    }
}
