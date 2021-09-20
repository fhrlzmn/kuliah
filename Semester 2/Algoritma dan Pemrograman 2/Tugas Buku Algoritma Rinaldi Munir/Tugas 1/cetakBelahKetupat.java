package tugas1;
import java.util.Scanner;

public class cetakBelahKetupat {
    private static void buatBelahKetupat (int lebar) {
        int divLebar = lebar/2;
        
        for (int i = 0; i < divLebar + 1; i++) {
            for (int j = divLebar + 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 0; l <= i - 1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i2 = 0; i2 < divLebar; i2++) {
            for (int j2 = 0; j2 < i2 + 2; j2++) {
                System.out.print(" ");
            }

            for (int k2 = divLebar - 1; k2 > i2; k2--) {
                System.out.print("*");
            }

            for (int l2 = divLebar; l2 > i2; l2--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Program Membuat Belah Ketupat");
        System.out.println("=========================");
        System.out.println("(N sebagai lebar terpanjang)\n");
        
        System.out.print("Masukkan N (bil ganjil) : ");
        int N = inp.nextInt();

        buatBelahKetupat(N);
    }
}
