package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class EmperorSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {

        List<Skin> list = new ArrayList<>();
        String perm = "cc.empereur";
        String maleName = "§cEmpereur";
        String femaleName = "§cReine";

        //https://mineskin.org/1606055766
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1Nzg0Mjk4ODAxNDQsInByb2ZpbGVJZCI6Ijc1MTQ0NDgxOTFlNjQ1NDY4Yzk3MzlhNmUzOTU3YmViIiwicHJvZmlsZU5hbWUiOiJUaGFua3NNb2phbmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2FmMjg1ZGI4ZTFiMjNkNWEwOGNiMjAxNzkwN2UzMTYxZGRkMDk4YjU4NWRiODRmYzFhZDFkNDU0ZDlmMzc2NzgifX19",
                "tng7VFnJcxiHrSHTWNuHeMk70Y2oOQ7H7XUD/l8yqYYC9N6YkfK9PFxrobof0Pw7TGWUM0DDs/jWJ6aFHK6H+RaNViChgd/nb1l5v1+xD3HTsY+vweUcbtDhxwGeORMKYuQqBSsOsOEdA35c5PzYAFL7bDr9zqCAr2cioti4VO6XfWg+40KDwqzas/kDCx0iIqL2bV3/fwTzhnBx9UV/SClbZK47JHe3s9fBMli2w2u9B3Eb/qzJAzsmN4F8Pa0WkewfDmIVeGnx+zWhQEQFIdtswYhNJukXChcMCue+JBE3+I3iDt8Khfo1n8Vphqa+SxXuguspR6mZ2pKG3s19xsdy7n4z2kaysddsSSwYWI8cma/DgR5RiiUWSJMagpbn8xp1ReUmaPEbNSKxDh0ui9nQuzbS8vqY9AY+l23I1gaPaRJnLTNWTjEryErRTh/HuAq3J2/guUMzRPHPc8lcowy33rFzwUZit4BTo2s4uJ9H780QcLdmFCVCUj9vv2DHloSogGKU8O6php7i9hY/xMJDPmyfsZBaVxyP1uNo6Pv1OEEau/gvT1i9a3zboi23g7HQryOMCetsgx4e2nXiL0L3vn+kLcj81Q1vxgjeMmsKTJ3LfqkwrIHzGPiyWLGv+JnZp88xA7666p3LpQczWTz5r2n9WOQZ7YCRY7yGOT4=",
                perm));


        // https://mineskin.org/400361934
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NjM1MDUzNjAxMzAsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJ4RmFpaUxlUiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWFmYTgwZTYwNDUxMTZhMjA4YzUwYjk5ZWRjNDFhNGI4ODE2ZTg4MTYwMTFjMWNkNDBmMjJmN2E4ZDk2ZTg1MiJ9fX0=",
                "qgvd+O8Dsq1bV/6p0PBR8+QJ7kYl3FnE95K3E/b0Rb1v17r/ul2mhcFqWidAdYXTyCT46GjT/ur8uOGY1MZfYzvKDHweXQcu8MnStJr0V5AzXW3YNAH9x0dWZM0rzxgt81otcOtT069P2U3lSMjP+LZsBXxsTJPp1VQ0EytqNPiGzcpdsNvPReTb38Cv1/Vu16M8Qh83TwIEQ2GWoAX3q66YisPaF16i+6GTR3a82mnJ4Ei1xEB160RhJ98gX0jEKOle1ABKO3url14z4UwxopLhi652cCN5oL8m8poTmo/TXUuSm0S9p0mkWkvZiPjGl3jPHgJroqiUm4nwJ17MDw72u0nqsL4ljtL4brR1SEO3Gv+i0ZOVRcYbc553nyyq6ihBMN+q+CYdHVkzT+S0ZHi1N3urgyP6C3m+iImjfX41y9/reLVcwR0wzROrAkwBHuKw60VMEYJoBwDtDAqaO3BwoVBCgXaWbGhS1xPwjdnPt8iENJT22vrMqqCijm1zyPgr5gcng1IRK4fdZi4RGK6ppZnXuHQMGWRHi9YEROhbfKEAEZtoo1NyjL9J4Fp+AS1FYIV4gvI5txbvSQsDPzulwa6ELiGONSkyXA0yrSSmhXzYRJ5lS86fi85zSJ/mr1QSOmsHA1NmCBze5uMzYbiSTcREVW9zZ4yLIPOCK+Y=",
                perm));

        //https://mineskin.org/66132644
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njg3MTcwNzEsInByb2ZpbGVJZCI6ImUzYjQ0NWM4NDdmNTQ4ZmI4YzhmYTNmMWY3ZWZiYThlIiwicHJvZmlsZU5hbWUiOiJNaW5pRGlnZ2VyVGVzdCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjMwMGI5YzJjMTRjYmZjYTllYjdlOTA3OTliNGNmMWY3ZjYyNTBmMThlMzFiNTFlNGRjNThiODE2YTQ4Yjc1MiIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "bXcsZY2jKXllXXFTIkKJ9+kzvL7xa8TGJcc6sPABGiyim3fDVhXdTbt3OtcBMjLvXFNdiaAxt76kulmzD7I0KpjkGfqugh+Ve4um+fOxCLMY4N6+tdZRRigH+7PRhze6WY/NCKTsABWPlTVhc5QuD1P7AY6bL+KDhJBLFwHocMpelIKONVmYU/6XKH+RQ6srFZUlcFiwD2wXMF/pzIXZXRdto0lxdH9j1VbrpZMoEL/W4s95EqSkMB65ysXtRI/gfA5LgOq4/dsZNch55mnaQo40BSyYE4h3Tak2bL8Gqa0PW+arbNuW+H8k89NwExRQXk9nL3P8cA/ATnVcc2ogkCxw7ItVYoqs5WvkOnxJebuTTDgBQBepqma9KVlgIP275t/YpYEiutLykpR0IpHvJWwss1ByXg+tRrGN77jIpIRID3bjQJ1oewWwVqbQCTh6GPQcRR1HiohSfLJwICDuCNWhIjLO+eaRGybVyBbBTzniRubTAL3CHfCfsTFql1hWpdQv02oN58C+eLkdjEoQ5T+pWHYraT/e9zg6og3BeIAlP4b3VotAHBE9N3DyVfFlRiGWKuLNeYPos245x5Q/TfaDHJ1qzuBSpho5xUKBfzDmFJslAUkKqeBRYyl5BK20sIxL0LmSDrnanaPbQ0nLS6rCumKzfI4WGfK4HzUlXJo=",
                perm));

        //female

        //https://mineskin.org/1077058417
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1ODU4MzcyNjA1MTcsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80YjA3Y2YzNzc1MjhmODE5MDI0NzkzMTFiNDU4MzRkZTU4ZGNiNTBmYjlkMTIyMzA4NDNmZjJkZTE1NGQ0MzgwIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "d3PD71TJ17WDhwScSDxiu+o/aoywrduxqqFWtwgW4lMlvpnt3xMjFWGdJzk1gUlm2kLEXGhJdc94e/L1gm0IVkHA/DQyE7M2/pogDPYrV4jG1UqHJc5mc3lzWK/o2tJ9Y1kQzFUJNd8fgwMl8d2zg5FtIDr74+gwRK0xVxtzTQJ1ZVo/F1UjQigqXJUGx411D2I7MP9eaw1AR11nYishr44I9XuJfDGzASxRob7XA0sZrDcZl0WTx8j0QDqhBiDgfijD7xnbVRPtQbutaYwiSU/On8LUHfwideJCyQo5nXNk74dmdZt5awj/6bzdUfz3z80Vos6niL1tvMJduf1gnBL7W/tidiIh6eJX0wrrvXCo6BxMo5nJBW5uut19+7fMBsjjn/LxFHKh2rBXhgPCC/vp7mFPR4TF95z6T/oswlVrFSqHAkFtDfR/yQ61+IvcHfn+rUuAVY85lIXKrXpjAaERk94K7MiCsEmo6n7xWQYZiZtsT55i0s6G7GgM8BcgLMtRMGYCO+JFHBhn6E3LFsWYr0G5OoPmMHXlp2e66TXM1awVOih5T1bTSVGUD37B6jN2Z5neDnc1SPab1GMXIDOeRXSWCk1yypjJDc9zVJXUZqizX9sCyD9aDg9DeW61ee1Jl5fXSTsqR+PcvEqFNYvg9rOboMVfToz4yaEVQoM=",
                perm));


        //https://mineskin.org/1104822856
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njg4MDk2MjcsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDMyMjNlOGFmNWNkMmJlYzM1MWY3M2ViNTM2MzE2NDBiMDA3M2ZiZDRkYmExYTA2ZDUyMGQwMWFhYzkyMzE2NyIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "azGVIFvPh0bwgKpOpFpZbQmBk0k6CKnp54s0vqnhJfXfgk/L6ULvEHDptcVWus7FGDivH044SSNEqFM/kuuJn3R2tpZBxsXaau6wAqrstbJOexVJyvUQ7EJWVGvPgz2iv4QBDQ3Nout+B4zX89FiozaDX9tMDqwFrSIRq0N69OPez5dxIxK3cNxDcybZYh52Iw0MtOg6rsboU0QaoP7kaV9OqjMjTgymPt6ycuoCr/kccv+5TrQvj/tn9yoGCC9yUrezvfIGSdukEh9AlOnR0Fgcryx0nq/RnEPkz6Z6dM23oe0dOsnO7PQCOYBStu5i0DnSp79owUClsxSlP4hZy5qsQVaRvOU74uxF4PuQhXYgj34D9hVjzRcWxDRvPQNtUTARC8N9ntNt42+5MP0uR8Lch5RpOWnBJbf04HsJ0ROYwwkBWWdFw261QaC6LV02BMcVRFmEkthQzHic7IO2TYLTaH+1wKScgeG0+meF4gMiP1sQXj5Akz9dVXgZHzHnOkT1YpqxGfBpQNYtlLUaCIPKvHscGexotjs+Xk4WwuvSesycYeN1TwxiKdDoy7LKkEc0NkyaxKadqo8DmpYzBJZnpQ36NTA68zRW3+MdRJuSOTXXcaVxMTvxt8ycF3HY5iYeMXrUEBSxRavhXveB5svcwCpguEd3BYuf+m47BQc=",
                perm));

        //https://mineskin.org/1551041800
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1NjQzMjA2MDQ1OTUsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWYzMGRiMTFmNmI2ZDdjNmMxMTc2ZDEyZTExYmRjYjExNDA2MjM4NzdhMzE2NTg3NDBjNWM2Y2MwYWY3NWMyMiIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "rJ8b+S4hLp3u7Ny5GvkWpOKjq3v7xVlvWLgUn0vdrcWff5fUyEDGfuTktFKDx9i6QO/g1XKvLkbIIp19omfF3EliaEUjSe1oK3+Vb5sBGaDeyPexQHczPlD4bu2Jj5jUL5kP+6zGDzC7P9fIkgbbZpJ/trTlllaVV3pcGcOR6uRlRDAv5fj+b33FnW5w7fseYxdjG0t5xVgRD+ZtnoWODr5YUaoDaPMtlvV0DzihDq+Ee7aYScbpStJRf1kwRbOiKoLCMAdHQSrmkGH6QP5J/BT2/aUyeodY5qHcQ+4TEV0STUahT7fMS3Jf1UdwUmRtsWCiu89tq0qCEUzbFuxb3+zvEpBF5EwoaJaDkA3+9psfneq50wU8RCxqd9MSFxzMYczRcQDmf7XAAkaPbCnOU+oI3sVu8vbYli1EtX1Yw3XOjWT8pzUBetpGcTNSaxDG0QM7FEtnGXyag+92psciFuns0NWvtQE5WpKQ2G022d+fjzKNAbr1WPHC+FKLkijBeYJB17QxGqYnUfx1QQGaHygVgHd5y08MYh+b0WPb3IFaS9w/VstVajzGQpUL+Dp7MOSS2fpOyBj4z9auNCNotgOx0ESKG9WBLEOZ2X18VKFOEJjKWVChOdJabLa9ZQzZnusI2O2fy5DJAPh2+rK+UlQHvVg16UvnBm3OpaG3B9w=",
                perm));

        //https://mineskin.org/1872396691
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1ODQ5Mzk4MjU5NDYsInByb2ZpbGVJZCI6Ijc3MjdkMzU2NjlmOTQxNTE4MDIzZDYyYzY4MTc1OTE4IiwicHJvZmlsZU5hbWUiOiJsaWJyYXJ5ZnJlYWsiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2QyNmQyMGE1Zjc2MzkyNTBkZjEwNzYwZDg0MGY5NzczMmU4ZmFiMDk0ZGFiMmNlY2RjOWYyYWU1MTgyYThjYjIiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "nwShpj2FbBE+8MbckSk5M3+dL0bLawPuuRlF8hU/xhXlTIBeJhRbK22CJXoXjlhJbsyckX66eRyF5hcmqh4aO0A40zNd3BJcBZ0KStkTEAPzi+Gb+tWwFWmorlHkTYu2B6iKg+vPLj9cYoEvy4VxjCm9KQtSyfZQB2LKBnbTZoOIqxvdWQVjJLZ+8++/vMRGfK+7txtbV80V5vKs+DK3S/a1X8WilCn7ygxj7AnihO9EC7r77ImQtVyfnydfVVSBrCA53DSW40NrJzO95OUuHY3Byz2CK5Z0GW5r3Dqx7+gCfp8aJ8dLmd9RjyF9EjbRKKwTFZmhx5c1dN+Y4MSVuZH1phgSXeCKTPSnvbhU9YAtB26fMM44dxgQPNp6dDPq/j9P9IOe3YZXnvnao4PRHJQlD7kE0ziV9GBJJUxYKXkxKm5HkF1r+i7Nd4dhCs6wsuXzY39VFM69cUJVqh6h0FWIz0Kk09HXZjHgkgd3frRpd0X9OhdYAOTm57SxMdQyPbPyyerXblycJXdehh6d/7tbESi+300FuvE/rmnF1UQb8YxvKOVJlTuHAoD8hUQ242O8sMvEtv1NreBCt0a6pkU4ilfLpygwiMQT2V+N0/ZPePZFChF3rf0ZFV5rRVk7rVuU9HQixW+e3ZDkbYyvG0Qjs7PGqjcahNolWksDd5c=",
                perm));

        list.forEach(r -> r.setRank(Rank.EMPEREUR));

        return list;
    }

}
