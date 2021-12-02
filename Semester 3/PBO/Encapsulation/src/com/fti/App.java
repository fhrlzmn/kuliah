package com.fti;

import com.fti.IF.MahasiswaIF;
import com.fti.SI.MahasiswaSI;

public class App {
    public static void main(String[] args) {
        System.out.println("Mahasiswa FTI");
        System.out.println("===================");

        // Membuat Object
        Mahasiswa fahrul = new MahasiswaIF("Fahrul", "301200020");
        Mahasiswa yanto = new MahasiswaSI("Yanto", "302200023");

        // Set Semester Object
        fahrul.setSemester(3);
        yanto.setSemester(5);

        // Print Data menggunakan Get
        System.out.println("\nMahasiswa 1");
        System.out.printf("Nama     : %s\n", fahrul.getNama());
        System.out.printf("NIM      : %s\n", fahrul.getNim());
        System.out.printf("Jurusan  : %s\n", fahrul.getJurusan());
        System.out.printf("Semester : %d\n", fahrul.getSemester());

        System.out.println("\nMahasiswa 2");
        System.out.printf("Nama     : %s\n", yanto.getNama());
        System.out.printf("NIM      : %s\n", yanto.getNim());
        System.out.printf("Jurusan  : %s\n", yanto.getJurusan());
        System.out.printf("Semester : %d", yanto.getSemester());
    }
}
