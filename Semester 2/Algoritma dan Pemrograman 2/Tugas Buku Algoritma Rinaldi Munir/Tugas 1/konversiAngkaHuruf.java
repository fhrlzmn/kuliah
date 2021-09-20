package tugas1;
import java.util.Scanner;

public class konversiAngkaHuruf {
    static String[] huruf = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Program Mengubah Angka menjadi Kata");
        System.out.println("===================================");
        System.out.print("Masukkan Angka : ");
        System.out.println(new konversiAngkaHuruf().Konversi(inp.nextLong()));
    }

    public String Konversi(Long angka){
        if (angka < 12)
            return huruf[angka.intValue()];
        if (angka >=12 && angka <= 19)
            return huruf[angka.intValue() % 10] + " Belas";
        if (angka >= 20 && angka <= 99)
            return Konversi(angka / 10) + " Puluh " + huruf[angka.intValue() % 10];
        if (angka >= 100 && angka <= 199)
            return "Seratus " + Konversi(angka % 100);
        if (angka >= 200 && angka <= 999)
            return Konversi(angka / 100) + " Ratus " + Konversi(angka % 100);
        if (angka >= 1000 && angka <= 1999)
            return "Seribu " + Konversi(angka % 1000);
        if (angka >= 2000 && angka <= 999999)
            return Konversi(angka / 1000) + " Ribu " + Konversi(angka % 1000);
        if (angka >= 1000000 && angka <= 999999999)
            return Konversi(angka / 1000000) + " Juta " + Konversi(angka % 1000000);
        if (angka >= 1000000000 && angka <= 999999999999L)
            return Konversi(angka / 1000000000) + " Milyar " + Konversi(angka % 1000000000);
        if (angka >= 1000000000000L && angka <= 999999999999999L)
            return Konversi(angka / 1000000000000L) + " Triliun " + Konversi(angka % 1000000000000L);
        return "";
    }
}