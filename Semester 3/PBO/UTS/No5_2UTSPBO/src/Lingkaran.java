public class Lingkaran extends BangunDatar {
    double diameter;
    double jariJari;
    final double PHI = 3.14;

    Lingkaran(double diameter) {
        this.diameter = diameter;
        this.jariJari = diameter / 2;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public double hitungLuas() {
        return PHI * (jariJari * jariJari);
    }

    @Override
    public double hitungKeliling() {
        return PHI * diameter;
    }
}
