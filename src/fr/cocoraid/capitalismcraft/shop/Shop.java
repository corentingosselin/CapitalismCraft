package fr.cocoraid.capitalismcraft.shop;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public abstract class Shop implements Listener {

    protected CapitalismCraft instance = CapitalismCraft.getInstance();

    public Shop() {
        Bukkit.getPluginManager().registerEvents(this,instance);

    }
}
