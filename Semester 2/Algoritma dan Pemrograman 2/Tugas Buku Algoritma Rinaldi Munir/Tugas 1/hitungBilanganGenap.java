package tugas1;
import java.util.Scanner;

public class hitungBilanganGenap {
    private static int genap(int hitung){
        int jumlahbilgenap = 0;
        for (int i = 0; i <= hitung; i++) {
            if(i%2 == 0){
                if(i==2){
                    System.out.printf("Bilangan Genap Pertama = %d\n", i);
                }
                jumlahbilgenap = (jumlahbilgenap + 1);
            }
        }
        return jumlahbilgenap;
    }
    public static void main(String[] args) {
        System.out.println("Menghitung Jumlah N Bilangan Genap");
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int N = inp.nextInt();

        int jumlah = genap(N);
        System.out.printf("Jumlah Bilangan Genap = %d", jumlah);
    }
    
    
}
