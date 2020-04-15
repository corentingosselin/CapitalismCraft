package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class LegionaireSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();
        String perm = "cc.legionaire";
        String name = "§eLegionaire";

        //https://mineskin.org/543786214
        list.add(new Skin(name, Gender.MALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1NzkyMDUwNzk4MzksInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTQ3NmU3YTEzMTQxODhjOTczNjRkYTQ4YmNhYzkxYzU4NWNjZTA1OTMwMTI4ZTRmZGM1YTlmNTUxZjkyMmY1In19fQ==",
                "n4pOqRnhciynOqmL+EJJIc52JE2IHUjeMDITAuwcvXOz3I+Lwt+sipplRxAJTClK8nraRxsgdY00tbgi8HQa96DR4aUwbG2WyVwIQOah3LinDIgzXDLzLNCmBYiJldKI2rmopXmDCd+afwR8WGEBqM9HDtQiRj+jrtEoKPDwPZM/Lw+zN62REO8mSzQ/L8sp5i/WlMsfGs+nfi1+atKy2bIQK7+Psu1tFixfPik7/6CqpkIG+QZ3TLzTsrDxXO988z8p2+VZvvv+aKUucZLpwFGF3XGp5wIkLdX2tImr+uxwMRbF2PxQRc/GQsi3YTwI+CuN/TrDlOus7ejpIiNm/g2F4soet+2Q0HZ1zADbMEbDpDS4zVOc8nuRXUVt3zlkHm9CfHqYc0GQgZbu/khB3+seVLUawycJjo2zyjq2OlIPbzrQo0kqDhB1S3LevZWmnxePAv5ggll3+80mIoSd/XMcQVxsK4lBes9gFCOwATVonFzCGfFvY1hzhVWRUeb9l7Ma42aOfcC+pDijwH4R7Kc6CHjobokpl5RHvvX3dL8EPz1JS6CgPTQf/SvXh3RFmjcMvwVxNIolXJq+C8ga5OrcNeq1uBTqsfK6mRuN2bBh2zeC6xTdKyh6iI2OtRcwSiK1hpBlkKwYtIdUYlKjdXHpbxwDKFbjksN3Y8hB3os=",
                perm));

        //https://mineskin.org/14959999
        list.add(new Skin(name, Gender.MALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njc3ODM1NzQsInByb2ZpbGVJZCI6Ijc3MjdkMzU2NjlmOTQxNTE4MDIzZDYyYzY4MTc1OTE4IiwicHJvZmlsZU5hbWUiOiJsaWJyYXJ5ZnJlYWsiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RmYmI4YWFkYjE0YmU2ZjRlYzQ4ODUzYjE1OGVhNDNiZmYxNjc3NzZhMzVmYjJjNTFkNjhjMzM3NmQzMDY0ODEiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "NRDLk/9HGNKzK5jYFP3/uN0or1nKcfNc7giJmsWfJ5cDmwRR21OmMymoF5r8OgtICwjT7RaEJPj/AB+7XE6G9+hC5DhtvHbZcl0Z5An94Ma+LSFiktiOuJX+f9PKFFvOsYjtLNeDrSZyK5RT5cc2JVgd5pzVbbMPiRCG1gVrx7Iqp5EJdTmaN3mqNw5LDWjsZlEUtfpMBeXiYDCjPtao63rPWRXTgy/4bTdkzuJi9KOWs3VtpLoqmk3OiY3AnenMydum4sd5MttReMvJv4k+3NOzxXwft9Q31kNwZjIyICx/N0JtF5sh5LmS63SDuHjbMlsjj1g9G8tGQOGZt0HeHUP8Ibae1PNr5jW0CK4zTtne8L6FFUYPMlH/TUsxJaILLzPxdr8nzLAe914OPgNaoLcEIPw35UZBAUO6xKJvLOHnASBff1n+DUWFOo3bqWYdSthBnmYB3A8+5iJ4Xi91hvsTSkxA/JBMjGd21Mqt49zRzsKhADCDHwe+9Yng+q/aHPWUmTFXIHV5vNtC8ED2pQgSrLWz0GqcOcB4vEiNwXmHJ+JEZw0ijl7sFPsEM8OtKkVdZdhG+OxFrSoU5N6kz2dTjg4xGgc3L36iOaEv3ltCvGzGzReCoi4iVVP1Des0VBfUmumvzDdTZxoC2Y1Aaaon1XGzCkArt/BeXmIvSIs=",
                perm));

        //https://mineskin.org/134070688
        list.add(new Skin(name, Gender.MALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njc4NTkwNjEsInByb2ZpbGVJZCI6ImRlNTcxYTEwMmNiODQ4ODA4ZmU3YzlmNDQ5NmVjZGFkIiwicHJvZmlsZU5hbWUiOiJNSEZfTWluZXNraW4iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JjY2E5YWUwNmNjMmM2NTcwMWI5YzgzYzFiOTRmODUwYjk1YzIxYjQ1NzMzNmY3NWRjNDc4NDRjODg4YWU0MTQiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "WijOmT8dN0gRrmrEH+L6K/fvah1ixpC8NVTbzOFvPKLKNpsoYMCugq5i/fqV066TEMrmlY6bMxgEVHxruZbAdzVa1e1NaCo94yDLSi+NOU6ALsEPBlRTjDIMR24eA1W1XxBM17aO6bHQ79N40KhSF/gLgRfVGZWyjjBqSDTMl6tgMcWQP0t2VWbJb15tXOhxAdNtTQ+c4erR+Zdlh+2j8TuMS1LZ0C0nSQbXxNPfaM4Zwc5jwd6ctvALNRdRDHqymco+0A5U502MNNk5J308sRzugV8DDVYWk+BbUSqyVp3TvD5U4lVt5bcEn+3itUtsrEonJ+GnuUu6ug0fEbrB7/BjVJeYsMmJBFOT0RQBRgRnqHuI2kgb2auTu1xEnSri8ECGCqtIXVmqoC78Oaz88IT1kqhMwmnzbT5OMZZx+3mkbySH32AqnhG9LZqtTcx+4wONTrpcHLpvwY0HkXDq26it5b9B8Z35QXWVwwdhtzbJ8O85iMiSsQmA/DEvR6FWkthA33hcQ/EW9SMWVg1yzqmWlNT6wIJUM4cc5AcwF84U4esfYAxm4nFV1QdRL25sHDrZoF5e6uiq6ec1MH2LyGyBUXOou23mZnfuoOBvSuO9jZS9C7W7tWoqV0/5wAcQRduG7wh0gbozeMqwr5oHocBr7CxRn1kssmN2nQOU9vc=",
                perm));

        //women
        // https://mineskin.org/2029078515
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjgwNjkzMDIsInByb2ZpbGVJZCI6ImUzYjQ0NWM4NDdmNTQ4ZmI4YzhmYTNmMWY3ZWZiYThlIiwicHJvZmlsZU5hbWUiOiJNaW5pRGlnZ2VyVGVzdCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzUwZjMyOWRkMTZiY2UwOTZjNDEyNDkyMDkwMTE2YTVkYWQ1MzljODkzYzYzYjE5MzUxODFjNWE2YjYwNmMxZSJ9fX0=",
                "uYE5QE/3tBADud3fUngRRZk3RZvQ5+3gZA4LJtP+GCrJBx0P/gKeTD1sntcoaAota3ObiWiipD2NNJi/QVyEcfZ8zsuEsERz9QLzzyg8uu6t3adS0kRMCi3/u9XSWsi6G4H5Q4VGPcmfPUiPGVlfw7tAkgTTXIe04lU81/XILRSvxVkXAdmRPdJaPws+CZlgjU0IKah5RuYJGA5TymtcLWMYxHoZ58WU/ms+4olDT06yU0TglWxIkUFxH+tWveG7qSuK4O3kA9CgkEp4Zpwm5gHiBQI+3HT3lGej2xDvs2HgRrkjWg06rOuZEAEckgVzV6ZyCosPzK2G/gN4gHQfb9zMWa5i7KnEFuM+pVNYbJo9JuxYGLuEcca4Zv9Dy2630/JYvOcfxAy5xP5WD5cunVQB4NztPuabTG/DbgJDxcItHZ0eMClGutakHy+wVV+C5y58wYDsP7rwHQhFeqXupExzQoOAXGRI6/aNe2rFw705XGuWK7Xrv3LKuhfejHAAxNHpSyca9mOuBMGKZRz6bDu+cEQ4ZceKxc9S7dVep8bLbZ+tttNmoSh2Bk5aBJIxyqpvFhwWQgZiBjE+iyyWqZiN2vv1MkQvL+QZZGI2MCuPz+u8AWUI2qhqJRJDs4X7o5VY2aG2lD4C4y5TWJ4dzDGk7CFIgjtMcXyaLYnZD5M=",
                perm));

        //https://mineskin.org/2042914976
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.UNIQUE,
                "eyJ0aW1lc3RhbXAiOjE1NjY0MjgxODI5MjEsInByb2ZpbGVJZCI6IjkwMmY3YzRhYmM3YTQwODk4OWFhMzgyYzNiYTIxZjcyIiwicHJvZmlsZU5hbWUiOiJLVFhmb3JnZW9tYW0iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2QzYWRhZDI1MzY5NjhhMWJhZTU2ZjM3NzgyMTFmMGNhZjYzODQzYzNlZTRhN2Y0ZWI1M2RjNzUyYzEzMWE3YTIiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "QKAbPdMTgzONJIzq0G/qKvhotfnC+2rTnmzjF09ayda6sNNxD5R6CcYoVqfEy55RxUrLWXtNbjGvDke/NvNT1RTrIyLiKVysHEzVpDMbthTn9PqrSzRN3xY6YCHTwkKcxZDMwoAvGeRhOGdsneLEtoj29n8WkU84dC9jKnsPnwuJ4t1/M+uEilUwd+CI0kWp93wLY+6WAltqE5DSmaiUG/t+HlUJz3G4wZdNgWpMbsJ6Y/qIfGxDJH0ddU2YVBmrotDiBnDWSDpb4J1s4YwbdpqXy+6Nka8Zs8Lryk81B/o6tyIYc8x6efUO9jtqBwz0sxEpl817IQxPSqfH9NQuFJD02BQYEkPS8RtmmdO0XUwY9Fb+IjHFiuH7U0LUG6L+1Ide0uI5gC/Kb8safsy74mXrKIsx3B98RqTm2wPNTA4cBg6YYpKHAAGDcIOD7AXsE++2RYM9mr2qzWATr9L4a0anXxGrMpsqGYT6ztjlBbW0jtq4R9eSygKaj0FUIJ6pcVUSIEYyo4eHWjLZFh+8mirh4hKW4j0pbIH+A7Rvde/f63Jwd16bfSK9aMXdUMjskc+q8RMI/IFGeDSuZCbVAHlsTbrptOQms7cFAJL75Oqk6aE2ZZBGLwuFVsqzFwENzfS7nQ2g9t80oDmtfHvp7lPhsVbVCXj5UEXUzt1sbeU=",
                perm));


        //https://mineskin.org/1380656144
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.TREASURE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjgxOTA4NzcsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGbGF3Q3JhQm90Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xN2Y1ZDMwY2EzMjk2ZWYxZDQ1OGViOGFiZmM2MGJlODkyZjM2YmRmYmQzNzU3MDdkMDZmNjU2NDgzMWFjMzk5IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "o4vGY9o7litOUdT2nV4WMPkV7bqg7y7No7/N4X0JiI+iR/55A7HlbJnHWveVFI2gTQlJ96H4VzfdDdCCSgIjAMBDcQvBmc6So8ENJ55TyeXfMES9iH0A523UGoAz5yQm503EXDdmqBFZiyPN/Kni/7OSAHE0m5VXn6Bbk6fv9Yfho6PA612gBhW6gfATFDl3PBaah71AVppMwgAfmjxaaynQYpEnGYiWOPSTMHEiiFfuZTELMSSXxXk0SUcLClLLPctdzVEkEDLS/Ek95Hf9JIdo6VAwM9OCdkaL8ROkC0wpXzTxTPgXaJb3a/42DoIAkBwqp3sVJVxmPYTCIQDQyezdpuUL/WvAda4DPbWBA+nbhvcR9SzcKTYw4Rrr4gzP8iYMh21brFaMnkN3U+PaHLzO7paOyetBzCgL/YtzTUptr0rOOi4sJWgO4slj4AhRoTHNFMR1uIVF9lx5vfTEOIBX1WGq7Orj5YhOPgKTUrc9EfJ1A2ATRmq6luOIEG75QCR8HhHN/iBqWdotFevEy9wSLJ0OqlbGRm6CRBJu1wD4Jk4l+6zEXbh8MbpCz0gyQEasF1Tq7KDmt4qIt5IABfRdvKC43Wfp9gWRvksPxeL86Q3J7EcrrgzUn2VS3mivR9lSC5tED9DQgb/voXBCqZ/pglBLqeQ8u5i6ONXfbuI=",
                perm));
        return null;
    }
}
