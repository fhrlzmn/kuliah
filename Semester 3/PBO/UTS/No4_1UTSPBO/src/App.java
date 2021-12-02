public class App {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Ujang");
        manusia1.setUsia(19);

        // Mengambil sebuah Attribut pada Object manusia1
        System.out.printf("Nama = %s\n", manusia1.getNama());
        System.out.printf("Usia = %d\n", manusia1.getUsia());
    }
}
