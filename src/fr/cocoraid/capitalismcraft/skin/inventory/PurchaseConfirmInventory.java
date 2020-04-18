package fr.cocoraid.capitalismcraft.skin.inventory;

import fr.cocoraid.capitalismcraft.bridges.EconomyBridge;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.utils.Utils;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PurchaseConfirmInventory  implements InventoryProvider {



    public static SmartInventory getInventory(int skinID, int price, ItemStack head) {
        return SmartInventory.builder()
                .id("purchaseConfirmInv")
                .provider(new PurchaseConfirmInventory(head, price, skinID))
                .size(5, 9)
                .title("§7Confirmation")
                .build();
    }

    private ItemStack head;
    private int price;
    private int skinID;
    public PurchaseConfirmInventory(ItemStack head, int price, int skinID) {
        this.head = head;
        this.price = price;
        this.skinID = skinID;

        ItemMeta confirmMeta = confirm.getItemMeta();
        confirmMeta.setDisplayName("§aConfirmer l'achat");
        confirmMeta.setLore(Arrays.asList("§2Prix: " + price + " "));
        confirm.setItemMeta(confirmMeta);


        ItemMeta cancelMeta = cancel.getItemMeta();
        cancelMeta.setDisplayName("§cAnnuler l'achat");
        cancel.setItemMeta(cancelMeta);
    }



    private ItemStack confirm = new ItemStack(Material.GREEN_WOOL);
    private ItemStack cancel = new ItemStack(Material.RED_WOOL);




    @Override
    public void init(Player player, InventoryContents contents) {


        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        contents.set(3, 2, ClickableItem.of(confirm,
                e -> {

            if(cp.getPlayerdata().getGiftedSkins().contains(skinID)) {
                cp.getPlayerdata().removeGiftedSkin(skinID);
                cp.getPlayerdata().addPurchasedSkin(skinID);
                player.closeInventory();
                player.sendMessage("§bMerci pour votre achat !");
                Utils.sendMessageCommand(player,"§3Cliquez §nICI pour mettre votre nouveau skin","skin apply " + skinID);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
            } else {
                if (EconomyBridge.hasMoney(player, price)) {
                    EconomyBridge.takeMoneySilent(player,price);
                    player.closeInventory();
                    player.sendMessage("§bMerci pour votre achat ! §2Solde restant: " + EconomyBridge.getMoney(player));
                    Utils.sendMessageCommand(player,"§3Cliquez §nICI pour mettre votre nouveau skin","skin apply " + skinID);
                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
                } else {
                    player.closeInventory();
                    player.sendMessage("§4Erreur, §cil semblerait que vous ne disposez pas de l'argent nécessaire");
                    player.sendMessage("§6Boutique: &eVous pouvez aussi obtenir votre skin via notre boutique: §6§nstore.capitalismcraft.com");
                    player.sendMessage("§cS'il s'agissait d'un achat §3en boutique §c, votre commande n'a peut être pas encore été traité...");
                    player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                }
            }

                }));

        contents.set(3, 6, ClickableItem.of(cancel,
                e -> {
                    cp.getPlayerdata().setGender(Gender.FEMALE);
                    player.closeInventory();
                    player.sendMessage("§bMerci Madame ! Vous pouvez désormais choisir votre skin");
                    player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP,1,1);
                }));

        contents.set(1,4, ClickableItem.empty(head));


    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }

}
