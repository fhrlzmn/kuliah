package tugas3;
// tugas 3 nomor 4

import java.util.Arrays;
import java.util.Scanner;

public class ElemenTerkecil {
    static Scanner inp = new Scanner(System.in);
    static void CariElemenTerkecil(int n) {
        Integer[] a = new Integer[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }
        Arrays.sort(a);
        
        System.out.println("Elemen terkecil adalah " + a[0]);
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();
        CariElemenTerkecil(n);
    }
}
