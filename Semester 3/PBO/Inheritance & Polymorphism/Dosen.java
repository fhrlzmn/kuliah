package Pertemuan3;

public class Dosen extends Orang {
    String nik;

    Dosen(String nama, int umur, char jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    Dosen(String nama, int umur, char jenisKelamin, String nik) {
        super(nama, umur, jenisKelamin);
        this.nik = nik;
    }

    @Override
    void kenalan() {
        super.kenalan();
        System.out.printf("NIK : %s\n", this.nik);
        System.out.println("Saya Adalah Seorang Dosen");
    }

    void mengajar() {
        System.out.printf("%s Sedang Mengajar Mahasiswa\n", this.nama);
    }
}
