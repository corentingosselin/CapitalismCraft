package fr.cocoraid.capitalismcraft.command.commands.wanted;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.utils.UUIDFetcher;
import fr.cocoraid.capitalismcraft.utils.Utils;
import fr.cocoraid.capitalismcraft.wanted.WantedPlayer;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.UUID;

public class WantedCMD implements CommandExecutor {


    private CapitalismCraft instance;
    public WantedCMD(CapitalismCraft instance) {
        this.instance = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) return false;

        Player p = (Player) sender;
        if (args.length == 0) {
            p.sendMessage("§3Les commandes pour mettre les tête à prix: ");
            p.sendMessage("");
            p.sendMessage(" §bMettre une tête à prix: §f/wanted add <joueur> <prix> <temps limite en jour>");
            p.sendMessage(" §fInfo: Si vous mettez un prix plus élevé qu'une prime existante, elle remplace l'ancienne");
            p.sendMessage(" §bMAugmenter la prime: §f/wanted upgrade <joueur> <nouveau prix>");
                p.sendMessage(" §bAffiche des informations sur votre contrat: §f/wanted info");
            p.sendMessage("");
            p.sendMessage(" §bAfficher la liste des joueurs recherchés: §f/wanted list");
        } else {

            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("info")) {
                    WantedPlayer wp = instance.getWantedManager().getWanteds().stream()
                            .filter(w -> w.getWanterUUID() == p.getUniqueId()).findAny().orElseGet(null);
                    if(wp == null) {
                        p.sendMessage("§cVous n'avez lancé aucune prime sur la tête d'un joueur");
                        return false;
                    }

                    p.sendMessage("§6Une prime dont vous êtes l'auteur: ");
                    p.sendMessage("§3Cible: §b" + Bukkit.getOfflinePlayer(wp.getWantedUUID()).getName());
                    String price =  Utils.formatValue(wp.getPrice());
                    p.sendMessage("§6Montant: §e" + price + " $");
                    p.sendMessage("§5Jours restants: §d" + wp.getDayLeft() + " jour(s)");
                    p.sendMessage("§2Mercenaires sous contrat: ");
                    wp.getAcceptedBy().stream().filter(uuid -> !wp.getBanned().contains(uuid)).forEach(uuid -> {
                        p.sendMessage(" §a- " + Bukkit.getOfflinePlayer(uuid).getName());
                    });
                    p.sendMessage("§4Mercenaires ayant échoués: ");
                    wp.getBanned().forEach(uuid -> {
                        p.sendMessage(" §c- " + Bukkit.getOfflinePlayer(uuid).getName());
                    });

                }

            } else if(args.length == 3) {
                if(args[0].equalsIgnoreCase("upgrade")) {
                    //check price
                    if(!StringUtils.isNumeric(args[2])) {
                        p.sendMessage("§cLe prix doit être un nombre entier !");
                        p.sendMessage(" §f/wanted upgrade <joueur> <prix>");
                        return false;
                    }

                    int price = Integer.valueOf(args[2]);
                    if(!EconomyBridge.hasMoney(p,price)) {
                        p.sendMessage("§cVous ne disposez pas assez d'argent pour mettre la tête à prix pour §2" + price + " $");
                        return false;
                    }

                    UUID uuidTarget;
                    if(Bukkit.getPlayer(args[1]) == null && Bukkit.getPlayer(args[1]).isOnline()) {
                        uuidTarget = Bukkit.getPlayer(args[1]).getUniqueId();
                    } else {
                        UUID uuidOffline = UUIDFetcher.getUUID(args[2]);
                        if(uuidOffline == null) {
                            p.sendMessage("§cImpossible de retrouver ce joueur pour le moment, essayez plus tard...");
                            return false;
                        }

                        if(!Bukkit.getOfflinePlayer(uuidOffline).hasPlayedBefore()) {
                            p.sendMessage("§cCe joueur n'a jamais joué sur le serveur !");
                            return false;
                        }
                        uuidTarget = uuidOffline;
                    }

                    WantedPlayer wp = instance.getWantedManager().getWanteds().stream()
                            .filter(w -> w.getWanterUUID() == p.getUniqueId())
                            .filter(w -> w.getWantedUUID() == uuidTarget).findAny().orElseGet(null);
                    if(wp == null) {
                        p.sendMessage("§cVous n'avez aucun joueur de ce nom dans vos propositions de prime ! /wanted info");
                        return false;
                    }

                    if(price <= wp.getPrice()) {
                        p.sendMessage("§La nouvelle prime que vous proposez est la même ou inférieure !");
                        return false;
                    }


                    int amount = price - wp.getPrice();
                    EconomyBridge.takeMoneySilent(p,amount);
                    wp.setPrice(price);
                    p.sendMessage("§2La nouvelle prime a bien été enregistré ! la nouvelle somme a été retiré de votre compte");


                    String finalPrice =  Utils.formatValue(price);
                    Bukkit.getOnlinePlayers().stream()
                            .filter(cur -> !cur.getUniqueId().equals(uuidTarget))
                            .filter(cur -> cur.hasPermission("cc.mercenaire")).forEach(cur -> {
                        cur.sendMessage("§6[Mercenaire] §eNouvelle prime pour tuer le joueur " + args[1] + "d'un montant de §6" + finalPrice);
                        Utils.sendMessageCommand(cur,"§eCliquez §6§nICI §epour accepter l'offre !", "wanted accept " + wp.getId());


                        cur.playSound(cur.getLocation(), Sound.BLOCK_BELL_USE,1,1.5F);
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                cur.playSound(cur.getLocation(), Sound.BLOCK_BELL_USE,1,1.5F);
                            }
                        }.runTaskLater(instance,4);
                    });

                    if(Bukkit.getPlayer(uuidTarget) != null && Bukkit.getPlayer(uuidTarget).isOnline()) {
                        Player target = Bukkit.getPlayer(uuidTarget);
                        target.sendTitle("","§4" + p.getDisplayName() + " §coffre §2" + finalPrice + " $" + " §c pour que vous soyez exécuté !");
                        target.sendMessage("§4" + p.getDisplayName() + " §coffre §2" + finalPrice + " $" + " §c pour que vous soyez exécuté !");
                        target.sendMessage("");
                        target.sendMessage("§cVous devez être prudent ! Les §2Mercenaires §cet grades supérieurs pourront vous traquer pendant §4" + wp.getDayLeft() + " jour(s)");
                        target.sendMessage("§cVous êtes désormais vulnérable en tout lieu, ils pourront vous attaquer n'importe où sur le serveur");
                        target.sendMessage("§cSi vous tuez l'ensemble des mercenaires à vos trousses, vous serez libre et vous remporterez la prime...");
                        target.playSound(target.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_CURSE,1,0F);
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                target.playSound(target.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_CURSE,1,0F);
                            }
                        }.runTaskLater(instance,4);
                    }

                }
            } else if(args.length == 4) {
                if(args[0].equalsIgnoreCase("add")) {

                    if(!StringUtils.isNumeric(args[3]) || !StringUtils.isNumeric(args[4])) {
                        p.sendMessage("§cLe prix et le temps doivent être un nombre entier !");
                        p.sendMessage(" §f/wanted add <joueur> <prix> <temps>");
                        return false;
                    }

                    int price = Integer.valueOf(args[2]);
                    int time = Integer.valueOf(args[3]);

                    if(price < 10000) {
                        p.sendMessage("§cLe prix que vous avez donné est trop faible ! Le minimum autorisé est §210 000$");
                        return false;
                    }
                    if(time > 7) {
                        p.sendMessage("§cVous ne pouvez pas dépasser une limite de temps de 1 semaine (Entre 1 et 7 jours");
                        return false;
                    }
                    if(time <= 0) {
                        p.sendMessage("§cLe nombre de jours doit être compris entre 1 et 7");
                        return false;
                    }

                    if(!EconomyBridge.hasMoney(p,price)) {
                        p.sendMessage("§cVous ne disposez pas assez d'argent pour mettre la tête à prix pour §2" + price + " $");
                        return false;
                    }

                    if(args[1].equalsIgnoreCase(p.getName())) {
                        p.sendMessage("§cVous ne pouvez pas mettre votre propre tête à prix ! Cowboy reprennez-vous...");
                        return false;
                    }


                    UUID uuidTarget;
                    if(Bukkit.getPlayer(args[1]) == null && Bukkit.getPlayer(args[1]).isOnline()) {
                        uuidTarget = Bukkit.getPlayer(args[1]).getUniqueId();
                    } else {
                        UUID uuidOffline = UUIDFetcher.getUUID(args[2]);
                        if(uuidOffline == null) {
                            p.sendMessage("§cImpossible de retrouver ce joueur pour le moment, essayez plus tard...");
                            return false;
                        }

                        if(!Bukkit.getOfflinePlayer(uuidOffline).hasPlayedBefore()) {
                            p.sendMessage("§cCe joueur n'a jamais joué sur le serveur !");
                            return false;
                        }
                        uuidTarget = uuidOffline;
                    }


                    //check if player has not already wanted the target
                    WantedPlayer alreadyWanted = instance.getWantedManager().getWanteds().stream()
                            .filter(wp -> wp.getWantedUUID().equals(uuidTarget))
                            .filter(wp -> wp.getWanterUUID().equals(p.getUniqueId()))
                            .findAny().orElseGet(null);

                    if(alreadyWanted != null) {
                        p.sendMessage("§cUne prime sur ce joueur existe déjà en votre nom !");
                        String alreadyPriced =  Utils.formatValue(alreadyWanted.getPrice());
                        p.sendMessage("§cLe montant de la prime s'élève à " + alreadyPriced + " $");
                        p.sendMessage("§cVous pouvez surenchérir la prime en utilisant /wanted upgrade <joueur> <nouvelle prime>");
                        return false;
                    }


                    //check if another higher prime is existing
                    WantedPlayer higherWanted = instance.getWantedManager().getWanteds().stream()
                            .filter(wp -> wp.getWantedUUID().equals(uuidTarget))
                            .filter(wp -> wp.getPrice() >= price)
                            .findAny().orElseGet(null);

                    if(higherWanted != null) {
                        p.sendMessage("§cUne prime d'un montant supérieure a été trouvé");
                        String higherPrice =  Utils.formatValue(higherWanted.getPrice());
                        p.sendMessage("§cSi vous souhaitez surenchérir veuillez mettre un montant supérieur à §2" + higherPrice);
                        return false;
                    }

                    WantedPlayer lowerWanted = instance.getWantedManager().getWanteds().stream()
                            .filter(wp -> wp.getWantedUUID().equals(uuidTarget))
                            .filter(wp -> wp.getPrice() < price)
                            .findAny().orElseGet(null);

                    if(lowerWanted != null) {
                        instance.getWantedManager().unregisterWanted(lowerWanted);
                        String betterPrice =  Utils.formatValue(price - lowerWanted.getPrice());
                        p.sendMessage("§cVous avez écrasé une prime existante car votre montant est plus élevé de §2" + betterPrice + " $");
                    }
                    WantedPlayer wp = instance.getWantedManager().registerWanted(p,uuidTarget,price,time);
                    EconomyBridge.takeMoneySilent(p,price);
                    p.sendMessage("§cVotre argent n'est plus disponible, il vous sera rendu si le contrat n'est pas exécuté..." );
                    p.sendMessage("§4Nouvelle prime ajoutée ! §cFélicitation le joueur §4" + args[1] + " §cest maintenant recherché..." );
                    String finalPrice =  Utils.formatValue(price);
                    Bukkit.getOnlinePlayers().stream()
                            .filter(cur -> !cur.getUniqueId().equals(uuidTarget))
                            .filter(cur -> cur.hasPermission("cc.mercenaire")).forEach(cur -> {
                        cur.sendMessage("§6[Mercenaire] §eNouvelle prime pour tuer le joueur " + args[1] + "d'un montant de §6" + finalPrice);
                        Utils.sendMessageCommand(cur,"§eCliquez §6§nICI §epour accepter l'offre !", "wanted accept " + wp.getId());


                        cur.playSound(cur.getLocation(), Sound.BLOCK_BELL_USE,1,1.5F);
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                cur.playSound(cur.getLocation(), Sound.BLOCK_BELL_USE,1,1.5F);
                            }
                        }.runTaskLater(instance,4);
                    });

                    if(Bukkit.getPlayer(uuidTarget) != null && Bukkit.getPlayer(uuidTarget).isOnline()) {
                        Player target = Bukkit.getPlayer(uuidTarget);
                        target.sendTitle("","§4" + p.getDisplayName() + " §coffre §2" + finalPrice + " $" + " §c pour que vous soyez exécuté !");
                        target.sendMessage("§4" + p.getDisplayName() + " §coffre §2" + finalPrice + " $" + " §c pour que vous soyez exécuté !");
                        target.sendMessage("");
                        target.sendMessage("§cVous devez être prudent ! Les §2Mercenaires §cet grades supérieurs pourront vous traquer pendant §4" + time + " jour(s)");
                        target.sendMessage("§cVous êtes désormais vulnérable en tout lieu, ils pourront vous attaquer n'importe où sur le serveur");
                        target.sendMessage("§cSi vous tuez l'ensemble des mercenaires à vos trousses, vous serez libre et vous remporterez la prime...");
                        target.playSound(target.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_CURSE,1,0F);
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                target.playSound(target.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_CURSE,1,0F);
                            }
                        }.runTaskLater(instance,4);
                    }
                }
            }

            //open skin shop inventory


        }
        return false;
    }


}