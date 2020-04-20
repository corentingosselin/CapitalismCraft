package fr.cocoraid.capitalismcraft.ranks;

public enum Rank {

    HABITANT(0, "§7Habitant","cc.habitant"),
    VILLAGEOIS(1,"§6Villageois","cc.villageois"),
    MINEUR(2,"§8Mineur", "cc.mineur"),
    BANDIT(3,"§fBandit", "cc.bandit"),
    MERCENAIRE(4, "§aMercenaire", "cc.mercenaire"),
    BOURGEOIS(5,"§bBourgeois", "cc.bourgeois"),
    NOBLE(6,"§3Noble", "noble"),
    BARON(7,"§2Baron", "cc.baron"),
    LEGIONAIRE(8,"§eLegionnaire", "cc.legionnaire"),
    SEIGNEUR(9,"§5Seigneur", "cc.seigneur"),
    EMPEREUR(10,"§cEmpereur", "cc.empereur"),
    MARSHAL(11, "§6&lMarshal", "cc.marshal");



    private String name;
    private String permission;
    private int position;
    Rank(int position,String name, String permission) {
        this.position = position;
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
