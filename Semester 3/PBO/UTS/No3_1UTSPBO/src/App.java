public class App {
    public static void main(String[] args) {
        // Object Orang
        System.out.println("==================== Object Orang =====================");
        Orang orang1 = new Orang("Yanto",20, 'L');

        orang1.kenalan();
        orang1.makan();
        orang1.tidur();

        // Object Mahasiswa
        System.out.println("\n=================== Object Mahasiswa ==================");
        Mahasiswa mhs1 = new Mahasiswa("Ujang", 19, 'L',"301200000");

        mhs1.kenalan();
        mhs1.setEmail("ujangdoang@gmail.com");
        System.out.println("Email : " + mhs1.getEmail());

        mhs1.makan();
        mhs1.mandi();
        mhs1.kuliah();

        // Object Dosen
        System.out.println("\n===================== Object Dosen =====================");
        Dosen dosen1 = new Dosen("Iqwan", 30, 'L',"123435431");

        dosen1.kenalan();
        dosen1.mandi();
        dosen1.mengajar();


        // Polymorphism
        Orang mhs2 = new Mahasiswa("Santi", 20, 'P', "301200054");
        // mhs2.kuliah();
        // method kuliah tidak bisa dipakai karena tipe obejctnya Orang
        // sedangkan methodnya berada di class Mahasiswa
    }
}
