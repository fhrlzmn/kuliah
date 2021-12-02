package com.fti.SI;

// Import Mahasiswa.java dari package com.fti.Mahasiswa
import com.fti.Mahasiswa;

// Membuat Class MahasiswaSI turunan dari Mahasiswa
public class MahasiswaSI extends Mahasiswa {
    // Constructor harus ada di Class Child
    public MahasiswaSI(String nama, String nim) {
        super(nama, nim); // memanggil constructor parent
        super.setJurusan("Sistem Informasi");
        // setJurusan dijalankan saat pembuatan object
    }
}
