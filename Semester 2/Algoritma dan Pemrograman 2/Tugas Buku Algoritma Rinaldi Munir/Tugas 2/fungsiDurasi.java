package tugas2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class fungsiDurasi {
    static Scanner inp = new Scanner(System.in);

    private static void durasi (String waktu, String waktu2) {        
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime Waktu = LocalTime.parse(waktu, formatWaktu);
        LocalTime Waktu2 = LocalTime.parse(waktu2, formatWaktu);

        Duration durasi = Duration.between(Waktu, Waktu2);
        
        System.out.printf("Durasi = %02d:%02d:%02d",durasi.toHoursPart(), durasi.toMinutesPart(), durasi.toSecondsPart());
    }
    public static void main(String[] args) {
        System.out.println("Program Menghitung durasi dua buah Waktu");
        System.out.println("========================================\n");
        System.out.print("Input Waktu (HH:mm:ss) : ");
        String waktu = inp.next();
        System.out.print("Input Waktu 2 (HH:mm:ss) : ");
        String waktu2 = inp.next();
        durasi(waktu, waktu2);
    }
}
