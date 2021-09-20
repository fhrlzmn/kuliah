package tugas2;

public class fungsiLower {
    private static void toUpperCase (String x) {
        x = x.toUpperCase();
        System.out.println("Sesudah : " + x);
    }
    public static void main(String[] args) {
        
        System.out.println("Program mengubah huruf kecil menjadi huruf besar");
        System.out.println("================================================\n");

        String x = "ini adalah contoh huruf yang akan diubah menjadi huruf kapital";
        System.out.println("Sebelum : " + x);
        toUpperCase(x);
    }
}
