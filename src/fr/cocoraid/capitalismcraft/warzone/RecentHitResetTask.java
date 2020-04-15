package fr.cocoraid.capitalismcraft.warzone;

import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import org.bukkit.scheduler.BukkitRunnable;

public class RecentHitResetTask extends BukkitRunnable {

    @Override
    public void run() {

        CapitalistPlayer.getCapitalistPlayers().values().stream().filter(op -> op.isTagged()).forEach(op -> {
            op.setRecentHit(false);
        });

    }
}
