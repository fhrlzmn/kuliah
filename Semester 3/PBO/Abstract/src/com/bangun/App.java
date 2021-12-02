package com.bangun;

public class App {
    public static void main(String[] args) {
        System.out.println("==== com.bangun.Persegi ====");
        Persegi P1 = new Persegi(10);
        System.out.printf("Sisi = %d\n", P1.getSisi());
        System.out.printf("Keliling = %.2f\n", P1.hitungKeliling());
        System.out.printf("Luas = %.2f\n", P1.hitungLuas());

        System.out.println("\n==== com.bangun.Persegi Panjang ====");
        PersegiPanjang PPanjang = new PersegiPanjang(13, 7);
        System.out.printf("Panjang = %d\n", PPanjang.getPanjang());
        System.out.printf("Lebar = %d\n", PPanjang.getLebar());
        System.out.printf("Keliling = %.2f\n", PPanjang.hitungKeliling());
        System.out.printf("Luas = %.2f\n", PPanjang.hitungLuas());

        System.out.println("\n==== com.bangun.Segitiga ====");
        System.out.println("==== com.bangun.Segitiga Sama Sisi ====");
        Segitiga SSS = new SegitigaSamaSisi(20, 30);
        System.out.printf("Sisi = %d\n", SSS.getSisi());
        System.out.printf("Tinggi = %d\n", SSS.getTinggi());
        System.out.printf("Keliling = %.2f\n", SSS.hitungKeliling());
        System.out.printf("Luas = %.2f\n", SSS.hitungLuas());

        System.out.println("\n==== com.bangun.Segitiga Sama Kaki ====");
        Segitiga SSK = new SegitigaSamaKaki(20, 15, 30);
        System.out.printf("Sisi = %d\n", SSK.getSisi());
        System.out.printf("Alas = %d\n", SSK.getAlas());
        System.out.printf("Tinggi = %d\n", SSK.getTinggi());
        System.out.printf("Keliling = %.2f\n", SSK.hitungKeliling());
        System.out.printf("Luas = %.2f\n", SSK.hitungLuas());
    }
}
