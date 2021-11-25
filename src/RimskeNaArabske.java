public class RimskeNaArabske {
    String cisloNaKonverziu;
    String cisloPoKonverzii;


    public RimskeNaArabske(String cisloNaKonverziu) {
        this.cisloNaKonverziu = cisloNaKonverziu;
        this.cisloPoKonverzii = "";

    }

    public void premen() {
        switch (cisloNaKonverziu.length()) {
            case 1:
                jednociferne(1);
                break;
            case 2:
                dvojciferne();
                break;
            case 3:
                trojciferne();
                break;
            case 4:
                stvorciferne();
                break;
        }
    }

    public void jednociferne(int pocetCifier) {
        int cislo = Integer.parseInt(cisloNaKonverziu.substring(pocetCifier - 1));
        System.out.println(cislo);
    }

    public void dvojciferne() {

    }

    public void trojciferne() {

    }

    public void stvorciferne() {

    }
}
