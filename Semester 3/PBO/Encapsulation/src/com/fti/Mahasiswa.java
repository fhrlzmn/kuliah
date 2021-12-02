package com.fti;

public class Mahasiswa {
    // Membuat Variable Private
    private String nama, nim, jurusan;
    private int semester;

    // Constructor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Setter
    // Untuk men-set data menggunakan method
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter
    // Untuk mengambil data menggunakan method
    public String getNama() {
        return this.nama;
    }
    public String getNim() { return this.nim; }
    public String getJurusan() { return this.jurusan; }
    public int getSemester() { return this.semester; }
}
