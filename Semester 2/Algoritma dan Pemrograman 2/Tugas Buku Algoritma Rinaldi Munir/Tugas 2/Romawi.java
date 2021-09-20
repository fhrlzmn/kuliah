package tugas2;

import java.util.Scanner;

public class Romawi {
    static Scanner inp = new Scanner(System.in);

    private static void intToRoman (int inputInt) {
        int[] angka = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] hurufRomawi = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romawi = new StringBuilder();

        for (int i = 0; i < angka.length; i++) {
            while (inputInt >= angka[i]) {
                inputInt -= angka[i];
                romawi.append(hurufRomawi[i]);
            }
        }

        System.out.println("Huruf Romawi : " + romawi.toString());
        System.out.println("==================================================");

    }
    public static void main(String[] args) {
        System.out.println("Program Konversi Desimal ke Romawi");
        System.out.println("==================================\n");
        System.out.print("Inputkan Angka Desimal : ");
        int inputInt = inp.nextInt();
        intToRoman(inputInt);
    }
}
