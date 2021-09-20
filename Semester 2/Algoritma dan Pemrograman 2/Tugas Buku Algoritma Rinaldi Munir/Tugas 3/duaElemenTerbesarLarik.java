package tugas3;
// tugas 3 nomor 3

import java.util.Scanner;
import java.util.Arrays;

public class duaElemenTerbesarLarik {
    static Scanner inp = new Scanner(System.in);
    static void cariElemen(int n) {
        Integer[] a = new Integer[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }
        Arrays.sort(a);
        
        int terbesar = a[n-1];
        int terbesar2 = a[n-2];
        
        System.out.println("Nilai terbesar : " + terbesar);
        System.out.println("Nilai terbsar ke-2 : " + terbesar2);
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();
        cariElemen(n);
    }
}
