package tugas3;
// tugas 3 nomor 9

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ProsedurElemenLebihKecil {
    static Scanner inp = new Scanner(System.in);
    static void ElemenLebihKecil (int n) {
        Integer[] a = new Integer[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }
        
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("\nElemen Array Berurutan (besar-kecil)");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        
        int jumlah = 0;
        int lebih = 0;
        
        System.out.println("\n\nElemen yang lebih kecil dari jumlah sebelumnya");
        for (int i = 0; i < a.length - 1; i++) {
            jumlah = jumlah + a[i];
            lebih = lebih + 1;
            if (a[lebih] < jumlah){
                System.out.println("Elemen " + lebih + " = " + a[lebih] );
                System.out.println("Jumlah sebelumnya = " + jumlah);
                System.out.println("");
            }
        }
    }   
    public static void main(String[] args) {     
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();
        ElemenLebihKecil(n);        
    }
}
