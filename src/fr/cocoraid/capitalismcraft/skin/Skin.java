package fr.cocoraid.capitalismcraft.skin;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Skin {

    private static List<Skin> skins = new ArrayList<>();

    private int id = -1;
    private String displayName;
    private Gender gender;
    private String textureValue;
    private String textureSignature;
    private String headTexture;
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
        this.headTexture = new String(Base64.getEncoder().encode(decoded.getBytes()));
        skins.add(this);
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
}
