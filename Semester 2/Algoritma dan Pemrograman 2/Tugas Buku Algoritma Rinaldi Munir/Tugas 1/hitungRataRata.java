package tugas1;
import java.util.Scanner;

public class hitungRataRata {
    private static float rerata(int x){
        Scanner inp = new Scanner(System.in);
        int[] data = new int[9999]; 
        int a = 0;
        int b = 0;
        float total = 0;

        do {
            x = inp.nextInt();
            if(x < 9999){
                a = a + 1;
                data[b] = x;
                total = total + data[b];
                b = b + 1;
            }
        } while (x < 9999);

        float hasilrata = total / (float)a;
        return hasilrata;
    }
    public static void main(String[] args) {
        int hitung = 0;
        System.out.println("Menghitung Rata-rata Input Nilai");       
        System.out.println("(Ketik 9999 untuk selesai)");       

        float rata = rerata(hitung);
        System.out.printf("Rata-rata = %.2f", rata);
    }

    
}
