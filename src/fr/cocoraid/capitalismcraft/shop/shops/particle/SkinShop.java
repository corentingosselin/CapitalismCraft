package fr.cocoraid.capitalismcraft.shop.shops.particle;

import fr.cocoraid.capitalismcraft.area.Area;
import fr.cocoraid.capitalismcraft.area.event.AreaQuitEvent;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.shop.Shop;
import fr.cocoraid.capitalismcraft.skin.Skin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SkinShop extends Shop implements Listener {


    private static final World WORLD = Bukkit.getWorld("world");
    private static final Location SHOWCASE = new Location(WORLD,-415 + 0.5,6,-2408 + 0.5);
    private static final Location ENTER = new Location(WORLD,-415 + 0.5,6,-2408 + 0.5);


    private Area area;
    public SkinShop() {
        this.area = new Area(new Location(WORLD,-419,5,-2406)
                , new Location(WORLD,-411,9,-2414));

    }

    public void initModel(Player p, Skin skin) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(p);
        if(cp.getSkinDemo() != null && cp.getSkinDemo().getSkin().getId() != skin.getId()) {
            cp.getSkinDemo().updateSkin(skin);
            return;
        }
        SkinDemo demo = new SkinDemo(this,p,skin);
        demo.init();
    }


    @EventHandler
    public void exitShop(AreaQuitEvent e) {
        if(!e.getArea().equals(area)) return;

        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
        if(cp.getSkinDemo() != null) {
            cp.getSkinDemo().exitShop();
        }

    }

    public  Location getSHOWCASE() {
        return SHOWCASE;
    }

    public  World getWORLD() {
        return WORLD;
    }


    public Area getArea() {
        return area;
    }

    public static Location getENTER() {
        return ENTER;
    }
}


