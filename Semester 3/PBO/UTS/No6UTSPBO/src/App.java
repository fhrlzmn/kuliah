// Mengimport dari Package Java dari JDK
import java.util.Date;

// Mengimport dari Package yang telah kita buat
import kendaraan.Mobil;

public class App {
    // Private hanya dapat diakses dalam satu class
    // tidak bisa dipakai di class lain
    private static String halo = "Halo Semua";

    public static void main(String[] args) {
        // Object Package Java
        Date date = new Date();
        System.out.println(date);

        // Object Mobil dari package kendaraan
        Mobil mobil1 = new Mobil();
        mobil1.cetak();
        // mobil1.setNama("BMW"); // yang ini tidak bisa
        // karena type nya adalah protected
        // sedangkan App.java berbeda package dengan Mobil.java

        System.out.println(halo);
    }
}
