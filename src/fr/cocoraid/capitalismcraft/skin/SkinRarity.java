package fr.cocoraid.capitalismcraft.skin;

public enum SkinRarity {

    BASIC(10000),
    COMMON(30000),
    MEDIUM(50000),
    NORMAL(100000),
    RARE(250000),
    EXTRA(500000),
    TREASURE(800000),
    UNIQUE(1000000);

    private int price;
    SkinRarity(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
