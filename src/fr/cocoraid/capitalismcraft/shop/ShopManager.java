package fr.cocoraid.capitalismcraft.shop;

import fr.cocoraid.capitalismcraft.shop.shops.particle.SkinShop;

import java.util.HashMap;
import java.util.Map;

public class ShopManager {

    private Map<ShopType,Shop> shops = new HashMap<>();

    public ShopManager() {
        shops.put(ShopType.SKIN,new SkinShop());
    }

    public Map<ShopType, Shop> getShops() {
        return shops;
    }

    public Shop getShop(ShopType type) {
        return getShops().get(type);
    }

}
