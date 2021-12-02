public class Kotak extends BangunDatar {
    double sisi;

    Kotak(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return sisi * 4;
    }
}