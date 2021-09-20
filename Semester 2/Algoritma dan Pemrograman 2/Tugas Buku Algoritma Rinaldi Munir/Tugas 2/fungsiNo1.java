package tugas2;

import java.util.Scanner;

public class fungsiNo1 {
    static Scanner inp = new Scanner(System.in);

    private static float abs (float x) {
        if (x < 0){
            x = x * -1;
        }
        return x;
    }

    private static float doubleNilai (float x) {
        x = x * 2;
        return x;
    }

    private static boolean odd (int x) {
        boolean hasil;
        
        if (x%2 == 0){
            hasil = false;
        } else {
            hasil = true;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan nilai x = ");
        float x = inp.nextFloat();
        System.out.println("====================\n");

        System.out.println("Nilai Mutlak x adalah " + abs(x));
        System.out.println("Nilai Double x adalah " + doubleNilai(x));
        System.out.println("X adalah bilangan ganjil : " + odd((int)x));
    }
}