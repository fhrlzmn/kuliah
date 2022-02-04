package no3; //<- 1. deklarasi package

import java.util.*; //<- 2. Impor library java Utilities

public class Program1 { //<- 3. Bagian class
    static Scanner inp = new Scanner(System.in);
    // Scanner berasal dari library Utilities
    // untuk input dari Keyboard

    public static void main(String[] args){ //<- 4. Method main
        String nama = "";
        System.out.print("Masukkan Nama :");
        nama = inp.nextLine();
        System.out.println("Halo " + nama + "!");
    }
}