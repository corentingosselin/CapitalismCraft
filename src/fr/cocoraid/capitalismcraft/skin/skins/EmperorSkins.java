package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class EmperorSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {

        List<Skin> list = new ArrayList<>();
        String perm = "cc.empereur";
        String maleName = "§cEmpereur";
        String femaleName = "§cReine";

        //https://mineskin.org/1606055766
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "",
                "",
                perm));


        // https://mineskin.org/400361934
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "",
                "",
                perm));

        //https://mineskin.org/66132644
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "",
                "",
                perm));

        //female

        //https://mineskin.org/1077058417
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.RARE,
                "",
                "",
                perm));


        //https://mineskin.org/1104822856
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.RARE,
                "",
                "",
                perm));

        //https://mineskin.org/1551041800
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.RARE,
                "",
                "",
                perm));

        //https://mineskin.org/1872396691
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.RARE,
                "",
                "",
                perm));

        return list;
    }

}
