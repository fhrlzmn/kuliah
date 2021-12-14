// Identitas
// Nama 	: Fahrul Zaman
// NIM  	: 301200020
// Prodi	: IF Pagi

#include <stdio.h>  // untuk menggunakan printf
#include <string.h> // untuk menggunakan string
#include <conio.h>
#include <stdlib.h> // untuk menggunakan printf

// Membuat tipe data struct dengan nama tipe data karcis
// yang berisi char nama
typedef struct
{
    char nama[20];
} karcis;

// Membuat tipe data struct dengan nama tipe data queue
// yang berisi int first, last, dan tipe karcis dengan nama data[5]
typedef struct
{
    int first;
    int last;
    karcis data[5];
} queue;

// Method untuk membuat queue kosong
// dengan parameter queue *q1 dan queue *q2
void createEmpty(queue *q1, queue *q2)
{
    // menentukan first dan last setiap queue
    // menjadi kosong atau -1
    (*q1).first = -1;
    (*q1).last = -1;
    (*q2).first = -1;
    (*q2).last = -1;
}

// Method untuk mengecek apakah queue kosong
// dengan parameter queue q1 dan queue q2
int isEmpty(queue q1, queue q2)
{
    int hasil = 0; // variable untuk hasil, nilai 0 jika isi
    if (q1.first == -1 && q2.first == -1)
    {
        hasil = 1; // jika hasil 1 maka queue kosong
    }
    return hasil; // method ini mengembalikan hasil
}

// Method untuk mengecek apakah queue penuh
// dengan parameter queue q1 dan queue q2
int isFull(queue q1, queue q2)
{
    int hasil = 0; // variable untuk hasil, nilai 0 jika isi
    if (q1.last == 4 && q2.last == 4)
    {
        hasil = 1; // jika hasil 1 maka queue kosong
    }
    return hasil; // method ini mengembalikan hasil
}

// Method untuk menambah data kedalam queue
// dengan parameter char nama[], queue *q1, dan queue *q2
void add(char nama[], queue *q1, queue *q2)
{
    // jika queue kosong
    // memanggil method isEmpty
    if (isEmpty(*q1, *q2) == 1)
    {
        (*q1).first = 0; // set first ke 0
        (*q1).last = 0;  // set last ke 0

        // copy nama ke dalam (*q1).data[0].nama
        strcpy((*q1).data[0].nama, nama);
    }
    else
    {
        // jika queue tidak full
        // dengan memanggil method isFull
        if (isFull(*q1, *q2) != 1)
        {
            // jika (*q1).last lebih besar dari (*q2).last
            // dan (*q2).first = -1, maka
            if (((*q1).last) > ((*q2).last) && ((*q2).first) == -1)
            {
                (*q2).first = 0;             // set (*q2).first = 0
                (*q2).last = (*q2).last + 1; // tambah (*q2).last dengan 1
                // copy nama ke (*q2).data[(*q2).last].nama
                strcpy((*q2).data[(*q2).last].nama, nama);
            }
            // jika ((*q1).last) lebih besar dari ((*q2).last)
            else if (((*q1).last) > ((*q2).last))
            {
                // tambah (*q2).last dengan 1
                (*q2).last = (*q2).last + 1;
                // copy nama ke (*q2).data[(*q2).last].nama
                strcpy((*q2).data[(*q2).last].nama, nama);
            }
            // jika ((*q1).last) sama dengan -1
            else if ((*q1).first == -1)
            {
                // tambah (*q1).last dengan 1
                (*q1).last = (*q1).last + 1;
                // set (*q1).first menjadi 0
                (*q1).first = 0;
                // copy nama ke (*q1).data[(*q1).last].nama
                strcpy((*q1).data[(*q1).last].nama, nama);
            }
            // jika tidak keduanya
            else
            {
                // tambah (*q1).last dengan 1
                (*q1).last = (*q1).last + 1;
                // copy nama ke (*q1).data[(*q1).last].nama
                strcpy((*q1).data[(*q1).last].nama, nama);
            }
        }
        // Jika queue penuh
        else
        {
            printf("Queue Penuh\n");
        }
    }
}

// Method untuk menghapus antrian pada queue 1
void del1(queue *q1)
{
    // jika (*q1).first != -1
    // jika queue tidak kosong
    if ((*q1).first != -1)
    {
        // jika (*q1).last == 0, maka
        if ((*q1).last == 0)
        {
            // set (*q1).first ke -1
            (*q1).first = -1;
            // set (*q1).last ke -1
            (*q1).last = -1;
            // set queue ke kosong
        }
        // jika tidak
        else
        {
            int i;
            // Perulangan untuk memindahkan antrian
            for (i = ((*q1).first + 1); i <= (*q1).last; i++)
            {
                // geser antrian setelah dihapus
                strcpy((*q1).data[i - 1].nama, (*q1).data[i].nama);
            }
            // (*q1).last - 1
            (*q1).last = (*q1).last - 1;
        }
        printf("Data Paling Depan Pada Antrian 1 Telah Dihapus\n");
    }
    // jika queue kosong
    else
    {
        printf("Antrian 1 Kosong~\n");
    }
}

// Method untuk menghapus antrian pada queue 2
void del2(queue *q2)
{
    // jika (*q2).first != -1
    // jika queue tidak kosong
    if ((*q2).first != -1)
    {
        // jika (*q2).last == 0, maka
        if ((*q2).last == 0)
        {
            // set (*q1).first ke -1
            (*q2).first = -1;
            // set (*q1).last ke -1
            (*q2).last = -1;
        }
        else
        {
            int i;
            // Perulangan untuk memindahkan antrian
            for (i = ((*q2).first + 1); i <= (*q2).last; i++)
            {
                // geser antrian setelah dihapus
                strcpy((*q2).data[i - 1].nama, (*q2).data[i].nama);
            }
            // (*q1).last - 1
            (*q2).last = (*q2).last - 1;
        }
        printf("Data Paling Depan Pada Antrian 2 Telah Dihapus\n");
    }
    // jika queue kosong
    else
    {
        printf("Antrian 2 Kosong~\n");
    }
}

// Method untuk menampilkan data Queue ke 1
void printqueue1(queue q1)
{
    int i;
    // jika antrian tidak kosong
    if (q1.first != -1)
    {
        // print semua data dengan perulangan
        for (i = q1.first; i <= q1.last; i++)
        {
            printf("no index\t: %d\n", i);
            printf("nama\t\t: %s\n\n", q1.data[i].nama);
        }
    }
    // jika antrian kosong
    else
    {
        printf("Antrian 1 Kosong!");
    }
}

// Method untuk menampilkan data Queue ke 2
void printqueue2(queue q2)
{
    int i;
    // jika antrian tidak kosong
    if (q2.first != -1)
    {
        // print semua data dengan perulangan
        for (i = q2.first; i <= q2.last; i++)
        {
            printf("no index\t: %d\n", i);
            printf("nama\t\t: %s\n\n", q2.data[i].nama);
        }
    }
    // jika antrian kosong
    else
    {
        printf("Antrian 2 Kosong!\n");
    }
}

// Main method sebagai program utama
int main()
{
    // deklarasi variable
    int teller;
    char nama[20];
    int pil;
    queue q1, q2;

    // membuat antrian kosong
    createEmpty(&q1, &q2);
menu:              // membuat label untuk goto
    system("cls"); // clearscreen untuk DOS
    printf("===== Menu ======\n");
    printf("1. Tambah Antrian\n");
    printf("2. Hapus Antrian\n");
    printf("3. Cetak Atrian\n");
    printf("4. Keluar\n");
    printf("\nPilihan: ");
    // input data dari keyboard, simpan di pil
    scanf("%d", &pil);
    // switch case untuk pil
    switch (pil)
    {
    case 1: // jika input 1
        // Jika queue full dengan method isFull
        if (isFull(q1, q2) == 1)
        {
            // print antrian penuh
            printf("\nAntrian penuh\n\n");
        }
        // jika queue tidak full
        else
        {
            // masukkan nama dengan input keyboard
            printf("Masukkan nama anda: ");
            scanf("%s", &nama);
            // tambah ke queue
            // dengan memanggil method nama
            add(nama, &q1, &q2);
        }
        system("pause"); // system pause
        break;           // break switch case

    case 2:            // jika input 2
        system("cls"); // clearscreen DOS
        int x;
        printf("===== Hapus Antrian =====\n");
        printf("1. Hapus Antrian 1\n");
        printf("2. Hapus Antrian 2\n");
        printf("Pilihan Kamu : ");
        scanf("%d", &x); // input simpan di x
        // switch case untuk x
        switch (x)
        {
        // case 1
        case 1:
        {
            // panggil method del1 untuk menghpaus queue 1
            del1(&q1);
            break; // break switch case
        }
        case 2:
        {
            // panggil method del2 untuk menghpaus queue 2
            del2(&q2);
            break; // break switch case
        }
        default: // jika tidak 1 dan 2
        {
            printf("Menu hanya ada dari 1-2 saja!\n");
        }
        }
        system("pause"); // pause system
        break;           // break switch case

    // jika memilih 3
    case 3:
        system("cls"); // clearscreen DOS
        printf("===== Data Antrian =====\n\n");
        printf("ANTRIAN 1\n");
        printf("==========================\n\n");
        // panggil printqueue1 untuk print queue 1
        printqueue1(q1);
        printf("\n==========================\n\n");
        printf("ANTRIAN 2\n");
        printf("==========================\n\n");
        // panggil printqueue2 untuk print queue 2
        printqueue2(q2);
        printf("\n==========================\n\n");
        system("pause"); // system pause
        break;           // break switch case

    // jika memilih 4
    case 4:
        system("pause"); // pause system
        return 0;        // return 0, keluar
    }

    // jika pilihan case tidak 1-4 maka akan kembali ke label menu
    goto menu;
}