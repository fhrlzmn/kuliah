package no2;

public class ContohImplements implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ContohImplements());
        thread.start();
        System.out.println("Kode ini dijalankan diluar Thread");
    }

    public void run() {
        String namaThread = Thread.currentThread().getName();
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Nomor " + i + " " + namaThread);
                Thread.sleep(1000); // pause 1 detik
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
