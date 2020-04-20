package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class VillageoisSkins implements SkinLoader {


    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList();


        String maleName = "§6Villageois";
        String femaleName = "§6Villageoise";
        String perm = "cc.villageois";

        //https://mineskin.org/598016283
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NzUyMTQ5ODU4MjUsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDA5MjY2ZDA4MjE5ZDliMDVjMTJiMDU2ZWMzYTAwMjBlZWNmNTlhY2NiNThhNWFiODg1YTU3NWQ2MjAyMzdmIn19fQ==",
                "UT0yijgIUjRQmw37XFCmIsvjwv1tLQ8OPTqHphMPkHSm16XMEI3v6FURCVlKwGXNKib1S4YphXDDrItThc0O7KAEHvh1g/UW7FUgehv5C9ONiKl9OOxc6v5BMKAY6Y+ZXVh0b9XDK0PMMRWmkk3xn/Y13gW4idFcwmIQTmlt/tZ81QlGKmuXQIhTxyJ9hyZF7tj2g+0780FJqurVocPg5DIYo04SVaF8+K8aVrtZBkjkv2zpHkytn8inSgyIPVKsnA2jPVai3CykHyuZQc3ivsjeGahcM/RAkRMHql/CZzp4UMW+9eBWxKwsT63/KlrWFfVTnBXrUY3UCWrU2maFyU58nKgBOxyGjONUvz0jzg/hI912yzjO5VjjfRiEehJp1fwjGZ2dRbsllVud0ie/Wmi/5vMQIYi+pv6R8zLJGO+G4Ei9aFC9ZPAY8wYyxxCI+tha5gJEGdJa7/z5LkKqzUeDeOKyZQ+nYf7CNtByEb3LbRwgua+WeVLEGnyE7oF3SemYsfmncZ1S9bIsHVv8I7IPNHNA99vAxupNGmKsk+clSEo6gf74A7Qm1FXjj7hVbxgJFnbwuRlxVElvtKOnh8V/6osyImCfW+inXXoH2zbhFOSlrWaYIyXM9/cppKhPk2cQUkdaDQL+X8hpiIZ5l/MGzqEid6LYYxyt2FPQgaM=",
                perm));


        //https://mineskin.org/820378736
        list.add(new Skin(maleName, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1NjIwNzc3ODMzMzksInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkzYjUwZDdlODM4M2Y2NTZhODY1YTlhZjA1ZTNmYzk3ZWM2ZWZmOGNlYzU0NmFkZmI1MGI1M2UzZGU0ZGU2MjYifX19",
                "dubcivWbARSmeEN1NJg89tvVFUuiFwZ3NBmPLNlUX4qwSDg3eqHyCEcl8fRu5Cf9R4Y4YQ782K+WtUszeRkkywChtZtyJ1jF7YbD2UDOH6N/gqTBETiKgkGrXyJ6idIfQKZ1LRhCAlj44K7bpW5OTjyyZESTmWkGc4AEXrIfEtGcvRA5oKk2JencxOwtoTnRkwMOBcZ1mezdHJGv5/iLc45B0P19SOo4yxlRM1zX/88g2euQyy+QUcXa2lROhIaARjDpvwd8BePWA0xnKD+T7h/UXl5FTouDCntcI8w0lOpo7FEOwgtMvHXo788iIZ4rJ2LWbHCIki7Dboj7ILyrAOXITCiOfYnn88ZDLW0bnah06Mqk/XkmzqamkYL8KsBAQK2u6e5mgOL0kzyRj3vKsWpbzQNFYtRDbVfaEBN+OleyeQTWlSPn2Ka7g9IzkQ21lrkYc683eP4FZABBCsPeKyXpzU0A4DjuG5WHitdsMue81CfbxwSkCgUI5DU/LDgbWDl+4S+MeLhZKg/cK+AmbPhDU9/KnGoHknUts7PhZOrz0qDsgCqOsPpYtH5SXMuSA0Anu5ozikbAdMnMVS8G4scKl0WengVKBkL+fGe6m/J3JFFyraoOQ0mL4pIUZd05MxGtpaMs2OROsn/lbH6l5dhgcsJIsKwStO6RUl87TBs=",
                maleName));



        //women

        //https://mineskin.org/1432742267
        list.add(new Skin(femaleName , Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NzMzNzk5MTgwNzksInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODAyMmRlZmI4ZWYyYjkwMmRkYWZiNmY4NTU5YTgzMmVjZjVmMzZhM2UwZGE0ZjQwNDNjYjVhZjM2ZmE5MWQwNiJ9fX0=",
                "s5zBTjDounqyKaIaZFg/ORU2oPa4s+2k1Jq9Xkx0+X0pZwLU8e5vq1Mfywj8576XJ/Im0eLN8UBVIu/lAyFMcWtQUhnaeoRzuyrBiivo5SZHi1YhFO7DfBzUXBceHl+cgF2XY+rKY5YcVMf498vgAYAJBJj8qevzAT2XRIVj+hzXrq3caIjggWj4okBj8gaD8j9dlWA2nF3E4PS2zsw9IVjI7H8TQ1gG20hVgdd3RFH4XJDKPO84/eMMvZuHjJ+VUhqlLV+bF0T83T46swGtnhzIfHOGvNQTni31TN7RYAItp4k0s85yOxKNoS5MBsc8BQs1KGG893Gsqi1hmIzRvjoqtZB54FOVWZhwVrt5jJfrpkLLXFfVsgppiZPvKWrL6oUOFE2eSJ4Tdlk8VdzI9dYUUBTJEZ2WVh2w2VVOVvyR/jyv3CbVuVS/rWo9iRERUBn4n9jQ4woewvwXwZtg/RxJ5eFqCjSd2xRd+I+J0S/z4RagSo0brGh93anCSIdSiaG5l1WfKQiG79yCWyucFu78c4oeABxnZlG5Fewg8iDMBIaPa7YWnVGlXFeZWc5aKE83BFNkM/5gaji6G5T7JuYaFyoQTR08tdwDkDf88bTTKMXSgSzW+1Htfo8CcRi+j9LYKJk54+TWT3C+ttpL7v+d8naBfUUyfuTiy+aDPT8=",
                perm));

        //https://mineskin.org/703890509
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1NzYzNjI4OTUwNzMsInByb2ZpbGVJZCI6ImI3NDc5YmFlMjljNDRiMjNiYTU2MjgzMzc4ZjBlM2M2IiwicHJvZmlsZU5hbWUiOiJTeWxlZXgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM5OWVkOTA0NTgyZTdhYTAzZTBlMWZiZTg1YWJkZjJhZmE4YWE1YTdhOTAzMjI5NWRlY2QxNmJhZDU3YmM2MTAifX19",
                "oAoJTDQkCLwMyW3ZTWDgSvVrbMlgWTW/VX2X5PRYVUvRS2pT5kEh+x3ViRGGTUNCbcnwHvm1D5TrUaR587Cgo1W6NeE9UUEiMNiwyZ28kG67QaZmytSTHAesXIiv2PXts/YcYb54FiysJAD4Nanomm5D54Qbz3qFErARwScSAbjgCzNojY9x/iQWzTxl5T7Ib7d7NeOKFiKTMXl8E0/7PgkuZnqHbwLJvkW6NeuUFlE8ZM5S7W7h5iCIbCBuY5D4N4mOJmL18jRFOBojTWdfRVn/beHmGhTc4rQ1YkIyobYweID7+LoKrURfmmnRM8Ssc/LStp6p4Xg84p+yuoubaLf43t+6CnSovmkZDehFfdK2i7iQ+yHQCNrK9kcbm+fcTAeZhQHbLv1PQ28mSqQf1HbvZEjl+oCntNX1V9tLpgA5T+J/0uFVgqa8hD6+I7k5+in2P/WoP+i/xQNQdzZBVzubTAWxt3O79XopPbNrc4E5LWBHhrQMczNcLoXP5d6Tz3q6gcXjgMinuBOqml3PijHUwh4zRkt1DsF4OnEAdaW3fY/croAwXjMzqjEaHz2o424D/i0SBWQAf20ieIYtHcudSkQrFJEgop+wNaKdObATO47FwmjHxzRp0YTUbLwkkqRzZEoe9uMixtsAW1dWpAHa6M5/bNJtqSqYaHKVgMc=",
                perm));

        //https://mineskin.org/1939826050
        list.add(new Skin(femaleName, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjQ2OTgwODMsInByb2ZpbGVJZCI6IjJjMTA2NGZjZDkxNzQyODI4NGUzYmY3ZmFhN2UzZTFhIiwicHJvZmlsZU5hbWUiOiJOYWVtZSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Q5ZTYwNzk0YTcyZTZkNDQxNzgwODc2YTJjODk5MTI1Y2E3YjA2NzA4NzJiMGFjNjczMjUxNTAxOWU0YWI4YSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "oc/ajqB/ONL4UdEKPQJkE99nBWOr5nMedGhur+6b8aPTqApARdNvr5TKgIfdm5c0tzxbbW0Kdr3Pf/d3skzsR28G0wIHXqrid/G6Q7OMFabszWMvVC8i2pDiriENMKbXzCiCGUrzhIAKxSLBwjoOVQQq/kOO1M7TTY7CcQPcyAeCyNyYZ+ZFDON11v6jntrm2YJaVfDbWRCqAh2sicHED2/Hg4RzFG9L6cPmTJpiarQmiWFixU7o8YxtMAnsaw+CrD7HW1S9buBZnc6jjwRzXnhS6ZFPRIhTkcnd12hW+1i2ffB/7aVJLnsjlj0QdCbJIVl618uvlu9vXaLiqBw5/nrQjb999KPAg8BO8MBiRl4Uzxfi2JmtMCi3YKoKRpECadrQN58MrCZ2mKRCmfkCAO26WWlYcUoiHbcxgw+5bxKsEQ87Dmaw4bN7OsrwUHof69xwgibIfqlol5F2Na7J7B4qjPazZMgCWN7yPZN2ZA6TIwbir2PihHTLBgZGarwWhnot5Nj/nMHP1/E9qJ5T5VcjU7RhIKuwa+lNY4p6UUmzaontwwtJG+heUGvqVuVE3NI+5roRUtjIW0dxYBa07U2yov6sZYLucasC15BtUZ7T5SBJMLbI5bXCKcxt6neIYkuJ26d0+15/YiUhr1RjlXlHgLxMKw4aEzi91nJQnBo=",
                perm));

        list.forEach(r -> r.setRank(Rank.VILLAGEOIS));

        return list;
    }
}
