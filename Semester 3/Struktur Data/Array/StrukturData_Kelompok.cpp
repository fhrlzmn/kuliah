#include <iostream>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Identitas
    printf("Nama    : Fahrul Zaman      (301200020)\n");
    printf("          Rangga Kurniawan  (301200024)\n");
    printf("Prodi   : IF Pagi\n");
    printf("\n");

    // Deklarasi
    int menu, jumlah, jumlah_awal, isi, hapus, jum_hapus = 0;
    int bil_1[20], bil_2[20];
    char ulangi;

    // Menu
    do
    {
        printf("=======================================\n");
        printf("| Program Mengisi dan Menghapus Array |\n");
        printf("=======================================\n");
        printf("1. Masukkan Nilai Awal Array\n");
        printf("2. Lihat Array\n");
        printf("3. Hapus Elemen Array\n");
        printf("4. Restore Array\n");
        printf("5. Reset\n");
        printf("6. Exit\n");
        printf("Pilih Menu : ");
        scanf("%d", &menu);
        printf("\n");
        printf("\033[2J\033[1;1H"); // String untuk Clear Screen

        // Saat Menu Dipilih
        switch (menu)
        {
        case 1: // menu 1
            // Masukkan jumlah elemen pada array oleh user
            printf("Masukkan Jumlah Nilai pada Array (Max 20) : ");
            scanf("%d", &jumlah);
            jumlah_awal = jumlah;
            if (jumlah > 20 || jumlah < 1)
            {
                // jika user memasukkan lebih dari 20
                printf("Jumlah Array Maksimal 20!!\n");
            }
            else
            {
                for (int i = 0; i < jumlah; i++)
                {
                    // Masukkan nilai elemen secara bergantian
                    printf("nilai ke-%d : ", i + 1);
                    scanf("%d", &isi);
                    bil_1[i] = isi; // Masukkan input ke dalam array
                    bil_2[i] = isi; // untuk backup
                }
                printf("Data Berhasil di Input!!\n");
            }
            break;

        case 2:
            printf("Nilai Pada Array : \n");

            // Print semua elemen berurutan dengan perulangan for
            for (int i = 0; i < jumlah; i++)
            {
                printf("%d  ", bil_1[i]);
            }
            printf("\n");
            break;

        case 3:
            printf("Isi Array Sekarang : \n");
            // Tampilkan Isi Array
            for (int i = 0; i < jumlah; i++)
            {
                printf("%d  ", bil_1[i]);
            }
            printf("\n\n");

            // Hapus elemen yang di inputkan user
            printf("Masukkan elemen yang ingin di hapus : ");
            scanf("%d", &hapus);
            printf("\n");

            // Lakukan perulangan seluruh elemen
            for (int i = 0; i < jumlah_awal; i++)
            {
                // Apabila elemen yang diinputkan sama dengan elemen di array
                if (bil_1[i] == hapus)
                {
                    for (int j = i; j < jumlah; j++)
                    {
                        // Ganti elemen yang dihapus dengan elemen selanjutnya sampai terakhir
                        bil_1[j] = bil_1[j + 1];
                    }

                    jum_hapus++;
                }
            }
            jumlah = jumlah - jum_hapus; // Kurangi jumlah array

            // Print data array setelah ada yang dihapus
            printf("Menghapus Elemen Sukses!!\n");
            printf("Jumlah Data yang Dihapus : %d\n", jum_hapus);
            printf("Data Array setelah dihapus : \n");
            for (int i = 0; i < jumlah; i++)
            {
                printf("%d  ", bil_1[i]);
            }
            printf("\n");
            break;

        case 4:
            printf("Mengembalikan Array ke Nilai Awal Sukses!\n");
            jumlah = jumlah_awal;
            for (int i = 0; i < jumlah; i++)
            {
                bil_1[i] = bil_2[i];
            }
            printf("\n");

            printf("Isi Array Sekarang : \n");
            // Tampilkan Isi Array
            for (int i = 0; i < jumlah; i++)
            {
                printf("%d  ", bil_1[i]);
            }
            printf("\n");
            break;

        case 5:
            printf("Me-reset Array Menjadi Kosong Sukses!\n");
            for (int i = 0; i < jumlah; i++)
            {
                bil_1[i] = 0;
            }

            jumlah = 0;
            break;

        case 6:
            break;

        default:
            printf("Masukkan Nomor Menu yang Benar!!!\n\n");
            break;
        }

        // Jika exit akan langsung keluar dari perulangan
        if (menu == 6)
        {
            // Keluar
            printf("Sampai Jumpa");
            break;
        }

        // Ulangi Menu
        printf("\nKembali ke Menu? (y/n) : ");
        scanf("%s", &ulangi);
        printf("\033[2J\033[1;1H"); // String untuk Clear Screen

    } while (ulangi != 'n');
    return 0;
}
