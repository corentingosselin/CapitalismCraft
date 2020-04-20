package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class MineurSkins implements SkinLoader {


    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();


        String perm = "cc.mineur";
        String maleName = "§8Mineur";
        String femaleName = "§8Mineuse";

        //https://mineskin.org/989689742
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjM4NDY5ODIsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWE3NjBhZWRiNTFhZmRhNWM1OGVmYzAyYzUzZGNkNzVmMzRiMmE1YjY4M2FlN2E2ZjRhYWM4NzliNDFiNmM0MSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "UEJRN7a47mfFDIsxFJ2X2D+6EFBy7Uw9wh2k8bQlQhYOKTHxONnZo2GW4X/eeggWsf3qXqr6yK8/gzwYd3gOXPJ2XBAyZUYsi8HAaRT9p8wIZebLy+g7ZSWOmeUeY1aK6612yVJ3cBJzvmgwB6tx4lWqbSwoRK2ZskIwc8wNwiZZQlKotvj9HUjNMrca4HfFgq4CkYu/O8FrI/l+3kgfeOdAnggTpPjthHKnYxD6XndWjQHYRmRAnIMmbQ2XVGtAsR+849uufGVVTX4BxlqKgrj+qte0ZK/8yF0N+RpmegQmHXVHdDzNN97dmvsRDciTCplr/gnfSA39VNVme3WXCKkoMorvTLm55rrUS0EI3hutCg0ll3XR7rgf3sekmCbM3FSM2btNNw/RTMURe3byn0hqDov/App5OI70R7BPELbehr8d9Zlcd2uCG1I9xMV3JK5J88e60Wh3byoy4sqGYeRSgJnKKz95iTW/D8ZKxX+kJYzRxIu4wXh/I+rC/ALXIKl7385U9UEibocpMxpW/fiE4Cj/nfZS+eivMPTt6e/rY8Ji1T5gPNgxa4mYyEUMiuTPXVbJb65utJR0cU+czHYR7t+xCJ6rOjrCvnzyB9zE9lj34SjwYNtM0ZsqXS3eN26GRjBFbLR2trccZQME16mVYrshVpSNQeo+BLE8scw=",
                perm
        ));


        //women

        //https://mineskin.org/114073843
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjQzMDg0MDksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jZmNlZTg4ZjNmY2IyNzFmYzU3MTBlOTgwMzE2Zjk4OWY0NDg4ODhiNjlkZTZmYWZmNzNhZmIwZGQ0NTgyODIwIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0",
                "AoVsSnY6W2MWdQpRW1d971uY2v26JkziilWhlorFSjkc+EaAFcYNO+9UZysdDKV0Cg23eARVZSrGxSvMMPHMHShIq6+pgBlSHPFFOmONmEilYGu6jAvGHvY4SWYgqJe917fGxy13S5FB2VdabE/L3K/W0DdxFR5qRNzRzJZO05enbxuZTUyEcz/zv92FP14QkzcQwtElpCjR36q6Vgp+jxxHIOpOh+Vm5qtef097/pN1T/IPS1NJCvl+k3/IFvDUuLX9Iag+O8OuaJr9b5TFB8nfbi7TCMf6lgg4aDnvsGEnlmDiihcDhIjw+Ea0aPFvRKMRxG/WdCsL+tj0HFZNnx0z04ayleqrs3mNyTR4puy5g+125BR1PPgVjKD3EdtGXKHiPikywQ5XVMIgAjGeBL3XA7DDDADhoO1CenLoaXAO6r2xzYkkbYGBAXWZF7inLt7i4p78IgkHf2Ow48QZZMOGDtNapoFOA0QxLYlRuKDweoC9+4Oj8lO5uom7qeZONdGLLAx3n9Nay8zXrD/L1TCQveZ7V0szje6rjQEL4l8LH0uc+0EwYtuExWp88OnxDJVJ3XRMqv7pcvsEeCH7ixkeRWjl1HLz5quRs0waXZsvbuc9dYK3p3HCbA/BuYEJLuVgdbnnevwU6MbKwffFj1nfY2CAhXp5x9+Seh+UG5g=",
                perm
        ));

        list.forEach(r -> r.setRank(Rank.MINEUR));

        return list;
    }
}
