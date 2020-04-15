package fr.cocoraid.capitalismcraft.skin;

public enum Gender {

    MALE("Homme"),
    FEMALE("Femme"),
    UNDETERMINED("Indeterminé");


    private String name;
    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
