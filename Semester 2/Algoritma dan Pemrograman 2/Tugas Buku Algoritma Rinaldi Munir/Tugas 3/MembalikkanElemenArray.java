package tugas3;
// tugas 3 nomor 6

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class MembalikkanElemenArray {
    static Scanner inp = new Scanner(System.in);
    static void Balikkan(int n) {
        String[] a = new String[n];
        
        System.out.println("Inputkan String!");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = inp.next();
        }
        
        System.out.println("\nSebelum");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        
        List ListOfElements = Arrays.asList(a);
        Collections.reverse(ListOfElements);
        Object[] reversed = ListOfElements.toArray(a);
        
        System.out.println("\n\nSesudah");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + "  ");
        }
        
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int n = inp.nextInt();

        Balikkan(n);
    }
}
