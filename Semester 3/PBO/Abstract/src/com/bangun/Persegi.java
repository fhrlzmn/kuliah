package com.bangun;

public class Persegi extends BangunDatar {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    @Override
    public float hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public float hitungKeliling() {
        return sisi * 4;
    }
}
