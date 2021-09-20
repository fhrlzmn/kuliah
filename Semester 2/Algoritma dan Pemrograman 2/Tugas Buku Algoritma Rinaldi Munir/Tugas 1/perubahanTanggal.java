package tugas1;
import java.util.Scanner;

public class perubahanTanggal {
    
    private static void penambahanTanggal(int tahun, int bulan, int tanggal){
        int outputTahun = tahun;
        int outputBulan = bulan;
        int outputTanggal = tanggal;

        switch (bulan){
            case 4 :
            case 6 :
            case 8 :
            case 11 :
                if (tanggal < 30){
                    outputTanggal = tanggal + 1;
                } else if (tanggal == 30){
                    outputTanggal = 1;
                    outputBulan = bulan + 1;
                }
            break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 10 :
                if (tanggal < 31) {
                    outputTanggal = tanggal + 1;
                } else if (tanggal == 31) {
                    outputTanggal = 1;
                    outputBulan = bulan + 1;
                }
            break;
            case 2 :
                if (tanggal < 28){
                    outputTanggal = tanggal + 1;
                } else if (tanggal >= 28){
                    if ((tanggal % 4 == 0 && tanggal % 100 != 0) || (tanggal % 400 == 0)){
                        if (tanggal == 28){
                            outputTanggal = tanggal + 1;
                        } else if (tanggal == 29){
                            outputTanggal = 1;
                            outputBulan = bulan + 1;
                        }
                    } else {
                        outputTanggal = 1;
                        outputBulan = bulan + 1;
                    }
                }
            break;
            case 12 :
                if (tanggal < 31){
                    outputTanggal = tanggal + 1;
                } else if (tanggal == 31){
                    outputTanggal = 1;
                    outputBulan = 1;
                    outputTahun = tahun + 1;
                }
            break;
            default :
            break;
        }
        System.out.printf("Tgl Sekarang = %2d/%2d/%4d\n", tanggal, bulan, tahun);
        System.out.printf("Tgl Besok = %2d/%2d/%4d", outputTanggal, outputBulan, outputTahun);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Program Menentukan Tanggal Besok");
        System.out.println("=======================");
        System.out.println("Inputkan Nilai!\n");

        System.out.print("Masukkan Tanggal   : ");
        int inputTanggal = inp.nextInt();
        System.out.print("Masukkan Bulan    : ");
        int inputBulan = inp.nextInt();
        System.out.print("Masukkan Tahun    : ");
        int inputTahun = inp.nextInt();
        System.out.println("=======================");

        penambahanTanggal(inputTahun, inputBulan, inputTanggal);   
    }
}
