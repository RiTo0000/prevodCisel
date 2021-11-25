import java.util.Scanner;

public class main {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        RimskeNaArabske rimskeNaArabske;
        ArabskeNaRimske arabskeNaRimske;
        System.out.println("Ak chcete prevod rimskych cisel na arabske stlacte 1");
        System.out.println("Ak chcete prevod arabskych cisel na rimske stlacte 2");
        int volbaPrevodu = sc.nextInt();
        sc.nextLine();
        if (volbaPrevodu == 1) {
            System.out.print("Zadajte rimske cislo na konverziu: ");
            String nacitaneCislo = sc.nextLine();
            rimskeNaArabske = new RimskeNaArabske(nacitaneCislo);
            String cisloNaKontrolu = Integer.toString(rimskeNaArabske.premen());
            arabskeNaRimske = new ArabskeNaRimske(cisloNaKontrolu);
            if (nacitaneCislo.equals(arabskeNaRimske.premen()))
                System.out.println(cisloNaKontrolu);
            else
                System.out.println("Zadali ste zle vstupne cislo");

        }
        else if (volbaPrevodu == 2){
            System.out.print("Zadajte arabske cislo na konverziu: ");
            String nacitaneCislo = sc.nextLine();
            if (Integer.parseInt(nacitaneCislo) < 1 || Integer.parseInt(nacitaneCislo) > 4999)
                System.out.println("Zadali ste cislo mimo rozsahu");
            else {
                arabskeNaRimske = new ArabskeNaRimske(nacitaneCislo);
                System.out.println(arabskeNaRimske.premen());
            }
        }
        else {
            System.out.println("Zadali ste nespravne cislo volby!!!");
        }
    }
}
