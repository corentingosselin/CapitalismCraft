package fr.cocoraid.capitalismcraft.area;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.utils.Cuboid;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Area {

    private CapitalismCraft instance = CapitalismCraft.getInstance();

    private List<UUID> entered = new ArrayList<>();

    private Cuboid cuboid;
    public Area(Location pointA, Location pointB) {
        this.cuboid = new Cuboid(pointA,pointB);
        instance.getAreaManager().getAreaList().add(this);

    }


    public List<UUID> getEntered() {
        return entered;
    }

    public void addEntered(UUID uuid) {
        entered.add(uuid);
    }

    public void removeEntered(UUID uuid) {
        entered.remove(uuid);
    }


    public Cuboid getCuboid() {
        return cuboid;
    }
}
