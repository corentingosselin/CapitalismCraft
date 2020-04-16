package fr.cocoraid.capitalismcraft.ranks;

public enum Rank {

    HABITANT(0, "§7Habitant"),
    VILLAGEOIS(1,"§6Villageois"),
    MINEUR(2,"§8Mineur"),
    BANDIT(3,"§fBandit"),
    MERCENAIRE(4, "§aMercenaire"),
    BOURGEOIS(5,"§bBourgeois"),
    NOBLE(6,"§3Noble"),
    BARON(7,"§2Baron"),
    LEGIONAIRE(8,"§eLegionnaire"),
    SEIGNEUR(9,"§5Seigneur"),
    EMPEREUR(10,"§cEmpereur"),
    MARSHAL(11, "§6&lMarshal");



    private String name;
    private int position;
    Rank(int position,String name) {
        this.position = position;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
