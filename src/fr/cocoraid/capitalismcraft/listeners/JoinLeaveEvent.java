package fr.cocoraid.capitalismcraft.listeners;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.player.CapitalistPlayer;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class JoinLeaveEvent implements Listener {


    private CapitalismCraft instance;
    public JoinLeaveEvent(CapitalismCraft instance) {
        this.instance = instance;
    }

    //https://mineskin.org/1195098344
    private static final Skin defaultSkin = new Skin("default", Gender.MALE, SkinRarity.BASIC,
        "eyJ0aW1lc3RhbXAiOjE1ODcxNzI2NTc2NTcsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDU4NWRhNjA2Yzc5NTZmNmE4YjI0NzRjYTM5N2UwZTFlMTg1NTc0YjYyMmY5YTJlNzFlZjIzOWI4NDliNDVhYyIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
"yTyaTlyHbZruHT0/06fCHEfwtf7QRmbQAOFeSmqQ5QFWKikrwTXEFq7+62pBM9aFmDzGVNIZ2b5wNd9ZVxKNhkfjKck9SHl3UiI5AvQNfbp6OXNNPeKArdLYvcgRzcddTbHe2yKVRpFVG4UUysCnl1oyk3frWAKTbUBaUwlWDg9HnAeXIVoaXqlNI6stdPwbrUczW/zh6Nb//+HHCEipbdGbU35EB0O3Vp6AlzeV3jn5wT/j8kItQU/m27TwtPA+6Urx8ypzNuTMmUipEMhfnRayqxgPEnssP82Nk02b7yno5vBtLjOU0O7JWLwwTkC2bE6OKXEu46Ul9Vuqwj0OrJDvC9LYn+t74spINNqV1pWCx5z7/LUO2NAyjyoxUjIbRO3NK/BnhtXAycOoKa0Rx6EThcgPeEGiLDaAOu5WNM/BMqYqmTqc9BNdZzzEwKv0Mbyth2XkRuw6sBdKijN+TnegQh1/PkD26+xEscvuC7dWKK0RLD1FxZKhI6j0dNhvq7aEKYuEV7nAvnZyOhrmPGJ4t3G6hJ8uTwxlRORatQUJ7CHlvw3U/Ee/JfdIBjxhDdEcqkoBEqPIP9Dr6ZNqu/06HRGgroDqES3kdTRQTkBWkrmgLShi23V/YE0HKZUdrKe9TfEFXFekSkmoSHlAjrP73b7Torjrk8kNVf1D++8=",
        "cc.habitant");


    @EventHandler
    public void join(PlayerJoinEvent e) {
        new CapitalistPlayer(e.getPlayer());
        instance.getPlayerDatabase().registerPlayer(e.getPlayer());
        CapitalistPlayer cp = CapitalistPlayer.getCapitalistPlayer(e.getPlayer());
        if(cp.getPlayerdata().getCurrentSkin() <= -1) {
            if(cp.getPlayerdata().getSkinsPurchased().isEmpty()) {
                instance.getSkinManager().setSkin(defaultSkin,e.getPlayer());
            }
            return;
        }
        Skin skin = Skin.getSkins().get(cp.getPlayerdata().getCurrentSkin());
        instance.getSkinManager().setSkin(skin,e.getPlayer());
    }

    @EventHandler
    public void leave(PlayerQuitEvent e) {
        CapitalistPlayer.getCapitalistPlayer(e.getPlayer()).unregister();
        CapitalistPlayer.getCapitalistPlayers().remove(e.getPlayer().getUniqueId());
    }

}
