// Class Mahasiswa turunan dari Orang
public class Mahasiswa extends Orang {
    String nim;

    // Jika di Parent atau Super ada constructor
    // Maka di Child harus ada constructor juga
    Mahasiswa(String nama, int umur, char jenisKelamin) {
        // dalam constructor Child hanya perlu memanggil constructor Parent
        // dengan menggunakan keyword super();
        super(nama, umur, jenisKelamin);
    }

    // Untuk menambah parameter baru di Constructor (Overloading)
    // Tinggal menambah parameter
    Mahasiswa(String nama, int umur, char jenisKelamin, String nim) {
        super(nama, umur, jenisKelamin); // panggil terlebih dahulu constructor parent
        this.nim = nim; // kemudian tambahkan
    }

    // Method Overriding
    // Method ini akan menimpa method kenalan yang ada di parent
    // dalam kasus ini Saya menambahkan status
    @Override
    void kenalan() {
        super.kenalan(); // panggil method sebelumnya, karena saya masih membutuhkan output di parent
        System.out.printf("NIM : %s\n", this.nim);
        System.out.println("Saya Adalah Seorang Mahasiswa"); // tambah print status
    }

    // untuk menggunakan method dari child
    // suatu object harus bertipe class dari objectnya.
    void kuliah() {
        System.out.printf("%s Sedang Kuliah\n", this.nama);
    }

    void organisasi() {
        System.out.printf("%s Mengikuti Organisasi\n", this.nama);
    }
}
