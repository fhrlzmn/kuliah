package tugas3;
// Tugas 3 nomor 1

import java.util.Scanner;
import java.util.Arrays;

public class CariElemenDalamLarik {
    static Scanner inp = new Scanner(System.in);
    static void CariElemen(int n) {
        Integer[] a = new Integer[n];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }

        System.out.print("Masukkan Elemen : ");
        int x = inp.nextInt();

        int index = Arrays.asList(a).indexOf(x);

        if (Arrays.asList(a).contains(x)) {
            System.out.printf("Elemen %d ada pada indeks ke-%d\n", x, (index + 1));
        } else {
            System.out.printf("Elemen %d ada pada indeks ke-0\n", x);
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();
        CariElemen(n);
    }
}
