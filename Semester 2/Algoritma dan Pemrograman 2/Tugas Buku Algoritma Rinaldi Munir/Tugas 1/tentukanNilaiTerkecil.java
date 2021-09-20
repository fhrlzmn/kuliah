package tugas1;
import java.util.Scanner;

public class tentukanNilaiTerkecil {
    private static int terkecil(int x){
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
                b = b + 1;
                total = total + data[b];                
            }
        } while (x < 9999);

        int min = data[0];
        for (int i = 0; i < b ; i++) {
            if (min > data[i])
            min = data[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int hitung = 0;
        System.out.println("Menghitung Nilai Terkecil Input Nilai");       
        System.out.println("(Ketik 9999 untuk selesai)");       

        int kecil = terkecil(hitung);
        System.out.printf("Nilai Terkecil = %d", kecil);
    }
}
