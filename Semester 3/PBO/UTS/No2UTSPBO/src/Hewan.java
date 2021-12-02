// Hewan Merupakan Class
public class Hewan {
    // Atribut/Field
    String nama;

    // Constructor untuk menentukan nama
    Hewan(String nama) {
        this.nama = nama;
    }

    // Makan merupakan method pada class Hewan
    void memakan(String namaMakanan) {
        System.out.printf("%s Sedang memakan %s\n", this.nama, namaMakanan);
    }
}
