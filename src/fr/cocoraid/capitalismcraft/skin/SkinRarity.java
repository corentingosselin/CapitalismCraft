package fr.cocoraid.capitalismcraft.skin;

public enum SkinRarity {

    BASIC(10000, 1),
    COMMON(30000, 2),
    MEDIUM(50000, 4),
    NORMAL(100000, 5),
    RARE(250000, 10),
    EXTRA(500000, 12),
    TREASURE(800000, 15),
    UNIQUE(1000000, 20);

    private int price;
    private int realPrice;
    SkinRarity(int price, int realPrice) {
        this.price = price;
        this.realPrice = realPrice;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public int getPrice() {
        return price;
    }
}
