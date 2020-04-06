package fr.cocoraid.capitalismcraft.ranks.baron;

import fr.cocoraid.capitalismcraft.utils.Utils;
import me.konsolas.aac.api.HackType;
import me.konsolas.aac.api.PlayerViolationEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemMendEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class HammerListener implements Listener {


    private HammerManager manager;
    public HammerListener(HammerManager manager) {
        this.manager = manager;
    }

    private Map<UUID, Long> cooldown = new HashMap<>();
    private List<UUID> ignore = new ArrayList<>();




    @EventHandler
    public void mending(PlayerItemMendEvent e) {
        ItemStack item = e.getItem();
        if(Utils.isSmilar(item, manager.getHammer())) {
            e.setCancelled(true);
            int addDurability = e.getRepairAmount() * 10;
            //130
            int maxDurability = item.getType().getMaxDurability();

            ItemMeta meta = item.getItemMeta();
            if (!(meta instanceof Damageable)) return;
            Damageable damageable = (Damageable) meta;

            String crypted = meta.getLore().get(1).replace("Durabilité: ","");
            int cur = Integer.valueOf(crypted.split("/")[0]);
            cur+=addDurability;

            int damage = cur * maxDurability / 10000;
            ((Damageable) meta).setDamage(maxDurability - damage);

            List<String> lores = meta.getLore();
            lores.set(1,"Durabilité: " + String.valueOf(cur) + "/10000");
            meta.setLore(lores);
            item.setItemMeta(meta);
        }
    }


    private List<Block> blocks = new ArrayList<>();
    @EventHandler
    public void interact(PlayerInteractEvent e)  {
        if(e.getClickedBlock() == null) return;
        if(e.getItem() == null) return;
        if(e.getAction() != Action.LEFT_CLICK_BLOCK) return;
        if(!e.getPlayer().hasPermission("cc.baron")) return;

        Block block = e.getClickedBlock();
        if (Utils.isSmilar(e.getItem(), manager.getHammer())) {
            cooldown.putIfAbsent(e.getPlayer().getUniqueId(), (System.currentTimeMillis() / 100));
            long left = ((cooldown.get(e.getPlayer().getUniqueId()) + 2) - (System.currentTimeMillis() / 100));
            if(left > 0) {
                return;
            } else {
                cooldown.remove(e.getPlayer().getUniqueId());
            }

            ignore.add(e.getPlayer().getUniqueId());
            BlockFace face = Utils.getBlockFace(e.getPlayer());
            Utils.getSquareRotation(block.getLocation(),face).stream().filter(b -> b.getType() != Material.AIR && b.getType() != Material.OBSIDIAN && b.getType() != Material.BEDROCK).forEach(b -> {
                blocks.add(b);
                BlockBreakEvent event = new BlockBreakEvent(b,e.getPlayer());
                Bukkit.getPluginManager().callEvent(event);
            });
            ignore.remove(e.getPlayer().getUniqueId());
        }
    }

    @EventHandler
    public void onPlayerViolation(PlayerViolationEvent e) {
        if(e.getHackType() == HackType.FASTBREAK || e.getHackType() == HackType.INTERACT) {
            if(ignore.contains(e.getPlayer().getUniqueId())) {
                // Cancellable
                e.setCancelled(true);
            }
        }
    }



    @EventHandler(priority = EventPriority.HIGHEST)
    public void breaker(BlockBreakEvent e) {
        if (Utils.isSmilar(e.getPlayer().getInventory().getItemInMainHand(), manager.getHammer()) && !ignore.contains(e.getPlayer().getUniqueId())) {
            e.setCancelled(true);
        }

        if(!blocks.contains(e.getBlock())) {
            return;
        }
        Player p = e.getPlayer();
        blocks.remove(e.getBlock());
        if(e.isCancelled()) {
            return;
        }
        ItemStack item = p.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        if (!(meta instanceof Damageable)) return;
        Damageable damageable = (Damageable) meta;
        int maxR = item.getType().getMaxDurability();
        int max = 10000;
        String crypted = meta.getLore().get(1).replace("Durabilité: ","");
        int cur = Integer.valueOf(crypted.split("/")[0]);
        cur--;
        if(cur <= 0) {
            p.getInventory().remove(item);
            p.playSound(p.getLocation(), Sound.ENTITY_ITEM_BREAK,1,1);
            return;
        }
        List<String> lores = meta.getLore();
        lores.set(1,"Durabilité: " + String.valueOf(cur) + "/10000");
        meta.setLore(lores);

        int damage = cur * maxR / max;
        ((Damageable) meta).setDamage(maxR - damage);
        p.getInventory().getItemInMainHand().setItemMeta(meta);
        e.getBlock().breakNaturally();
    }

}
