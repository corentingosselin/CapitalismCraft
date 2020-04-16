package fr.cocoraid.capitalismcraft.skin.skins;

import fr.cocoraid.capitalismcraft.ranks.Rank;
import fr.cocoraid.capitalismcraft.skin.Gender;
import fr.cocoraid.capitalismcraft.skin.Skin;
import fr.cocoraid.capitalismcraft.skin.SkinRarity;
import fr.cocoraid.capitalismcraft.skin.loader.SkinLoader;

import java.util.ArrayList;
import java.util.List;

public class MarshalSkins implements SkinLoader {

    @Override
    public List<Skin> loadSkins() {
        List<Skin> list = new ArrayList<>();
        String perm = "cc.marshal";
        String name = "§6Marshal";



        //https://mineskin.org/1341413644
        list.add(new Skin(name, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1NzA2NjkxNDcwMDIsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mYTcyMGFkOWE2YmUxYjNiM2Q4ZjRlYTA3ZDlmOWQ3NjBiMjRiYjVhNjI4Mzg2NTU0MzVjNWI2ODRmOGFkOWUzIn19fQ==",
                "X5dPDzOJmsg4IadSsb33RzJY65Vpx04rimPQoxpDv1fNFZBgtdecjb41AbcFJUEg3CuYpSNhXYw/y+tIkTOCk+kaB1oJ1RRQnhrO8/b/EyBjcCI/b0d6VriW4G/yBMUYrOOgIMCMQZrR+wznCkUGGuhSj1CSF9VmOtJshAsk7B44Zclu/qVsysUy6ldLE8Cy7IKN8Gv4wWWUHJE5cG+VCsuVRHJDxX/Vu9VcBzkXY4KrYMpeLbvEv+rKm59IWWTWsZVCc2EV74Fk6EHJpEsQZcXkqqaZnhwELfqefoGkewz1HFpKaomrrjM4/N+25tvN/KUqHzvTDwyMxB4G/1L2b/WOxwMH2Tk6irhnn+yVn1pLUWBAYmZtEBXupc3bHdRovMbUZZ13GA+2ySp4sk7Zdf2tl/+UVXw0XvDv068paOrcApBNCf3B0xrGNtGwxlttg6/DNcrVLu7YbDg6yngUKpCVz4VOSY2FlFRGB21DgZYlEkESRsU/MwTQPZz63Z7yEyJoAQoz8C/DiI3sR3wAlzqycaEG+vPDRcNA2BZAB9uxJEFXzajUMRmk/HiUd07/uKSCx8cPW6sklX+IvkSyUFrXP2j8PWEp4URZkHD11dHrk3nLW8XbtEF17D+Kauqb99gkBI1ohu8CT+tIduTRffpByGVwaLKQ3pGdwQwBm1s=",
                perm));

        //https://mineskin.org/1389513822
        list.add(new Skin(name, Gender.MALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjkwNTIxNzQsInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zYTk5YjM2ZDFhMDQ1ZjQ1NWI1NjgwMzAxNjljMTU4Mjk3OGZhMWRhZWY3OGUzOTA2M2Q2YmEzZjk0MmY0YjljIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "kRA6v3QNxsf/a6albfqJGFlnLSmNNbGUsduGyyY6D9GDTtECjhZ03ooVaMndpBhh7lqBsdHmgsi7nhzo9bUA2KDRli3HJlTE2ebEaVb6jfGzLJB/Ch+WDYodKdKpCIrtyInmWUCAkB2ioPAOCkMo7pTElWfuhvKQJggD+n1H0ADL89NKSb8OtHiMIEe9e/C7QNlKWs/kmKQApvjRkNod9DQuN4TzIQ/4UJUAAeTdEiOuo/ETubANVUZOJxucQGdrkFfmqT1KRB3ghyN07tF3iOIsd6+Fr8jxpaLze/kODgmlPcoG6MWmFDrA0I8JSlNTMdDopsl5zUpTHnSjr5XOvYmCb4ODW1jSAnOSGu/meImu6sHFbJDlNtIxmgrprWO+ADREZxapBW/QywZXJKizb9STw7TjY8naY2h7mG8yD4u1w3MbeJokCZgOZG+uWSIYjvwgCXIT093r0JXlTS28uS0SBkqe43tVLU/Hd61sizvJ97rHmG2YmqkwHfdWyCtmQfADs6FZVRcwOoFWrercvNYAiJC0PsU3U1nUSgOh8irkxEDZR0br3TBe/+H4CE2KC5Q91c38+XBPX1Q12Z4jy87rx2FPlBn6Oyc+yjNUrSZjCA+Ue67zByw/ZOxSS9A27AqAQkQpcuiuz1Bhmtt9ACMr2yvr1IxGZoBSF+3YRIE=",
                perm));

        //https://mineskin.org/1024417043
        list.add(new Skin(name, Gender.MALE, SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjkwODcxMjEsInByb2ZpbGVJZCI6ImQ2MGYzNDczNmExMjQ3YTI5YjgyY2M3MTViMDA0OGRiIiwicHJvZmlsZU5hbWUiOiJCSl9EYW5pZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEzYzM3YjdlOTUwOGU2ODIzNzdiMDNhNWJlNDIzMjQ1YWQwNzUyYzU4ZTYyOWZmZDQyMTNhZjY0ZTdjZTdhYTkiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "CK0AHr2uCKzwFZl/KI2mli4MW5GjDp2BYVhWCJaC4Llzuak+IUbg4wiTdbCQ+PuxnzqVGplJAp3jq4F5NSf3M/xKy2FjrcbjCPNUidmed4dsGnaHRNuTSom+HRujG0272jV/4yMghN4oD4IzVEd8Vmrg74kRrA7wtkMqS/ddXBRbGmoEEvIPWc3/SXX9FDt0XvE73UbtQ+nu+qhEg2WS6nC75jeif7OqLvvtnbXbpBB0QZtqtUBlBdjl4c+IYYICjPzecQ6bsGahmYRcc/TdyCh+Y+189su7zpEjdOGp39INad2gCRwwFm4IwfD9/EOsJdUzDLVnTcmOoFLJ/2zhAdz6Whov2D+MrSKp/LfmVyQ6N3QsnAvuF7212TOHXTBDXVGWEcYl8RVr6RfXlbLmlUGVLRRWL3ofUQxL+iW6D47jEX3CD/MYel0do11VB9ToMlJz67F0l7Ji5z5V98wIcYOu0zni4ixAhfB8C5HsyWbzmUYQRveNTIeR+2ZsTbkLppLzWSYFBsy5bDZo3VwZq+vEF8ulCRCjhDne2hcayjBusMV2Or9NOfn/d5VdyScbcRPenvbT+iezh4dy8XEd6t2XQ4PngvH76IJ+4ohIVv/ReDcxT6trl/ZN8QyykB0fYX9wGa6CWOjqNy/hvK2vJOs16WdJZuUDKh4KDF285+c=",
                perm));

        //https://mineskin.org/718519273
        list.add(new Skin(name, Gender.MALE, SkinRarity.MEDIUM,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjkxMTg4ODIsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbl9vcmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y3ODc5MmQ1OTM1ZDZkZmU1ZmYwZGFjYTgwMjNiOWU3NzQxM2U4YjA1ZGQwODFjZGU1YTc2MGUzNjUxNzcxMjQiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "m2Henm8YJ5XGSLQ+bzWcxT5KsMFiUWp7hg8No5x5apWazCP1wanyYkCWGgVq/jBSGtPc5WgeNpuDPBfk4gasN3s+M8QZ+ySEk4g6YmUngxnT0Xb8jMOmxUfoNIWtu+6eQ2UEKoavzDSZK6SODwALTA0wZAYpnDN+3y0pIqE5Qx6dDIRG6J8RRQXNYnIdmxg58klmib6lb+V+uwSlct8hB0ppL4Ch0H8wUDYZHe98XF5vNpWUE1qvjNBTqvmh6SsR5tq22HhDFrf6ImslH15zHzZgEbyMa6/duoRIRlLW9v9+BAzcDS+9P3dkuF/TSlVZEVxpSF5mPZ0H7gziGf/Co42YgarvL2IkeqFyw2E+LoNgGbiLSd+5eqQ4UeAu8BkH3hV/2p4kBlgdJtZuxjsla/ApUP5JO36hs4bvDqt8csIzX4hn/y097FlKmPIN+75Xj2ZEDZcY18m+gC527vtBu844ynSi/VF62m9ANjzYw8U7v53Ym2g7fYybWcQHORxzVYaWCwAxZZchwJLAlyJ+/mtsHueexGxqbjpMfIDGCuXTnyumhGgoV6HCI3RNxtYJ9Pv7hbOnGmiOvixD9MiVhW0lKGlixvP4Dxi1JgmTl5Tgzu+tqvhhHIFCpDKm3lgQ/kG0DqVYnHClU/LYIkqj0iD23mCyXuRDCjG3jx1gkJo=",
                perm));

        //https://mineskin.org/1330012347
        list.add(new Skin(name, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODE3MDYzMDU5ODYsInByb2ZpbGVJZCI6IjE5MjUyMWI0ZWZkYjQyNWM4OTMxZjAyYTg0OTZlMTFiIiwicHJvZmlsZU5hbWUiOiJTZXJpYWxpemFibGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E4YzU2NjA3Y2EyNDE4NzY1NjIzMzg4ZWI3MjY1ZDQ2Mzk4MGVkYTBjMTNlMzUyZmVhZjJjYmNhNTQ5MTIwZGEifX19",
                "Mi5w2q4w6kE1VLY1EPH7NcbwsM2ZHDWtdD3K2/VIPzpUkRiPrGVkd76rkV/wTBi21zmfgGFGdfcNs5H6C3VGQeKd9cqi0V7EmCCAeZ92spqvb3FiPGKoAOBmdmZS5+iEOjAo7LdAo9ShlsuxS9VUlnqUNCjdiaQuTJ0vT99q9gmz0wCH7QceWZmRCboyJVTWqcbOVIMGaPaGwtONKVLHN0oFnEZLQRAlDscP7qiri4kEyIVBgR+CbTjKXpfcU4m+ZLvpSIIP92eZQRGjGG9aKhJZ/2MxFTjWz0+dDMCluVG67bvi/0P2ZbfMJhueCyfSfKZfxzIUUXc8clN8eJ+dIgDT9XZ3C/PKFVnzxZSADi70d6E5X0nitEhx/VuZuIgqgnFogdem0mHy4jqYIGL3OIky8V1EMuHEe5/5A51TO6MzD3TaAk/ewGY3zGYX4n0VC4OuCWzfHH99Tv5Rsl0aZGc9c9qTO48UaJ0/kI/pKS7iMyPcR4e61uPBViy1Z9Z/DfPiJZ/aDVQumWuN+BauHO45v3IpQQvrNrsCFWGzB6uuJ86wYup2a9UFXTPIBktroV5NhgoIKv7pmjJRPKrdgWP8GPXS3KkjY5KX7a5NwNh6Cg1K5PFEySLLi9fKnAV2B069+WleLWtep8vq0fl5ngHtPVrx3K5/WjiINrXMYPo=",
                perm));


        //https://mineskin.org/763420654
        list.add(new Skin(name, Gender.MALE, SkinRarity.COMMON,
                "eyJ0aW1lc3RhbXAiOjE1NzY0NjUyNTU2NTUsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hNTViOGE3NDg1NmJmODYzZGI2MWVhOTliMDZiNjU0ZDZmM2Y2NTVhNjk4MTVjNzk5ODdiZjFiNDZmMTY1MzZlIn19fQ==",
                "hQkH2pYKh/L5foxDC2a69WRmFed9AOaeBquneA50pHIpcEr6/cQhmInmlsD/SiANG27FvIkZuhinMNtJrEAIc+0f5pFVePDWG00o4M0i8nmXNEtx4JYjWRfGknYUptGgbgpBZEKmf7U3Ir9SiL3I6wkneNQ77VQCoY+IfjiOx67dWKT47oI++ideMUXNo53HJ+Ghz/CrZAxIpnzu+yKu626jQu8I+ZB/W2ihULpHmOQvDgAJAswRkQ07XEIAKS7KtYTaClw45WbHPTTVKPGBB2qKuomW/EpSbeECa0lMLKHRJzmt/AWDDHOKJfC9mKq/F3mSao2vENXfLEj01/Evz4/yAXZAXigCZcDoOPYiApNxRoUhSt50/3cPR2pASx1Qin5QXqzmiCV27FOZ/l7WtTn/NRFeZ4j0RRXKBpR/LwBwma4WCcTi1iV2L2okaRt52UIC4X72ekKOoMLSqZiR2TWKFWDxYIrYFL5QZpguba6FTKP/XUFpGgOSOM1mDfcHD6QKENELlnysj0Ad6OI21sQcQLbaQeKWX5j3H+GiXPZuSeJZByg9Vpz5KaberBnY58nnYx6kLetLRUfqL3UjvDIciIJyhrgAuwqeWDvp2Y+n9ePyuHiHxYPPyfeaBmA74yGmFU5oNzGoO6pb7em+QZ1uFACNX1aYUlbWQF4BcnI=",
                perm));


        //https://mineskin.org/485043401
        list.add(new Skin(name, Gender.MALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODI4OTkwOTEzOTgsInByb2ZpbGVJZCI6Ijc3MjdkMzU2NjlmOTQxNTE4MDIzZDYyYzY4MTc1OTE4IiwicHJvZmlsZU5hbWUiOiJsaWJyYXJ5ZnJlYWsiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc4Y2IxOGZhNzIxNTE0M2E0ZGQ2YTU4YjJhNzU0ODY0MDUwNjA2MzA5MDM4NGEwN2JiM2ZmZmVhYWRhYjVlZmIifX19",
                "BFxM3uF94kfobuSOms5+G6RkuKoHW+rhzLKsw7U6U9rfGHLa+f4+lPSBT6GVibF2LIoki1xpihBuBN/Kmy3a68edPZnNaB7FX4ry/DPqyjoyzu/epQ2IGr9eMYhn12S837IMA+xFDiX3E8oPRebEvgHtw5w0HxqotICE07WbAtbBIXXlSRjLrCltOlPeDymhPknwH0qCV8jR9KggRoMFSDlgW8i4OBKzCgpugfoGsvkpCCJnIHc4STlhlKUV58/XTreGNTNEMfRoMLsa/m+GZB2wTHEUDJo4YeAIDVf4tId840tRwkDa+Kky6YF3hKzuh+IK/LUFqGrWKkSK2ZPMOyB+1erFzfOTvQ6LL4ck8oDVwzbfSZdxHDINaE6FWBT2+w7yovZAR6NFtuX6zEbAy5BSyfK5Q+94Qzl+OKjL7SVLgOSw0tSjZRJ3g13aZ8AX1Gp2kZBJPipiUWL2Sfdv+uvG14cNmOKwueoMbZNjtckmQqDwmikMbOI4Y8m33m0FQjJwvvPLCSe+kxuUgoxKS4Go/btcMDqjh1dMMS4bwYvqga7MLHdyjhrPKlI1Xz3UFLtiZxAndhAoBpI9FB33Sy4Iz60DThhejeLGu2X+7FDa3OBZXsHfyJaQNhN4zEBhxGGcy5X//HqdOvL/odeV+E69ZsGrsUEcbJSrngq1Ek4=",
                perm));

        //https://mineskin.org/336316305
        list.add(new Skin(name, Gender.MALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODY4Njk4MTUyNDMsInByb2ZpbGVJZCI6Ijc1MTQ0NDgxOTFlNjQ1NDY4Yzk3MzlhNmUzOTU3YmViIiwicHJvZmlsZU5hbWUiOiJUaGFua3NNb2phbmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM5MjJkMzVhOWUzNTcwZWM4YWVkYjhmMWM5ODA0M2RkNWRiNGYwNTFkY2M5NGYzNjY2MjVjY2MxYWFiMDc1NTMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==",
                "rBfwdhHsz7zlks0McZwPM1J04SJMCax7ZbnuadVKfVLsGBuwqz0oz3VcnVKSxjU7mMVxrIUwG9mhQVfhK6gBlS9Zw8xWfri79pPmmA0Ea46G17mCngvdKeP7KasMdY8j/gvWBZRgHppW4lDB3ZTY8CgxkQy/MEvDqIoVAEBhS+RuOeqSXLzxsIBVE2ZAZ+R8vMYeO4CedvZQlZlJrRJjp24T5ruqaZNzbciqB0FnpNw8I1hqarHczofk9IZ2CzzoUAIE7BMjrJyy1DukivpPxvggjO6fCpSn6q6piUX+lOQKCaUtA8yU3J2s4A/mqcOUtbvdhBLY4tF6xn5HM17BEU1KyLHdflZ15iWEf+K06njMk+qnxmJ5f2RvUcVQGSHmWeals1MNVsJqmcm9jGix6+gyiVodxoFeY6go2eV54paSpK50jqxtmhlTk7oxkJIj/ZsPvyc8R9B7qhhodbtTyZPqWk34jL3vdQPewJ+YXcMUz3M0Jpjx2za9p4cEg65lzpQ8zruNsIAzuC0STFTWHuGzMlfHLGSgdy54DxtLhNg6ayS305Wm7e86fP6v3/pSCQmXcWt+Lry/bzAOCznIwmElmmxL4SGRZ8mJSnPn7xZGd6f+VJhMVmk4GCmJodH9AKP8vfb+2DegJP+tTIXIvdiyKUEqlYLEDmlkYvg3DDk=",
                perm));

        //female

        //https://mineskin.org/2139029932
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.RARE,
                "",
                "",
                perm));


        //https://mineskin.org/155384098
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1ODE3ODc2NDA3OTQsInByb2ZpbGVJZCI6ImU3OTNiMmNhN2EyZjQxMjZhMDk4MDkyZDdjOTk0MTdiIiwicHJvZmlsZU5hbWUiOiJUaGVfSG9zdGVyX01hbiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWM4ZjNkMzFlNGU2NGY4NTY1YTI5OGYyYzMxN2JjYjI3MWE3NmJjN2ViMzRiNTI2ODhjZDQwY2UzODcwMWFkNSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "INBPdelHWaUWBgG195ge7hnZofGogSNEPTkWHLLXoFvzqNDghPo3IqZ5A+SkSS3yrmakchL5PBdwDYszG8s8tkfqMJnAvQpUm0/3tXHzY5WdF+XdkltgdDOoEmGxxSJHov9fJ6lJB3G6N+NdQsuX/p05o5UQoIFadCEua6GfU7GfLX1WEvo6uko0RxXJfKRrXZhasdTIfChToAGe9HYiGDYSslXUegZ9ZcXJ8JYrK4nJA2p7l5sNVTvi6xmXmLRVDVDVz6L3XXg+hL8IDJBiop3B1j591vq/SC6HFjdLeYq72sCa+9SJlxckLZmL4nfGG/uZnYmFRLVqjdya3DUYsEVt2jHgGSwHLD15FHQckfLTAQZysPcxG/BsL5+WmGc3rLosz7TwM+ulY3vcvTqoBXqmcs4zknF9JOC4slK7tEq0DlzKfQ2dzyZaUeuU7+DYW5+OmsOizaSJDzYUfCuE0Jufxmw2WJKZOEgEzjP4XMdC4mEoCC5I15lQH8fN/rx2Xx3kt9AyNPQ6CFtdk9KlZFBWMJqDLkhTbWKUJs0MBAp7iqGqVd5CAv+OYoFgSf1ZfmmJWHNdC6B6abQpdoqV7NHDPalVOXJuAfblqR8YipPSimvQ+OxkxYdUei5iUZE5FI3OfZEAuWQbsyNfqlFtFdfagtUiVmRmvqeAmBTXGX4=",
                perm));

        //https://mineskin.org/1390343842
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.EXTRA,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjkzMzMxODQsInByb2ZpbGVJZCI6IjczODJkZGZiZTQ4NTQ1NWM4MjVmOTAwZjg4ZmQzMmY4IiwicHJvZmlsZU5hbWUiOiJZYU9PUCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDllYzEyODYwYjIxYTRjMTg3ZDI0ODExM2I3OTMxYTUwYzkwMmRkNjQ4MTEzNjI1M2U0ZmZhYmNjODViZDhkYyIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "Jl100d2HE0CwdmAlABqXpHe71IvrVgy7wQQXWMl++6sCG99FLhQgQubE4LRxWR9VrJesCfENhDXwalm7yj67k+qeKemh+IcmvZouBWTUDP5VOTWIKlC/HhmZ0OWOPJXd1botcPppRKNMuWaw1uctXR1ReY9xc4pZm3YplFExWQGtcGF1QN0GanoUGEi98wH0i4RK798W+no3mqz8fyh/Duz9xsW3gT1TyR3DTm7El+uE7SM6JxxxH0OGM/1MfQSVfisWV8SC3IJp4QrsRG81cKrxjKn3py9d44uHDcRzf1mYFgAgoxCd4XetlqecO7pSnu/wyc0UaMhDQJrwOm9jKDOFt1k5m1Haw5mM7TAxZomjfE2P6vARP541EvbTPtzYsJ+cg0ofLTO7c6W9OAmK9H8WBbLMbmt7/NkOzLasoVIpHXck83SB9LkTYAJ//CWse6k+jKr5U170oYOB9kQnAty2FVMNXJCIela32jCRcIeyjtDJgnksLSGu4+pPH3JTFYR74o0zMkktyAP/EN+cSxn3niKYiu6kgPOS0QQK4GbS+Klc9lDfpXCIaU9Lm5wsBptiCE+CsywNqE1qwilL+ehW2Yi94QE7cKxb3wWn6hC4GWLd7+4UbCAFdjw6F9P7TM4GD/lQeWiLKdZzf64Ki2Jl6FaXuVelZSJwsXj2hmg=",
                perm));


        //https://mineskin.org/632041962
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.NORMAL,
                "eyJ0aW1lc3RhbXAiOjE1ODY4NjkzNTg2NjUsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTZlYzJhZmRmNWNhYzg2ZmQzNWEwMmMyNjk3NjY2OTc2ZjIxNDM3ZGVlYzVjM2Y5OWUxMzg1MjVkMjJmY2Q2NCIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19",
                "yi472pUbYHx/6PGZxighIc7kjAZ5+8Rsyd+cCg59qjNUe2Hna1nhxf1dEccOrFGIJEl9aNtaN+NmBvpPixEX3DpjSDB12h6JdOV0sj9pCHTRBvXHGUJfppqQx0EL7JX57j0dEb4LJIpaM5kyuWIb+4Nv14tmHmqHUHXU9fPPf8qsZemEBtD1o5Ul1MHpqU5rFRlEUQjh3q3efmLqMpvtCOX/q9Z3T5cLGJXOzHX9hMpfPO7eWfN+S07NWRjjA7dCifhfHClUdTO+yAP1BYfJbqv4+zyM/+kZ4Bv/eEmSk4aKpCv2tSayj3/StvC4qnXtLBnuwn7/T3kywEROQnpm5PAMEaoQpdYJ/eTXsyTCLLAOasIwWYWFTSFtWMUv3k1RHx6HLNgnO1hNOhx0z++WQfffCC5NIh0lgX45slkrmrWlTzys11/OS3VW8AhAowaH2+pydGsCjgchREJhdqnAJqfqHY4c99dXzcsvl7+IkyVWyHcmkvMrF9tZNhyoNjMVGAP2Uo5PubpnB3UA7964xtVBAKTmTmMshA2cSF6RfE1DiUd+jqqaLj4ghLUV5TrJaGUmzwd30mdK9vRpLQqOEZprcvlnoeM06yUbvIAJ/kjvE7pfqN7/aOoX9W/jYHOrIkoT4hqu8uHOZg90xk8cTOm3Bv+Rq4W+xXQsQitMzy0=",
                perm));

        // https://mineskin.org/239804998
        list.add(new Skin(name, Gender.FEMALE, SkinRarity.RARE,
                "eyJ0aW1lc3RhbXAiOjE1Njc2MjgyNTk1MTMsInByb2ZpbGVJZCI6IjIyZmQ2N2IxN2U2NzQ1ZmI5MmU3NDc3MTIzNDMwNTE4IiwicHJvZmlsZU5hbWUiOiJyYWtldGVuYmVuIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jMmM2OGRhMTIyMzM2ODZiNjJiMTYyN2ZjNzg0YmM5NWNmM2Q1OGRlM2U3Yzg4OTQyMTI0YmVkYTE3MmYwOGI1IiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=",
                "qMUMTISTp/D7RkWDeI0YhOExscXMaXvkuve7QZzNVCQBUmg/NK6Hffc4Vvkw00kHerzQhUql9u6Z132pCiG2prxqyH3aRy7On8Sk4G512JUzAWwpJGiHXAmly5NIB/9odwkqpUTYiuK+mLXc0cilrLnbNxgKidO7vkaDJTL9/i0DJbv1cnO/ek9wpBaAeuPvvpyCNEhkNBvsjTSLkulJ4PSPfdl8k4mJ6VtoNkotxZAwTeXcjIUudx8e82JiNDdVjq7jQJy+b9SbAc9CGRihXzTYzVTgB+RkTSoU6GjIiXIyjUx7rC8s33sH0OfW2z/MEWcX5f+G6LNcgU++mJW/7b/gGzhaR0iE3zNCgfROLEaZIJv98R1NTdQ9G9zTA58QtxRmzYmbr89m/SR4ZjrpHspHcfkkpZ6QXBRD7qUTBprir+xc8AgHfFr2Fu/lsdcciUu14pw9hTa6Ftvy4qJimHsEBrovNjcgQXq1ZyVay5COyG6cR29bb4BnNie33Mno8Rfa0xkWt+xXnLnBhK1GVCawtDLRR41fpudpfLvmBNbmqZf3dpzhnlBTc6RBGdo79MhfKJs1d6NWQOQh8Zbg4K0u+5heAXwcCf3/gpGaob03b4tPE79LscV9KaKo7ScFIzTP9PxMjkWX/UyaXdGXB1rv0HGPn0/2c04SWVXmjjo=",
                perm));


        list.forEach(r -> r.setRank(Rank.MARSHAL));

        return list;

    }
}
