package com.fti.IF;

// Import Mahasiswa.java dari package com.fti.Mahasiswa
import com.fti.Mahasiswa;

// Membuat Class MahasiswaIF turunan dari Mahasiswa
public class MahasiswaIF extends Mahasiswa {
    // Constructor harus ada di Class Child
    public MahasiswaIF(String nama, String nim) {
        super(nama, nim); // memanggil constructor parent
        super.setJurusan("Teknik Informatika");
        // setJurusan dijalankan saat pembuatan object
    }
}
