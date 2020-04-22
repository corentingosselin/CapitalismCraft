package fr.cocoraid.capitalismcraft.wanted.inventory;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.utils.Heads;
import fr.cocoraid.capitalismcraft.utils.Utils;
import fr.cocoraid.capitalismcraft.wanted.WantedManager;
import fr.cocoraid.capitalismcraft.wanted.WantedPlayer;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import fr.minuskube.inv.content.Pagination;
import fr.minuskube.inv.content.SlotIterator;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;

public class WantedListInventory implements InventoryProvider {

    private static WantedManager wantedManager = CapitalismCraft.getInstance().getWantedManager();

    public static SmartInventory getInventory() {
        return SmartInventory.builder()
                .provider(new WantedListInventory())
                .size(6, 9)
                .title("§7Liste des personnes recherchées")
                .build();
    }


    public WantedListInventory() {
    }


    @Override
    public void init(Player player, InventoryContents contents) {
        Pagination pagination = contents.pagination();

        if(wantedManager.getWanteds().isEmpty()) {
            ItemStack empty = new ItemStack(Material.BARRIER);
            ItemMeta meta = empty.getItemMeta();
            meta.setDisplayName("§cAucun contrat n'est disponible, revenez plus tard...");
            empty.setItemMeta(meta);
            contents.set(2,4,ClickableItem.empty(empty));

            return;
        }

        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        ClickableItem[] items = new ClickableItem[wantedManager.getWanteds().size()];
        for (int i = 0; i < items.length; i++) {
            WantedPlayer wp = wantedManager.getWanteds().get(i);
            ItemStack item = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta skull = (SkullMeta) item.getItemMeta();
            OfflinePlayer op = Bukkit.getOfflinePlayer(wp.getWantedUUID());
            skull.setOwningPlayer(op);
            skull.setDisplayName("§c" + op.getName());
            String prime = Utils.formatValue(wp.getPrice());
            skull.setLore(Arrays.asList(""
                    ,"§3Client: §b" + Bukkit.getOfflinePlayer(wp.getWanterUUID())
                    ,"§6Prime: §e" + prime
                    ,"§5Jours restants: §d" + wp.getDayLeft() + " jour(s)"
                    ,"§2Mercenaires ayant acceptés: §a" + wp.getAcceptedBy().size()  + "/5"
            ));
            item.setItemMeta(skull);

            items[i] = ClickableItem.of(item, e -> {

                //check for mercenaire perm
                if(!player.hasPermission("cc.mercenaire")) {
                    Utils.sendActionBar(player,"§cVous ne pouvez pas accepter de contrat, vous avez besoin du grade mercenaire !");
                    player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO,1,1);
                    return;
                }

                //check if size is lower than 5
                if(wp.getAcceptedBy().size() >= 5) {
                    Utils.sendActionBar(player,"§cLe nombre de mercenaires est au complet ! choisissez une autre cible...");
                    player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO,1,1);
                    return;
                }

                //check already accepted any contract
                if(wantedManager.getWanteds().stream().filter(wplayer -> wplayer.getAcceptedBy().contains(player.getUniqueId())).findAny().isPresent()) {
                    Utils.sendActionBar(player,"§cIl semble que vous ayez déjà accepté un contrat !");
                    player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO,1,1);
                    return;
                }

                AcceptConfirmInventory.getInventory(wp,item).open(player);
                cp.setPreviousInventory(getInventory());
                cp.setLastPage(pagination.getPage());

            });

        }


        pagination.setItems(items);
        pagination.setItemsPerPage(14);

        SlotIterator si = contents.newIterator(SlotIterator.Type.HORIZONTAL, 1, 1);
        si.blacklist(1, 8);
        si.blacklist(2, 0);
        pagination.addToIterator(si);


        if (!pagination.isFirst()) {
            contents.set(4, 2, ClickableItem.of(Heads.ARROW_LEFT,
                    e -> getInventory().open(player, pagination.previous().getPage())));
        }


        if (!pagination.isLast()) {
            contents.set(4, 6, ClickableItem.of(Heads.ARROW_RIGHT,
                    e -> getInventory().open(player, pagination.next().getPage())));
        }

    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }

}

