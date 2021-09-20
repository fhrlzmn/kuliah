package tugas1;
import java.util.Scanner;

public class perubahanJam {
    
    private static void penguranganJam(int jam, int menit, int detik, int p){

        int jmlWaktu = (jam * 3600) + (menit * 60) + detik;
        int kurangiMenit = p * 60;
        
        int hasilWaktu = jmlWaktu - kurangiMenit;
        
        int outputJam = hasilWaktu / 3600;
        int outputMenit = hasilWaktu % 3600 / 60;
        int outputDetik = hasilWaktu % 3600 % 60;

        System.out.printf("Maka : \n%2d:%2d:%2d - %2d Menit\n", jam, menit, detik, p);
        System.out.printf("Hasilnya : \n%2d:%2d:%2d", outputJam, outputMenit, outputDetik);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Program Pengurangan Jam");
        System.out.println("=======================");
        System.out.println("Inputkan Nilai!\n");

        System.out.print("Masukkan Jam   : ");
        int inputJam = inp.nextInt();
        System.out.print("Masukkan Menit : ");
        int inputMenit = inp.nextInt();
        System.out.print("Masukkan Detik : ");
        int inputDetik = inp.nextInt();
        System.out.print("Pengurangan (Menit) : ");
        int inputKurangiMenit = inp.nextInt();
        System.out.println("=======================");
        
        if (inputJam == 24 && inputMenit == 0 && inputDetik == 0){
            penguranganJam(inputJam, inputMenit, inputDetik, inputKurangiMenit);
        } else if (inputJam >= 0 && inputJam < 24 && inputMenit >= 0 && inputMenit < 60 && inputDetik >= 0 && inputDetik <60){
            penguranganJam(inputJam, inputMenit, inputDetik, inputKurangiMenit);
        } else {
            System.out.println("ERROR!!! Masukkan Nilai Dengan Benar!");
        }
        
    }
}
