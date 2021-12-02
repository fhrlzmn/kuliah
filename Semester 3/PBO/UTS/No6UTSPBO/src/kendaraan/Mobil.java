package kendaraan;

public class Mobil {
    // Protected hanya dapat diakses oleh file yang packagenya sama
    protected String nama;

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getNama() {
        return this.nama;
    }

    // Harus public agar bisa diakses oleh file yang packagenya tidak sama
    public void cetak() {
        System.out.println("Print Mobil");
    }
}
