package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class BanditSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();


        String perm = "cc.bandit";
        String bandit = "§8Bandit";

        //men

        //https://mineskin.org/1910143843
        list.add(new Skin(bandit, Gender.MALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1ODYzNTY2NzYyNTYsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbl9vcmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQwNmFlMmZkOGI5NmJhMmNmMzM3YjgzYjQzNWZiZmJjNmUwNDQ4OTYxZTE3MDhlODgyMzI0ZjRlMjU4MWFiYzkifX19",
                "ES23H6tB0MOBcrxwHk1DJ9t5rk7DdOuZjL4S8OVq3UhikzXe9XO5MCjQKc0CVFGjXrz8u+gqlBDhBg745/F/z2xR7kZGZRuAFzimDA2RUzuEnM7guYC1LNYVHxak8/l0InTfVm8pjt7Y75UlinILNkkXGByN+KtJtKIApkXG+hOVYc3A/S1LAMEA/+VcVIOoUwk4uKewNvSr3Lco8sh+/xxvz3JU7eCuG09068JvTh+dxo1ZVm8/FgPYYeB/CbN0IdfY8PChrfoZGXADIKseCQJU/kO+m4PPxQhm6kW9SxlrvsiXPE5EpdYKCU2FYxKM5u5E8c24saZeTquV2js8/aDAviggHoA2rcHu3eHz9ASUJ1azDHQmkqJsxfxUtn4aCWOqh/UuGmUGgiB34BQT0kOHqTes8at5F+uIbi0gPiquGbWhmUNOO1httuW9bhG7J63UgwHTmYOw9P8atyKSy9nti8jgjBV9XuDWnsv2jTwbRJ37lWfEiohLwWGDVhWGiW06QsPnXi+ADOkwDdmls8isQyU0vk/VeRcsaGARuGeaNtwHfHayPs/tw8mD1FU3V5XMjFmQ4FW+waxYPPGwhyxMZKw4LyIjNFpS6YntaxzbMEgsl9EzH4H1zvd4yBhrqQHFo4dRaPpVb1oWCE9px5ljYFwHWXbBgiI5np3OaRM=",
                perm
        ));

        //https://mineskin.org/1319386949
        list.add(new Skin(bandit, Gender.MALE,SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1NjIwMzk3NzI4ODAsInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzExNWQ5MGM1MmNkNDc5NDM4Yjg2YzNlZGY5ZDk4ZGJmZDgxMTYwZjUxYTMwNDkyYzIyOWZjZTkyMTgzMTVjMWQifX19",
                "UdWqfBCqnx+unp0K/9kbWP1ARq7y/QlytW7cf/OLvJNHB+6r/BghF8d3he5ln1aOCPSis9RYaj02u1QvtM+6kr5/78MBvz/Qrl8vwdG59yAPY7C0a/6lDDgo1e6z/a/ruBPjIHfSlHCAwLb7k1fvjA+rxxVJeAkGEtJ62ItPLmv3jZQYKS/7+oG2g5O+0EuOilzAX3UjMlwrkcm8gI9MASXSoRI4yd3fWLc4ODm998k9uwAuaLWMg/0hOQbqiD7XQ63JSldKFR6Nr6R3BmRtIuLnhKgp++Jp+DtPXbLmxxF5hcPWHiTa+14wczjTE4wl2FG98R6tC+Nv2Sgv/k+njfVCDCAelMTH76t7OK2d+rAK2BxaRx1UVIwmMaX9Uik6E9le2y3d8CWMENKnAJqVY/6lsyHHL3SW8E82OfW2CuqUUprkMBXv8nkXHkHRCDvLWGTt3Oeqwe/DrGxLfzFevPMBmYpmN/N+jRU0a/T7+ObLHq1qj+yFeZ+BUWkO65EDBFLuZ9+l/kPkAWslWwDAfYfcmm9GTMbkN9OZXgdfdk2fT8OpwUQHA0LI4FA2JNLI6ZqrRJsHrAYPd1xAx6xhHoALxIHTMwBlOTR4ETSIrY1+a63lvsSYaSLb7RnC5J6szrxIh4/AY0PZfT99QnjPMt37AV53mLED0/a6KJVWSxA=",
                perm
        ));


        //https://mineskin.org/1546135852
        list.add(new Skin(bandit, Gender.MALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1NzM0Mjk1NzM2NzYsInByb2ZpbGVJZCI6IjUyMWI2YTk2NWQyNTQxZjRhYTVhOWE3ZmE2YjVlNTgxIiwicHJvZmlsZU5hbWUiOiJBcW93Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zMDJhYjc4NDRiOTRlNjVmYmU0OGZkNjFkMjFkY2FmNWMzMGI2ODk1MjY1YWVhZmE3M2RkNGNlZmIwNGY1MDc1In19fQ==",
                "dzGsMHhET+u/l48jFoPYETy9ugtul1MULR1jRhHsC7Rw0QapDjKi8QKOYjUn0t/yJLEq4NsIHfeW3fDGoTngocVCgmpxCJO1w64DLWSgBQHPQ7O3KU33DkzrEjcCohwM38ShKzJu+ObQczPIUCB0VQtAloJZxw9ai51BzIiTh0oHkFp79XaN00zar9XmzPI0GYcPqi9ZxiHEJF7mlpClQ3yTnZMh4YZ+v98mjzeLqZPCxLBqjANFEVHNb4vPz9aMLkn/m5QvVEaya/8Hts85jlPKl88lGYmn3DTFCCR6DeGLHJ3pKQfTUa/lUQuYMO5fpJREY60cxPQR4O9bfuWgJSs9Ev1Kcm/I3+ipCUMoxoRYRMHRBJGBHbhVhAPl8KRVK7N9GNl2O+1QHkp9OvAQvPe+kRKhykGtxlCMAxkV/7Pzsv4idEjNHD6tH0xhe2/XoIEKUQuGTViCRr8yEdqe2oBIPh/WIyOSA1SOT6WOT+akl5Dq3ysszpIPsMrfn+wQuP+3LQ/wq6nAoNJHORsK2Rvej54iUndhBIDq8uzHq7jzy/fgJI8NDvLd2GY/VUwpA3O+pOwg2+HRgn1GHteJ3BNNYIMRQfWnFPa3wEkRauZi55GTj9nhmE4eNXsExGAn4LbDjOgZAZYfZ2STiJzpD//xhb3haAWhtTrFGvuYX0A=",
                perm));


        //https://mineskin.org/108502135
        list.add(new Skin(bandit, Gender.MALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjUxOTU5ODgsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGbGF3Q3JhQm90Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ODk4Y2Q4ODU2OThhMTNmZDE4NDBkZmI1ZjBiZmEyOWMwMGY3NWY1MzZmZTlkOGM3YzlhMGM5YmQwMTlmZDA3IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "JVbU9x2/s0BYUO5IzflA8xDGVRTzZZLag4/2lDP3egJnbI8jOJooaVSSfDSmRl6v2WwhbpDTqiVq+KIH4SuUVVC+iiewE+oVWptRHUxSDb2aK5yZXCsPdvJWs36P+uXrtEiKXMcsJMrmmSrDqodps/Bs8FfiGz/gJYOp5muhrwX2jZE/yi0GS9LJX1WpXdxF3z5PweNWv7KQT7NATTKsDfu8FXNTSg+WxGNGoIEwoH5BLYZHQRPKFNlDmZxnbsIP5KLoqi/BtR2bBLZRFbUeGb3MSGhKMi0Qk4y0mGyvjqTnGP7aDjpaPIFHh2HBaGADAcehDK58DmGyqa/biN9Q5Z1zl816THQDpfE2ZeI2s9ma+FEazdZWtwV7nyxTDXdCmHiEEzM/2X6suVM/7Wtd++uI0EMLJsIiNKVubB/XiEWb7+HNzmdehX6601hRcu0ISTLz96SXea1ViPGvoIPdUTb593WFiBJlMHNGjLKsbkdB3U0vuQVwTL8ieQ2dH0zITiNcliKjezvC4N+Gkcdvby95s2HrvuDUEWKhnthYliTgxPEr52SCPcGWp+QFJR5OxFM3VhbM1HDpP5ylCLVMfeZ4eAhEzg8tIimrZEpWlsJsZJGX6ehRsA5537Hl/8UBeB7bwAkotucpry3hiW3pmkU1vrgqFk2lUa/WZngFnTc=",
                perm));



        //https://mineskin.org/742162419
        list.add(new Skin(bandit, Gender.MALE,SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjUzMDI0NTYsInByb2ZpbGVJZCI6ImI3NDc5YmFlMjljNDRiMjNiYTU2MjgzMzc4ZjBlM2M2IiwicHJvZmlsZU5hbWUiOiJTeWxlZXgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEwNTk3NTU2NDhhN2JlMzBjYjUwZDU3NDA4NTczYmMzYTczNDhjZDNiYzYxN2MzMGIxMDlhYzQzOWU3NmU5YTQiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "Ft1LUbRl0Xc1sMlrurs4A80Gp1u4aOwW6V8PkvB5TvZsZIvzs8OFPnu6MjdFm9ssCkWW6Pdpyd0D6t/eUbd8VXhEnKn9IYNezbUU6XtdA4phS6dCMC748SGFlwmn2TQYujiTtwYutknjBSpBSRJpRZ2I/BgZIbEkTiC++/3MgKrFO+z66i47b1+LBJdvyLZrBgpdHME5NoQuqUnmjYSYtv8FjqasvLvX6vtAmolxS/tlUW9EbtTL/W8nyP6lM/L+0c0pPO72Xb3t/so/g5a3E6KDMAPLFJdKIaY2femyC9eoycQTpVGFs2AC8shX089qKZWXMgiCFoJiNrd7ikJT4Me6aiHpX78T/DDm/2GFdmGR28wP+rcmxJ5U/hJUz9LADnZ4elUVu63y2oj+xSqxFKo8XUyO7zLXeEZETN8RydBc3mhw9/NOkuonZwkVA9HSstrmx6B+6MaGCrV3Q9/HWxvLWnFyRv11z1DXjxeR5NBpruYJAu8TfUUiQIyTeb8aptYTmm8n6sK0SBuZnDPgG1eXVs4GXlnmX0doaxTgpewhdcRdKmP9Nf1Gpvb1BDt2EpZlSPLMyxCGp4q+rcVZ9RLORQXhiUnCTG4ipulDUNbK8GzBcza9x9LOAgmkH7Tjp4qJbQqXOCfgSGI8A3pJf1N1MiRtYIBKcWEz/NEI4mA=",
                perm));


        //women

        //https://mineskin.org/336665881
        list.add(new Skin(bandit, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjU1MTA2NzUsInByb2ZpbGVJZCI6IjkxZmUxOTY4N2M5MDQ2NTZhYTFmYzA1OTg2ZGQzZmU3IiwicHJvZmlsZU5hbWUiOiJoaGphYnJpcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWU2NzFlNDUxNmE2ZmY1ZGM5MWEyZDY3ZGEyMTVhYjZmMjdiNWJmYjg2NTRmNzI2ODcyZTM3MWM5OTk1ZTExMSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "fdFZd4bcjDWv5h8PaQIjbF5OnvENu/4PucMBXAlRK6GHL1JPhp5AH/zDoKApK5ySME5aj+E7h1P7Xmd6kbHJO12w9L3bxisqYLPLjGMmAETo+0hadZ+OF+eLkrqFvL6maG/64ziTM+EcLPLOsbRn9BX9PoM5pv/GKxcX4QD7uePcknmyYUGSnd395/vCZreXGjSWy3N7sq29WhKkYl9N/vKVWBq4+WaOI+XfCE0hYPyaybjqWaMl2O99kHWQxgwLIW6nW3te/ORZr3LqTKBsHp0Xc5SoV9fJxGwlggNdJxKDQDa9laOlGjqOXKHZOdN4VBam0OI6mRaUBuZSRg/gQKtzTRi3oa6Jq/mBLXAXlBwTB5uhTmQ8cMso7Thn8hPogDnBNcKpUk5HCDZz26ce4jXLv2uGTKMQNSYExOgF/mG4B4wfMAnIhOrTXk/2f9fESLdUjClrmTuGpP7NWSuk1Wgsx8eu1HAwuRI+tobB4Am1DUrR/iG/Kw9Nr8iKdrhoxn/FcfuhXjoIxF3n7CgwY11JZR6oc8oAjwmOQ5m/me4dtJrNYU/UTW32NbfPWil1oc0MG5MiCE/3fPQjwzkAshWhgJtxjtpPl0tWF1XHCztEaey0trsTlazZ+eYWkpkXGDryYBHjR7mdfKyyd6jqiSQCyPoAdDTEWCOF6xhn2pQ=",
                perm));


        //https://mineskin.org/825910537
        list.add(new Skin("§7Bandit", Gender.FEMALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1NjY0MjYzNDIwNzMsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDAyZjUzMWFlOTkzM2NjZjUxYWUyNzk4MDM1ZGNjMmIzNWMxOWRjZDFjNDVkYWM1NTM1OTYyNzJiMTQ4ZTQzNyIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "b1as9uzhFM2dvDoMtwFo8kLUNp5+TpkIDRF47QMn0uuNe+CIZ30Nr1xEcBfupvxP+jZ1ZFmvKkTRpdea6TuHGSJbLLC5PAccCrPLdLs1jUcnHk4vi4Kw439japjAI29/6xp5tJSTlF4Su8Xxxt5UHVoUvhPhAQY26Az88HsyclUw6fSJhyRY/BVDYoiBERVogybCG4AC5ZonVDTWMHMOl6TGPCNKodr//ivWGkK8eCHilDnMAqyq2mRvt4vwNw9J3jzCXOr4I0ECCectnlyCf0v40KO+i9ZQ9ghtFODb/yHA8bF3M+Ri3iaVDs3689e26H18M1P5kBcDaTUijE72RNzbrV6BFUx7wAZFuxzPomGmZhBZjypVRoabYlCUuvUEpuEH1Y7dZPv1k+2xeqokY1MjPWesJjgthJdYa2Q/8IV7uHilPEnIKyM/+ei8CHdOzGyiG+ea6G2PhVdeyjcy6So3B2PV5fTU+uRum9p7ex3Qtx5k+bVkTQvlvL3fYERaYQnnDuvLYriCy2k0WEwL75cOEhv4iPpBoE3QkleSksvq428sFx/LOrKbmRF+gtSa71tNDwZ7thcuAVRWQkmiojbk97T61uM8tgJs6f+F4C6YOmp0pTXslh/fmckfOmoiz6FCvtBtWxgr0j0QNLV5FHL0xYjRoCaPAQVM/0F3oAk=",
                perm));

        //https://mineskin.org/1669117399
        list.add(new Skin(bandit, Gender.FEMALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjU1NzI3MjQsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UzNmYxNmJmZjhhNTUxZjRmNWY1NmI2YWE4NWZkZTc0OTc3NmUxNTQxY2JjNzg4ZGI0ZmRjMDI1YTgyNDgwIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "h/EYgxZ290utJQahdyTMeUqUCGzU4HoRrbSpaNiSj6LLoS5NpeWghWfeW7nrDU7EJRr74ZAD9I+Ed2F+wl9Vq24PPMe9bICfvOe098dehkbg9PAx/27LIAtpXz1ZQtgMBL8TpRHPo56AD+2BIHjYMjpQVWGzUf1kTCE7JTVY5LcnKr7t+EIltoknI2mmmES313mrSCaCFojF/IwWpER9YtImXGFNt+R+IGhmv04Mn0YnvsuPMHH6R5q9YtcGcCm5cJ6Fg0IiFCGgI1I/6bgnbimPUaVi9ekX06hxmLOvaJaYdc2zKhv+HVvZ8DdvUP3tnaRx2ICgVwBPXg5gDzODj2Z/PUO5+EDGbtm3PosOo6p+3KeNxRJ1FdUECUdA+mbc1IdbEA+cC2B1+H7IscnXcuR+4Oqy8fYjTnLcnEo4hg6DaBLOyf9hB7PQHXTQptWDC3kJU58+BKBLdrgPRlnuNxgoZ5MFUJAggNG04Dt3YlSGjK5VsgkF4SHU9gDPqK7nW3Ziua4PKucgN0/yU6U3/mC8w60rcjfY7ADvDjldazWbEHc9NVC/3ROjvUPsml/DUgRyBDI0bbzLOJYbEtHFMhVTxAYm5duQ0/hTrWTkTaSd35wxesnqYl01d7ZKyQRhlNj9hjCiuHyIoIpHeMtXhBpbGJcZEKnankGvsHW/714=",
                perm));

        //https://mineskin.org/334879672
        list.add(new Skin(bandit, Gender.FEMALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1Njc3MDIxMzI0MTUsInByb2ZpbGVJZCI6IjVkMjRiYTBiMjg4YzQyOTM4YmExMGVjOTkwNjRkMjU5IiwicHJvZmlsZU5hbWUiOiJ4RmFpaWlMZVIiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIwM2ZmYmVhODhjZGE4Y2ZiZTNjMGZmZmM4MDMwMmFmN2IzZThhMDNmNTNiYWIxYTc1NjVmNWE3M2M0NDEzYTMifX19",
                "adKPxatM9yAFPpKsPzCwRlcwFasoKs1xR7As6dHxsTJP7bcO0Ssbe5JwjKykqZte97vej2PHaoqaLpJNiIxtk8kdFTfEMIy/p0RQppnSh8VxnmiJ+WpnWbFfYBu3/eLD/y3TSAVkwmCHJTAtIBgfv99eD5ckFHOy9arqx6mLejrvhtoEd+eD1LuI6Tm7/khJcJT80G/94P2h5NqcB7FB8C0/iwK+Zy9e9S9mDkBpRQMDOPDeTQ4Z0qEMrAdIfNCZ2VjQVsnTKusJJ+m17zzeapvTZ7WuJ3oCuvWchWR3tUQ2oKZWB1AyfqkcJzr+XHhLZK8T5epBSXc+BodoWcSB12ZYo/o66ePbH8JH7Wp1LOIViWGwzVu7wbZWMvCliWn8VEJXRf/dS8QX9CuQL/KIQMMcaRp4EznfDyna94CkWDYrBUw7S8zUhCFy2L4UOt2bCpAZ0vAurOfOiLkbbMYsDl6dbVpjHeNOUD5HVPEcegtCPW2R1aMcer+qGT9hRp65156epOZ1KlegWs6ZGIlKJtqC4n1gcVt2X233UXD6R8D+lB6qbzZ4aywg0SHDgaSlt48hB9TKdfWYyUrBrApd2BapGxux53OGhG0KRB+nu1QoFvrWi+jWksZvllYL5ENuBdXyLmq0vvbRlF2wHfmNB9Jkq5KmCfFmvl1a84C4Vj0=",
                perm));

        //https://mineskin.org/1243882518
        list.add(new Skin(bandit, Gender.FEMALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODMzNzMwOTY1OTIsInByb2ZpbGVJZCI6IjU3MGIwNWJhMjZmMzRhOGViZmRiODBlY2JjZDdlNjIwIiwicHJvZmlsZU5hbWUiOiJMb3JkU29ubnkiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRjZmI0NTM3NGE5MTQ1ZjlkMzgxODcxYzlhOWJjZDU0ZjRkMjI1OGQzMzE4NzJjMDNiMzA3NTQ5ZDkwY2Y4NTMifX19",
                "r98RoeXBebeYkI1ByTI6eCm7vcF4s0Bqw1LSKz9Ze9odGFylQYaEXkQ5orEc",
                perm));

        //https://mineskin.org/656128120
        list.add(new Skin(bandit, Gender.FEMALE, SkinRarity.BASIC,
                "eyJ0aW1lc3RhbXAiOjE1NjU1OTU1MTI4MzcsInByb2ZpbGVJZCI6ImZkNjBmMzZmNTg2MTRmMTJiM2NkNDdjMmQ4NTUyOTlhIiwicHJvZmlsZU5hbWUiOiJSZWFkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mYjZhZDdhZmM2M2YzNWQwZTA3OGM2MWJhMmE5OTY4ODA4ZmY0ZGJiYzJjY2E3MTBiYWI5ZmVhYmQwOWY3NmJkIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "ddEBxiLtG6FIenatBXQVW6gXS6ndicRFJ0oZflzxKMVSEUGymCuKmBRTg1szBl5SHODEXIOCqA4CLKsBtc8XAci8DFyTYzNjUVUKOdnwqHni6briVJgjf0BP0quSNzFX",
                perm));

        list.forEach(r -> r.setRank(Rank.BANDIT));

        return list;
    }
}
