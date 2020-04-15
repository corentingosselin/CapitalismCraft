package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class BourgeoisSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {
        //men
        List<Skin> list = new ArrayList<>();
        String perm = "cc.bourgeois";
        String maleName = "§bBourgeois";
        String femaleName = "§bBourgeoise";

        //https://mineskin.org/1891846132
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.BASIC,
                "eyJ0aW1lc3RhbXAiOjE1NzkzNjA0NDA5MjgsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbl9vcmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I2MDljZmRhOGM3MDc3YTgwZmJmZjA4MTRhZDM5ODNmNDQzZTFlYWI1ZTQwNmY3NTBjZjU5ODAyYTBiZWUxMWIifX19",
                "soN1ISW4xSW6RYBWqKFZ7zHWD16OraYUkUV6ReSksLFKO72yTk44WqgoOlM7b89MaCIKe1bztj7Vv1UNrNKT/B2r48U19iYytksrSA1L5/ba0meSygEpgnfDBECbNYI4CtmaOrhRGIrGtOyxpQ6ecPs/+h6ZSCP1Gic1zT4WuEV3bDn5gDbcAFVWWZ8qDg6fe8h30JvFG626uPToY3/bodsl1NsrbCjrvJ9WcM3SLXx4GjYzPM5ydpKYUmt1D3L5PBlEJkE69bcDnIkR3aeTetTrtQ6JDZgFMRm2N3gH+tTBbP76AHiWe/3nYsBwHkFYl8ew+LItclQ2K7zFlGWdVBeDM7zbC3TpxJ6Yn/UUMaV0npfqA5cTZr73Xsixi7CYukGiHnByI4BI9eCal5xEr60FF9qq/v0v/ZKsXKA+l6mIUoQkPbZr7FPE1F5/Vht9Y0JCmJuoXxZ2PfATf2y7uNhY8PbtEcpP1oRhJ1HlwwUi1kc2IiK3frbU02QRLwllNAU+1HZg2OjlMsnwnxS4uZ+4kMkjEqIjs30bXCOdSyzWc7FL3TU5U24r5I11DqVmO2wf0wofH7QNgG6nUZUWghWTFHFhW76VwJqoBRpsmBK4VeakxLBhMQhUGTYGvdr8vxTJIcZcmtGUNPLmD5+lZErWL3I1eRl2JsWlVHp95/I=",
                perm
        ));



        //https://mineskin.org/766603178
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1NjMwMzk3OTk0MTcsInByb2ZpbGVJZCI6IjkxZmUxOTY4N2M5MDQ2NTZhYTFmYzA1OTg2ZGQzZmU3IiwicHJvZmlsZU5hbWUiOiJoaGphYnJpcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzc4MGQ5MDc4OGJjNDMwZjI5OTFkYjNiZjY4Zjc0ZDAzMDM4OWJhNjNhNWZkODZlNGVhMzkwZjE2MzcyZjhkNSJ9fX0=",
                "nkJzy8kySmkTA7ZCjdyDEhlgZNHu+MuogPD5mXrYKjMAipC0wRkRmE2CN2AegebZa+BO5HpncjmH6nJffQJ0ZexuSI5fYUc9du0EXx41EYyAP9hpFDBx0j//5Uv3pWz4chH1+AYrCl7PPwFmqt0MXY9G/J3pgHMRAh6i8/w8gfWoWilfEb16AW4M1SSOY+Wa0Jmh/ppSoxa0v+6o9dK4R4FPqfiY5jefG5kOYzZXHBsvVItXPj6siFDK1Rp02iu+0h9S3CjCJJxd7dqf6riICtIxGQfv6TWNr8XjCsr8h+zYCpSDye6Ahmr9lN63tzqPynT/DkJ3RhHMTmnQvMH0+GWrH+EXJJq1PQ6Jr4NV9146+spRzrGIzC12W7wVJ8knTG57UMuKTUUAvJ9wguBqpdCH/qckemVRalGxzUkNZbxfKQ+ikAik9M9RkFXHKlFbF8wrjpUE569/D6czPHamrHwrbOuW+2rwRpgZRpsnIgpo7EWuVX+UUuYBrXTpBL5icBSoN1IkusEU8pFxxO6mEzEITdSVZEzlkzRpwsZEZjeb+UPe0wH+54cxBDWPiD6VIJyeIjrj1XIb83AcVf5+XBI5b0+6TjLBFiRchgAHhm9LBucrHzon9DxSBcUNbYrxp5PvN5MpHkAFXhpBL0c0dTGXdIjwfurPmum5GPN6jTE=",
                perm
        ));

        //https://mineskin.org/952436551
        list.add(new Skin("§bBourgeois", Gender.MALE, SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjYxNTE1MjMsInByb2ZpbGVJZCI6IjgyYzYwNmM1YzY1MjRiNzk4YjkxYTEyZDNhNjE2OTc3IiwicHJvZmlsZU5hbWUiOiJOb3ROb3RvcmlvdXNOZW1vIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xZGE4MWU5NmQyODU4MDJmZWNmNjg2OTViZTdmYzMxYTBiZWZlMjlmZTQyNDA2OTU2YTU2ZTkwNTVlYTk0ODY2IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "GCDfWBDJKINLVSPw0bJYpOGBx6LY6hD3RXDrYVOZ3nsULi+JAl+ZRr4bOfvU7jUT4HXaCBMJpfcRoNVf7HYiYRqQkQu0FviN/U8BRCCjUuvEa7X9RfvRjY0p9OMA3rCHHaae+HZFb/cHka3tk0L0G/0pK2R8/1lUOcifiGbiHyZAReMeg3iz2JDdBtsa9vc4+DV7rL7P45JaerjsOt7F5H8fC7qnVCcZUOwHtpafx/NcjZvoqaWYsWVlAsw6qJpF8kxpzSTDyYqx7DBd/cEZ5f97YRwMdKR8fNyoCtaanC34OM8unMfNOsv6yw8w/tdZ9VN43NGLQXzb8YmjlQs86uOEtkTYAt+6d7LR6s4rpjAB0ucuW5VM6lv35467ebsq89yTtaOqv8vU5dX+VvDDhxK1Mm+/WSBp72fAyxWZNQ1smxWlcY9M1WQ/UZ6b8OUyZIquJeAEixlxem3cj2Usk3Mwpgr4gT/F7w59XP/ln3dKxsx6uEWnH/xTq+1hZza87n0tkA4FMlHlIQ4DAtGscYh9TYdA5Osmou0gewPQxxwwUVprYdVNBTWuqteoZEr35AhNhtcaEaUKtd6O2pQqJS44N2wBgYL6Im9LpUkeW7hzR3uZ4LDWxoHDMetgSLb2Rf64mETfpo/syG61LmTQDgpR3Xmom0QETxZNESW6Hzg=",
                perm));


        //https://mineskin.org/1891638796
        list.add(new Skin("§bBourgeois", Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NjMxMTAzNjQzNjIsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJ4RmFpaUxlUiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZlZDIxMzUwMDBmYjlmMDMzMTEyMTM5MmYxZmI1MjkxZjUyYjJjZTRhZjAyZDRhYTNiYjNlNTk1M2M1OWIzMyJ9fX0=",
                "KD8PIttJHtjrt7FEaE9iRo5CrEJXobnIyQ4Dr4evSrV2icaYqyBEJXFaapbs0x2sJp0+lWYKHjO9n4DIGofXzW1BqDlh2LbJ34JsS6TAWp4wdK9onC7rsn64/MPlck5+GKWFphG5ahV5n+Yj49av/XM7XoQvqLQs+rWNvH0IYcLDJNKCNp076XirYevIPjL3ER4A5uOM8GgeH/hnLafMREyDrbw+mBGcPahn7CRrusGbP/OKgevCxlL/dXYeSBSOCor2MOYf6e+a6MZCaQzaB72l9CEHPAFuIgTibrawnCV5TrOuSzUppS46+M7vgrW12Z1qJfoQwMLbSqcsSaSbHawUtTl2w5YW2yt0QRVRsFIA1Sznb4A+SadbxihCgQRUFOt228qjn8e/awQjMq4Q3/1dVXIGA/hdDMndLbTn5NumOZ/JfXXwdYwmmSbJz8EG9x8/t8od5EMooy7xTIcJiMptO/G/xDcrL5PlrSAEjUsprAQNVZR8gTUI6vxebOzOXCiTWbrHWykCwF3mFiX99/QA1EAUF2iNAbgyUuE+BuSPy+aL/ZMF//iUEgr4cf8d549sovWOETR11VIPmDGn1r3lu6O+oe1Y682uS/tq9Kvia+X2/drC3Q+/9F89rblW2uol9a8cXMyys8x7KTXUVDlAiMvRbGuCrwEuCXj2xFE=",
                perm));


        //https://mineskin.org/999161931
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1Nzc2NjI3NzA1ODAsInByb2ZpbGVJZCI6IjE5MjUyMWI0ZWZkYjQyNWM4OTMxZjAyYTg0OTZlMTFiIiwicHJvZmlsZU5hbWUiOiJTZXJpYWxpemFibGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU2N2Q1NDcxYzllZDg1YTcxY2VhNjU0YzMxN2I3NTNjNGU0MDNkYWI3YmJkZGMxOWFiMzg0NGU0ZDEyNDJmMGYiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "b9Lz/fxinw1NJB7CgL+tBUj4X8V8yaGdGuq8njwOpi+v+dbgsg9vruNzP3oxFBXXuakXhtph03EahEwmWWGaIMIjq8YnZUC+ypkpxvIe5iJM+SKVyx0wW+JZ6FhsGaBcs8MP6tnQd60/EzHSWqp7rNNTgGHtbDaGMhcBP+aQTwudn2n9I2X7cMGEXZXF7clyoXAlIicwE3Ac7Hb+ImtvTBDR+n4dx2+ryX6CQi2fj94UpIPJ1CVzwofgasOmpDxf4TmfJntM6zvfC9lGmpXXnn9pT5MnCGwemdkmbCsSaHh4P8V/+1vCWKM4oEZD5eBCk8M5A22chKl7SsVFevv66XohdRhN94x66Gr8AvndSkJEhqmTbw4VOiCOLm5jQVbRvUqbh1SEwyt9GI0WJdT9qH5e/fJmIc93wCvuVAZnliOZGm4+ntPUcsejAO5qSc0T3aVN+BKdeyKwvIpuR2eKHXpKWinXlKsGTytdSbpNO3PFR+jya2PVgCe1oLhIuwmJFt5jnJCZtYf3rdL4b6aiWkeEQnB1mBQpIfMmtQKeXMbIM6l5zGWjcKftfOcBLXoozVaMGSMCanb62TuN9D5RKASt+YYzg+MRKlMx8piRns0Frbx4F0/rH0RnIteo0US3Ws7kmhHFJUapxSZdtpJdtbtkaQ/qUGzkd8KngpTazE0=",
                perm
        ));

        //https://mineskin.org/1264703593
        list.add(new Skin("§bBourgeois", Gender.MALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjY0MDg3MzksInByb2ZpbGVJZCI6ImU3OTNiMmNhN2EyZjQxMjZhMDk4MDkyZDdjOTk0MTdiIiwicHJvZmlsZU5hbWUiOiJUaGVfSG9zdGVyX01hbiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTcxNjBjNDI1NzhmZmQwYWI2OTA3YmFkNzg1NzVjZmU3NmQ3MTk0OTI3MzgyNzFlYzNjMzMzOGQ1MmU2MThjMCIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "erVozYSXztrMqMeGYrS44LSEcb4NoaK5p3VT61lJAe02kQLjQlLdTMPMpD2Nd0lsTGlGUU75eO9OY/pDkhcSxs5RePifCChhGxotWmFZ8MXmnnccZ/ENkrdt5dGtY+nyvwD/f8HEZt8KD1zMLrn9afTIYjy54mwgL/efKkqBaa8XHxYTsDyhQq947GkQsrbW3UrVnhcln5qQvS+Js7o9YcSx6vg/vGK6G1zjLvrf0D2eV+Sg+XkAGzu+hzMbhRkIuBG5fJg169IHB4iC8TylKVfK+WeRRZ6DaeSCpPTaItl3y2emQt2hzPuhNqm5nzHvCXRUX9RYVT4D+sSjrwlj5nL5zfenkZuKOQF/awwTPX6ofjKUSf/p6Qb9HIn0RJFCvlrRE+EDn2bPpiRtOIB6CK3PnmEPYDhjRJ11lp7Y4hMf3b1kqqGWKKEmP1ppPdilvrKUOUNE9rF/JaIPFD6qVKXZjh6x4TDwTlojUFNNadEjkKSzGKDf5HIr8+UqWZ11+E4KmzuX5kq7Uu8BBQJ/r2S48Ld9WrUGTIpwSxlbb3qkhuhm9Gg9ROwQqBwmg8pV+WlX/MyGZzmjFul4IrFJy7ceGhZRKmbLtQXmiuPW3+ygKzTOfgxB2D19OFf3BF64lyrjd1tNBrT1raa8ii8O8H3ggMTGbQs82HP/q7UrRRs=",
                perm));


        //https://mineskin.org/731644690
        list.add(new Skin("§bBourgeois", Gender.MALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODU4NjQzOTQ0ODIsInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xMDI1NzY3M2RmYzZmZDU0MzU5MDY0Mzg2MWExMTk2MzgxZWU1MmVhMWM4OGY0YWFlMTlhNTBjNTU3MmEzMjBkIn19fQ==",
                "TPtnBXeGWdNjRHkhB0URDCBl/Ok3Ra6229lSRAx8tFtn5D/nfTrrzoDA2DFUYtw/vhUG29U6MwojCd3xXO3Ahx7UxQf1U7fEvHqEFR+VOZot+51HP4FvVgro8ZJlz1HW3LhHsP4Ub+5h+5O/JiQZPTXgl+ivLXkoD7afla3zhvi4BaEAcm5iSAC5sxBY/MKIWSlIi02N79C8UAtayXWPmQPl6wkhpcAOH1O1tWwErXG/EeP0f8ITX8kMnR9M4co3z236PUUaRrgvKWFDiYTcmZtCHDfeVdS9vBpzYoKGDKsG5neiDX0iL8jZeg3JQPgkeuH0JsNMRimT65QCUSj6Jt5/ZHSyI3Pdh6ir6EYsY+7cshSqfGlEYmGTIthdor4ZhqYh4xF4+CrVHGTHveT4KDumi2FthxTZIDBJO7i/qJvq8EBu+mlqFi5yEcXLlWkUVu0pyMUVsNDgUp3AQ+KqAuXW1DkV2SshqlsRiOL2zaXf2PrBNNJRqwxq1pJLXzXu8lqRsYkpKKMHW8z7fnmK6C8FXnHpocb9EjxcC9oIyLnIhp2yr/kPuTPqumAcQYzeCK4EDz56xhvvhcooj9BARj5xaI0/GKiKcMYxMoP7foElK8gFLf1RtE1bxqdHgxW317Q8hZWAzXvEjqQlzrwG+US8GQy8frGkLaum2WkuV0M=",
                perm));

        //female

        //https://mineskin.org/960964600
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1NjYwNTA0ODUzNDUsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMjA2MWVlMzVhMTM3ZjA1OTUxZjg4MjgyMDkzMTE1NWZlYTYzMDg1MTE4YjU0NjQ3MzI5MzJhNzUyYzg2OTU3IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "j/UryOn4j0SZrINf0WY65h94zzjwBfgrTSzaRNPm0gmcqGlgDzFPjjvJmNNbwfovgwQ3fDyvuK2gUSDviTJq+gEq4GnjlFYFtR6lb+9woe3CMTNNn6c0V0Le7DoN+wv8lAgCsTkwyqVjRHL5EJ0Hndp8MQNRaUu6PGQsG0Aw75PS7O+FPvTjySNm3/OWuY/TYbgSjju//YgUWhOupuuAZ/XRO1nHY8QrwRpEyRmgrQ/JTGYFwAXdAYcYg7FTTnj9/SF3Gb9kjvYK5y/2JP3kZ35c5i1RDsyaiu9xNCIl8mnBV8ABAarVifSzw1XRLTQ9hZNNcxtfIIDO804HATT/iuudXIBq7tSnafG7yCQ0clpFdbIRoy/z4DUNz63CPVF2xi0IFCLsnONwUWJwXsHRhyt9TW2SvPmgSANEMEA+3kkzt40A98w4tDFNDu97RbkuLj+k98cOKLiBmWz+2jXBW1mvqz31l5tkRFORLbgXoxatSmTglcukpq5cO01CIVVNhUqIzxlOaFeD7WDg4JrO9QW0EU/zUJkoaObrwC/ohJWDZZauDgOd9cc1mWwARm+Gw5bJDA/ecYXjRVelfdTD0xDBaYVlGhBq1xLGsKfNxc2FDim/l02F8kyL9YwjvEUTWGz+GVMPpww2abxa25CYfFGncPhcgep1xybaStf2maQ=",
                perm));

        //https://mineskin.org/984827985
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1Njk2NzI0MzQ0NDQsInByb2ZpbGVJZCI6IjQ0MDNkYzU0NzViYzRiMTVhNTQ4Y2ZkYTZiMGViN2Q5IiwicHJvZmlsZU5hbWUiOiJHR0dhbWVyc1lUIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iZGRlMDZiZjdlZjQ1YzVhNTFhMjdlZjkzNmNhZDkxNzIzNzU0N2UzNTA2M2VhNGRjNWUzNTAxNjdlZmFkMmYxIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "dBDlKY3VlGkOuJpRv1l7XcNu910qUkLfXqBR5qeizjEtr6SewQYRluUOUuwFBR2u0XAFvzRngHwRbq2NSIvLf6R7z0uxOfkAhegN5kSlh6zKvWN35AeWsfvb/LoQ7G2Rj9AeWmjCHvony2PijkfE2/IUNlrNDiDABHIjGaROzG59JpgTMwzKzy6zRxMRujxbBjkwwH1ZxVun06Hd26sssgrn4oySrzhWdx4ED8bfUhpQMQhL3KSQKlVsU/WajPx70un+v7h/mjn5qxqkya7nvcLx8aBTSaLn7u/bT4pColpAahPZP6LTYN7aBGOwOYmaimas+DRS0TRYcEvzMBkEM03/AYPSnqGzggs31pyQpfsuIvySNnQ3e39RbuoQfiYkoST+tMFuPE9THs1/78cWo8jza9A4OgfCqq00fDIcV27yPLpV6HbpYEetzbGzB2Ea0kt9JXG9dPkXXVJZgPojgvqf9WJaMjmrnj+4G0BZ6jLYZqMQIUT0yNJZmcEPA4bXuCBz8aWI/f3wdu3cLa0NNMjpcik1+2u/i+PcSUaab4u3A8ojsyoWVPsTDvGZn6h79fP8GyS9hMqhZCioPUqaVFCGjkBy7avqyDTsV0NwALHmuU4ktN5cp1G8Rqz+swlFUaOvyyTt77sMHFpZE+f8c+5hGRgRa2hgN848ScmVkbQ=",
                perm));

        //https://mineskin.org/417906206
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.BASIC,
                "eyJ0aW1lc3RhbXAiOjE1NjIwNjU0NDI2MjAsInByb2ZpbGVJZCI6ImNiZGViZGRjODNhNTQ0OWFiZDFiOThhNzBjY2E0ZDhlIiwicHJvZmlsZU5hbWUiOiJDaGVja2lkb2lzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xNzExZDdhZjJiOTI5MzQ0NmRkZGNkNDA0ZWY2ZjQxOWRkNjNhYWU1YTU0ZDhkYjdlMzlhNWE4OGQwNTdlMTVmIn19fQ==",
                "YNu3+mwB87bVzyZqbFynfonpY+ASQBrlxkjcAMHXzfBAnl5FMCLw8LaZcqREdauakWzb6ipauSw042WMJH0FRS058tm/1/KEfbxmaafJmOU10uP7b5d4XoJ22iKcl0a06KKZnf1JPZjLilQxb13vn/vi+IE5cnu5w9oxer2FRRijF1vtUbhOMQ7Nedn3MvBDjBc66j8KuiaLpu0dormxq6+slbzIU9EDHdozbexMoDPDtypiyUUE49CxupPMxcH7dQyuRFJSeP5Ze8tIKfRNY2oeQAPbpBkkixb4XsRME8RaNJSEROyni/Zu09GQanfWmLgSa/vcPbRXeqE60zIw2MvAWvYgzIA+Lakj0uklm267JFDwCDbTWlKDzMtb4CC3sS2lBK/ODNZSIHmWZ6SJsJpfQIa9+/0I9xt3z8unYRWz2/gfPMUsFZ0QyZVnGVx/KiNsgCu0NIcynoNczB7OH/n5/tmucNbdaHT4fDJKyC+Lcy9X5IQXxEpRY6KKnRo1o1w08LT5mWL4lTXC9F+HIqPtZdw0juE/O+f3B0nuCKiknMvM7eDme0GJh71BOAt4JA6DTV4jPyCCAAk4TR15G94lm/tVDC4prMpPf22G2FSfhPVBQ5W21o0e6HkQMEykx6UtfXy69H7M6KHK8IEP0fsNBHZRWG63scXzPwr8gJ0=",
                perm));

        //https://mineskin.org/2112850003
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1NjY0MjkwNjMxODYsInByb2ZpbGVJZCI6IjkwMmY3YzRhYmM3YTQwODk4OWFhMzgyYzNiYTIxZjcyIiwicHJvZmlsZU5hbWUiOiJLVFhmb3JnZW9tYW0iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2EwOWJiNjMyZWQ4ZTA0ZWY4M2IwNThiOTVkNzAxYTk4M2JkNDQwNGQyM2FkZTFkMWYzYTg0YjY5Nzg2OTYzOTciLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "HJP6dtCabOJ150pQUWS2VdiHgms1S70tuNq7ZUZNgrqrouUH8yDXUxCJ/u34sAgpY99f4mJocGk0JxDLyOFgjFORFnaH0RRLK6V203nfwhMqdgjZ5evkisg1TlEPYpbBnPnvCxpN3ekNx7jlJqVMLwMnv6FnyE8IccTQJlwFzabuLXIh9NL5lpvJSwik4/J1v24v8KX3C5dhbgKJFtV16kliAaX/47Gq5FeRK4pB0CsyN2MC7whYBAQYzq+JFMPMn7+oTWmIpvth6wOdW6jY3EpAl57hw3m5MKh4lztLTEdCmqva2NMh/AiMoBVJmLtI98/Dgv95hFZv9cj/1t6jKGWynOghtDJd7TnDuZDXSQAyFyyoUs+V/BO/sns7hhmHLzG+RRk3RRlHZ00Ij6dLzV5imI815HJlYFi5N5R/Kbg8Yio7tds0QNxClLDTEGXeD69j0X+nZk+7Xb3s5lDpHYfrjqdNfqHhpRwYsDH61Vj1B1EReCYcnBaAaoi775PHKY+UToy9qwVHCEFj4wWJqK3ZL7a2Af1iSGubZZIVldoL+qasbpA03mPBItTyW0i3oYu4uZ2no6bn7ZX3KV0WCQjY8oLbP8SujOoO5JBILVK5WisajYdPrqu4hNuQfMk/RMq1uBNCzmkoEERklymm86lCN33nHfRphuX8d8sb6kk=",
                perm));

        //https://mineskin.org/953285002
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjY2MDQ0NTgsInByb2ZpbGVJZCI6IjRkNzA0ODZmNTA5MjRkMzM4NmJiZmM5YzEyYmFiNGFlIiwicHJvZmlsZU5hbWUiOiJzaXJGYWJpb3pzY2hlIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82NWNmNGUzZDI1ZjcwOWYxMzgyMWMwNTFhYWUzNjZmNzM1MDcxYTNhNTkzOGU3NTFlYmJmMWRhNDFiNDZkODExIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "tQyosJDjCKkgJ3UnStE6ObXdZJcZiFANDFUFuwGI9yF+BfuFOhR0CFwDjc+nH25VC3feQGRlkxXdHByneVhpweNir/RUSJMefjktI/kMzY6VcJD3ETlh3X4B7xQwQaxVSoxmS8t7MxViisbgshSsJdzGaQxEUezkqnYGawSKx0qQE9kXyizgxjE0KQTmw0UrrFPZyFg86IOsBLuuUqDjPGAaLR5tD7+z6orJ2SqsDWH7s/7jQrASdO8tRsUMNhBKl6Bnegw//7WLJO4Q/7j+iQA5S13yWVckrG7T4zUYZQrFBuZFKUXfW8VB8aKLNY+Q21t+CPNy1l2JD0c/H/NLUxpx65hCOfeoDXrk+KqlxgBiONYessMZC4pH/nl6ZHelA1tuurAiC6ILP90q1BVnrsZMkWkcXEvHJ/EjatR5kPQ2bFMGkORyNSWR6x2U3xBMulNbEjXPirlScakDi5Ll/kAAYQ7RCTzdfh7DeujdOPpKV/RNEgYy4y+ymhiiHXeoGyJ4aY/l4LbNt4KlJyr8tmi2tmIZB8zsT87csXQaOdd+YRci5Ju70xxcTEa8puh7ts68+b7HkUY0RhMO9oDSpFnvHVnP2UZl6BuVEXYbusj9VAl6OIuwuFY2WqxrFHRzuKlo8+ZkCbZz0PBSMaPK0i46u4Qg6ctzToRZWEeLcUo=",
                perm));


        return list;
    }
}
