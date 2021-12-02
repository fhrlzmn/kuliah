public class Manusia {
    // Simpan Variable/Atribut kedalam private
    // Agar tidak bisa langsung diakses
    private String nama;
    private int usia;

    // Setter
    // Yaitu menentukan suatu atribut dengan menggunakan sebuah method
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Getter
    // Yaitu mengambil suatu atribut dengan menggunakan sebuah method
    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
}
