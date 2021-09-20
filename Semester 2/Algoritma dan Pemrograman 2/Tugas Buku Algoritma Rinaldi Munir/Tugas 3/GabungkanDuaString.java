package tugas3;
// tugas 3 nomor 13

import java.util.Scanner;

public class GabungkanDuaString {
    static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;
        concat(s1, s2);
    }
    
    static void concat(String s1, String s2) {
        System.out.println("Menggabungkan dua buah String");
        System.out.print("Masukkan String 1 : ");
        s1 = inp.next();
        System.out.print("Masukkan String 2 : ");
        s2 = inp.next();
        
        System.out.printf("Hasil : %s %s\n", s1, s2);
    }
}
