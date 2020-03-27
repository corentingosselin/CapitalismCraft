package fr.cocoraid.capitalismcraft.database;



import fr.cocoraid.capitalismcraft.CapitalismCraft;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

/**
 * Created by cocoraid on 13/02/2017.
 */
public abstract class LocalDatabase {

    protected FileConfiguration data;
    private File file;

    public LocalDatabase(CapitalismCraft instance, String filename) {
        File dir = instance.getDataFolder();
        if (!dir.exists()) {
            try{
                dir.mkdir();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        file = new File(instance.getDataFolder(), filename + ".yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        data = YamlConfiguration.loadConfiguration(file);
    }


    public void loadDatabase() {


    }

    public void saveDatabase() {

    }



    public void saveData() {
        if (data == null || file == null) {
            return;
        }
        try {
            data.save(file);
        } catch (IOException ex) {
            ex.printStackTrace();
            Bukkit.getServer().getLogger().log(Level.WARNING, "Could not save config to " + data.getName(), ex);
        }
    }



}
