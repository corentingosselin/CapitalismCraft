package fr.cocoraid.capitalismcraft.ranks.legionaire;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Tomahawk {

    private static List<Tomahawk> tomahawks = new ArrayList<>();

    public Tomahawk() {

    }

    private ArmorStand tomahawk;
    private boolean comeBack = false;
    public void update() {
        if(!isSpawned()) return;
        //apply rotation

        if(comeBack)
            comeBack();
        else
            goAway();
    }

    private Player owner;
    public void launch(Player owner) {
        this.owner = owner;

    }

    public void goAway() {

    }

    public void comeBack() {

    }

    public boolean isSpawned() {
        return tomahawk != null;
    }

}
