public class App {
    public static void main(String[] args) {
        // Membuat Object dari Class Hewan, Buah, Sayuran
        Hewan monyet = new Hewan("Monyet");
        Buah pisang = new Buah("Pisang");
        Sayuran kangkung = new Sayuran("Kangkung");

        // Memanggil Method yang ada pada Class Hewan
        monyet.memakan(pisang.nama);
        monyet.memakan(kangkung.nama);
    }
}
