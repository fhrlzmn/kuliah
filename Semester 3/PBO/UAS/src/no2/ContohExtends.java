package no2;

public class ContohExtends extends Thread {
    public static void main(String[] args) {
        ContohExtends thread = new ContohExtends();
        thread.start();
        System.out.println("Kode ini dijalankan diluar Thread");
    }

    public void run() {
        String namaThread = getName();
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Nomor " + i + " " + namaThread);
                sleep(1000); // pause 1 detik
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}