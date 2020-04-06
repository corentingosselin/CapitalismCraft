package fr.cocoraid.capitalismcraft.ranks;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.ranks.baron.HammerManager;
import fr.cocoraid.capitalismcraft.ranks.empereur.KeepExpListener;
import fr.cocoraid.capitalismcraft.ranks.empereur.MonstersIgnoreListener;
import fr.cocoraid.capitalismcraft.ranks.habitant.KillRewardListener;
import fr.cocoraid.capitalismcraft.ranks.mercenaire.RewardMercenaireListener;
import fr.cocoraid.capitalismcraft.ranks.seigneur.DoubleExpEvent;
import org.bukkit.Bukkit;

public class RankRegisterer {


    private CapitalismCraft instance;
    public RankRegisterer(CapitalismCraft instance) {
        this.instance = instance;

        //habitant
        Bukkit.getPluginManager().registerEvents(new KillRewardListener(),instance);

        //villageois


        //mineur


        //bandit


        //mercenaire
        Bukkit.getPluginManager().registerEvents(new RewardMercenaireListener(),instance);

        //bourgeois


        //noble


        //baron
        new HammerManager(instance).setup();

        //legionnaire


        //seigneur
        Bukkit.getPluginManager().registerEvents(new DoubleExpEvent(),instance);



        //empereur
        Bukkit.getPluginManager().registerEvents(new KeepExpListener(),instance);
        Bukkit.getPluginManager().registerEvents(new MonstersIgnoreListener(),instance);

    }


}
