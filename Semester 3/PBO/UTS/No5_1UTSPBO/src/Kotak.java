// Turunan nya menggunakan implements
public class Kotak implements BangunDatar {
    double sisi;

    // Constructor
    Kotak(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    // Mengoverride method yang ada pada BangunDatar.java
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return sisi * 4;
    }
}