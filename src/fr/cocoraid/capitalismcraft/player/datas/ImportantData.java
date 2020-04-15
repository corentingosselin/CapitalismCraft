package fr.cocoraid.capitalismcraft.player.datas;

import fr.cocoraid.capitalismcraft.player.PlayerData;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class ImportantData extends PlayerData {

    private transient final static String SECTION = ImportantData.class.getSimpleName().replace("Data", "").toLowerCase() + ".";

    private List<Integer> skinsPurchased = new ArrayList<>();
    private Gender gender = Gender.UNDETERMINED;

    public ImportantData(Player p) {
        super(p);
    }

    public List<Integer> getSkinsPurchased() {
        return skinsPurchased;
    }

    public void addPurchasedSkin(Skin skin) {
        skinsPurchased.add(skin.getId());
        set(SECTION + "purchased-skins", skinsPurchased);
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
        set(SECTION + "gender", gender.name());
    }

}