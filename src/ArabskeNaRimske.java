public class ArabskeNaRimske {
    String cisloNaKonverziu;
    String cisloPoKonverzii;


    public ArabskeNaRimske(String cisloNaKonverziu) {
        this.cisloNaKonverziu = cisloNaKonverziu;
        this.cisloPoKonverzii = "";

    }

    public String premen() {
        switch (cisloNaKonverziu.length()) {
            case 1:
                return (jednociferne(1));
            case 2:
                return (dvojciferne(2));
            case 3:
                return (trojciferne(3));
            case 4:
                return (stvorciferne(4));
            default:
                return "Pozor nieco nie je v poriadku!!!";
        }
    }

    public String jednociferne(int pocetCifier) {
        int cislo = Integer.parseInt(cisloNaKonverziu.substring(pocetCifier - 1));
        switch (cislo) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }

    public String dvojciferne(int pocetCifier) {
        int cislo = Integer.parseInt(cisloNaKonverziu.substring(pocetCifier - 2, pocetCifier - 1));
        switch (cislo) {
            case 1:
                return "X" + jednociferne(pocetCifier);
            case 2:
                return "XX" + jednociferne(pocetCifier);
            case 3:
                return "XXX" + jednociferne(pocetCifier);
            case 4:
                return "XL" + jednociferne(pocetCifier);
            case 5:
                return "L" + jednociferne(pocetCifier);
            case 6:
                return "LX" + jednociferne(pocetCifier);
            case 7:
                return "LXX" + jednociferne(pocetCifier);
            case 8:
                return "LXXX" + jednociferne(pocetCifier);
            case 9:
                return "XC" + jednociferne(pocetCifier);
            default:
                return "" + jednociferne(pocetCifier);
        }
    }

    public String trojciferne(int pocetCifier) {
        int cislo = Integer.parseInt(cisloNaKonverziu.substring(pocetCifier - 3, pocetCifier - 2));
        switch (cislo) {
            case 1:
                return "C" + dvojciferne(pocetCifier);
            case 2:
                return "CC" + dvojciferne(pocetCifier);
            case 3:
                return "CCC" + dvojciferne(pocetCifier);
            case 4:
                return "CD" + dvojciferne(pocetCifier);
            case 5:
                return "D" + dvojciferne(pocetCifier);
            case 6:
                return "DC" + dvojciferne(pocetCifier);
            case 7:
                return "DCC" + dvojciferne(pocetCifier);
            case 8:
                return "DCCC" + dvojciferne(pocetCifier);
            case 9:
                return "CM" + dvojciferne(pocetCifier);
            default:
                return "" + dvojciferne(pocetCifier);
        }
    }

    public String stvorciferne(int pocetCifier) {
        int cislo = Integer.parseInt(cisloNaKonverziu.substring(pocetCifier - 4, pocetCifier - 3));
        switch (cislo) {
            case 1:
                return "M" + trojciferne(pocetCifier);
            case 2:
                return "MM" + trojciferne(pocetCifier);
            case 3:
                return "MMM" + trojciferne(pocetCifier);
            case 4:
                return "MMMM" + trojciferne(pocetCifier);
            default:
                return "" + trojciferne(pocetCifier);
        }
    }
}
