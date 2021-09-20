package tugas1;
import java.util.Scanner;

public class simpanUangDiBank {
    private static float hitungbank (float uang, float bunga, float tahun) {
        float F = 0;
        
        for (int j = 1; j <= tahun; j++) {
            F = uang + ((uang * bunga/100) * tahun);
        }

        return F;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Program Simpan Uang di Bank");
        System.out.println("=================================");
        System.out.println("Silahkan Inputkan Nilainya!\n");

        System.out.print("Nilai Uang Awal Tahun : ");
        float A = inp.nextFloat();
        System.out.print("Bunga Pertahun (Persen) : ");
        float i = inp.nextFloat();
        System.out.print("Berapa Tahun : ");
        float n = inp.nextInt();

        float hasil = hitungbank(A, i, n);
        
        System.out.printf("\nJumlah Uang Setelah %.0f Tahun = Rp. %.2f", n, hasil);

    }
}