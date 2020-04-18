package fr.cocoraid.capitalismcraft.area.event;

import fr.cocoraid.capitalismcraft.area.Area;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AreaQuitEvent extends Event {

    private Player player;
    private Area area;

    public AreaQuitEvent(Area area, Player player) {
        this.player = player;
        this.area = area;

    }
    public Player getPlayer() {
        return this.player;
    }

    public Area getArea() {
        return area;
    }

    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}