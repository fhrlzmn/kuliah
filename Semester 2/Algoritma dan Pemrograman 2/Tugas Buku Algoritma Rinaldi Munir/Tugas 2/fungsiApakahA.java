package tugas2;

import java.util.Scanner;

public class fungsiApakahA {
    static Scanner inp = new Scanner(System.in);

    private static boolean apakah_a (char a) {
        boolean hasil;
        if (a == 'a') {
            hasil = true;
        } else {
            hasil = false;
        }
        return hasil;
    }
    public static void main(String[] args) {
        System.out.println("Jika input bernilai 'a' maka true, jika tidak false");
        System.out.println("===================================================\n");

        System.out.print("Inputkan nilai (char) : ");
        char a = inp.next().charAt(0);
        System.out.println("Hasil : " +apakah_a(a));
    }
}
