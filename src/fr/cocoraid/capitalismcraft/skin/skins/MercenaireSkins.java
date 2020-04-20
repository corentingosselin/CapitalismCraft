package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class MercenaireSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {

        List<Skin> list = new ArrayList<>();

        String name = "§aMercenaire";
        String perm = "cc.mercenaire";


        //https://mineskin.org/1539385710
        list.add(new Skin(name, Gender.MALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1NjYyOTQ5OTcxNDcsInByb2ZpbGVJZCI6IjVkZTZlMTg0YWY4ZDQ5OGFiYmRlMDU1ZTUwNjUzMzE2IiwicHJvZmlsZU5hbWUiOiJBc3Nhc2luSmlhbmVyMjUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFhZGFkYjIzOGQzYzFhYzNmNzg3ZDkwYTJiZTQ0M2E4NmYwYjcyNDgyYjA1ZjUxMjRiZTBjYTBiNjAyYjM5MWMifX19",
                "O4r2My3ael6ZPo/cI7y9DdtKh+gXvVdBq1DfLf+OA1jlc+EHc2SO/h1CWdQJDxP7Q4dMXH5L0RLK0Ho+PvEf2tnnri2+zaxwTbcbUX3z56+Y2eUx910jA25PnWH5OzIHo5dLuHub7Ymvlq0st0XGmEZogStao4fitNGxsdG8q7OMW2xHxhC9wpslAQ/ZvR17CYccCiF+m0j0lAOM+kB/Drlc63sYoUXiEMt+DiwpIroYRk5P+oRDILTLTHQT4/vd52MSaUKTLlv09x39+q87mUvnah1XW1+e1MMIvc3C839K+bv3hRjVhijLjanwi4cjNGD+eCbxryqMuITL6sUsp3nv7A0WGlBF9up2AoaQ7vnvKVVHkOOriPNeBq9oVhPUr7+oGuSWaFEpiL95oJAwo7fD+jXMSgC2BY7Uw+tkbGXl2khdfxPEe1o68SM0420WRs7DNuqZGHDysDiEQNf1p+BuaOaJVyGS5JjuAGdytbVlsghrvQ9rmtKtp/BfIZrpqZ43tHJJo+drvOnQwzkRUUJ63K/PC64GU8OfRvICWSKe3qScW6O4pxMXArHfpCgygHeucC0WYhUNAqBcrm6x3iAp6bJSmo8illGWr9Ijiz+ixw6B/I0InIXgt4N8fkfBSctAuInE9pxogriOzMK4VbsJuKYhE7BDrwkeTLT2W4I=",
                perm));


        //https://mineskin.org/2105273442
        list.add(new Skin(name, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NzE5MjcwNDczMzksInByb2ZpbGVJZCI6ImU5MjNiYTVkNzQ3YzQ2ZjQ4MTc1Y2Q3YjBlZmMwMzBhIiwicHJvZmlsZU5hbWUiOiJTYXN1a2VkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85NzYzNzYzMGVmNTBmYzQxMjliOTZhYjZhODMwMDJiMTMyMjM2YmQ4MWM3OWZjNDI1NWI0ZTE4ZjU3MDZlMGNiIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "r/e+EUrJ9EBQijL5i825Z9Al0VanOMAg08xHk5DwK2ZPvCW/5cJjgsD0DhXoTzQRcgCE446bZm71GdnKBK41C1cLXjDla1Ru38nQvqSE49Aoy3P2I5t9Spmtz2xZ4ro7y4eI4dW5Af0MM4ATUUq/4+f40WRrgQqFBX+SlRCBF0vT4uTezvj/J/Asdx0JWkh0Kdyqc2tmQ4Ul8DeINMlY9ohPMoBdIUsluktR9VBULcwBXNrgxu/Co6eRUUjrrxYuVQMnzAvA3mbEDTeqyzmAGIiYoYaHMKcOn0GJdYVW7swha04sEwtbfBsGosSP5PyV6qwDrFSlm4u7ADYmCdKh3YCT/xYbBQ1ixOCCg+vluN71KYZzwDAOzadMzX5DUfqr4qyA5AOqvmE4VymgbwHEhbLjQUrTZr4/xQ5GhhGqQleeIYCt1ft9iTWs/r8wgfPh3c0VLW033YUNxKnRDwzhGSQp0y3OTXgDZcxohyyfKk+LcAVHqlTDarcRZvJd85dstkqGaUxrmEqvkEvZ8WDzZMkPzFoTiXtOG7FrYoNO9t/KZ/nxcyzLx2pKgOmCIUmt5Z9jZUvIxVkM19t1/3gAAQ3M+sp8B6nhwwdI8qPvfIoYoO+3T/TImxPPFZTtWJFrPZdCaXGtTR3ghJxbN/ZN8Z0AuA9F260cEccP4wDg1lo=",
                perm));


        //https://mineskin.org/1951180291
        list.add(new Skin(name, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NzE1ODA5MjA1ODYsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDljMzYxM2FlMjQxZTYxMjkwYzJlNDczODdkYjgwZGIwMGY2MGZjYTE1NWU0ZDU1ZTA3MWRkNzE3ZGVhODlkYiJ9fX0=",
                "NUfGW12Rl3lA9z+5Y6BWM4MPUWYQkmEjuXxfH/XA06PGGRP7lKJ51d1l35JB7cXXK1a64H5ldVrZyzpbq9wlFxumsmgvqU1RkaGVJ66bun8tETOJLgxkmpVesZoEnTyBPtz3Ji+U71Md/1tVgmATZ4F5N7mbe888qRWLwH6suGs+BtflDSJt3X1d+pYrQBuqvZbNgo95Ii8kYYQX3rIeNeFVojtF3yT+cSMIkC904x7HY/1aNcWLFnQi/yfgWTIZ8KBq+t1E7LfpCPeXjnSS7PWk3DNXOOrznTrUsGai8gT7Eiib3pqaj835MBzVZO9yuOyLvrUcNKyLxHpGW0mjhegyIjSQ8KznnZXD6sdLeW7lMxXRZ5Zx/NIMnGKRfc7+5cUSM4TAERzf7uUA567aXLPILJSpmc2I32JIEmiV7dalT7GjA0EmOcbicTtazffz4ddL3+w6jFp5QuRhAeudEi2TlQJ2ctSfWJoKal8hI6OUFq9rpGmRdv8WFD3jvPmv0Hoe/roGwu7JU6ev6uecE3JqgdSW0jnXfdVFycfPzi8pbrTZV1Y7Py57F/v78NoyPUmXq4q85SzOIc/6exKq/MPTj8/M6rK1qIpUkxA3oH4P8G6yjFPQNUrtymidXrn4y7zgUZ5821cXhaUCHuPi0En6HC1iYca1SnNa8nLqXJA=",
                perm));


        //https://mineskin.org/1916638437
        list.add(new Skin(name, Gender.MALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1NzI3MDExNDAwODgsInByb2ZpbGVJZCI6ImZkNjBmMzZmNTg2MTRmMTJiM2NkNDdjMmQ4NTUyOTlhIiwicHJvZmlsZU5hbWUiOiJSZWFkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMjYxMGY2MWJjODZhZWU0NzVlOTc5ZTJhZWMwYjE0NDIyZDEzODU1MWIwNWJmYTY3NjViODRlMjRlODFmNWFiIn19fQ==",
                "axqrw3rgLx9abQH99h8apavkuxfNZPAbBqfPHqXlhQqb6Ol3JiQy7NDXfrWPjQNWPtCd7y6e5wL6M26f8lsN08chZBddL9RuGKuVf255EljyYeGlzSQszPnX3n8zqmyva9++IYg9rwBys0vBXPditZqUT46TomFrNlEh3lheZGBx45JD7IQ3FYTcQmjHu8mRhMAHetoUjWU/9+ptP08dSPWcMZ+W3E2XD5PbMH9dKfnNp8F0YmOAT95TeOW8fiY3FBO7WPN3D6dPz4TAgaZ29X9nRZsBsjiARp5eMLLtRxCrkSHoQwxU3rmSKz0cKgada8hs4S3v/aOWhdLxvRnP8Vft0nAxdMIAl5n7LamUCUaX/3cZvY60zczs8DD9/gvcHQXds7+rKhNRs2l5JDTJ/Cbst0pCpTfeSMDcUkY510pQFiSIulOz2YHgctG0/e3ni6UV07+mhRt3yc0jvBm8ygwlkGC1ks1zrlhRNURgjCLuiIcDlTnXFrIrFjxQ+LzD0krAPsmXrsmne2W8Gq01AJUJMTZP5tQb0P3To3uJ/eJR8GyfPOOIs7EA9fCNWyPuFNp1Fw4CX+NQp+hEOunp9zB1oK2fS70WMtDI4K1YUqRFBOqBpntVgVkPYbrZBPHIiZ+1GZfqKVfzKPNvzd3YNs450V29mlBjqmuX5VNQQAo=",
                perm));

        //https://mineskin.org/495470195
        list.add(new Skin(name , Gender.MALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjUzMzgxNjgsInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGUzZWM3ZDgyOTJmYmM3ZjM1YmU2MjUyNTRlNzA4MDBhMDk4MjEwNTJhY2YwMmY3NzYzMjhiZGFiODQwNGZjIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "WhRpa/mOLWgc1QKUs6BDsMKBV1JxJdoETxdqPxNU7tLYL6e5ZtLuYOY4tPGCHtB62JaYMr5ripFp43Vb2zU6gqahfG9cqbZeVXdNpC1Qo9KqCNkED8+q08m6ZUE5AuwTCOyAA5ujtVg/eauLWVQWV+RnZ1kHsW7OGvWSc7MV+LyUYHRET6qxgWucoa9PKC3m8lLG71OPXkCXPek2tttVrMMf0IMdmWKe1AECGPEX3sLYji8ZB1dUN1AimD2XFcSNSnBAj1t+igq8PZ1gp9u9jOxdBOj4XZfgNAo5jRUaPLtg64E/p2OU913fZ0O8s/E7zI/FqRiRohKF09nj9rbAA+geswypybwABWqMscaGPhjha2fMqVPiT3dbqWI141WW6epdJF7HsxRSvwk+vQRVE/u/4CeIbcmLKagmT3y4lq49e/9KdsxyHvGTEwlRqNmCtCazfJtafKzi8cllbCFiMWBG46CiN4SZaMcLXQ2L0+3UV7OWcS0bdKer1pJtKAsP5mkGOFzonSBdL1QeIrleCJ7/AoXggpKYTCQKRIO+3ft8HVqowEN7ZBcntupPmQBQFsvgffz8Z3cGfqEs5av+u2bqm5BDYdjbIKbq9Y0WytvGxTei1cVd82x+K5eq+339pZ2/tIA46T3oli5zpdD6ttWbp5cL33xlZ/LcSDds/pY=",
                perm));


        //https://mineskin.org/634778006
        list.add(new Skin(name, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njg5NjcxNzksInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjVlZWViODg4NzA3NzU5NzgyOGFmOTIyNDg2Y2IzMjQwZTlhZDY4ZTI4OGI0ZDUxZGQ4OWU1OGJjMjM5MjU5NCIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "qE0PnNSl85VIMR6jZm1vnvT03hKtSdCV+TmfTllD3Pgq2mjpsg7RYsXbVjaAKONpMG3J+ghpJfl6fj+DRStn1t4Ilqz6oC+fVbjie0ru0PTQ0L8hHqW/cO/coIUwg12mfgOSVG/jClmnzuMVuJHjILwKMPw9NhWpIyaLcE0bZW29AG66sXw/iVq52k6SGp1xiXhOdOiVh5zx3nBFmsz8bQ8yHGfr3bkScSOebEIti0W/sSEldspCXvGSw2jWTGiYKUr7Sna8iUbuNzMQDGoGtrp1rBTLCafSr+rn73XAEBgk8sQPx0t14axBN7hMHRVGz6YG0kdAozr3zhBxgpF0jnq2r9Q/tfm6lyDyc4KLUiYDKZJ2egS+h0ONbIjTpZPTJqsi7ewFV5+NQwQhBpHvwfomV744jYcubou8IxC2xIcPNRVc4+vNe3BKPQl3KvmDmCPYIASyA9hsFXM11dDD2i18EJJ4xNPrBIpDQrcrvQXt8TsZVHv9Mlllsj+emaxeti1PePkArV6na5CIxBikPpGKP+AX0cYar+lfRURzzAaiGFL/2/+O20S7s87efbWymWXq9VGKKm/09M9hnP2Yv5bYFZB6iCLNx1GIbPYJkZWU3DFSDAkhgDcD9gFw4/Iqzc6Cp76XxQST4ODLYkiwlrE3U6gSccN3L9MtC1RHEL8=",
                perm));

        //https://mineskin.org/279405105
        list.add(new Skin(name, Gender.MALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1Nzk0MjA2MTE2MjcsInByb2ZpbGVJZCI6ImUzYjQ0NWM4NDdmNTQ4ZmI4YzhmYTNmMWY3ZWZiYThlIiwicHJvZmlsZU5hbWUiOiJNaW5pRGlnZ2VyVGVzdCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQ5NzMwMDcyYjk5MTJlZGVjMjBmYzZlOGZlMWI5NWRlZjI2ZWRjY2RjZTdmZDAzNzk4NTE1OGFkNzQ3NGYzZSJ9fX0=",
                "KiGg6FXHR03xC0fwZ6KibulOJgVSMyR3IDKf/9xL6MvuYZVMWFMCib5XDI5UxzMPfBBYbcNxtzebnVsKSQOYUfHC/hI//eKYeYWAo4A3CJhbk46pTbr/+3oSX0hI+3QOTUMMb9i9/iL+DGzqtDzEIg5QfxvOB5kcyMbpO+RxYlOdvEn8jUZysRpFCQBAZnONXP1g1dnO/IPXqLlUAE8smLIM4o9ZjpKNePp1EmccDLl8QSpBCeeyP8lOJVz8B8jaHBYkTAgHfQOJkl/lupQBJcVZ2Yle8fO3t+yjmA4JcBvP2vXSldVwG2d8g21DiKcuUwId1TVRR3IEwKNF9byU2nqHxdzcphmCscxFl29A9WOFunn6XLDyyyaUaSYZ7tARJHn+Rz3ztRE7y0JKHvzKTzRdkrMmYAjFKAW3t2CM6mkHVgO30SS6yTzOmptHjl3aXW3rR5aD6jd+2gQQ1FlCd8awywlJXteOqfSyGJTAca9PrVIWn1VYwP9gmpNB2MGUJ8yP6DMQb2WGWUEZ/f2cXVx8eZraB7yfh+Okwuwj3YE05vmiB0TFXs27Bk18jPlLFHAh731CzXLG1FOtjZVsrIJuSdrLCb4E5EMnUFIGVZGVNj422IImvnFEgGZp5JLcroQtBEGF4hlilZ8K+Ct33A9haPe69+kr/72n+nIdsRc=",
                perm));

        //women


        //https://mineskin.org/595010716
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjU2MDg1ODMsInByb2ZpbGVJZCI6IjgyYzYwNmM1YzY1MjRiNzk4YjkxYTEyZDNhNjE2OTc3IiwicHJvZmlsZU5hbWUiOiJOb3ROb3RvcmlvdXNOZW1vIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kZGNmNWVlNzgyOGQxOTVkMGMwNGY5N2Y0MGM4NDc5OGU2ZGE2MGI0MmQ1M2FlZGY2YjhiMGY1Yzk5ZjcyZjU2IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "iXYfkQ+FlLPmWAdCuY8eU6KYoQqFXtnrBuJJVpVB+kAWWv6m5RgXar6IGgIPDtl+3bG6Hy1r7f1xZdWe3yzF76/TPoNfokXqc+Lbq7r040BcGo03HAw7P2B27Z+fTVfGC15iq/T+qvRUSXp7rkCrzeRXSZ5ZVBieOllV9Cqi5m9x94AkhSO8fFjbg6x26hyD/IRaED1jKqBmlV/XxbL32z7f0qnXulwM3hhz/Xu8omiLPguQ7soOSTA2Jqs70pX0TfdESRRtm/DDzGJQVRKhXVsXux47Yepk+tCnGHjDUjLk2RYh8rIdfZ3shBfiCPJ17KJPqQ8SkLdZpYa2WIkQ+LJb6u9O4khkYRzkSpffiSwXDwKCRN85hIUiSY73imzrbcPlKRa9VJlpIiYwKv5RolFiNy8hq+UwncRJqPOIz39lCQ4vGK+cUORhT4utRj//+6zWBj9Vmkn5EUBxqlsM72q2dRtnjGSltYVdRJfKr0OhFIL8xnYn5FwyJ/LELAmAIC/cQv5k+D/5WQIqEFj5T6nEdtWOtcJ0XiFhMLA0uvhOhKNmylv4ySOTibr95oNdUdeEJzSXdAzJTOis3to0xgB4UagILn2yoe0TG6AUZ1ULhY4DzCkEux22ko3tRF80vIKbklKkSxnEx4awexyZ01pqhM+zg9t12vKRRSi/D4A=",
                perm));

        //https://mineskin.org/1553612249
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1NzU1MTI1MjAyNzAsInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mYzgzZTI4MTcwN2QxMzNlN2ZiZWRlMmMxNTNhNWZkOGJhMTcwZTY2MDljYzUyMmM5ZmEyN2Y2OTliYzY2MDRiIn19fQ",
                "yia04l5qkWXHCCRXVfMGQTpELIqQYW57sHZasXLlp0rp8LrtWZF8LUIDfrDhhok59PVYcmuXcALmI0XCU8B24kblMy+UqZuwbda7aC5M6OBCWyArRNVr04Da+d2qYP1lKSe/9qkFz/NOH6t573QcSbmNBDpdIsh9arCkYYjpSHgRZzRtvJwhrbaGdPaRB6IIS2DjU14ZvhVCd2or67o7i/l+XDmyM9DqplTvaeaQYbjSjrjs427D3bQdb3Mp9UV7usvj6rHekCykjWpQGcdRRLUk0REQ1jYdK2Y39oHWVUFtE4mZnDm4rtYoTwh446YSk7pmxGC0k9OnmQl7VGYQ2d+Q6VZm+5/4CKMHdRF2RviZnwWEtT8ZV7Fpa3YjdTS5XqQ72UwRZMRi+V+yZoO+wMZBO2sdtg/B8NTsRZoqL1hkpthyyB9t7icXsNjy6dixpEJfWPpxd53CT/p44WtDDbNnVnCLX71S/9jpcSu0R9TvDAo+WEChpGXVG6/QTtnOGWRri3xYoqG5k8uOBpG7SuvRt8qcWv6leqKRVgBVbYMxMB2eulIPzsWxZe91nC+WuJ1ZvJm9TPQ90POfqVrY6TBxUQroT+LFrHuCTREK+2t1WyGSbJpU/O2QbbOm3quIBu2iI9KhUBSR8cim+WDoX63Ou84AyqskvabHEpyqwr8=",
                perm));

        //https://mineskin.org/1660222215
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjU2NzY5NTcsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGbGF3Q3JhQm90Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zNDU0NGJjOTg3NWY2N2NmMDEzNWQzZjkyYjQ2YjE0M2E1ZDQzMjg4ZDYzMGMwY2U5NmVkOGQ3ODQ3ZmQwNjMyIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "gJE+U33kEA3dV9wo4BbQbw35Y7zXAfpVVd+nDJBiD+/6JRVeXtuGKRcoTephDWcHgHRjgFDY06Uln33MjYrsopRq+s4J1LqsT34qdMrzzhU57CIyJF/NsjpAyOsWUOQAoNGvgxB/T7Z4z6yh/EoETWPfdYqgK3EbBA1P+dSGHf1PCW0Eqf5YPQ1lK86rKLWP33q2Uz8MEJoFcWydklNKNr2aL2SXCYvQvEAGYMWhB9Q0F3IPLKYIpWrmZFirMu8+wMyK/pL7X9xsmGozKGMFizoLTlAGQR+fDIBdpqQYNnLT5SxU/DiFMdhuR8Oo3p11WJziF9X7tk+/kiGcmgDmo08/pCjxptULBI9iK5D+WgBhigXUrF7MjbKZZi26yAh12GEVqIKhUSHwQIxJQqLU4h78iIlR0P8SZv8Oi5Qs1Ne9gNStdIyD/VJdXNooyCNt1zvJLHWLB7bSd02HsoyjD34d0TqkqyAggiVFr8CyNBsBPY4/CviY7R7UN/KbuuV83RYfQwp+RmdwvUo4DRgTv3441gBG/HZOn3Cn5Q5/MvFOxn1OIMh9eMEulPKS+UDR3cBqKoMnNvBQR/Aco9gEyxAS2AenYP+U+UB80/aDGTL7Jrl1EIlXVyUz/HqH0EIlsovVkMxXXm0lgxoYM7DcVyvf8nUHbQZQA9HmCVTR4Tg=",
                perm));


        //https://mineskin.org/593293705
        list.add(new Skin(name, Gender.FEMALE,SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1NzE0NzQ4OTE1MjYsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U5NTEyODhmM2VlZWVhZGFhODY3ODg2YWVlY2ViMTEyZGViMTRjZjM1MTgyZjVjM2VhODU4YWZlOGFjOWUwMGEiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "ryVzK3NBypVY8Xdp9sYcFN/wsHXV1rtZ/UlVrXkk0NlEqOCuS9bGgnVCa/9Sm5oREUmwFp+1qcALURsYleaYA5J4hDymIIK7GETcUaN+tnuM+KxE5eISuPJbGCW0Wjp5rvWnnO1yWhh1Kfg5mB2Bh+Wxpu2xIVYnH2vFEpGcEhtvKUr4TL5Tq7xpuL6RsGHoigd3Vh203WaJshvaBMlmzdzxUxizsb6J7xjrXCbK3TK5FITUTKbHzA/LOQEDbRmGyBnaKltOYnrvcyZx7Hp9xnWdUrH7BQnI/+3Szxmm0qBYzCTS05ZcD202SIpoGQW96/l0Esije8jPAmiXajbBC2jiuHAN5dw5WfjqZLSRbEc6apWa6eXQ65oorGIoIwW+5yqB+qxIy03PWjAyEtPW+zlZLzfsZMHfvv1nD9nJMHePHSjb2U5cpyYO5CsdxDGY8cvg14jcdjNQPj2QY352xR3V9ChHK+5eMb0dFpATmOVdiHy23h33pMQVAuonI5I27fXWXrrWOgNhl6Chysl8EZr/hR6PLXsu928V9zJx3QLZ2lEQEhhHl+i8sbLJiogoiir/rWMBOKBjTLfMuRQms5oDRA6wwiNeKC5rwTb3NGRnCdgCLfTQPppYLFXd8PdQMcmGCh04LtNLdUFVyoHuttZd3yIqaykLDuA5pzVMm4w=",
                perm));
        list.forEach(r -> r.setRank(Rank.MERCENAIRE));

        return list;
    }
}
