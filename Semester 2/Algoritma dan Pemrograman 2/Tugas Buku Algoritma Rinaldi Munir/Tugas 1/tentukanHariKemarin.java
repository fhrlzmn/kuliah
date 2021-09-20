package tugas1;
import java.util.Scanner;

public class tentukanHariKemarin {
    private static String hariKemarin(String a){
        String kemarin;
        
        switch (a.toLowerCase()) {
            case "senin":
                kemarin = "Minggu";
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

            case "minggu":
                kemarin = "Sabtu";
            break;

            default:
                kemarin = "ERROR!";
            break;
            }
        return kemarin;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Program Menentukan Hari Kemarin Java");
        System.out.println("==================================\n");
        System.out.print("Masukkan Hari : ");
        String inputHari = inp.next();

        String outputHariKemarin = hariKemarin(inputHari);
        System.out.printf("Kemarin adalah Hari %s", outputHariKemarin);
    }
}