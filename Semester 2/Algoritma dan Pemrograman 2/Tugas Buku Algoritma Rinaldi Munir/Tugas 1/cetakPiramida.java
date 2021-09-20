package tugas1;

import java.util.Scanner;

public class cetakPiramida {
    private static void buatPiramida(int tinggi) {
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            
            int j = 0;
            for (j = 1; j < i + 1; j++) {
                if (i + j - 1 > 9) {
                    System.out.print(i + j - 11);
                } else {
                    System.out.print(i + j - 1);
                }
                
            }

            for (int k = i + j - 3; k > i - 1; k--) {
                if (k > 9) {
                    System.out.print(k - 10);
                } else {
                    System.out.print(k);
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Program Membuat Piramida");
        System.out.println("=========================");
        System.out.println("(N sebagai tinggi Piramida)\n");
        
        System.out.print("Masukkan N : ");
        int N = inp.nextInt();

        buatPiramida(N);
    } 
}
