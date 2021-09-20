package tugas2;

public class fungsiUpper {
    private static void toUpperCase (String x) {
        x = x.toLowerCase();
        System.out.println("Sesudah : " + x);
    }
    public static void main(String[] args) {
        
        System.out.println("Program mengubah huruf besar menjadi huruf kecil");
        System.out.println("================================================\n");

        String x = "INI ADALAH HURUF KAPITAL YANG AKAN DIUBAH";
        System.out.println("Sebelum : " + x);
        toUpperCase(x);
    }
}
