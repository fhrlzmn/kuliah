package tugas3;
// tugas 3 nomor 5

import java.util.Arrays;
import java.util.Scanner;

public class TukarDuaArrays {
    static Scanner inp = new Scanner(System.in);
    static void Tukar(int n) {
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        Integer[] swap = new Integer[n];
        
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i < b.length; i++) {
            System.out.printf("b[%d] = ", i);
            b[i] = inp.nextInt();
        }
        
        System.out.println("\nSebelum\n=================");
        System.out.println("Array A");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "  ");
        
        System.out.println("\nArray B");
        for (int i = 0; i < n; i++)
            System.out.print(b[i] + "  ");

        System.out.println("\n\nSesudah\n=================");
        for (int i = 0; i < n; i++) {
            swap[i] = a[i];
            a[i] = b[i];
            b[i] = swap[i];
        }
        
        System.out.println("Array A");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + "  ");
        
        System.out.println("\nArray B");
        for (int i = 0; i < n; i++)
            System.out.print(b[i] + "  ");
        
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.print("Jumlah Elemen Array A dan B : ");
        int n = inp.nextInt();

        Tukar(n);
        
    }
}
