package fr.cocoraid.capitalismcraft.wanted.inventory;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.utils.Utils;
import fr.cocoraid.capitalismcraft.wanted.WantedManager;
import fr.cocoraid.capitalismcraft.wanted.WantedPlayer;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class AcceptConfirmInventory implements InventoryProvider {


    private static WantedManager wantedManager = CapitalismCraft.getInstance().getWantedManager();
    public static SmartInventory getInventory(WantedPlayer wantedPlayer, ItemStack head) {
        return SmartInventory.builder()
                .provider(new AcceptConfirmInventory(wantedPlayer, head))
                .size(5, 9)
                .title("§7Confirmation")
                .build();
    }

    private WantedPlayer wantedPlayer;
    private ItemStack head;
    public AcceptConfirmInventory(WantedPlayer wantedPlayer, ItemStack head) {
        this.wantedPlayer = wantedPlayer;
        this.head = head;

        ItemMeta confirmMeta = confirm.getItemMeta();
        confirmMeta.setDisplayName("§aConfirmer le contrat");
        confirm.setItemMeta(confirmMeta);

        ItemMeta cancelMeta = cancel.getItemMeta();
        cancelMeta.setDisplayName("§cAnnuler");
        cancel.setItemMeta(cancelMeta);
    }

    private ItemStack confirm = new ItemStack(Material.GREEN_WOOL);
    private ItemStack cancel = new ItemStack(Material.RED_WOOL);




    @Override
    public void init(Player player, InventoryContents contents) {


        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        contents.set(3, 2, ClickableItem.of(confirm,
                e -> {
                    if(!wantedManager.getWanteds().contains(wantedPlayer)) {
                        player.closeInventory();
                        player.sendMessage("§cNous sommes navrés mais le contrat n'est plus disponible !");
                        player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO,1,1);
                        return;
                    }

                    //check if size is lower than 5
                    if(wantedPlayer.getAcceptedBy().size() >= 5) {
                        Utils.sendActionBar(player,"§cLe nombre de mercenaires est au complet ! choisissez une autre cible...");
                        player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO,1,1);
                        return;
                    }

                    wantedPlayer.getAcceptedBy().add(player.getUniqueId());
                    Utils.sendActionBar(player, "§2Contract accepté !");
                    player.sendMessage("");
                    player.playSound(player.getLocation(),Sound.ENTITY_VINDICATOR_CELEBRATE,1,1);

                    if(Bukkit.getPlayer(wantedPlayer.getWantedUUID()) != null && Bukkit.getPlayer(wantedPlayer.getWantedUUID()).isOnline()) {
                        Player target = Bukkit.getPlayer(wantedPlayer.getWantedUUID());
                        target.sendTitle("", "§cUn chasseur de prime a accepté un contrat sur votre tête");
                        new BukkitRunnable()  {
                            @Override
                            public void run() {
                                Utils.sendActionBar(target,"§4Soyez prudent, un mercenaire peut vous attaquer n'importe où !");
                            }
                        }.runTaskLater(CapitalismCraft.getInstance(),20);
                    }



                }));

        contents.set(3, 6, ClickableItem.of(cancel,
                e -> {
                    cp.getPreviousInventory().open(player,cp.getLastPage());
                }));

        contents.set(1,4, ClickableItem.empty(head));


    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }

}
