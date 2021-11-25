import java.util.ArrayList;

public class RimskeNaArabske {
    String cisloNaKonverziu;
    String cisloPoKonverzii;
    ArrayList<Integer> cislaZoZnakov;


    public RimskeNaArabske(String cisloNaKonverziu) {
        this.cisloNaKonverziu = cisloNaKonverziu;
        this.cisloPoKonverzii = "";
        this.cislaZoZnakov = new ArrayList<>();

    }

    public int premen() {
        for (int i = 0 ; i < cisloNaKonverziu.length() ; i++) {
            cislaZoZnakov.add(rozpoznajZnak(cisloNaKonverziu.substring(i, i+1)));
        }
        int vysledneCislo = 0;
        for (int j = 0 ; j < cislaZoZnakov.size() - 1 ; j++) {
            if (cislaZoZnakov.get(j) < cislaZoZnakov.get(j + 1)) {
                vysledneCislo = vysledneCislo + (cislaZoZnakov.get(j + 1) - cislaZoZnakov.get(j));
                j++;
                if (cislaZoZnakov.size() - j == 2)
                {
                    vysledneCislo = vysledneCislo + cislaZoZnakov.get(j + 1);
                }
            }
            else {
                vysledneCislo = vysledneCislo + cislaZoZnakov.get(j);
                if (cislaZoZnakov.size() - j == 2)
                {
                    vysledneCislo = vysledneCislo + cislaZoZnakov.get(j + 1);
                }
            }
        }
        return  vysledneCislo;
    }

    public int rozpoznajZnak(String znak) {
        switch (znak) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;
        }
    }
}
