package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class HabitantVillageoisMineurSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();
        
        String maleName = "§7Habitant";
        String femaleName = "§7Habitant";
        
        //men

        //https://mineskin.org/801896765
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.BASIC,
                "eyJ0aW1lc3RhbXAiOjE1NzE4NTc3NTE3MjUsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjcyNjg5NmJlMmE0YjAxZGZlZTFiZDFjMmQzZTU3YmVjMTVjZTNkYmMzMDc3MWNmMmIzYjZlODAwODQ1YzNhNyJ9fX0=",
                "S2CDEpfgC2+LZebuIf3AkMdkKI0Z5LG8PXel5PITPiNQszXU/i0fsYe5tmVlGkjilQS9qwG+rgR1su2MbuG442zGyvU+gswObzkcuAev3xVaJNUG8sKEaTgyTGX3lMcSSXSpcM5wu+1r0abwbcge1+h0wOSw0YdsauYB8Ce+NMF9iV1FU1UYAeKLDiiguOnlZ49K0L2SUPhdRMqOPDnyX/cVqOIgQcAAhHT1QWnov3qyQmCVH93Z46aV2nxIfmXGbysbqhFBX96bxLbPOrADV2BN160b9mjEggF5sgJ2YLVOJvUGHWnG+OQrbr+NFNw/zh6CRHEBNjD2ks8h2k/UZTlrVGXSF+283cWjR4zU4CjGRzg8fOWVbKXCllzyqD6dpp8qyZgLxaN9EcPrh691rNkHAPCBPTAXTxu7N20CysYFvj+1spNYIL9Ik5YvsHlI8UsT9KPIhMQGu7kpUyuSJkgBfTsVFbUT+6sorObiFKiHEoUALI+33GqsF7taPRFMASx8rlOS+JEgda94bBn0Ly2u9eJr5y82SGdu6cmwHwcOvATE7kLSk/6/uFMgbOHXwaYURdkO/gAsvdJL8AvgHAixlkFWzOZQCjqysv2KqxDpeIUoxUFo3Ks0Xgq4OUXfe6Yt1/nx9qDG3AQjV8GI2pj2L1L+cYp5up8ayeehEGs=",
                "cc.habitant"
        ));


        //https://mineskin.org/989689742
        list.add(new Skin("§8Mineur", Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjM4NDY5ODIsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWE3NjBhZWRiNTFhZmRhNWM1OGVmYzAyYzUzZGNkNzVmMzRiMmE1YjY4M2FlN2E2ZjRhYWM4NzliNDFiNmM0MSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "UEJRN7a47mfFDIsxFJ2X2D+6EFBy7Uw9wh2k8bQlQhYOKTHxONnZo2GW4X/eeggWsf3qXqr6yK8/gzwYd3gOXPJ2XBAyZUYsi8HAaRT9p8wIZebLy+g7ZSWOmeUeY1aK6612yVJ3cBJzvmgwB6tx4lWqbSwoRK2ZskIwc8wNwiZZQlKotvj9HUjNMrca4HfFgq4CkYu/O8FrI/l+3kgfeOdAnggTpPjthHKnYxD6XndWjQHYRmRAnIMmbQ2XVGtAsR+849uufGVVTX4BxlqKgrj+qte0ZK/8yF0N+RpmegQmHXVHdDzNN97dmvsRDciTCplr/gnfSA39VNVme3WXCKkoMorvTLm55rrUS0EI3hutCg0ll3XR7rgf3sekmCbM3FSM2btNNw/RTMURe3byn0hqDov/App5OI70R7BPELbehr8d9Zlcd2uCG1I9xMV3JK5J88e60Wh3byoy4sqGYeRSgJnKKz95iTW/D8ZKxX+kJYzRxIu4wXh/I+rC/ALXIKl7385U9UEibocpMxpW/fiE4Cj/nfZS+eivMPTt6e/rY8Ji1T5gPNgxa4mYyEUMiuTPXVbJb65utJR0cU+czHYR7t+xCJ6rOjrCvnzyB9zE9lj34SjwYNtM0ZsqXS3eN26GRjBFbLR2trccZQME16mVYrshVpSNQeo+BLE8scw=",
                "cc.mineur"
        ));


        //https://mineskin.org/598016283
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NzUyMTQ5ODU4MjUsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDA5MjY2ZDA4MjE5ZDliMDVjMTJiMDU2ZWMzYTAwMjBlZWNmNTlhY2NiNThhNWFiODg1YTU3NWQ2MjAyMzdmIn19fQ==",
                "UT0yijgIUjRQmw37XFCmIsvjwv1tLQ8OPTqHphMPkHSm16XMEI3v6FURCVlKwGXNKib1S4YphXDDrItThc0O7KAEHvh1g/UW7FUgehv5C9ONiKl9OOxc6v5BMKAY6Y+ZXVh0b9XDK0PMMRWmkk3xn/Y13gW4idFcwmIQTmlt/tZ81QlGKmuXQIhTxyJ9hyZF7tj2g+0780FJqurVocPg5DIYo04SVaF8+K8aVrtZBkjkv2zpHkytn8inSgyIPVKsnA2jPVai3CykHyuZQc3ivsjeGahcM/RAkRMHql/CZzp4UMW+9eBWxKwsT63/KlrWFfVTnBXrUY3UCWrU2maFyU58nKgBOxyGjONUvz0jzg/hI912yzjO5VjjfRiEehJp1fwjGZ2dRbsllVud0ie/Wmi/5vMQIYi+pv6R8zLJGO+G4Ei9aFC9ZPAY8wYyxxCI+tha5gJEGdJa7/z5LkKqzUeDeOKyZQ+nYf7CNtByEb3LbRwgua+WeVLEGnyE7oF3SemYsfmncZ1S9bIsHVv8I7IPNHNA99vAxupNGmKsk+clSEo6gf74A7Qm1FXjj7hVbxgJFnbwuRlxVElvtKOnh8V/6osyImCfW+inXXoH2zbhFOSlrWaYIyXM9/cppKhPk2cQUkdaDQL+X8hpiIZ5l/MGzqEid6LYYxyt2FPQgaM=",
                "cc.habitant"));

        //https://mineskin.org/1360700031
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1NjE4NDA4NDMwMzIsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJ4RmFpaUxlUiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzgwYjk3YTVmOWY4ZmFhMGVkMzg2NWQwMjY3NWU1ODdmM2IxZGI5NGQxZTA5N2VmYmFkOTUyMWI1ZWM1MTlkZSJ9fX0=",
                "RCDlxdKfrSmbFokrlSE+wXiQOoKqQKefq98YxyzaegpeJ0kURdiqAZSvNQZN0r4P4TQLk9FWm90SrWRQ3Y7KqXVuVx/G8Ck9H01iednkXpinGjrDM7nOSnTboJ0UT422Id+KbWbHuDAQ9DIU6cHskuqtTPwbuo1G+zUp2IOEJCtZcxtP2UgJskgt+CS17x17PpP66Kezm6rTkS1wL79pODEiwkaRDde+CkAp+TT5THydl7PW9/VkhIKaBl9Jgs1Yzd7pdEiVzhWlq5QcWlg3wt4lGKiy/1rFy19W0i6znd0rKp+9MqYlZuC7v1IwYwLAcpGTalwI2JWwBp3bfH+i79ZXRC4ZuuoFAjFOmrYsIXQszs+zX7kFk+VMa+u1bI2/OcQLnNDxihUeRPA8wvLUnONWRfNeCtAMSDuNz5XGWVpe9EaHxf8onHrOl39pXeUuiNi85KUAbbPubW+PRG6nkglVaHbGJWxbEf+QDaOQ7TDFXs06u6LYCzfMW7rwUktZiPXhWP2abumPQxqgXb1YnK7dNx0Mj40Xc/FzsyaUBroOO2ERbLAKFnJq18REHIA354G4x+V1TqYBXFggrm9HtSpx5s9sr9CJF8kddW41HKoD6n15jWI7pqr5NFQNLa0Sgob0vOS6RWuSB3s20G/ov1kd1XlysHytONbrBunqX4w=",
                "cc.habitant"));


        //https://mineskin.org/1093651151
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1NzUyMTU1Nzk1NjMsInByb2ZpbGVJZCI6IjE5MjUyMWI0ZWZkYjQyNWM4OTMxZjAyYTg0OTZlMTFiIiwicHJvZmlsZU5hbWUiOiJTZXJpYWxpemFibGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3Yjc5MjE5YTU1MmUwMTA0MzQyMGMzYWZkNGI3MzM1MTZiMWQzNDIzYTNmODE5YjFjYjliZjg5ZmFkNTcwNWEifX19",
                "YTvpuJx1E/arsu48W8ju9JeMbQF3Lcv4imNJrJwKNgyDVneQfQ3Ow96jxWqHG+yrvC22KfqMibWDTGahAaBiDgEhmuiKXbgIOxcnBPJ3U0YSYAPGTl3CQPiRqZmJw+C6gFQiUq7BXP1XhSlRUc4/JLf54y5z2Tc+qhLXZwsA7jsj0R5DvU0TUwkHsQzKLZljceMdtWYOur9SWdpZhqdeJ/k0jCKzxik/eq6IaRqaKriVdJsJivc7bkIfEvz7pQjSG4xvrRKl6I/lxIxDwn8/cX8Nv1ZDQwz0vEXRZZXDk2YInFPRnKnlbv+NkQ++iCs4hcI91ruZIRhpHGaE7u26v5pX0yGJhXP2DgH0cS1OIdTiDgtIzMZQuliaMWqDaP0hQIFtMK27A+4jsTRxWA9LWDQo3uhEvwRogvNjEpCLh0ULDOb2jOO5VBPriNJEN6J1/0h0tiNReyHvgIVk/LlljO1YatjnVMPRx6dmFcJ5Kf+9P4yquoHfn3xCGQ+BmNK+MrGXWv5+v172q6usBi5uKFHtokOKJVcD4cMtmzBGA+SudX0KLPvmwiZ+m+ejiJzNVJBAb5lqPdgqnF5Txb2/PPEiRx/xz29ZWryOhlRfGuOcSCupjikXbCPhO95R9HPcn6QlGj0K03buBZSfXI2nx5qrW7NKZj6JSKdfmshqgq0=",
                "cc.habitant"));


        //https://mineskin.org/585416755
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1NjIxMDc1MzA2MDgsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UwNmNmYzNkNDNkYjEyZGEyZGJiNjAyOTNmMDQ4MjE0OTRiMDAyN2IyNzcxNTQ3M2YxYzE0ZGJmNTMwZThhOSJ9fX0=",
                "s6VkhuA7mcs9jIB4YhWZMONJ4DBpuKGlR1qp10aNtQwY0rBHmulRdUsc3MUSEH+LDIGJLY3QV1ipKkgUTY5D0WkNoP2YiZSf/ycyxpw1kEt24geqcFJyCG44kEMXWW5iV+d5IUMy22cQZZy5pLkDExAZkdj4lzxvnBGmcf1PthDe+MJvLlhCqqhv1t0jy8djm7gAhVHi4hYGy7OvpZITH2DwVYukw87RhFXSHtO81huQhrSeK/aCpYnin6pnretPsGeXnzc7LSS5h4NcLQqs/UhgsqbIPIhg/mppVt6n9wCrCEAQHW8p0ZpsEqOZbUIoMPJ49+rm9IiAWp6AZa2Z6uoLyKwq8YX0Ebju9Um6g4JRJOz5Ib6sphm5u6xjBplEeI6eeoGut+uVil14VUX0JMkGYu9UXAweKly2zxBzOtBjBgODJ1tXIUTwez+0K02H10qbpVSnBQ/PyO177wt90b59V7x7Y1nCiKWB/aaGdCudeoucXdjyqzSBMW+iM45xKvF4Gy6v39wbGY2+b2kBaleLsc201CnHbJCemAwNrjpkA0Jlro8co3WM9a3SxzS7lhXd7Gpu0QR5K8XkEjK/RJSax+ohiop8w7DxdcYvl+DQUQYc6Z6kQu4ehPnPzr6xdh8uUUQDazddk60flmAL9jXzGOlmyusu3sGoUval6Co=",
                "cc.habitant"));

        //https://mineskin.org/820378736
        list.add(new Skin("Habitant", Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1NjIwNzc3ODMzMzksInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkzYjUwZDdlODM4M2Y2NTZhODY1YTlhZjA1ZTNmYzk3ZWM2ZWZmOGNlYzU0NmFkZmI1MGI1M2UzZGU0ZGU2MjYifX19",
                "dubcivWbARSmeEN1NJg89tvVFUuiFwZ3NBmPLNlUX4qwSDg3eqHyCEcl8fRu5Cf9R4Y4YQ782K+WtUszeRkkywChtZtyJ1jF7YbD2UDOH6N/gqTBETiKgkGrXyJ6idIfQKZ1LRhCAlj44K7bpW5OTjyyZESTmWkGc4AEXrIfEtGcvRA5oKk2JencxOwtoTnRkwMOBcZ1mezdHJGv5/iLc45B0P19SOo4yxlRM1zX/88g2euQyy+QUcXa2lROhIaARjDpvwd8BePWA0xnKD+T7h/UXl5FTouDCntcI8w0lOpo7FEOwgtMvHXo788iIZ4rJ2LWbHCIki7Dboj7ILyrAOXITCiOfYnn88ZDLW0bnah06Mqk/XkmzqamkYL8KsBAQK2u6e5mgOL0kzyRj3vKsWpbzQNFYtRDbVfaEBN+OleyeQTWlSPn2Ka7g9IzkQ21lrkYc683eP4FZABBCsPeKyXpzU0A4DjuG5WHitdsMue81CfbxwSkCgUI5DU/LDgbWDl+4S+MeLhZKg/cK+AmbPhDU9/KnGoHknUts7PhZOrz0qDsgCqOsPpYtH5SXMuSA0Anu5ozikbAdMnMVS8G4scKl0WengVKBkL+fGe6m/J3JFFyraoOQ0mL4pIUZd05MxGtpaMs2OROsn/lbH6l5dhgcsJIsKwStO6RUl87TBs=",
                "cc.habitant"));

        //women

        //https://mineskin.org/114073843
        list.add(new Skin("§8Mineuse", Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjQzMDg0MDksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jZmNlZTg4ZjNmY2IyNzFmYzU3MTBlOTgwMzE2Zjk4OWY0NDg4ODhiNjlkZTZmYWZmNzNhZmIwZGQ0NTgyODIwIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0",
                "AoVsSnY6W2MWdQpRW1d971uY2v26JkziilWhlorFSjkc+EaAFcYNO+9UZysdDKV0Cg23eARVZSrGxSvMMPHMHShIq6+pgBlSHPFFOmONmEilYGu6jAvGHvY4SWYgqJe917fGxy13S5FB2VdabE/L3K/W0DdxFR5qRNzRzJZO05enbxuZTUyEcz/zv92FP14QkzcQwtElpCjR36q6Vgp+jxxHIOpOh+Vm5qtef097/pN1T/IPS1NJCvl+k3/IFvDUuLX9Iag+O8OuaJr9b5TFB8nfbi7TCMf6lgg4aDnvsGEnlmDiihcDhIjw+Ea0aPFvRKMRxG/WdCsL+tj0HFZNnx0z04ayleqrs3mNyTR4puy5g+125BR1PPgVjKD3EdtGXKHiPikywQ5XVMIgAjGeBL3XA7DDDADhoO1CenLoaXAO6r2xzYkkbYGBAXWZF7inLt7i4p78IgkHf2Ow48QZZMOGDtNapoFOA0QxLYlRuKDweoC9+4Oj8lO5uom7qeZONdGLLAx3n9Nay8zXrD/L1TCQveZ7V0szje6rjQEL4l8LH0uc+0EwYtuExWp88OnxDJVJ3XRMqv7pcvsEeCH7ixkeRWjl1HLz5quRs0waXZsvbuc9dYK3p3HCbA/BuYEJLuVgdbnnevwU6MbKwffFj1nfY2CAhXp5x9+Seh+UG5g=",
                "cc.mineur"
        ));

        //https://mineskin.org/1432742267
        list.add(new Skin(femaleName , Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NzMzNzk5MTgwNzksInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODAyMmRlZmI4ZWYyYjkwMmRkYWZiNmY4NTU5YTgzMmVjZjVmMzZhM2UwZGE0ZjQwNDNjYjVhZjM2ZmE5MWQwNiJ9fX0=",
                "s5zBTjDounqyKaIaZFg/ORU2oPa4s+2k1Jq9Xkx0+X0pZwLU8e5vq1Mfywj8576XJ/Im0eLN8UBVIu/lAyFMcWtQUhnaeoRzuyrBiivo5SZHi1YhFO7DfBzUXBceHl+cgF2XY+rKY5YcVMf498vgAYAJBJj8qevzAT2XRIVj+hzXrq3caIjggWj4okBj8gaD8j9dlWA2nF3E4PS2zsw9IVjI7H8TQ1gG20hVgdd3RFH4XJDKPO84/eMMvZuHjJ+VUhqlLV+bF0T83T46swGtnhzIfHOGvNQTni31TN7RYAItp4k0s85yOxKNoS5MBsc8BQs1KGG893Gsqi1hmIzRvjoqtZB54FOVWZhwVrt5jJfrpkLLXFfVsgppiZPvKWrL6oUOFE2eSJ4Tdlk8VdzI9dYUUBTJEZ2WVh2w2VVOVvyR/jyv3CbVuVS/rWo9iRERUBn4n9jQ4woewvwXwZtg/RxJ5eFqCjSd2xRd+I+J0S/z4RagSo0brGh93anCSIdSiaG5l1WfKQiG79yCWyucFu78c4oeABxnZlG5Fewg8iDMBIaPa7YWnVGlXFeZWc5aKE83BFNkM/5gaji6G5T7JuYaFyoQTR08tdwDkDf88bTTKMXSgSzW+1Htfo8CcRi+j9LYKJk54+TWT3C+ttpL7v+d8naBfUUyfuTiy+aDPT8=",
                "cc.habitant"));

        //https://mineskin.org/1897902830
        list.add(new Skin(femaleName,  Gender.FEMALE,SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1Nzg1NzA3NDM3ODUsInByb2ZpbGVJZCI6ImI3NDc5YmFlMjljNDRiMjNiYTU2MjgzMzc4ZjBlM2M2IiwicHJvZmlsZU5hbWUiOiJTeWxlZXgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcwYzEyYjAyYTdhZTE3OGQ1ZDcxOTdmNTJhNDEwZDdiNzcxODRkNDMwNDdhM2ZjMmU4MzA1NTRiOWFiM2Q5ZGEifX19",
                "PC2iCiRsnEH5Q5RDqpHNJAeF2QCzKMMuBIw0pvtVTwyxExClWu5YlN3LurU6aMJLqpyXV6Wr+YP1g9b4Cm4Nwau35zoHM6BDsk512V2dhNub5BfjvhXBk6IT2CdVBBUxbNlPD/ZRXzNWuOQw8YZmjHg03t7vdssdWNkfXOdE2bq2Pp+qGeeiU9xMf4DGe4RdPq7hcXxofSCoq+yWo3uj6GkrpCDDVOKncMZkqBXXzC/5ou3vHgPRE8JJcVhnanwJKBJ6kvXid6ecxTPg4c8OBwfUErTtJje3234NqFmUz8kOxNnpS3Q997b0ffqGm6ieyMZS0a9zYPsKOb0l0DNkqhEooqKQiNrH40DwbT32LzuSMhFOasYqBB5ESYirBk2bpqXeeAup0XwnAsKP96gt6fLZeF0i3SjvEUjrEnzABiLl6xKEIAqf7Orn1+EvqdCpnAylHVqvdPWW4E74At8O8D7R8qVFnfty8V7AhXSuXrIoTvbKLa1E2O7PNNL6lj23n3PFkk6jKSdpbxmdUPVf4lwQVdxx0MZTGeh5jLf3ESNnwm4lW2k13/tJcBNYF6O9k/YRZGM7dP/4Zqwku2dqsNWtytNAyPvORiEdDpUaEZPHNXWGqlmeuqWADbK5tfkF0qFITYNgtntpHmNMHTlqzRiQquRvbCOs9CFuHe4VuHE=",
                "cc.habitant"));

        //https://mineskin.org/703890509
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1NzYzNjI4OTUwNzMsInByb2ZpbGVJZCI6ImI3NDc5YmFlMjljNDRiMjNiYTU2MjgzMzc4ZjBlM2M2IiwicHJvZmlsZU5hbWUiOiJTeWxlZXgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM5OWVkOTA0NTgyZTdhYTAzZTBlMWZiZTg1YWJkZjJhZmE4YWE1YTdhOTAzMjI5NWRlY2QxNmJhZDU3YmM2MTAifX19",
                "oAoJTDQkCLwMyW3ZTWDgSvVrbMlgWTW/VX2X5PRYVUvRS2pT5kEh+x3ViRGGTUNCbcnwHvm1D5TrUaR587Cgo1W6NeE9UUEiMNiwyZ28kG67QaZmytSTHAesXIiv2PXts/YcYb54FiysJAD4Nanomm5D54Qbz3qFErARwScSAbjgCzNojY9x/iQWzTxl5T7Ib7d7NeOKFiKTMXl8E0/7PgkuZnqHbwLJvkW6NeuUFlE8ZM5S7W7h5iCIbCBuY5D4N4mOJmL18jRFOBojTWdfRVn/beHmGhTc4rQ1YkIyobYweID7+LoKrURfmmnRM8Ssc/LStp6p4Xg84p+yuoubaLf43t+6CnSovmkZDehFfdK2i7iQ+yHQCNrK9kcbm+fcTAeZhQHbLv1PQ28mSqQf1HbvZEjl+oCntNX1V9tLpgA5T+J/0uFVgqa8hD6+I7k5+in2P/WoP+i/xQNQdzZBVzubTAWxt3O79XopPbNrc4E5LWBHhrQMczNcLoXP5d6Tz3q6gcXjgMinuBOqml3PijHUwh4zRkt1DsF4OnEAdaW3fY/croAwXjMzqjEaHz2o424D/i0SBWQAf20ieIYtHcudSkQrFJEgop+wNaKdObATO47FwmjHxzRp0YTUbLwkkqRzZEoe9uMixtsAW1dWpAHa6M5/bNJtqSqYaHKVgMc=",
                "cc.habitant"));

        //https://mineskin.org/410883950
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1Nzg2NTgyNjc0OTYsInByb2ZpbGVJZCI6Ijc3MjdkMzU2NjlmOTQxNTE4MDIzZDYyYzY4MTc1OTE4IiwicHJvZmlsZU5hbWUiOiJsaWJyYXJ5ZnJlYWsiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgzOTAxYmE0ZGY2ODU1ZDcxNmY4MDgyZjg3ZDI0NThlMjQ0ODgxMWVlZDFkMjU0ZmJkMTFjOGQ4YjE5ZGE4NTEiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ",
                "fgLdqvAplTazAOAFgsB783igwev5vXvkzYTf7s+1YgYzesgI+TL0G2NPZvxE4qt3DW+Vo1YlLmGQTqZWvADwq/DHEHwoFI9/ZjRntFRvN5bgfKr4OdY+ybI6XId9sYHW8S4sLkuAWNOu/c5bCH27OWNgsJduhjIMb44LYnXV45pzeD3F/FrBGCn4OYysdMqBB/xWvJ6f5UNhC059W1OizF96Yep0ryxmCqHRVChQm5a0Qf7QnKXvzR5S5d1F2WovDk/kWkpocZT0uNUr8LjEdv7pc7knExPulvHPylYlLT/Hj2W8JPxBrL1q//3EvIiKrpwWduZiTcYH9x82Sxa7hv+hcUnyHxROq/Se2TWX710Oj6qfoDrj7EAvJDqfi5j6zYhU97WQmc/STL3HpvDC3KNFEu2KrVoAfK0MHn+sHV6HEm4bCYXtwWrAtowNGB7MY82rZzYQUWoUpPcuOvVBGQZs3w+bW5WDTg0RS6ii83lzY0bWJyQKRo6f+81AJr9vQwN+ZLjPDDTVESpEs9DiDTDgi9aEG2euo5sN3V+5y6mePvACY6nNT2xW1C0KBxdnR+vYHnNjjxsspKn0IFG6aI53ELIHpn3VC0qUFjVO/eGMA4xqhalpByT7mzbUt5+dQ4SK63mqpxGy9h8DMNuQkJb27rxjSP2RGA+ySdl1E2g=",
                "cc.habitant"));

        //https://mineskin.org/503152486
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1ODQ1ODg3NTQ1OTEsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFkZDUzY2NiODk2NjgxNzZlMTgyN2U0OWMxMmYwZTBhYTlkMDI5NmU5M2ZlZTUxNWE3NGJhODBhZTU5MjIyZCJ9fX0=",
                "kDqVd7/MdojYJnXnk+MkkkNA1qaZFtfi5qQUewS/qdm5OFxbg0+9Vi45LwEvqQSSSxFPuvp/YIyLToH/jt+YXZ2dW6BUauNgteNlZfwzAQrBBcCbsQIuMXJsIn18q30QW0/4AG/D+vs+Xl38yI4IzugXB4HE5dTbjfST6Hr8x3Laf+0+G+sPFuwcbvZINERk7g6itova5PoGGBHjFzF+PGRqoBS6YphS8gF1URCrmnotwrR/nWDB0djE6/iO2mVMCOqFRYJnyXMO/L1dEu9E2bzAM8z0/ZvfsBVZK19JZSeQKzMD9h/hzUx7NOlbTx9IK9irRu9yThuky4l/bvLwz7zxFLZvXRJfhY++uwy85icoBJnVnrfLN/mHR4HIKROIqx2VbhvVtUoGI2upIlbEeFi3+AYSmb8eshPb7GtaVoMXewH08iq0/jXPnNOkSR5F6m1dh75vIaBU5Dz1HhiEC8g1Earu5J/NWBh/D072spCCLlRDPo6C0tcHhbPoE8LRbEB17g9pbj8OB5wm9Wr0En3jL1tzI0SRrKpmOlbITLfwnlGuNc8u5mnhh5wSpqm2rERQ/i5Vjs76W1/N1aHFNRniRGv/RHyjFdGL5Eyhm6H1VXE27HcGRd+XwdvhRmH3kuka0c2kUS1OKwq3Gs3rk8+gIISOu89M5o++gIVhUk8=",
                "cc.habitant"));

        //https://mineskin.org/1599746545
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.BASIC,
                "eyJ0aW1lc3RhbXAiOjE1Nzg5NDYzMDkyMjksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ODlkNDJkNGE3ZjUyZWQyNmE4MTQ3YTIyMmU2MTc2YzQ0ZWUwZDdiNTA1NWVlNTBjYTkzNmJhOTFhYWUwNmMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "kzKZQQp+lEHMILxeouYHQajiWNli8iRRq6vy63ihuT3ygVZ2ujI5TWACfDpLIoVfd69velXSoKlQdUimW3rm325x1r5x9gas8EuhGC1vpdcaQ5EpaZ1Yd2BVdynI7Zhcwl7JVz5zaSk3ryMV97FvEYp5KAqXSzXTWKV+AZxUSqqJucOQw+OtLYoP/kPN28pqHQd+EiZ5DjqPpRbj4ZVg75kOB/34XQbVMjdcpKG55/5VVl/mhnby1l3BKNma2UkYeHNETLj3Vng7pHqlbO4GRh2XAio7gi1Ml4+q+3ffm52M9XO+LumoyfJcvVGvy4/bFv0T92y2E1crKAnkXZCfViejWunJpOHdRNWIu5UaPIZK48E1WGahS8IyVqdgCbrKkrCj63xuTuY7I51ENWyLtlKJGUruQE+9Yoysg6yzldzKXAJXPwzOfJB5QEu/Mme95FRi0oc4nb/3fgg6ZvXOi7QJrX9U0mVfMR4387m0/wfiydVV5iGCl++lCW3qwC3JN2CjAcxc0wCDBMCp2Df9ZwilCEEbO80GxPnvcI3PyXZHDsfSUb043BbEuPLusK9cZVWsPyplBy3Ky7XefHsiqMZuWnlEehhjIRtgrG8gUSd+P2LmEIyl+8KaOYNSiEe9VxIQB4+yPlRrWLoeaYGoxx+/azihd96AS+c8jiakQqs=",
                "cc.habitant"));

        //https://mineskin.org/1704351894
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.BASIC,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjQ2NTc5MzcsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbl9vcmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEzY2EwODM1MjkxZTUzZDFkMTllMjBiMDU4ZGEzNmQ4YjI0NzhjMTkzN2E2MTViNDdmMWZmN2M1MDExMDc0N2QiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "rGLK6FeV/eBP/Eiuda4OzW0WvzqHTn+LE21SST39ldtn7cre6XyPDprB6W09aIJxrqOmXKKWBJThHhQVbTg+5iXY+ig5mMomRm74V3F1u6JsVxEf2UHybx1lVOHzLdktMdGg7y8suOLb2M+Q75mUwmIw25TTY2qbpp3B4uGaCiZSDh/CsGW2NbzXhKZaGiEXke4qThdjlh4tbCctQyJTFMZ8lFvPZ9+cGI/uh/lZgCKx9oc8r+5GsbURalqjMds4L6IP9c6k7kBv3l1K0ALGUhs6lQQsNKgD30jM2vu4/J44gyoF7RdFcUhOZSYG81xQQ6lfGNoMp+gNL+QMrbQVMC0hWh98OnsR5hY/Da4hqKq/JcFiAPw7iRVIMnuqdAUDWhbgtT6mkv4aozCu3mRyqUEzH3HvJFzS5j3OzHyREtUwtD9nc5yoidhNoTdokV6GriHNOb18fsPgCe5qiQxhobTQCAXIm3mJYJUZjP2IA+g5jZ8c7ZLlj8nPJDIANWBCb1sPwSkYa8rajdnff9dMqOpaTFaPJOOCs39PxtsufQvGLlGJKQPwTKB+YhIdWMFs/vxXBnGVZBpGfwydLx0mI/4wchPcNVTHJoDsZ8ZB9Urbd58zxKTEZEUXtH/QJGxH1wm2hcPrk4X3KDxf7nGgdpTHeS9ccylk/rnvkwIEsOA=",
                "cc.habitant"));

        //https://mineskin.org/1939826050
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjQ2OTgwODMsInByb2ZpbGVJZCI6IjJjMTA2NGZjZDkxNzQyODI4NGUzYmY3ZmFhN2UzZTFhIiwicHJvZmlsZU5hbWUiOiJOYWVtZSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Q5ZTYwNzk0YTcyZTZkNDQxNzgwODc2YTJjODk5MTI1Y2E3YjA2NzA4NzJiMGFjNjczMjUxNTAxOWU0YWI4YSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "oc/ajqB/ONL4UdEKPQJkE99nBWOr5nMedGhur+6b8aPTqApARdNvr5TKgIfdm5c0tzxbbW0Kdr3Pf/d3skzsR28G0wIHXqrid/G6Q7OMFabszWMvVC8i2pDiriENMKbXzCiCGUrzhIAKxSLBwjoOVQQq/kOO1M7TTY7CcQPcyAeCyNyYZ+ZFDON11v6jntrm2YJaVfDbWRCqAh2sicHED2/Hg4RzFG9L6cPmTJpiarQmiWFixU7o8YxtMAnsaw+CrD7HW1S9buBZnc6jjwRzXnhS6ZFPRIhTkcnd12hW+1i2ffB/7aVJLnsjlj0QdCbJIVl618uvlu9vXaLiqBw5/nrQjb999KPAg8BO8MBiRl4Uzxfi2JmtMCi3YKoKRpECadrQN58MrCZ2mKRCmfkCAO26WWlYcUoiHbcxgw+5bxKsEQ87Dmaw4bN7OsrwUHof69xwgibIfqlol5F2Na7J7B4qjPazZMgCWN7yPZN2ZA6TIwbir2PihHTLBgZGarwWhnot5Nj/nMHP1/E9qJ5T5VcjU7RhIKuwa+lNY4p6UUmzaontwwtJG+heUGvqVuVE3NI+5roRUtjIW0dxYBa07U2yov6sZYLucasC15BtUZ7T5SBJMLbI5bXCKcxt6neIYkuJ26d0+15/YiUhr1RjlXlHgLxMKw4aEzi91nJQnBo=",
                "cc.habitant"));

        //https://mineskin.org/1969827652
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.BASIC,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjQ3MjkyMDEsInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY5N2RjMjJiZmFhMDRkNjdhYmY4ODE4ZTc5OGRlMWViZTE4MDVhNTJkYjE1ODkwZTdhYmE0NGU3NmViMTViMCIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "W53NXOQv8fB72lZEskba6ngko5+KqkZ7xmt8moJFzwtJFcM93upTNjHoOl7rUPSjMGu/7CgNlGexgYIYN0lR7vIUzxKpHNKa4eJhSyI/xE5/R9AfGLa5QDxXn8mOxyJolG2r+tnmiT2lqDYEqV8a2MIBx+NQcLbrbCEmg3OQiaLU6/4W+D6nKVeBETxoTtwhH1qIC9fkMe2EM2qRdsZGV+8qmJeWB2iHLqF7BH0lEagsAz4HW/sUat7g4gq0kZ4W2JRrmV/EeKjBeoQyITonozk5w9oRFS1jSpkhDIkMAM2zl+ArM0shcJEqhB5YMOk+IdN+Cj+CUMMqokNEY0FLrhMMCBgK8EV32vZGrxVyNT1Oe/5T6+6SOYfBhczA4glYYJLDcJGeq1c5Ms6vq2FnM58YEfAAtjx1CVOwQGnaY+uCRcMtOVEEMU1AqCG5jUsimIbT+H6c5OzPnAV8yr6tdmJUxDElO/BEOU4lkFCtD1E00xUuMjL5+lnDnUtvDBdDyhHj7KWwslZCHFqqNb/c6Agt10OEZevbLBXg2nW0Ckh0ko6t3g6CEpQuaBzEMj4fuqCOexuxOZLt/J34a5nrdp+eQINGuLQrChWObBi2GVCF/zqJOp5lw6nBN5IPi621/wGW1WXhqARsorN29+Bvh/3tGejBTdmralUYezLzXqQ=",
                "cc.habitant"));

        list.forEach(r -> r.setRank(Rank.HABITANT));
        return list;
    }
}