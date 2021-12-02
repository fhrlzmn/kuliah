package com.bangun;

public class PersegiPanjang extends BangunDatar {
    int panjang, lebar;

    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }

    @Override
    public float hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
