package tugas1;
import java.util.Scanner;

public class tentukanHariBesok {
    private static String hariBesok(String a){
        String besok;
        
        switch (a.toLowerCase()) {
            case "senin":
                besok = "Selasa";
            break;

            case "selasa":
                besok = "Rabu";
            break;

            case "rabu":
                besok = "Kamis";
            break;

            case "kamis":
                besok = "Jumat";
            break;

            case "jumat":
                besok = "Sabtu";
            break;

            case "sabtu":
                besok = "Minggu";
            break;

            case "minggu":
                besok = "Senin";
            break;

            default:
                besok = "ERROR!";
            break;
            }
        return besok;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Program Menentukan Hari Besok Java");
        System.out.println("==================================\n");
        System.out.print("Masukkan Hari : ");
        String inputHari = inp.next();

        String outputHariBesok = hariBesok(inputHari);
        System.out.printf("Besok adalah Hari %s", outputHariBesok);
    }
}