package tugas2;

import java.util.Scanner;

public class hitungJarakTitik {
    static Scanner inp = new Scanner(System.in);

    private static double jarakEuclidean (int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public static void main(String[] args) {
        System.out.println("Program Menghitung Jarak Titik dengan Rumus Euclidean");
        System.out.println("=====================================================");

        System.out.println("Nilai P1 (x, y)");
        System.out.print("Masukkan x = ");
        int x1 = inp.nextInt();
        System.out.print("Masukkan y = ");
        int y1 = inp.nextInt();

        System.out.println("\nNilai P2 (x, y)");
        System.out.print("Masukkan x = ");
        int x2 = inp.nextInt();
        System.out.print("Masukkan y = ");
        int y2 = inp.nextInt();

        double d = jarakEuclidean(x1, x2, y1, y2);
        System.out.println("\nJarak kedua titik tersebut = " + d);
    }
}
