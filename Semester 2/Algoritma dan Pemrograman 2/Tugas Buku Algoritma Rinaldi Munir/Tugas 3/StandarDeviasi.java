package tugas3;

import java.util.Scanner;
import java.lang.Math;

public class StandarDeviasi {
    static Scanner inp = new Scanner(System.in);
    static double TotalData(double[] x) {
        double hasil = 0;
        for (int i = 0; i < x.length; i++) {
            hasil = hasil + x[i];
        }
        return hasil;
    }
    static double RataRata(double[] x) {
        return TotalData(x)/x.length;
    }
    static double HitungDeviasi(double[] x) {
        double rata = RataRata(x);
        double akar = 0;
        
        for (int i = 0; i < x.length; i++) {
            akar += Math.pow((x[i] - rata), 2);
        }
        
        return Math.sqrt(akar/(x.length));
    }
    
    public static void main(String[] args) {
        System.out.println("Menghitung Standar Deviasi");
        System.out.println("===========================\n");
        System.out.print("Masukkan Jumlah Data : ");
        int n = inp.nextInt();
        
        double[] x = new double[n];
        
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Data ke-%d = ", i);
            x[i] = inp.nextDouble();
        }
        
        System.out.println("\nTotal Data = " + TotalData(x));
        System.out.println("Rata-rata = " + RataRata(x));
        System.out.println("Standar Deviasi = " + HitungDeviasi(x));
    }
}
