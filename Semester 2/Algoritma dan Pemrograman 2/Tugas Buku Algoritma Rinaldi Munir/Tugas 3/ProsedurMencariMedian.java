package tugas3;
// tugas 3 nomor 10

import java.util.Arrays;
import java.util.Scanner;


public class ProsedurMencariMedian {
    static Scanner inp = new Scanner(System.in);
    static void CariMedian(int n) {
        Integer[] a = new Integer[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }
        Arrays.sort(a);
        
        System.out.println("\nElemen Array berurutan");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("");
        
        int median = ((n + 1) / 2) - 1;
        
        if (n % 2 == 0) {
            double even = ((float) a[median] + (float) a[median + 1]) / 2;
            System.out.println("\nMedian dari data tersebut adalah " + even);
        } else {
            System.out.println("\nMedian dari data Tersebut adalah " + a[median]);
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();
        CariMedian(n);
    }
}
