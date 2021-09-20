package tugas2;

import java.util.Scanner;

public class fungsiPythagoras {
    static Scanner inp = new Scanner(System.in);

    private static void triplePythagoras (int a, int b, int c) {
        double hasil = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        if (c == hasil) {
            System.out.println("Triple Pythagoras");
        } else {
            System.out.println("Bukan Triple Pythagoras");
        }
    }

    public static void main(String[] args) {
        System.out.println("Program Menentukan Triple Pythagoras");
        System.out.println("=====================================\n");
        System.out.println("Inputkan Nilai !");
        System.out.print("a : ");
        int a = inp.nextInt();
        System.out.print("b : ");
        int b = inp.nextInt();
        System.out.print("c : ");
        int c = inp.nextInt();
        System.out.println();
        triplePythagoras(a, b, c);
    }
}