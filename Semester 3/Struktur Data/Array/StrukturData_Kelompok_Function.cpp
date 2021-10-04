#include <iostream>
#include <stdio.h>
#include <stdlib.h>

// Function untuk Menampilkan Menu
void showMenu()
{
    printf("1. Masukkan Nilai Awal Array\n");
    printf("2. Lihat Array\n");
    printf("3. Hapus Elemen Array\n");
    printf("4. Restore Array\n");
    printf("5. Reset\n");
    printf("6. Exit\n");
    printf("Pilih Menu : ");
}

// Function Menampilkan Data Array
void showDataArray(int array[], int jumlah)
{
    for (int i = 0; i < jumlah; i++)
    {
        printf("%d  ", array[i]);
    }
    printf("\n");
}

// Function untuk Clear Screen
void clearScreen()
{
    printf("\033[2J\033[1;1H");
}

// Function untuk Reset Array
void resetArray(int array[], int jumlah)
{
    printf("Me-reset Array Menjadi Kosong Sukses!\n");
    for (int i = 0; i < jumlah; i++)
    {
        array[i] = 0;
    }
}

// Function untuk Menambah Data Array
void insertArray(int array1[], int array2[], int jumlah)
{
    int isi;

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
            array1[i] = isi; // Masukkan input ke dalam array
            array2[i] = isi; // untuk backup
        }
        printf("Data Berhasil di Input!!\n");
    }
}

// Function untuk menghapus Elemen pada Array
void deleteArray(int array[], int jumlah, int jumlah_awal)
{
    int hapus, jum_hapus = 0;

    // Tampilkan Isi Array
    showDataArray(array, jumlah);
    printf("\n");

    printf("Masukkan elemen yang ingin di hapus : ");
    scanf("%d", &hapus);
    printf("\n");

    // Lakukan perulangan seluruh elemen
    for (int i = 0; i < jumlah_awal; i++)
    {
        // Apabila elemen yang diinputkan sama dengan elemen di array
        if (array[i] == hapus)
        {
            for (int j = i; j < jumlah; j++)
            {
                // Ganti elemen yang dihapus dengan elemen selanjutnya sampai terakhir
                array[j] = array[j + 1];
            }

            jum_hapus++;
        }
    }
    jumlah = jumlah - jum_hapus; // Kurangi jumlah array

    // Print data array setelah ada yang dihapus
    printf("Menghapus Elemen Sukses!!\n");
    printf("Jumlah Data yang Dihapus : %d\n", jum_hapus);
    printf("Data Array setelah dihapus : \n");
    showDataArray(array, jumlah);
    printf("\n");
}

void restoreArray(int array1[], int array2[], int jumlah)
{
    printf("Mengembalikan Array ke Nilai Awal Sukses!\n");
    for (int i = 0; i < jumlah; i++)
    {
        array1[i] = array2[i];
    }
}

int main()
{
    // Identitas
    printf("Nama    : Fahrul Zaman      (301200020)\n");
    printf("          Rangga Kurniawan  (301200024)\n");
    printf("Prodi   : IF Pagi\n");
    printf("\n");

    // Deklarasi
    int menu, jumlah, jumlah_awal, isi;
    int bil_1[20], bil_2[20];
    char ulangi;

    // Menu
    do
    {
        printf("=======================================\n");
        printf("| Program Mengisi dan Menghapus Array |\n");
        printf("=======================================\n");
        showMenu(); // Panggil Function Show Menu
        scanf("%d", &menu);
        clearScreen(); // Clear Screen

        // Saat Menu Dipilih
        switch (menu)
        {
        case 1: // menu 1
            // Masukkan jumlah elemen pada array oleh user
            printf("Masukkan Jumlah Nilai pada Array (Max 20) : ");
            scanf("%d", &jumlah);
            jumlah_awal = jumlah;
            // Panggil Function insertArray
            insertArray(bil_1, bil_2, jumlah);
            break;

        case 2:
            printf("Nilai Pada Array : \n");
            // Panggil Function showDataArray
            showDataArray(bil_1, jumlah);

            break;

        case 3:
            // Hapus elemen yang di inputkan user
            deleteArray(bil_1, jumlah, jumlah_awal);

            break;

        case 4:
            jumlah = jumlah_awal;
            restoreArray(bil_1, bil_2, jumlah);

            // Tampilkan Isi Array
            printf("Isi Array Sekarang : \n");
            showDataArray(bil_1, jumlah);
            break;

        case 5:
            resetArray(bil_1, jumlah);
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
        clearScreen(); // String untuk Clear Screen

    } while (ulangi != 'n');
    return 0;
}
