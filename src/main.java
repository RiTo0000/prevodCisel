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
            System.out.print("Zadajte cislo na konverziu: ");
            String nacitaneCislo = sc.nextLine();
            rimskeNaArabske = new RimskeNaArabske(nacitaneCislo);
            rimskeNaArabske.premen();
        }
        else {
            arabskeNaRimske = new ArabskeNaRimske();
        }
    }
}
