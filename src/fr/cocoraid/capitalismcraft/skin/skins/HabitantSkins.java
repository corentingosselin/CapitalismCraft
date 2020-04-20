package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class HabitantSkins implements SkinLoader {


    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();

        String maleName = "§7Habitant";
        String femaleName = "§7Habitant";
        String perm = "cc.habitant";

        //men

        //https://mineskin.org/801896765
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1NzE4NTc3NTE3MjUsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjcyNjg5NmJlMmE0YjAxZGZlZTFiZDFjMmQzZTU3YmVjMTVjZTNkYmMzMDc3MWNmMmIzYjZlODAwODQ1YzNhNyJ9fX0=",
                "S2CDEpfgC2+LZebuIf3AkMdkKI0Z5LG8PXel5PITPiNQszXU/i0fsYe5tmVlGkjilQS9qwG+rgR1su2MbuG442zGyvU+gswObzkcuAev3xVaJNUG8sKEaTgyTGX3lMcSSXSpcM5wu+1r0abwbcge1+h0wOSw0YdsauYB8Ce+NMF9iV1FU1UYAeKLDiiguOnlZ49K0L2SUPhdRMqOPDnyX/cVqOIgQcAAhHT1QWnov3qyQmCVH93Z46aV2nxIfmXGbysbqhFBX96bxLbPOrADV2BN160b9mjEggF5sgJ2YLVOJvUGHWnG+OQrbr+NFNw/zh6CRHEBNjD2ks8h2k/UZTlrVGXSF+283cWjR4zU4CjGRzg8fOWVbKXCllzyqD6dpp8qyZgLxaN9EcPrh691rNkHAPCBPTAXTxu7N20CysYFvj+1spNYIL9Ik5YvsHlI8UsT9KPIhMQGu7kpUyuSJkgBfTsVFbUT+6sorObiFKiHEoUALI+33GqsF7taPRFMASx8rlOS+JEgda94bBn0Ly2u9eJr5y82SGdu6cmwHwcOvATE7kLSk/6/uFMgbOHXwaYURdkO/gAsvdJL8AvgHAixlkFWzOZQCjqysv2KqxDpeIUoxUFo3Ks0Xgq4OUXfe6Yt1/nx9qDG3AQjV8GI2pj2L1L+cYp5up8ayeehEGs=",
                perm
        ));


        //https://mineskin.org/1360700031
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1NjE4NDA4NDMwMzIsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJ4RmFpaUxlUiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzgwYjk3YTVmOWY4ZmFhMGVkMzg2NWQwMjY3NWU1ODdmM2IxZGI5NGQxZTA5N2VmYmFkOTUyMWI1ZWM1MTlkZSJ9fX0=",
                "RCDlxdKfrSmbFokrlSE+wXiQOoKqQKefq98YxyzaegpeJ0kURdiqAZSvNQZN0r4P4TQLk9FWm90SrWRQ3Y7KqXVuVx/G8Ck9H01iednkXpinGjrDM7nOSnTboJ0UT422Id+KbWbHuDAQ9DIU6cHskuqtTPwbuo1G+zUp2IOEJCtZcxtP2UgJskgt+CS17x17PpP66Kezm6rTkS1wL79pODEiwkaRDde+CkAp+TT5THydl7PW9/VkhIKaBl9Jgs1Yzd7pdEiVzhWlq5QcWlg3wt4lGKiy/1rFy19W0i6znd0rKp+9MqYlZuC7v1IwYwLAcpGTalwI2JWwBp3bfH+i79ZXRC4ZuuoFAjFOmrYsIXQszs+zX7kFk+VMa+u1bI2/OcQLnNDxihUeRPA8wvLUnONWRfNeCtAMSDuNz5XGWVpe9EaHxf8onHrOl39pXeUuiNi85KUAbbPubW+PRG6nkglVaHbGJWxbEf+QDaOQ7TDFXs06u6LYCzfMW7rwUktZiPXhWP2abumPQxqgXb1YnK7dNx0Mj40Xc/FzsyaUBroOO2ERbLAKFnJq18REHIA354G4x+V1TqYBXFggrm9HtSpx5s9sr9CJF8kddW41HKoD6n15jWI7pqr5NFQNLa0Sgob0vOS6RWuSB3s20G/ov1kd1XlysHytONbrBunqX4w=",
                perm));


        //https://mineskin.org/1093651151
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1NzUyMTU1Nzk1NjMsInByb2ZpbGVJZCI6IjE5MjUyMWI0ZWZkYjQyNWM4OTMxZjAyYTg0OTZlMTFiIiwicHJvZmlsZU5hbWUiOiJTZXJpYWxpemFibGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3Yjc5MjE5YTU1MmUwMTA0MzQyMGMzYWZkNGI3MzM1MTZiMWQzNDIzYTNmODE5YjFjYjliZjg5ZmFkNTcwNWEifX19",
                "YTvpuJx1E/arsu48W8ju9JeMbQF3Lcv4imNJrJwKNgyDVneQfQ3Ow96jxWqHG+yrvC22KfqMibWDTGahAaBiDgEhmuiKXbgIOxcnBPJ3U0YSYAPGTl3CQPiRqZmJw+C6gFQiUq7BXP1XhSlRUc4/JLf54y5z2Tc+qhLXZwsA7jsj0R5DvU0TUwkHsQzKLZljceMdtWYOur9SWdpZhqdeJ/k0jCKzxik/eq6IaRqaKriVdJsJivc7bkIfEvz7pQjSG4xvrRKl6I/lxIxDwn8/cX8Nv1ZDQwz0vEXRZZXDk2YInFPRnKnlbv+NkQ++iCs4hcI91ruZIRhpHGaE7u26v5pX0yGJhXP2DgH0cS1OIdTiDgtIzMZQuliaMWqDaP0hQIFtMK27A+4jsTRxWA9LWDQo3uhEvwRogvNjEpCLh0ULDOb2jOO5VBPriNJEN6J1/0h0tiNReyHvgIVk/LlljO1YatjnVMPRx6dmFcJ5Kf+9P4yquoHfn3xCGQ+BmNK+MrGXWv5+v172q6usBi5uKFHtokOKJVcD4cMtmzBGA+SudX0KLPvmwiZ+m+ejiJzNVJBAb5lqPdgqnF5Txb2/PPEiRx/xz29ZWryOhlRfGuOcSCupjikXbCPhO95R9HPcn6QlGj0K03buBZSfXI2nx5qrW7NKZj6JSKdfmshqgq0=",
                perm));


        //https://mineskin.org/585416755
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1NjIxMDc1MzA2MDgsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UwNmNmYzNkNDNkYjEyZGEyZGJiNjAyOTNmMDQ4MjE0OTRiMDAyN2IyNzcxNTQ3M2YxYzE0ZGJmNTMwZThhOSJ9fX0=",
                "s6VkhuA7mcs9jIB4YhWZMONJ4DBpuKGlR1qp10aNtQwY0rBHmulRdUsc3MUSEH+LDIGJLY3QV1ipKkgUTY5D0WkNoP2YiZSf/ycyxpw1kEt24geqcFJyCG44kEMXWW5iV+d5IUMy22cQZZy5pLkDExAZkdj4lzxvnBGmcf1PthDe+MJvLlhCqqhv1t0jy8djm7gAhVHi4hYGy7OvpZITH2DwVYukw87RhFXSHtO81huQhrSeK/aCpYnin6pnretPsGeXnzc7LSS5h4NcLQqs/UhgsqbIPIhg/mppVt6n9wCrCEAQHW8p0ZpsEqOZbUIoMPJ49+rm9IiAWp6AZa2Z6uoLyKwq8YX0Ebju9Um6g4JRJOz5Ib6sphm5u6xjBplEeI6eeoGut+uVil14VUX0JMkGYu9UXAweKly2zxBzOtBjBgODJ1tXIUTwez+0K02H10qbpVSnBQ/PyO177wt90b59V7x7Y1nCiKWB/aaGdCudeoucXdjyqzSBMW+iM45xKvF4Gy6v39wbGY2+b2kBaleLsc201CnHbJCemAwNrjpkA0Jlro8co3WM9a3SxzS7lhXd7Gpu0QR5K8XkEjK/RJSax+ohiop8w7DxdcYvl+DQUQYc6Z6kQu4ehPnPzr6xdh8uUUQDazddk60flmAL9jXzGOlmyusu3sGoUval6Co=",
                perm));


        //women


        //https://mineskin.org/1897902830
        list.add(new Skin(femaleName,  Gender.FEMALE,SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1Nzg1NzA3NDM3ODUsInByb2ZpbGVJZCI6ImI3NDc5YmFlMjljNDRiMjNiYTU2MjgzMzc4ZjBlM2M2IiwicHJvZmlsZU5hbWUiOiJTeWxlZXgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcwYzEyYjAyYTdhZTE3OGQ1ZDcxOTdmNTJhNDEwZDdiNzcxODRkNDMwNDdhM2ZjMmU4MzA1NTRiOWFiM2Q5ZGEifX19",
                "PC2iCiRsnEH5Q5RDqpHNJAeF2QCzKMMuBIw0pvtVTwyxExClWu5YlN3LurU6aMJLqpyXV6Wr+YP1g9b4Cm4Nwau35zoHM6BDsk512V2dhNub5BfjvhXBk6IT2CdVBBUxbNlPD/ZRXzNWuOQw8YZmjHg03t7vdssdWNkfXOdE2bq2Pp+qGeeiU9xMf4DGe4RdPq7hcXxofSCoq+yWo3uj6GkrpCDDVOKncMZkqBXXzC/5ou3vHgPRE8JJcVhnanwJKBJ6kvXid6ecxTPg4c8OBwfUErTtJje3234NqFmUz8kOxNnpS3Q997b0ffqGm6ieyMZS0a9zYPsKOb0l0DNkqhEooqKQiNrH40DwbT32LzuSMhFOasYqBB5ESYirBk2bpqXeeAup0XwnAsKP96gt6fLZeF0i3SjvEUjrEnzABiLl6xKEIAqf7Orn1+EvqdCpnAylHVqvdPWW4E74At8O8D7R8qVFnfty8V7AhXSuXrIoTvbKLa1E2O7PNNL6lj23n3PFkk6jKSdpbxmdUPVf4lwQVdxx0MZTGeh5jLf3ESNnwm4lW2k13/tJcBNYF6O9k/YRZGM7dP/4Zqwku2dqsNWtytNAyPvORiEdDpUaEZPHNXWGqlmeuqWADbK5tfkF0qFITYNgtntpHmNMHTlqzRiQquRvbCOs9CFuHe4VuHE=",
                perm));

        //https://mineskin.org/410883950
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1Nzg2NTgyNjc0OTYsInByb2ZpbGVJZCI6Ijc3MjdkMzU2NjlmOTQxNTE4MDIzZDYyYzY4MTc1OTE4IiwicHJvZmlsZU5hbWUiOiJsaWJyYXJ5ZnJlYWsiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgzOTAxYmE0ZGY2ODU1ZDcxNmY4MDgyZjg3ZDI0NThlMjQ0ODgxMWVlZDFkMjU0ZmJkMTFjOGQ4YjE5ZGE4NTEiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ",
                "fgLdqvAplTazAOAFgsB783igwev5vXvkzYTf7s+1YgYzesgI+TL0G2NPZvxE4qt3DW+Vo1YlLmGQTqZWvADwq/DHEHwoFI9/ZjRntFRvN5bgfKr4OdY+ybI6XId9sYHW8S4sLkuAWNOu/c5bCH27OWNgsJduhjIMb44LYnXV45pzeD3F/FrBGCn4OYysdMqBB/xWvJ6f5UNhC059W1OizF96Yep0ryxmCqHRVChQm5a0Qf7QnKXvzR5S5d1F2WovDk/kWkpocZT0uNUr8LjEdv7pc7knExPulvHPylYlLT/Hj2W8JPxBrL1q//3EvIiKrpwWduZiTcYH9x82Sxa7hv+hcUnyHxROq/Se2TWX710Oj6qfoDrj7EAvJDqfi5j6zYhU97WQmc/STL3HpvDC3KNFEu2KrVoAfK0MHn+sHV6HEm4bCYXtwWrAtowNGB7MY82rZzYQUWoUpPcuOvVBGQZs3w+bW5WDTg0RS6ii83lzY0bWJyQKRo6f+81AJr9vQwN+ZLjPDDTVESpEs9DiDTDgi9aEG2euo5sN3V+5y6mePvACY6nNT2xW1C0KBxdnR+vYHnNjjxsspKn0IFG6aI53ELIHpn3VC0qUFjVO/eGMA4xqhalpByT7mzbUt5+dQ4SK63mqpxGy9h8DMNuQkJb27rxjSP2RGA+ySdl1E2g=",
                perm));

        //https://mineskin.org/503152486
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1ODQ1ODg3NTQ1OTEsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFkZDUzY2NiODk2NjgxNzZlMTgyN2U0OWMxMmYwZTBhYTlkMDI5NmU5M2ZlZTUxNWE3NGJhODBhZTU5MjIyZCJ9fX0=",
                "kDqVd7/MdojYJnXnk+MkkkNA1qaZFtfi5qQUewS/qdm5OFxbg0+9Vi45LwEvqQSSSxFPuvp/YIyLToH/jt+YXZ2dW6BUauNgteNlZfwzAQrBBcCbsQIuMXJsIn18q30QW0/4AG/D+vs+Xl38yI4IzugXB4HE5dTbjfST6Hr8x3Laf+0+G+sPFuwcbvZINERk7g6itova5PoGGBHjFzF+PGRqoBS6YphS8gF1URCrmnotwrR/nWDB0djE6/iO2mVMCOqFRYJnyXMO/L1dEu9E2bzAM8z0/ZvfsBVZK19JZSeQKzMD9h/hzUx7NOlbTx9IK9irRu9yThuky4l/bvLwz7zxFLZvXRJfhY++uwy85icoBJnVnrfLN/mHR4HIKROIqx2VbhvVtUoGI2upIlbEeFi3+AYSmb8eshPb7GtaVoMXewH08iq0/jXPnNOkSR5F6m1dh75vIaBU5Dz1HhiEC8g1Earu5J/NWBh/D072spCCLlRDPo6C0tcHhbPoE8LRbEB17g9pbj8OB5wm9Wr0En3jL1tzI0SRrKpmOlbITLfwnlGuNc8u5mnhh5wSpqm2rERQ/i5Vjs76W1/N1aHFNRniRGv/RHyjFdGL5Eyhm6H1VXE27HcGRd+XwdvhRmH3kuka0c2kUS1OKwq3Gs3rk8+gIISOu89M5o++gIVhUk8=",
                perm));

        //https://mineskin.org/1599746545
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.DEFAULT,
                "eyJ0aW1lc3RhbXAiOjE1Nzg5NDYzMDkyMjksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ODlkNDJkNGE3ZjUyZWQyNmE4MTQ3YTIyMmU2MTc2YzQ0ZWUwZDdiNTA1NWVlNTBjYTkzNmJhOTFhYWUwNmMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "kzKZQQp+lEHMILxeouYHQajiWNli8iRRq6vy63ihuT3ygVZ2ujI5TWACfDpLIoVfd69velXSoKlQdUimW3rm325x1r5x9gas8EuhGC1vpdcaQ5EpaZ1Yd2BVdynI7Zhcwl7JVz5zaSk3ryMV97FvEYp5KAqXSzXTWKV+AZxUSqqJucOQw+OtLYoP/kPN28pqHQd+EiZ5DjqPpRbj4ZVg75kOB/34XQbVMjdcpKG55/5VVl/mhnby1l3BKNma2UkYeHNETLj3Vng7pHqlbO4GRh2XAio7gi1Ml4+q+3ffm52M9XO+LumoyfJcvVGvy4/bFv0T92y2E1crKAnkXZCfViejWunJpOHdRNWIu5UaPIZK48E1WGahS8IyVqdgCbrKkrCj63xuTuY7I51ENWyLtlKJGUruQE+9Yoysg6yzldzKXAJXPwzOfJB5QEu/Mme95FRi0oc4nb/3fgg6ZvXOi7QJrX9U0mVfMR4387m0/wfiydVV5iGCl++lCW3qwC3JN2CjAcxc0wCDBMCp2Df9ZwilCEEbO80GxPnvcI3PyXZHDsfSUb043BbEuPLusK9cZVWsPyplBy3Ky7XefHsiqMZuWnlEehhjIRtgrG8gUSd+P2LmEIyl+8KaOYNSiEe9VxIQB4+yPlRrWLoeaYGoxx+/azihd96AS+c8jiakQqs=",
                perm));


        list.forEach(r -> r.setRank(Rank.HABITANT));
        return list;
    }
}
