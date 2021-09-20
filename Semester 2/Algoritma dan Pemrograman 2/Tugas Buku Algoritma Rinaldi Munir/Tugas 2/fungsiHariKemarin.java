package tugas2;
import java.util.Scanner;

public class fungsiHariKemarin {
    static Scanner inp = new Scanner(System.in);

    private static String lastDay (String hari) {
        String kemarin;
        switch (hari.toLowerCase()) {
            case "senin":
                kemarin = "Ahad";
            break;

            case "selasa":
                kemarin = "Senin";
            break;

            case "rabu":
                kemarin = "Selasa";
            break;

            case "kamis":
                kemarin = "Rabu";
            break;

            case "jumat":
                kemarin = "Kamis";
            break;

            case "sabtu":
                kemarin = "Jumat";
            break;

            case "ahad":
                kemarin = "Sabtu";
            break;

            default:
                kemarin = "ERROR!";
            break;
            }
        return kemarin;
    }
    public static void main(String[] args) {        
        System.out.println("Fungsi Tentukan Hari Kemarin");
        System.out.println("==================================");
        System.out.println("Senin..Ahad\n");
        System.out.print("Masukkan Hari : ");
        String hari = inp.next();

        String outputHariKemarin = lastDay(hari);
        System.out.printf("Kemarin adalah Hari %s", outputHariKemarin);
    }
}
