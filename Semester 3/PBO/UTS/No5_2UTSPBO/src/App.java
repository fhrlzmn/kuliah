public class App {
    public static void main(String[] args) {
        System.out.println("==== Kotak ====");
        Kotak Kotak1 = new Kotak(10);
        System.out.printf("Sisi = %.2f\n", Kotak1.getSisi());
        System.out.printf("Keliling = %.2f\n", Kotak1.hitungKeliling());
        System.out.printf("Luas = %.2f\n", Kotak1.hitungLuas());

        System.out.println("\n==== Lingkaran ====");
        Lingkaran Lingkaran1 = new Lingkaran(20);
        System.out.printf("Jari-jari = %.2f\n", Lingkaran1.getJariJari());
        System.out.printf("Diameter = %.2f\n", Lingkaran1.getDiameter());
        System.out.printf("Keliling = %.2f\n", Lingkaran1.hitungKeliling());
        System.out.printf("Luas = %.2f\n", Lingkaran1.hitungLuas());
    }
}