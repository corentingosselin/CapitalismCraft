package fr.cocoraid.capitalismcraft.skin.inventory;

import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GenderInventory implements InventoryProvider {

    public static final SmartInventory INVENTORY = SmartInventory.builder()
            .id("genderInv")
            .provider(new GenderInventory())
            .size(3, 9)
            .title(ChatColor.GRAY + "Choisissez votre genre")
            .build();



    private ItemStack skinMale = Skin.getSkins().stream().filter(s -> s.getGender() == Gender.MALE).collect(Collectors.toList()).get(0).getHeadDisplay().clone();
    private ItemStack skinFemale = Skin.getSkins().stream().filter(s -> s.getGender() == Gender.FEMALE).collect(Collectors.toList()).get(0).getHeadDisplay().clone();
    {
        ItemMeta maleMeta = skinMale.getItemMeta();
        maleMeta.setDisplayName("§3Homme");
        maleMeta.setLore(Arrays.asList("§4§lAttention §k! "
                , "§cMerci de choisir votre véritable genre"
                ,"§cVous ne pourrez plus revenir en arrière"
                ," "
                ,"§cCette information sera utilisée pour " ,
                " §f- La gestion des skins"
                , " §f- Les statistiques serveur"));
        skinMale.setItemMeta(maleMeta);


        ItemMeta femaleMeta = skinFemale.getItemMeta();
        femaleMeta.setDisplayName("§3Femme");
        femaleMeta.setLore(Arrays.asList("§4§lAttention §k! "
                , "§cMerci de choisir votre véritable genre"
                ,"§cVous ne pourrez plus revenir en arrière"
                ," "
                ,"§cCette information sera utilisée pour " ,
                " §f- La gestion des skins"
                , " §f- Les statistiques serveur"));
        skinFemale.setItemMeta(femaleMeta);



    }



    @Override
    public void init(Player player, InventoryContents contents) {


        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(player);
        contents.set(1, 2, ClickableItem.of(skinMale,
                e -> {
                    cp.getPlayerdata().setGender(Gender.MALE);
                    player.closeInventory();
                    player.sendMessage("§bMerci Monsieur ! Vous pouvez désormais choisir votre skin");
                    player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP,1,1);
                }));

        contents.set(1, 6, ClickableItem.of(skinFemale,
                e -> {
                    cp.getPlayerdata().setGender(Gender.FEMALE);
                    player.closeInventory();
                    player.sendMessage("§bMerci Madame ! Vous pouvez désormais choisir votre skin");
                    player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP,1,1);
                }));


    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }

}

