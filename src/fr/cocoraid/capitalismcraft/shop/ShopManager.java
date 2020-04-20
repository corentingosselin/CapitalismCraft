package fr.cocoraid.capitalismcraft.shop;

import fr.cocoraid.capitalismcraft.shop.shops.skin.SkinShop;
import fr.cocoraid.capitalismcraft.shop.shops.wood.WoodShop;

import java.util.HashMap;
import java.util.Map;

public class ShopManager {

    private Map<ShopType,Shop> shops = new HashMap<>();

    public ShopManager() {
        shops.put(ShopType.SKIN,new SkinShop());
        shops.put(ShopType.WOOD,new WoodShop());
    }

    public Map<ShopType, Shop> getShops() {
        return shops;
    }

    public Shop getShop(ShopType type) {
        return getShops().get(type);
    }

}
