package tugas3;
// tugas 3 nomor 2

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JangkauanLarik {
    static Scanner inp = new Scanner(System.in);
    static void Jangkauan(int n) {
        Integer[] a = new Integer[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }
        
        Arrays.sort(a);
        System.out.println("\nUrutan Larik (kecil-besar)");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }        
        
        int maxValue = a[n-1];
        int minValue = a[0];
        int range = maxValue - minValue;
        
        System.out.println("\n\nJangkauan nilai dalam larik : " + range);
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();
        Jangkauan(n);
    }
}
