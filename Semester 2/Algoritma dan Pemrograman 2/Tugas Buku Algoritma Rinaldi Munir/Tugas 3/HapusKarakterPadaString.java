package tugas3;
// tugas 3 nomor 14

import java.util.Scanner;

public class HapusKarakterPadaString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Menghapus karakter 'c' dalam String");
        System.out.print("Masukkan Kalimat : ");
        String s = inp.next();
        
        System.out.println("Output : " + hapusKarakter(s));
    }
    
    static String hapusKarakter(String s) {
        String s2 = s.replaceAll("(?i)c", "");
        return s2;
    }
}
