package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class BaronSkins implements SkinLoader {


    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();

        String name = "§5Baron";
        String perm = "cc.baron";

        //https://mineskin.org/1376468444
        list.add(new Skin(name, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjcyMjUxNTksInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWUwMDY0NGZhMjdmMjlkZjQwNGY3NGExZTkwY2VkZmM1MTEzODQwNDNlMTdjNGFhMjQxNWQ1NjVmY2RkODg5NCIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "bCwTFFW0q+i1dFpbsZEQtX8uFLq1FfiAObREu8YhAg74kWp2P96nvI3lwR3xygKyu4ro/nMK7zYrEAYHFs1FY8SUhiw7h58SJC2oF7/6SWSJPzx4s0RlJoogy9V+8BmHrexxhsGbODX0gkzBcpB8nb8U7loGzaHzaP3md0B3d3ogoZGjQu889Ai+JEEyBYElWU67YU33PbpTnqPADCvt9kbJvLCsC04uxJepd6kXV0XupcBRrtACwGimEnVPtXxM0SgxkU7q/uYLHg8g7ERawROnk3awEjOVuumDjnI0rO0OXQ6uvPXb/fskHfHSsrJ2aqbRPjGigheM62Vnn4BekUVz241DjtLQ5RIQCHTaI+778tjVb64pYHoDODgM7RcA/fu8n76rL9HrK8b+w7d6swtvpbf9x+yJehdhOi1GBSHwL7fOr3KhvVb/KWGSy7QkH/EXIQllk+6EyEza4lVPAyaEfpr7u+LvNTj1lCvL7FUlRu73TPCNG7NIeK5lrNnFVnAFFRsSOuMGQjdukOAcJsP8sF9dIqc09LClP/AochkPLT5yy+DF/V83DcjoXud6ZpxMgoQN8rwV5gJY+FEwoJbyQYsRAkJlVkYgiE74kh4xV5lBe8EZv4OucIzZ3zfrad8WQjZj3C2yO0wbydNnnn1noqs1A4LhDbKw/vOV4uo=",
                perm));

        //https://mineskin.org/1339025452
        list.add(new Skin(name, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjcyNjUzNjksInByb2ZpbGVJZCI6ImRlNTcxYTEwMmNiODQ4ODA4ZmU3YzlmNDQ5NmVjZGFkIiwicHJvZmlsZU5hbWUiOiJNSEZfTWluZXNraW4iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M3OWM2MmU0NTg5Yjg4ZmQxZjVlMmJiNDNkMjU0N2VlMzcwYjg1NzczYzJlM2QzNjBhZTYwNzk5MmE0MTUxMzMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "B/NuE3lPI/B04A70reABm0LbolyVMWpTb0hBlgT/1CY4qxJ9khHm7DIClNxLYpwXYITaGb7rVv53Dxm9ASLk+gERPCysGIPM90Ezq4SFtRiC242kNRhwQIShhdmD81QB5Zg+4K/uuABgGY/LVxG9PcZ8LsrwuxLW17vd/Nsyx5W+bg1N/Ld3N1d2NPVlgsGMXOBXXg4EUu4gAH6bEo84rHJ9oR8NFH89Nb2hImpclSwQjwiJ5aai7rJcn4YetOEyv8uwxnvW6OsrsZI7NNn2fSM1SWtq1MGQZP+aObO6S9aq5eU8t0W4/jYJ8v7/BsMhE9aCQTOo95HGhNA+fGsEBchuvQrlaAug4Ww+IP0LA4lkpNc9bpLufd+bJgZePO3kzI+EXVI6Ix73Gxa/5jbKSxs8SziRWR045N0rCFaOFUVfcAyvcugwLbjGUWpIWRwxBqervQgUTL0JBp2+M3+gx5i5LGkA4LeJ6yK9jdljmFqIOcSWj1wJH36sOTVhBtxZ8X7XojvpxzxDKndag3c5ez8DknRiQhJ+2kLwSqCfUjlS36Os8jAmJSF0+S75ZPIrNzVOpPIEVkyRdqPGDfzNABZHQrB/FdAT8CHWWdO15QdS1DNxcLw3Vqyyzb4U69OIDg7PRr96igA/8mCXlHgMptQ7daSsmkj37SzLM2DjCm4=",
                perm));


        //https://mineskin.org/1576429697
        list.add(new Skin(name, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjcyOTE5NjMsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xNzdiY2RjYjk5MDRjZGMzMjQzMWUzMzQyMWM4NzMyNzAyOGRlNDlkMDQ1OGExNjljZjY5NzYyMWE0OGZkNjQwIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "ZtPn7yCjY4X3i7Jooqx0pNAQCfT5zGAXli9sGW2YUSz9d4VXBZ2E73hx9PddmaPNJzvNyv4GWVZcQqt1Fsr/RO9lM1f3bgICslaqyA/am04JeeZJk1tlAMexopjxH6L/2HP4sboyr+O552GJEoSFu7UvSZbDD7locfbV2HuzEJHITEN30FO5U2c95s8dzGf+LUqxvPql3v02saNjrgK3K9ob8iBqPDLTb/5wDQ+MPI1upo/XqZexy+5uC89Tqi7ENlJIGxOYAKc+mQs2KFt4B8I1sK09wSXIKNYAGhSo8N+W5TKuONkKUvsUfNr4fQtP/9nWNC6e08/gMqo8pXfrFtINaOl6++/yDQ1XVER1ktBDeGWqiqsqeoQklJE/4Vz+lFIkhIviK/3utnEFIpSbrYM5B75xw/TX0V2ajJJpPZTP6Ov2c9Bgr3Y28yTdyuYrG1H1JY7UABcZLSXiy/DwhJLRkUJ23J1LiH2Btk4XjQgro0PS1kjSZ4TmwM5cl5KDRjnwQocfFShLiy2cE7lFV/ng1OVgffCNBGuOjT3fh1GYLvJt7Og3vwDcK3M0i4+JjPsPsL1unblt6MLWyFVxHaI3aHlchLviUD/w3FAA6KIJyd0mRcR+PCXLdCpzQMZI6Osn3z5Jg3j7SqipgVMZ+OaaVNwreGY+xIaPIV8Tpf8=",
                perm));

        //https://mineskin.org/66307139
        list.add(new Skin(name, Gender.MALE, SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjczMjI1NjksInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjliNjEwNTc5OTUyYzJhOWZkNGE4NzZmMzQzZWI5NmE5MDIwY2U2NThjNDRhN2NlYTU4NmMyNDdkNWQ2OTM2MyIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "VUMfO8WSGkNBtrqMGCvHr0V9whczw5bU0RK9s1vUd/mVnEc8ugtY9Addz0H2L9L2zFsIjy+IRWqvZHVMPJjCwyJTP9s2yBtdhFXr8bmREofx9K987aJ/KOd0QwLHkyf8EVtg7Ae+RiKtgF+EF1PnKIJZoTskJy8GoWBQEq/WrZj9v7rbXE1SlDVczh1JTXD/ogZhPHMGetr/x2HMnRHo0gYAQ35rQC0wDlUlF2Z+U0palMyg2Qiiyu9hxSTVg/1U18cOdIxShgkAy8c5TILvzJnUBeAxqqV/Qv2+Au7F9FDevpEqn0a1/CwzgAURtkf+NDi8/KmLws7KOo2AOIoua8E72J6jb/+gu39dayO3R7UlXPHuv1ibom+WdjIqOmtzDRyzTk4fIcOWhyhqPm4Qq5MBBiqgJn1Zo4OALFfBUnSDOikSrXooxduJLuY/hgdbC/5cLp0/RMM1pE85RhdgOsnvC+In5b9IJI5VXdE/Oc1y0Sv5ai7HpE6ak79gtQAbk4VJfX6FXnMLJFPZB9f1YrHISJ8BYv6yVRVT45fXRAGurtWx/v2mWRfx1wGecdm54kTz3vigA47QOAUL2KFwCxfiO1TVhCFiNn8CQbCL0a76V4Q9xyCQzY/ZfoHV05gUKuZIEWMUqkSlr+fH3w/3CAFMfMeGNidWFiAhPNVuwLU=",
                perm));


        //https://mineskin.org/2008251571
        list.add(new Skin(name, Gender.MALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1Nzc4OTQ1MTc0NzksInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDljODA3MDA2MDIzYjE0MTcyYzQwNjNiZjlkMzdiMTI4Nzk3MWJiZjIwMDA1YjAxOTQ2ZWI4ZGU5M2VmYjc0MyJ9fX0=",
                "EtJ6OFB2TuyOJvLUx83Y+rIguyenXo6H84Foj7JwVJMVDkPhHLWJPuP1S3s+DAxxCJgGfkZL7e9Xap0ujq9Tf56y57veZ5n+VW32i9AEWPhTPfpNoDTqqtrQYt1MsNu1zlz3dxxZqfORUrk0Hqae7qgvhSVczjCUD501sz7/SXFW1FoORrfN8hv3ESJiEOu1NPje98AhgkfeRF97xj1UAF4xDIFM6ucXtsvayMdJp0Fttv+XEsQTMefFLx9UIc+wNYusz5a0TFciMPcCY05oVeV3CIo11HFgNmbo3+iLh/SpQAUA+ejpY9oIEZCeMq13bnXcAviGTVZo1NqLYpYD72rdT4/fTOLWFtqSOwILZ4dG3KCJJl/YRtyy7REoi/SB0lmyb9ugimi+vnhnbNbjMFxzSBb7bLqxbWX1KsYnVaELe8XNBqXrmGH91Fw3djldHxpje8I1JbMGUrR7EUUpvARfXkcmOucPNDLVv6BVPyOLWK7ZtfInRNymg+ZrKGvzem8n573hLrIHE1dTI70fjrJyvULkBgWMtp3uYUrVHxwQQA4H+8mNUgLcAIWW5W1bGN/6f58MQfpru84d6qAbpMo4lXnonL1dAYq47GDT9/HA2rMvJNAiW+4vTPxpD6VmSwfYeV/XhqNY4tQ1b/4PJ6jCegViBSHhwq01plH/XMk=",
                perm));

        //https://mineskin.org/1160191837
        list.add(new Skin(name, Gender.MALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1NjY3NzcwMzY1NTEsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdhOGRkY2FiYzhjZWQ3MWVlMjg3YmU4OTZmOTM3OWE1NWQ0NGZiMmVjMDRkMzIzYjljZTJhMGIxNzgyNzUwOTcifX19",
                "yWX3QjGxW9bwCpgEpqLtOIGhncZny5DKAAv5Di1XC3hyVOyBpp7MUPKUdIqh0TOFXwwP7jvl7x6t13Bx0ogNFOm7ygt/heC6981m5La3tf6daxfZ/cAzEcZUstH3Au+RBRGIxDOp/eAWDayWG5mGExLKPktE8tnIrCZytAWEI7wGeDZ83JYmLPoisXb4dKFOx0u6gW2EPWzU+dm1mJGNxZRe5RMqt3At9kJdW7SxrJNKFzjyBjIlnA1jPV7m0SH5S9gVLWWjVmMD1LCCY8WrzD0ugiEd4tI/JakNe9QgCZHU1rQg1e8EY2LXiZjyYEgguqZ5FNOTWoIakPLJ56vS7if/oB0WNKcNyTioKedodQZjIb6GRdbX0Rb6JRCR+tOKLQCpqAeSCvRD1SDauotewEo9Bev8/UTycUVeA712fEeHwY1JL4oqilz4NIvmDPNeoreJiwIP3EbPLLRbD2wrCDHowdQKMJj2YZu1REiUPgAP/NEn2uH3wuRJPonZVwj/9TRex31gy36dElsGPJeV0jpsEy+zCKDXXDivRjfUdzIBDtNp+Jbp5jww1+pxnP2oE6mlTD1hOubFAc/ZYIm0nAxBT/wmss1i03Z9wTU2FqTjOi9Ug5dZIcuqBg6pqwwyCfH3U1IYeC9zk0wmpcRyiEIQzTpvw11zzqaZH0pbR2s=",
                perm));

        //https://mineskin.org/1160564041
        list.add(new Skin(name, Gender.MALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1Nzg1OTI1MzM4MjgsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MDNlZDU0YzAwYTJhNWZiMjE2OTExZDdlMTViYTdmNTE3YjU0YTUzYmVlMzQwNmJhZjliNzdjNDRhM2IyOTQwIn19fQ",
                "sjZUd1YbkKZuBBcy9lizOxAS14LuT5T5zuzQ2A+IuDGIpmJa7YmJBnn+3Hi/A0pWcdsMMO6xVIAMXBJE4xxmOXr9wWkAqyXfUQQpL+GiEihsTf/559wygw6afyiLIYPNo44CuPwI5JBE8AH9Zk80CueUzj1uII1fVWypGFaDZg54Kn29aaFgbAEmADR9qCv5ixdY5EiEWjjjUBafeZq2yGuI+lBtNOa0aTKAvEB8vse6pJlIn1f+dGcYySuvUiSQ9OozqBxtHxwXDLMiT5mgdwfLzsj++hQ2EBtZy5P3TR4o+eg8GOsTVJvU0ECiyWWvdPXoKCT2ciXxTKOfxKr2Phg5S33M6sR+q3dobjgiK734iWHap+FoTgGBEJbuq4LsXHWwxy3t3qzlhWKyZSJfEGLhwB5sc1a7y5j+HtkYC0tOIMo19V7UXVt0cS1pm9wZn40kCH8SXMGbg5KJuFsS/BubWRnMqUqCsK7grFna408MIsCM5KcYac7QiRolVeJzBHRrZvPmCDnA/+vivNgeS4Gkrlg9XkpuIGnm3Baq4sG8sTtjXZHLaDYwEv3UTCe3t6W8pSo2Vyq+8v0e61ce8i5YFla+eaEVH6ZNDKwnZt/d9xsyopJATrsa2zHKhf13bVWNh32/QVjwqlXq/TbwioZZctdGz1iS7bOhPIReAPk=",
                perm));

        //https://mineskin.org/1967714179
        list.add(new Skin(name, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njc4MjQ1MjIsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y3MDZhNzdkMjMzZmI5NWRmMGI0NzJlODM2Yzc1OTAzZTJlNjhjZGQ1ZmM5NzA3MDhkNzBkM2M1MzAwYTkwMjkiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "GZ4ofr6+7VTh7cvqis5t95X/WzxaF3yGgkjibF8Rfh3RZ5ZsAc58FhBP3lvs+05/Smlnf3/4L6zKMYWqJMj6nvESlH8FTdAuktuPiZQIuB/dBONucDwLxkMrU7+BezuV32iyuOEH8NMOmMDcrvlKA98yhXVMAK3dU8zbQ0/MIEJD6M+FwT+IbOC7L1VA+2+kJiNcWt1ICUEhwduSEN2BJX9mDWb4qE/Pa6tIu+jGdWUvIdGkAv34vHqwEtS7sfzibkLWJFlC1LHnaxddvVznkvownyzQQs4eek55otDdzpI0WDiDrZYvR0JZXjA80XuEuIBPXq8zTKptayLvITMpdFtm+XR3pcwuBnnzEE7z+Pqu1++U1fXXo42sWFB191yBRBnr/8LBXuU6PgxxV+1MzPcMuqqS5bYNZBUNDIvt2QuA26zOedBrSVT0WAdHyT34la4ubEqRTJOjx2b5cqT54DUgHxz6G56m3CkVEmgwZ5Ld+vQXVB1Ld0JigtzmcW2BMu6f1fuEZUTOnQeaNCxxlHux3IrVwB5lTiRh39uDsH5KlXa0QetjYAknfhC7cg62IEbzPKVjq5ZDcY3OY6gaPA84+sPeWXaWlflkErlbSMUp8zTj80kxPpbfzZpDRrIb6jobxnl+8tgA9vfRcvnrf+5htDr3wcbLBssNEi4wrWs=",
                perm));


        //women
        //https://mineskin.org/1184266368
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njc5MzEyODUsInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jYTdlNzY1MmFkYjFjNmQ0ODJmNGQ1NGVhMmM4ZDFjYTY1ZmFjYmI0Y2E2NzMyYmU2M2E0M2ViZmJmZTU3MzE2IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "wP+Sxqb6ImMgMx3VUKcBpefDUDhWVNsHE2h9WYOzW7x6ApAOJjgtCa1HwSMmG/KqqRhA0fw03mqGheUoRRHHO5TtppvbjTEp2KBnqCJbw/I6yqFIZRsTEuvovmXDR9zZuDcsC8R8mdQHidtWCOub+iiL6I0yapIv/HbYPZkMJoRn+UAv8PRn/yDOOqsJ2qpU1rdUVMIzEdakCAepu0aoUlt8JHk0Tpnvtj6jQ/cmJSTC0aE6LLr8vDm/lZEEJMRqj+19vprHVzMZOBJ5oqJElegp09sflB9zVs7KlXQllqQsx/lG7mGyYXQvgYi3T3/e+7h9Jjau7KlY7Q7GoIG00XdPSLIbFle7n+snpSOBkFPd2bIsznscvqexVEE6aypGX3+Q5ZKQbBwAl1+y+kjAXUDCWgBP7ZEBwQyshmwqRJXGhacycX1xZs/tg84FFCRURXYas15L3BjHhlmJ9lNj3uDCgZ4J5EHXVl+q1SpN2e0CJ0iEZ5C7FEeEM9eiLntfqAKui3+lQNyDuu3qtrpyK11VHkWtXJ6H+eQRFKuyhccPdm9T4u388Wcln+WyvVlBcaKEFiW7Qmi6zHAnhUwzL/xoKjKkqxKqTcuGmNqLBtR2OwgDqeypYHh56wdnJKMeBocOHPZcGR1qxhVnpw7brYtf7c5GPO55phoc/9UGY+Q=",
                perm));

        //https://mineskin.org/861982205
        list.add(new Skin(name, Gender.FEMALE,SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njc5NTkyNDksInByb2ZpbGVJZCI6IjczODJkZGZiZTQ4NTQ1NWM4MjVmOTAwZjg4ZmQzMmY4IiwicHJvZmlsZU5hbWUiOiJZYU9PUCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2MyODY0MDExZDBhZmUzYWI4ZGU1MTE5YzhmNGI0ZjUyZDIwYTcwNDFkN2YyMGExYjg5ODU1NmE4ZjE3NjdkYyIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "uDeO+DlWPzS7uz+p4R6CJITYV9NGGMubg5iX8z0S9YtjGcxiGYyqiu3Ih186ArhWRGOQI+jsKEcVlQnk/hjr7F0NuAcxJdr7bUlvy16CTL9Mv+FCWga+auinDM0rfI4WYw8dP4jtQLu4lDOe1GPFUnGIefA1MN2N9ixnvV2tvKTtOBsyUd8YoCBnbCjTxcy8nK1SbyQw9AaWD//yz/ZeX/cUm/Rdxorg4lQkkNcvQHaAQ2OPqfq9DDKN4ESLdfmpJmtYM+U1689pdOlbAAFEDp8h3gK9Up5TvI2bADzg/zsWsAqY/wVQfhxaLytWR1wem4BR3WGWcq+w4tl9DPQ28YKqmAA6mE8nZUI0HwueaQMl4EIuv6kB9Vsk1t3E4UYmR03vja6P43NI/QaX+rzROuENCJE2Pm0pmJrA3SvqbD2XO+VmoDBIpnmxaDjd7VZ8dD+Fi6lQ69gfQ9QuSB563DVwJhXE/xJ/ZZm/j4H0drASFLqzmSV4WgvSiKffd08aZrrDPC9o3v111bVhAjDNhYksUQ8f1/m874kZUWNpx89ydJKRKwdPJmIUVBtExcixCGYFSNjk8VLCZw1MtxUH310DWHUlG4Y40KMc7U1XC1kf8fp3mKSYc1rKHmCE9evuS/u8TqK3bqzru28vcc6TseqIWzSlMEJhxZTgZoIVI4w=",
                perm));

        //https://mineskin.org/850797362
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1NjE5MTE0NDIzNjQsInByb2ZpbGVJZCI6IjkxZmUxOTY4N2M5MDQ2NTZhYTFmYzA1OTg2ZGQzZmU3IiwicHJvZmlsZU5hbWUiOiJoaGphYnJpcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGM1MWFlMjY1OTcyMmM1MGVkNTJiYmVlY2FjZWRlZjk5YjNlYzEzOTRkZDNlODljNjc0ZjM2ZDQ5MjMxMjUyIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "YFaX9IaUBH2dpVQiR+M2WZ1WDCoy+NPpQOApsPa5SRFlliWuEzqaj/Kmslz7TLG3ENvga3wBERaEm1N3bk5TqKVGZ27rTpApOv3oZK3F2cn5k22GseNd2rNYGHiK0HiLRKY+eVtW1XtgeXsd1EuxKUp+bpdKU2R+Zf4epKKPiN7KMveerhKuog/5D5ibqX4hFT76wIN1IzamTB/X+Z7+IA3jm2enR8mmjmNCg6J8Q6FHl/veg2f5WNzn7KQ2Ii7WpK57KJK901YkmIRi/H9R5N7qP8kBrvnTczGMCNv0uQkgl5MaapSXIwNXrzBefVpMmc8vrYMGh6TkQe+Ady+J8gjY/iLVyd4+A3rkgRLOQs4gpQGhbgsvJFSWsshHZlljnt7CiHuGIxTkZhujCq7Ln3bouLBPnI2fAojFveJ891kV0HD8FYs9jGJQAU3MKD1WeCbfRpVgaunpAZzLTLvhUyQlIfsxNYq8JPdxfI75mqqRmKry5VCi5kKZmpjK0W3q/YoEV/alUSsjMwdEmIXQrTgfbKnpf9nkJOJCRgziBYfnWxguzBbW9nNT7pA/tweZY/zJS5oeNyagjXOCFKdfpsyC0BYYe9SY1clAkhgo3lNig3VTx/Ji/EEP2LhdyY1pSBtHBhqMrbJJeynFBpE18X2rOJwcNIsCVzo7H1ZzQy8=",
                perm));


        //https://mineskin.org/267738005
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjgxMjkzODQsInByb2ZpbGVJZCI6IjE5MjUyMWI0ZWZkYjQyNWM4OTMxZjAyYTg0OTZlMTFiIiwicHJvZmlsZU5hbWUiOiJTZXJpYWxpemFibGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhlMGMxMmY2NzUyYTA4YzJiMDY4YWFlOWY3MGI0M2M5NGY1M2NiNjQwM2ZiYTdlOTc5NzA1OGNlOTA4NDE3NzEiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "VzW7Ojh2pJF2x6O98iM3hxd72V2Bxu2J3aBRtReKm/rkrcAnenTBjFAlooQljKjJw5yy3o+TcJM8m0ALlbGcUryxKE1soU7+3ANNaGjlcJm59oHZFFIZHTaFz/ed32LxRqoNZzSQEuvFumph0kcyFh1UGLMhdHnTwe8sOpKWbLuDyd1uw4Gmvsjm75rRZrfZMvEyjH/P72qjiaeNCEljLO/AZ1yhv34j1tJdiaJNZwsJA4cG8aX3MyfhXcCvX4rLE/AiBRM6m45WspPbhvD37cw4qOo3djippso8W6tvPlqAM0k7YdhzQGD7oiQ4djPkNR+lsAr4mRk4g7iunGPQ1KiseIgwJ8zaftAXof9RMep5kiEkOsB16WKo4xEmY1jSsEOkm4uqmaxsIeKj5w4CC6dpzaPTut3WJ7O1cQbiiIiRTobLgjs09b2XSE72h/0+iolPTBui57yc30rqSrYTGfKYJ+SIdJ32SukvE3bmX2xQvkDlJuoulDRcgsUTbK2lH93vwEtv66wgrRzX4qQZIMABkdqLfu51NCfCAeS3wmE9g202POmaZy4+Yhe9hLQO5vZggNJVSRNqq8+8ICR9x8v1AftV+kiV+gx9idUrNGCsT8AIbQUR9HoypwzJDZ9FJQxbVA07tao7KqpkJViYUVbf9/z/+SuaJXABwUKnsbs=",
                perm));

        //https://mineskin.org/1105477785
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjgxNjI0NTMsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWFkOTNjY2IzNTUwM2I1MDlkNjAzMGY0MTk5OWRhMTVhZTE0MmUyYjVmMGUzNDU3ZTU2Yzc2MDViNDBkY2NhNiIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "FgupLW6+23MFKNAGL+VSFzIZvBWeRP1aCoXquSmO8eUjMooqe5k41CT2uk7+d1aLPT5/U9Fj9imAbIkKCfERZLEojf1T0iuDyqAKkhbpANXrGUC0YeNfEAlSRFoGcLRibzcpfK1W196b5rDJfdNTn/GVWnL9mCUNwGEFtplcVbDv0bOwh5s24LUs0PiSCEzXL1UWTsMrpMP8ic/GYf0A/heZKVOb3+V733LnLg1eBGIisDy2nCXEZQJpQ7n0tpC9EQwoPw+EMKLItXNuhL22MdjvWUlGMQ7qc9f/CQ2cKZ4YSU8BokHVCivDnaeUjHmPC3fAg8FYhAbL1nsRM/dlNcI2xXd0yhU44FUsKW9zSJng85GgdBVmiZGsC4+zYmaciRaV4IYBUGCGXBFlOB4KUS95BiIE9zpsDRiDUQGLHvewD7ZimulNHg0/7Ib2lZxkIAvUR2ZMRXRN8roAqUKpzQcFaFJdOmEE7PheCmuv5o8QOgBsJGurS4iOP6nLwWm3kbMQu9cPmnfYmD+oUk4Q8fr5UVo7AJICwCyy52To810lRuv5Sn843ArhWYoaQixalatkmjbtgdgGpeXNxsa6HWgf+KmLtbt8YwFrdUw0ukDyiDd378ouGwyDbRa6hku+oYPk1Qi8U9/j1XCihLMgjNd/bxnIGvT4KYFLh7RCc4w=",
                perm));
        list.forEach(r -> r.setRank(Rank.BARON));

        return list;
    }
}