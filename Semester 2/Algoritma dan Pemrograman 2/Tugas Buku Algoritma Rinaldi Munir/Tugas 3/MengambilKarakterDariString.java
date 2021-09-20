package tugas3;
// tugas 3 nomor 12

import java.util.Scanner;

public class MengambilKarakterDariString {
    static Scanner inp = new Scanner(System.in);
    static String s = "Universitas";
    static String AmbilKarakter(int mulai, int berapa) {
        int i = mulai - 1;
        int n = i + berapa;
        String output = null;
        
        if (mulai > s.length() || (berapa - 1 > (s.length() - mulai))) {
            output = " ";
        } else {
            output = s.substring(i, n);
        } return output;
    }
    public static void main(String[] args) {
        System.out.println("Mengambil Karakter dari String s");
        System.out.println("String s = " + s);
        
        System.out.print("\nMulai dari karakter ke? : ");
        int mulai = inp.nextInt();
        System.out.print("Berapa Huruf? : ");
        int berapa = inp.nextInt();
        
        String hasil = AmbilKarakter(mulai, berapa);
        System.out.println("\nOutput : " + hasil);
    }
}
