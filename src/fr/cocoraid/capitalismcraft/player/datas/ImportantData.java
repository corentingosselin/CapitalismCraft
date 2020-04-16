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
    private List<Integer> giftedSkins = new ArrayList<>();
    private Gender gender = Gender.UNDETERMINED;
    private int currentSkin;

    public ImportantData(Player p) {
        super(p);
    }

    public List<Integer> getSkinsPurchased() {
        return skinsPurchased;
    }

    public List<Integer> getGiftedSkins() {
        return giftedSkins;
    }

    public void setCurrentSkin(int currentSkin) {
        this.currentSkin = currentSkin;
        set(SECTION + "currentSkin", currentSkin);
    }

    public void addPurchasedSkin(Skin skin) {
        skinsPurchased.add(skin.getId());
        set(SECTION + "skinsPurchased", skinsPurchased);
    }

    public void addPurchasedSkin(int id) {
        skinsPurchased.add(id);
        set(SECTION + "skinsPurchased", skinsPurchased);
    }

    public void addGiftedSkin(Skin skin) {
        giftedSkins.add(skin.getId());
        set(SECTION + "giftedSkins", giftedSkins);
    }

    public void removeGiftedSkin(int id) {
        giftedSkins.remove(id);
        set(SECTION + "giftedSkins", giftedSkins);
    }

    public Gender getGender() {
        return gender;
    }

    public int getCurrentSkin() {
        return currentSkin;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
        set(SECTION + "gender", gender.name());
    }

}