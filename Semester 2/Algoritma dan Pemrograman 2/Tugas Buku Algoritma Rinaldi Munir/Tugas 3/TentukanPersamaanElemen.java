package tugas3;
// tugas 3 nomor 11

import java.util.Arrays;
import java.util.Scanner;

public class TentukanPersamaanElemen {
    static Scanner inp = new Scanner(System.in);
    static void Persamaan(int n) {
        Integer[] a = new Integer[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }
        
        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            if (a[0] != a[i]) {
                check = false;
            }
        }
        System.out.println("\nApakah Semua elemen tersebut sama ?");
        System.out.println(check);
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();
        Persamaan(n);
    }
}
