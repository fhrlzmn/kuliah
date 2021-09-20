package tugas1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class perputaranJam {
    private static void jamBerputar(String tanggal, String waktu){
        String tglDanWaktu = (tanggal.substring(6, 10) + "-" + tanggal.substring(3, 5) + "-" + tanggal.substring(0, 2) + "T" + waktu);
        
        int detik = 0;

        while (true) {
            System.out.print("\033[H\033[2J"); //Clear screen with ANSI escape mode
            System.out.flush();

            LocalDateTime TglWaktu = LocalDateTime.parse(tglDanWaktu).plusSeconds(detik);
            DateTimeFormatter formatTgl = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy HH:mm:ss");
            
            String TanggalWaktuString = TglWaktu.format(formatTgl);
            String hari = TanggalWaktuString.substring(0, 3);

            switch(hari){
                case "Sun": hari = "Minggu";
                break;
                case "Mon": hari = "Senin";
                break;
                case "Tue": hari = "Selasa";
                break;
                case "Wed": hari = "Rabu";
                break;
                case "Thu": hari = "Kamis";
                break;
                case "Fri": hari = "Jum'at";
                break;
                case "Sat": hari = "Sabtu";
                break;
            }

            System.out.println(hari + TanggalWaktuString.substring(4));
            detik++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        


    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Program Perputaran Waktu");
        System.out.println("=========================\n");

        System.out.println("Masukkan Tanggal (dd-MM-yyyy) : ");
        String inputTanggal = inp.next();
        System.out.println("Masukkan Waktu (HH:MM:ss) :");
        String inputWaktu = inp.next();

        jamBerputar(inputTanggal, inputWaktu);
    }
}
