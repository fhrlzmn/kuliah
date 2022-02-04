package no4;

import java.sql.*;

public class DatabaseConnection {
    // Menyiapkan variable JDBC untuk koneksi ke database
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement state;
    static ResultSet rs;

    public static void main(String[] args) {
        // Melakukan koneksi ke database
        try {
            // daftarkan driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            // koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // buat objek statement
            state = conn.createStatement();

            // membuat query ke database
            String sql = "SELECT * FROM buku";
            // eksekusi query
            rs = state.executeQuery(sql);
            // tampilkan Hasil Query
            while(rs.next()) {
                System.out.println("ID Buku: " + rs.getInt("id_buku"));
                System.out.println("Judul: " + rs.getString("judul"));
                System.out.println("Pengarang: " + rs.getString("pengarang"));
                System.out.println("ISBN: " + rs.getString("isbn"));
            }

            // Tutup Koneksi
            state.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
