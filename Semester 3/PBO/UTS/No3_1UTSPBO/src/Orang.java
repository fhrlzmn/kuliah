public class Orang {
    String nama;
    int umur;
    char jenisKelamin;
    private String email; // private hanya bisa diakses dalam suatu class

    // Constructor
    Orang(String nama, int umur, char jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    // Method
    void kenalan() {
        System.out.printf("Nama : %s\n", this.nama);
        System.out.printf("Umur : %d tahun\n", this.umur);
    }

    void makan() {
        System.out.printf("%s Sedang Makan\n", this.nama);
    }

    void tidur() {
        System.out.printf("%s Sedang Tidur\n", this.nama);
    }

    void mandi() {
        System.out.printf("%s Sedang Mandi\n", this.nama);
    }

    // Getter Setter
    void setEmail(String email) {
        this.email = email;
    }

    // untuk bisa mengakses properti private pada class
    // harus menggunakan method yang mereturn private properti
    String getEmail() {
        return this.email;
    }
}
