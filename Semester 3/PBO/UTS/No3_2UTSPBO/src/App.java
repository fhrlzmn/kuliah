public class App {
    public static void main(String[] args) {
        // Membuat Object kotak1
        Kotak kotak1 = new Kotak(20, 30, 12, 15);

        // Print Attribute kotak1
        System.out.println("Kotak 1");
        System.out.println("Lebar = " + kotak1.lebar);
        System.out.println("Tinggi = " + kotak1.tinggi);
        System.out.println("Dalam = " + kotak1.dalam);
        System.out.println("Berat = " + kotak1.berat);
    }
}
