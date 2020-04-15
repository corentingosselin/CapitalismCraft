package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class SeigneurSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();

        String perm = "cc.seigneur";
        String maleName = "§5Seigneur";
        String femaleName = "§5Seigneuresse";

        //https://mineskin.org/27537464
        list.add(new Skin(maleName, Gender.MALE,SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1NjIwOTIyMjIwMTEsInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M5YjY3MzE3YzZhNTFkMWQyYzhjZjY3OGNiOGEwODY1ZDczMTcxOTAxYTQ4NDRiMjM4NzU5YTA3Mjk1YTRlZWMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "sJt1ER7nJjmAKvuwQ7RwrSebvg0JPbvhY5iyV4ttR+XjHlzD3Swp7ZXdcGDqwf9SoNJ/SbS8MGHCf0HTAR1scCVu9N3xuL8mFGyhEKuZSwfr54L2z0U7zCDBENaZEHIl1vD9jBgF+v8YR67ZyF7LsPNK8m0SOW/PwOXVd3o/oa/qEw5N8s7gsMH0siS6UX4rpTss0xJxWuoq30GZYBZy47dDWa0uHqd/fwLjTpkVWqAUe84EcrNh6UuAH0XcpM3T1psPSGtVhRwC7jssxmxzYCzKQ+FE4toca44yGm01W2e8bxQxyxHpHMBYS6hh58CLzolkXG0IpFGVqErrZI45boztMfhK9KpCFh+RcA9lU6Is5m4QNilzt/2KLydFqd9GikkgT4Q8ks26o2tBSE23Y8jpPwIim7ATjkcaE7yqrG1eRFyQkgTKDXFBHAAj+DJ0ukglmbvZpSS+xvPZTqeOpGFTK3xmaMxWxY+LVkNS857mFBuuowfEebgcjZRqO9RyiMpNE+sJR04RJCeqyUVVw/J0GljS4z/gs/7zZAsohxwAAAqW8d9U1oto0oIHG24epWmDOBWd10OHMY/BeiaFSAyd3WrUBVw10HQlEZ1JZMh1kcKuxyA0fsesup/ME80Hpt74mR9rX09z0/6rF8tytdAN5H3fNG6mXqKhcdX8+qA=",
                perm
        ));

        //https://mineskin.org/1708198225
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1NjgzODIwMDQyMjMsInByb2ZpbGVJZCI6ImMxYWYxODI5MDYwZTQ0OGRhNjYwOWRmZGM2OGEzOWE4IiwicHJvZmlsZU5hbWUiOiJCQVJLeDQiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlkMTM0OGRlMDhhYTZmYWI5YTNiZDcwMTI4MGNhMmFmZWM5YjIxODg0NzI1OTFjNTcwOWNmMTFiNTVkYTkyNDIifX19",
                "TZTWTKPtMEcaoCKoesItsMe1Bez5004yfRju2wSYQDH6tFmx//22tDO0uF8GQylPwMoUDEOiVRoBPuelwxZ6Oo+MUcSKxwqUxQX4vMUWrDtTnMd3qIdYAdNuTA/3NO+dqtAOnmKhg9sZEenMpsTgUuN1+7W+o111x4sBuByI8UvZe3hnkP+rzX+VKCIGm7LNTxZihOQEeJuArHzK0holcs/YJ5AqFrFaKZbJdz8hRP4mT5ZzfW2RPXSZ+B4CUgJzhDHPka2zTaE2Or6VCgBkb2wpqj3LEX/5ILR5V0WdRkJ8d41q9jztMXjuM3VjOCQmAQ3+Dy5wTj29EqALYbdHvMYhPtlCkP4a5To2UnXTP97FX5zJ+U2G2JbYKnRKZDph3/dvd9fn0P7IU1S9E13y6L0AYj8jbDcrglw3BkK1bg2UplTppP32xOgVW1N8C4jlciUJD+Wnm5jI+8YjMBNUJq78Wc9+VR4CDnmun1Pr0QDKkJbaURbLyztwsjl4sXZgeXxpPXpf2jmuzXO85xzc+qjezuf9A17GxIOWQJmm7z9RIWo8turMiY45c9fQrZvSyTKjytS5bE2kEw5FhTHA76ryoWDJen8j1lDYaPmTiuGQbGuIxrmUuHbg87LTu9V8SP5RpJXtb1OMT701Bi+G9nPhKAIxgv6l1QwkxE0T+RU=",
                perm
        ));

        //https://mineskin.org/302853357
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1NjE4NDA4Mzg0MzgsInByb2ZpbGVJZCI6ImZkNjBmMzZmNTg2MTRmMTJiM2NkNDdjMmQ4NTUyOTlhIiwicHJvZmlsZU5hbWUiOiJSZWFkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84Y2Q2YzQ5ZDJkZmM0MWY5YmMzNDUwMWMwYWZjMmNjMDhlZmZhZGU2NTY0Njc4NmJjMmJmM2JlM2NiMWNmMWZiIn19fQ==",
                "Q3CDt+IXIBjuOll2Wu0/fAQ7rKzDfMbKaIWH9/rBVK6KccqpmxqAhStcQViydQ3inUpCtylyY6ARXPSMzMnSinO/V9KkiVF92FqtkKeeZzf/zLMkJcMzYex7J4cMgyyEhFrTRw/EOdlAAP7qR1EJc9tWPFKTdQMPuxRaEIbzuf0USOks7LRhGwTeri2exjNdQ8gTNcEczchqagE1QIiSsMgwXrr1tSwtTHpN+EgdkeM03420sdGwGb8WuvuHNuIFG9t+FAwx6XfbPD9hf91NwtxddlIrgA9TNZUK3pqz5Lz4gESf0wp7L+N91bLNdHJqFexGJYIdcS+JwYxzdbgb74eQN+aXSms6bv/T3TNgE2hgZ38y7F5G1EoF9obhqTcGwKvCBjljWmXlAaGSZrnCBXqR+dqf56iJ9kb0KXwG/qRxZ2hJAUXVw2u9XUpAsfzDbuBT03+H71fazoFusiuZel3OIl9xLDypkjYH89E5m8RhkxDuOmvQo1cb0jmjaohb6nWiz0oAbrFieE9J9BBftzWYwjAn2t2VMHd+lhOO/29sHGd1fsFhCGIG8oJp/BfZyRBlWVxvCftRZx51utBQyQjbRtdBn+GMYi+0lqntpF2UcF8FnFIa42FmgKdQpySDeKKol9cKF+xUVSgbT2vA0aj6YccvRg458Pcs4NJ2yd8=",
                perm
        ));

        //https://mineskin.org/826311168
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.EXTRA,
                "Q3CDt+IXIBjuOll2Wu0/fAQ7rKzDfMbKaIWH9/rBVK6KccqpmxqAhStcQViydQ3inUpCtylyY6ARXPSMzMnSinO/V9KkiVF92FqtkKeeZzf/zLMkJcMzYex7J4cMgyyEhFrTRw/EOdlAAP7qR1EJc9tWPFKTdQMPuxRaEIbzuf0USOks7LRhGwTeri2exjNdQ8gTNcEczchqagE1QIiSsMgwXrr1tSwtTHpN+EgdkeM03420sdGwGb8WuvuHNuIFG9t+FAwx6XfbPD9hf91NwtxddlIrgA9TNZUK3pqz5Lz4gESf0wp7L+N91bLNdHJqFexGJYIdcS+JwYxzdbgb74eQN+aXSms6bv/T3TNgE2hgZ38y7F5G1EoF9obhqTcGwKvCBjljWmXlAaGSZrnCBXqR+dqf56iJ9kb0KXwG/qRxZ2hJAUXVw2u9XUpAsfzDbuBT03+H71fazoFusiuZel3OIl9xLDypkjYH89E5m8RhkxDuOmvQo1cb0jmjaohb6nWiz0oAbrFieE9J9BBftzWYwjAn2t2VMHd+lhOO/29sHGd1fsFhCGIG8oJp/BfZyRBlWVxvCftRZx51utBQyQjbRtdBn+GMYi+0lqntpF2UcF8FnFIa42FmgKdQpySDeKKol9cKF+xUVSgbT2vA0aj6YccvRg458Pcs4NJ2yd8=",
                "OiBwxjKDgmNjFPJJgTy/+Jm0NGLEvai4/9d4VX0tQqqnq8Co3dbOC3PEQvs+GPw82Sbbt9K/JUq9hSkjRRTlTKmXdsEFm5XOSWlTPz8Aj7pHPSCwofwL6Cy1xgXhZ6+rrYJx85lcCaPOULfo9fIPCM8AP2AdAV/IPCs32+dLtJM6ttRV2fVaIihvh3R1MHtLAKLkdkD4PxDds46/C2eADK2+r2gYMHczS4gWWdUYMdBVCI+BzUS3Nt9beyuEFLqJPQhcVTvlGwm5lF3X9PFOwOlmnOgNgBQKjbaqUdPH/LALFavmeM95nWh9nMHH3zXVj38dfcOHFfdqnKnnFoEs9Av4AMN4bO20XARDTk9mc1S34zWXZDCIPsZzrOII6wqRkx06MZf/MDRoNzMXA0+SRWN+sKm47uWfBoMuaEZuHwPVI0pAKXYUIeMoSOZou6kXDYHJhaHj8/Mw6m7c/NbjFlh5ok0tHBhTreMOHWTh07qT6y8co9JWDUvaqDx4OFJKoJStGHmpSMGHfDJL96K3Op4ejhwcE/qY7IgrjzVqIXXLkK+k7DC20AzqnI+AdlWpqfe1ci5dXoc2yJnu3xW6sS7f2ZMFmUAGz0O0az/Ohe2vUn560bH/QVVZMMKyxvUHd6QizF8ydqHDGcvEdZ1cipUdBUR6akk6w5Sx9UVN7RA=",
                perm
        ));

        //https://mineskin.org/1274159189
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njg0MTc5NTcsInByb2ZpbGVJZCI6ImI3NDc5YmFlMjljNDRiMjNiYTU2MjgzMzc4ZjBlM2M2IiwicHJvZmlsZU5hbWUiOiJTeWxlZXgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg5ZmVkYjZiODRhM2UyMDk2M2I3MGUxYmQzNDQ5OTI5OGMwMTI5MTUyN2IzY2E0YWVhOGEwYWQ1YjQwZDNiNjMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "k3HXID94+TPy68/hhqamrqfICPWQV4TkrZsi+DtuA0X8m4+oRTRdW+EPgWhc0FOQV+rqhvTsc5lteWnCu3qBTUV4IMmdcX2FNzbW0FLVU0UG2UEcqzh7/qJGjlTtmSnuTjHhcWSMUEYFRF/5lm8385bAcO7NzEeEcOnkQzjY2ad91FM1y5gJAy1HEuMiOCNXmJPgefq+HvfhaA93nsKFczPBnBx+hN9tT72f/+98BMOMEIAceMJuifEKz5E3Ar+XY5dDSfXx0lSx/j+PZuIpwalzt18qV7jNtWctmDezUgw6gRthTrSp3ujzqTngMjDdoOrqm0RnbEA+LBeE/ScDvu7VoLf3bK7YeRt+XjCh8e05vebES9rPWMIfgmsf2ANBWC666Yfh0fApKGZl4rtfpvSzqED2gP0isSa2/TJX9MimYqMuOwZZTWUfSN73Sz0zspTFm0u2sqjNf3x7ALE/2/cZx4J7BHVRQ/7BpPAPfnyES6AvPksl+m99zmj5Qm5SwT1ZjwOiUjufOSekSMRtWXDULGxS1ydzwEPqKd6vbKexkGENgHwYjcLnLv7gIqHbQRsq4SC9Fa8q1hWEcziRaGSed2dwg0KRvk/b790cm8XyJ5SdBOzK02ONcwpe4B0lh0K6AwocRWwGxzDEkDNsCXYZZrgimeaBtR3KpCOXGHo=",
                perm
        ));


        //female

        //https://mineskin.org/1161743271
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODE4NTA0NDI1MDQsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTUxN2JiMzhkY2NiZDM3NzBlYTM5NDQ4YjEwNmMyYzJhNGM3MmRkNDk5Nzc1M2UwZjY2MGNjYjg0YWE5ZDA4ZSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "TnFRgAobLSxZr8i2/8O+9eeL9k50bvVlFTUPdHBqlEVPyoC/WVcPCmbUi4hfJ6H3xEvnQa4iEm9DJkQTdTolNC7sj0OW4GO+ysxxvb/HmiMZF7izV1cZjl8otKOO9+THF6LCDgHk/FCEpAZ8xpMzHf3PJRd+K7uWY6ekDwZiaeAh9c2bo+NT71iy3+TrIrNY3Ct8GvBOh4m6vic5NqP4uDG8NQvLfPmRuIcbi2iuFF+rXi0ajf+zP4Yd0Gsd03DVA7LjxSYeXOXhDJRcjeci88FaCZ01EwIkpVkvOV+qXefpDqpLyKK43KsSVVeEdh71D8H4vVAGnrevCiz7GUFFo53aALWbprrBw7mOEC4Fp6ienvKDTEM0kBsqVZNd7hUxFbZ/lFS8xlitkA/V/nfV/3ShadA6Ffwi2+o9uJGRd8uSzY2S9ldmM9ZWikv8EK4utXxny6JJqrcEBji2nycI+FHd/l6SsZhrXjHaUJzTqh9OmL1H0+XNAnfj1FvY2ik+OFpgOKzsf5z3w5nqaLEynTX8z8i6AP9KrT2c3/w01RIItHwwMjSURGms/5gXINcNSQsCack0ASnMgOklG2JVhiAmrz/CFS/kwgiB5buscAjhUgvN5eChWNxr0xO3ncgR//EPLMTBsJkYkO+70JkDpQXHYY39klU7dTkaFM4pb7g=",
                perm
        ));


        //https://mineskin.org/452010185
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njg0ODcxMDksInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEyMDVlODRkMzY2MDdlMjI4YTcyNTZlYTRlZGE4YWQ2ZmQxYzVhOTRhOGJkY2M1YWNhMzJkNmFjYzJjOWExNDYiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "aev5kHrCHScX4zC37TGXaSMijAFIDyWphAWm9/oB7pVFfxMpnz9+N+9wWBIdyXVsWsfCo9pSEu+qYndYkaFJXtvL8Che6CuRIJ5ohNz1PDbLUKfpD1y/D7v7jPN4dx5ry1Bye8IPw63cMQQs7JE2FJBEheDfIbaI82N/e7koGJSKHfqg7Nju5qnT0tm1r5S5sc9699hB00RRIlhOHgh3+K9/i+3aD24VS/vhu5pKoF2LY4v8DM40rOpk4mYmpZepHuFmMU7myQJSdezUXSukhniAyYjC+4qaeROzmKTLHpQ2C2u/s7KappuxUUs/1bVKlixixveXQMf4KbeJJ/XGRHhg8lK7zcqQxlewFHaHkaZxwVcwBNr/sczlqHL2nxYmZ2v2HtpGpql1Zb/xBdZ7gfEJdXcu5skY7awOFvjcoBVdM1W6LVVNwKz2fargyx6kshY8E2daf0f31GB0bTa7HnbRkoVkMpzlw3Jjbk2Ng3x67lf7+1Uw/GACI3//ilGbAT/CESYL7NgvG4uGoDArRoURovcGTMxfKf81O/++ni3Iss/iIapYNFSsjkNEWf5uxXl8UMNy5kFyTdBWFDbuwjTYw4zcA9ILdjRZV3KDTy6lyw7orA1znarL3As5yRJ9E61FiKKmMEaHTXt7xg9fgOwP8bjuk/sFI+gg2WPvMHk=",
                perm
        ));


        //https://mineskin.org/1996769402
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1Nzc0NzI5MjYwMzYsInByb2ZpbGVJZCI6ImI3NDc5YmFlMjljNDRiMjNiYTU2MjgzMzc4ZjBlM2M2IiwicHJvZmlsZU5hbWUiOiJTeWxlZXgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E0MTU0NWM4Y2FlY2U3MTIxM2Q0NTg4MTA0ZjkyMWQ4NTZlNGY5YWYwMTM1N2Y4OTU4ZjFhZTU1MzI3NjJjNmEifX19",
                "w59jEip2n8fivkHVISQVyfKq03I+qIOLv8zZs10P/r9+YP72KL3hUAcChmQcv/bvQ8Es3CyXASoHhWRNMOd11xlOv0f/JkRtmyYL528Riufgp6JV+wkOPMpyLXWn6mQGUdF2Q0tqNjyjunLUoamI8V3+khHDa7IK6YkTJ5k+EmasqT5T4AOlYsP3Na9jD0pm6fD8YqxLPc/IhwIhjFVoK3P1e8QMNkVFyckJKFXYjeA78capmX0avCe7Ed75xMdwv3NnkZKf1k2BKGyd80UvWdHpMnUl0Y5uUiy4f+6Clr9gx3/hVs4TsuNFbRU5sy3n1KRThFZcZtmZRoDuLOwi8PSr76Y7ZZMCmq9q9d/5uZ6gsTS1MS66jhtWg/dlAPrZX7IG3GC9cJ05cfUM02UJ5GfHLK7n4eBJEb+q8+FFelD4ie3CaSGHVSoV/YJEbWcJYTee30UvYRgjXewHTPb2r9HK8FRCtBNlu5UrL1P53W7iXUu87pV5UATR8I1+lcBU/qILZDxtReQITfJfwmlgwIrKyQeEwTmKRx1AEKGN7BtWhECaj7n45rZrwdMySWyL7DZlEOsuOJI2qAauAd+nAMZ5ms0lGCpFQmB4PJJQU7ZBchDgQW8I+Z4YfSP2FIgiRX8MAa7sHMUyvTkZfHSh15wDZgfGOS3wV/yADW3Oc9g=",
                perm
        ));

        //https://mineskin.org/465175335
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njg1NDc0NTUsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODMwMTE4NzlmZjI2MmY4ZTBhYjc4MWJhMDUxZWI5OWQzMWUyMjE4ZmFkNmE5MGFiODdlMTc3MTlmNTA5YzFlOCIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "XLu2NFawjtJ2lnFYSFQlb9JM0lFJH9d/ejCHoxDe9KX9e/6QTdxqIGc7qV1y+7V5clxom+niXup3aJ/NmQHMNlKQciSdvhqMjIIsPNsYn7karTCdOul5ZMhtiu6JrF1OvztGgG6MMDTK3VM55UwheTl9dKq858tVHFQU/1J/IL+mC/fF1j8mqB1UzJRQ2LWxV9Py6sHW0T9CKTxsfKof3cYsDW6eci4qz1V7HyTkYXLn4BTaSkOLWSVQmzxuCcW02U8ERauj+6FKt1DmxLf2DQdBwShDATFMR/piv4ECus5gU1elAHQOiQs5JSG4jsjpxAbY7RS1yzPAHtCp+KIDrL5aACQRgqzx4kj38Ot63rIcgHRO2bi1AmPE+fFfI45m7hlgENQS2TJ1S3DE+bxVhbMm/+TBZAf6hxRQyFO+SWVcGWocG6MBT3/PDYx+UWTVx4ePB1pIf3FBO26sIPHMi5MMALExrAsXr7H/CqMOm7EzC6nuWN3L42LGb1k4aPaNFaWbZvrBjMAL3HiCxbh74W1JQQEZw3F1s/S14z18/V9lEWuDDZPXcbTqmD9DJ756BS3ENiR9/XcPTonngFp5wor2CQF7Cg+9kWtzpKYwpWMCaSdSSWr3/w4xZZlDO8Crl2Fd5PdC6zvPBvrrMX4J+ba70ToDNpgTBezFDJ5T26A=",
                perm
        ));

        // https://mineskin.org/1500641530
        list.add(new Skin(maleName, Gender.FEMALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1NzUwNjQxNzU4MzYsInByb2ZpbGVJZCI6IjgyYzYwNmM1YzY1MjRiNzk4YjkxYTEyZDNhNjE2OTc3IiwicHJvZmlsZU5hbWUiOiJOb3ROb3RvcmlvdXNOZW1vIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kMzlkM2RkZmFjNGI3MDY1MTYwYTI3MWVhOTRjZGEyZTI0ZWIzMzZmOTIzN2QxM2JiZDc1NTE3NWNkZjBlMjNmIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "f/1wfQxMe5ErHWeNfZxDZoeeCM0+5/NJygdhbPjWJRj8LVEC1TvNhcCjptJGp6kGQp8e15wnLUa9dqvPsra14JXhGhtKnI/JZgNZiMvTOD9P6erGW7QDnb8/gAXn75Ruz7kupjPueEhm3BTFZznPipByFioRkr4c8MiSyvKHCw17ZuFgWNOlF2RTqsVzKSV7kFl6oKHeLKD9v4mfoIMeqRp55RoRuAs36VybwJAwxWqBZm0lRzLvF+dtQLKFzSNL1QHaPqBpEhYpd86gpXyOc17+e1f9aO2eA5ST96rwVGaxmXVlmCsyNj2HdKEi84enwApZHpW65HAH5qJ3cv9jSrnE1fGNQqgrAaJJPVjKDUAhRLKPX59QxV/s+/Iwc5dPvLWfG/skrk4wxyjoHsRf7jsay26x86nSyXLvSzUWcfv8xmszrAaNyjNwe3XMMMRSU0iL1ZjYhrYiMJJYeOc/3kpLgxGFnmf4Tg9tzAizBmkYJZrc8atg8lgebdQBRIi+m1h3L83z7wfbRoOHWGvqzocy3msg+qTyjvatXp3snwjsJ3N2+L2SS9S4gpBM9K7zudLz4HK/R/ngN7NQgghUiOpjwQvc6ZryyZpPseb0ecBb2N/FQePvvLBV+pWoPnW8duDgBb786KZnGiZTBfuIEDTo/DaYU1Qr1wtB04JEutk=",
                perm
        ));


        return list;
    }
}
