package fr.cocoraid.capitalismcraft.skin;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.utils.Utils;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class Skin {

    private static List<Skin> skins = new ArrayList<>();

    private Rank rank;
    private int id = -1;
    private String displayName;
    private Gender gender;
    private String textureValue;
    private String textureSignature;
    private ItemStack headDisplay;
    private SkinRarity rarity;
    private String requiredPermission;


    public Skin(String displayName, Gender gender,SkinRarity rarity, String textureValue, String textureSignature, String requiredPermission) {
        this.id = skins.size();
        this.displayName = displayName;
        this.gender = gender;
        this.textureValue = textureValue;
        this.textureSignature = textureSignature;
        this.rarity = rarity;
        this.requiredPermission = requiredPermission;

        //find head texture with the skin texture value
        String decoded = new String(Base64.getDecoder().decode(textureValue));
        decoded = "{" + decoded.replaceFirst(".*(?=\"textures\")", "");
        String headTexture = new String(Base64.getEncoder().encode(decoded.getBytes()));
        String price = Utils.formatValue(rarity.getPrice());
        this.headDisplay = Utils.createSkull(displayName, Arrays.asList("§fPrix: §2" + price + " $", "§fPrix IRL: §6" + rarity.getRealPrice() + " €"), headTexture);
        skins.add(this);
    }


    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Gender getGender() {
        return gender;
    }

    public SkinRarity getRarity() {
        return rarity;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getRequiredPermission() {
        return requiredPermission;
    }

    public String getTextureSignature() {
        return textureSignature;
    }

    public String getTextureValue() {
        return textureValue;
    }

    public static List<Skin> getSkins() {
        return skins;
    }

    public ItemStack getHeadDisplay() {
        return headDisplay;
    }
}
