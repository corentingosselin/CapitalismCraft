package fr.cocoraid.capitalismcraft.bridges;

import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.flags.Flags;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;
import fr.cocoraid.capitalismcraft.CapitalismCraft;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class WorldGuardBridge {

    private WorldGuardPlugin wg;

    private CapitalismCraft instance;
    public WorldGuardBridge(CapitalismCraft instance, WorldGuardPlugin wg) {
        this.instance = instance;
        this.wg = wg;
    }

    public boolean canBreak(Block block, Player player) {

        LocalPlayer localPlayer = WorldGuardPlugin.inst().wrapPlayer(player);
        RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
        RegionQuery query = container.createQuery();
        if (!query.testState(BukkitAdapter.adapt(block.getLocation()), localPlayer, Flags.BUILD)) {
            // Can't build

        }
        return true;

    }


}
