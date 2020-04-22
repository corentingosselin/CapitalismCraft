package fr.cocoraid.capitalismcraft.wanted;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.database.LocalDatabase;
import fr.cocoraid.capitalismcraft.timeismoney.TimeMoneyMachine;
import fr.cocoraid.capitalismcraft.timeismoney.TimeTracker;
import fr.cocoraid.capitalismcraft.timeismoney.listeners.DetectBuildMachine;
import fr.cocoraid.capitalismcraft.timeismoney.listeners.InteractWithMachine;
import fr.cocoraid.capitalismcraft.timeismoney.listeners.RegisterTimeEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Directional;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

public class WantedManager extends LocalDatabase {

    private CapitalismCraft instance;
    public WantedManager(CapitalismCraft instance) {
        super(instance,"wanted");
        this.instance = instance;
        // registerEvents();
        loadDatabase();
    }


    private List<WantedPlayer> wanteds = new ArrayList<>();


    //idée un joueur qui est wanted peut etre attaqué par n'importe quel chasseur de prime partout
    //de plus, il perdra son stuff


    //limites
    // prime minimum = 10k
    // maximum de mise de tete à prix = 1 par jour
    // maximum 5 jours


    /***
     *
     * wanted:
     *  wanter:
     *  wanted:
     *  price:
     *  start:
     *  end:
     *
     */
    public WantedPlayer registerWanted(Player p, UUID target, int price, int day) {
        int id = wanteds.size();

        long current = System.currentTimeMillis();
        WantedPlayer wp = new WantedPlayer(id,p.getUniqueId(),target,current,day,price);
        save(wp);
        saveData();

        return wp;
    }

    public void save(WantedPlayer wp) {
        int id = wp.getId();
        data.set("wanted." + id + ".wanter",wp.getWanterUUID().toString());
        data.set("wanted." + id + ".wanted",wp.getWantedUUID().toString());
        data.set("wanted." + id + ".price", wp.getPrice());
        data.set("wanted." + id + ".start", wp.getStart());
        data.set("wanted." + id + ".end", wp.getEnd());
        data.set("wanted." + id + ".accepted", new ArrayList<>());
        data.set("wanted." + id + ".banned", new ArrayList<>());
    }

    public void unregisterWanted(int id) {
        data.set("wanted." + id,null);
        saveData();
        wanteds.remove(id);
    }

    public void unregisterWanted(WantedPlayer wantedPlayer) {
        data.set("wanted." + wantedPlayer.getId(),null);
        saveData();
        wanteds.remove(wantedPlayer);
    }


    @Override
    public void loadDatabase() {
        super.loadDatabase();

        ConfigurationSection section = data.getConfigurationSection("wanted");
        if(section == null) return;
        for (String id : section.getKeys(false)) {

            long end = section.getLong("end");
            if(System.currentTimeMillis() > end) {
                section.set("", null);
                continue;
            }

            UUID wanter = UUID.fromString(section.getString("wanter"));
            UUID wanted = UUID.fromString(section.getString("wanted"));
            int price = section.getInt("price");
            long start = section.getLong("start");
            List<String> acceptedString = section.getStringList("accepted");
            List<UUID> accepted = new ArrayList<>();
            acceptedString.forEach(s -> accepted.add(UUID.fromString(s)));

            List<String> bannedString = section.getStringList("banned");
            List<UUID> banned = new ArrayList<>();

            bannedString.forEach(s -> banned.add(UUID.fromString(s)));

            long diff = end - start;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(diff);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            WantedPlayer wp = new WantedPlayer(Integer.valueOf(id),wanter,wanted,start, day, price);
            wp.setAcceptedBy(accepted);
            wp.setBanned(banned);
            wanteds.add(wp);

        }

    }



    @Override
    public void saveDatabase() {
        super.saveDatabase();
        for (WantedPlayer wanted : wanteds) {
            save(wanted);
        }
    }


    //HERE detect when player is killed, event
    private void registerEvents() {
    }


    public List<WantedPlayer> getWanteds() {
        return wanteds;
    }

    public CapitalismCraft getInstance() {
        return instance;
    }
}
