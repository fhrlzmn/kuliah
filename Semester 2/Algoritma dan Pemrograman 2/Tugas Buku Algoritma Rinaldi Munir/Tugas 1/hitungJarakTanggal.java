package tugas1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class hitungJarakTanggal {
    private static void tentukanJarak (String tanggalAkhir) {
        DateTimeFormatter formatTgl = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate tglAwal = LocalDate.of(1990, 01, 01);
        LocalDate tglAkhir = LocalDate.parse(tanggalAkhir, formatTgl);

        Period jarakTgl = Period.between(tglAwal, tglAkhir);
        
        System.out.printf("Jarak Tanggal = %d Hari, %d Bulan, %d Tahun", jarakTgl.getDays(), jarakTgl.getMonths(), jarakTgl.getYears());
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Program Hitung Jarak Tanggal");
        System.out.println("=============================");
        System.out.println("(dari Tanggal 1/1/1990)\n");

        System.out.println("Input Tanggal Akhir (dd/MM/yyyy)");
        String inputTgl = inp.next();

        tentukanJarak(inputTgl);
    }   
}