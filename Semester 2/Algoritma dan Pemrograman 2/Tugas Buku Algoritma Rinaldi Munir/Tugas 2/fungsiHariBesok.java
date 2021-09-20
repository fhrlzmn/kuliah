package tugas2;
import java.util.Scanner;

public class fungsiHariBesok {
    static Scanner inp = new Scanner(System.in);

    private static String nextDay (String hari) {
        String besok;
        switch (hari.toLowerCase()) {
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
                besok = "Ahad";
            break;

            case "ahad":
                besok = "Senin";
            break;

            default:
                besok = "ERROR!";
            break;
            }
        return besok;
    }
    public static void main(String[] args) {        
        System.out.println("Fungsi Tentukan Hari Besok");
        System.out.println("==================================");
        System.out.println("Senin..Ahad\n");
        System.out.print("Masukkan Hari : ");
        String hari = inp.next();

        String outputHariBesok = nextDay(hari);
        System.out.printf("Besok adalah Hari %s", outputHariBesok);
    }
}
