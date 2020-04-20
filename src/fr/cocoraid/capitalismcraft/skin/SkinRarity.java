package fr.cocoraid.capitalismcraft.skin;

public enum SkinRarity {

    DEFAULT(-1, -1, "§8Par défaut"),
    BASIC(10000, 1, "§fBasique"),
    COMMON(30000, 2, "§8Banal"),
    MEDIUM(50000, 4, "§7Moyenne"),
    NORMAL(100000, 5, "§3Normale"),
    RARE(250000, 10, "§bRare"),
    EXTRA(500000, 12, "§5Extra"),
    TREASURE(800000, 15, "§6Trésor"),
    UNIQUE(1000000, 20, "§eUnique"),
    LEGENDAIRE(2000000, 25, "§dLégendaire");


    private int price;
    private int realPrice;
    private String displayname;
    SkinRarity(int price, int realPrice, String displayname) {
        this.price = price;
        this.realPrice = realPrice;
        this.displayname = displayname;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public int getPrice() {
        return price;
    }

    public String getDisplayname() {
        return displayname;
    }
}
