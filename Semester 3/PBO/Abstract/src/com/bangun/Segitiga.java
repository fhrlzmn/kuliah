package com.bangun;

public abstract class Segitiga extends BangunDatar {
    int sisi, alas, tinggi;

    public int getSisi() {
        return sisi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    @Override
    public float hitungLuas() {
        return (float) (0.5 * (alas * tinggi));
    }
}

class SegitigaSamaSisi extends Segitiga {
    SegitigaSamaSisi(int sisi, int tinggi) {
        this.alas = sisi;
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public float hitungKeliling() {
        return sisi * 3;
    }
}

class SegitigaSamaKaki extends Segitiga {
    SegitigaSamaKaki(int sisi, int alas, int tinggi) {
        this.sisi = sisi;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float hitungKeliling() {
        return (2 * sisi) + alas;
    }
}