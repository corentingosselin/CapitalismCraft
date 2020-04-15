package fr.cocoraid.capitalismcraft.player;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.player.datas.ImportantData;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class PlayerDatabase {

    private CapitalismCraft instance;
    public PlayerDatabase(CapitalismCraft instance) {
        if (!instance.getDataFolder().exists())
            instance.getDataFolder().mkdir();

        File databaseFolder = new File(instance.getDataFolder(), "database");
        if(!databaseFolder.exists())
            databaseFolder.mkdirs();
        this.instance = instance;
    }

    private File getPlayerFile(UUID uuid) {
        return new File("plugins/CapitalismCraft/database", uuid.toString() + ".yml");
    }

    private File getPlayerFile(Player p) {
        return getPlayerFile(p.getUniqueId());
    }

    public boolean isPlayerRegistered(UUID uuid) {
        return getPlayerFile(uuid).exists();
    }

    public void registerPlayer(Player p) {
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(p);
        File file = getPlayerFile(p);
        if (!file.exists()) {
            try
            {
                file.createNewFile();
                try {
                    //Set default data
                    cp.setPlayerdata((ImportantData)new ImportantData(p).uncache());

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            catch (IOException ev)
            {
                ev.printStackTrace();
            }
        } else {
            cp.setPlayerdata(new ImportantData(p));
        }

        cp.getPlayerdata().cache();


    }

    //Save data in cache
    public void savePlayerIn() {

    }

    //Save data in file
    public void savePlayerOut() {

    }

}
