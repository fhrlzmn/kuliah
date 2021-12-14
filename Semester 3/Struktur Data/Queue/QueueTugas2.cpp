#include <stdio.h>  // scanf & printf
#include <stdlib.h> // system()
#include <string.h> // Untuk menggunakan String

// Struct untuk konsumen
typedef struct
{
    char nama[20];
} konsumen;

// Struct untuk queue
typedef struct
{
    int first;
    int last;
    konsumen data[20];
} queue;

// Method untuk Membuat Antrian Kosong
void createQueue(queue *q)
{
    (*q).first = -1;
    (*q).last = -1;
}

// Method untuk mengecek apakah Antrian kosong
bool isEmpty(queue q)
{
    // q.first = -1 artinya kosong
    if (q.first == -1)
    {
        // jika kosong mengembalikan true
        return true;
    }
    else
    {
        // jika isi mengembalikan false
        return false;
    }
}

// Method untuk mengecek apakah Antrian penuh
bool isFull(queue q)
{
    // q.last == 19 artinya penuh
    if (q.last == 19)
    {
        // jika penuh mengembalikan true
        return true;
    }
    else
    {
        // jika tidak penuh mengembalikan false
        return false;
    }
}

// Method untuk menambah antrian
void addData(char nama[], queue *q)
{
    // Jika data Kosong
    if (isEmpty(*q))
    {
        (*q).first = 0; // first menjadi 0
        (*q).last = 0;  // last menjadi 0
        // Copy nama ke dlam antrian q.data[0].nama
        strcpy((*q).data[0].nama, nama);
        printf("\n%s Masuk ke No Antrian %d!\n", nama, (*q).last);
    }
    else
    {
        (*q).first = 0; // first menjadi 0
        (*q).last++;    // tambah last nya 1
        // Copy nama ke dlam antrian q.data[terakhir].nama
        strcpy((*q).data[(*q).last].nama, nama);
        printf("\n%s Masuk ke No Antrian %d!\n", nama, (*q).last);
    }
}

// Method untuk menghapus antrian
void deleteData(queue *q)
{
    // jika Antrian Kosong
    if (isEmpty(*q))
    {
        printf("Antrian Kosong!\n");
    }
    // Jika tidak kosong
    else
    {
        // jika last == 0
        if ((*q).last == 0)
        {
            // kembalikan antrian menjadi kosong
            (*q).first = -1;
            (*q).last = -1;
        }
        // jika last tidak 0
        else
        {
            // geser antrian setelah dihapus
            for (int i = (*q).first + 1; i <= (*q).last; i++)
            {
                strcpy((*q).data[i - 1].nama, (*q).data[i].nama);
            }
            (*q).last--;
        }
        printf("Konsumen Paling Depan Pada Antrian Keluar!\n");
    }
}

// Method untuk menampilkan data Antrian
void printQueue(queue q)
{
    // Jika antrian kosong
    if (isEmpty(q))
    {
        printf("Antrian Kosong!\n");
    }
    // jika antrian tidak kosong
    else
    {
        // print semua data dengan perulangan
        for (int i = q.first; i <= q.last; i++)
        {
            printf("No Antrian\t: %d\n", i);
            printf("Nama\t\t: %s\n\n", q.data[i].nama);
        }
    }
}

// Main method sebagai program utama
int main()
{
    // Deklarasi Variable
    char nama[20];
    int pilihan;
    queue q;

    // buat antrian kosong
    createQueue(&q);

// membuat label menu untuk melakukan perulangan menu
menu:
    system("cls"); // clearscreen DOS
    // Identitas
    printf("Nama   : Fahrul Zaman\n");
    printf("NIM    : 301200020\n");
    printf("Prodi  : Teknik Informatika (Pagi)\n");
    printf("Tugas Queue 2 Antrian Konsumen\n\n");

    // Tampilan Menu
    printf("========== Menu ==========\n");
    printf("1. Tambah Antrian\n");
    printf("2. Hapus Antrian\n");
    printf("3. Cetak Antrian\n");
    printf("4. Keluar\n");
    printf("Pilih Menu: ");
    scanf("%d", &pilihan); // input dari keyboard

    // switch case untuk pilihan
    switch (pilihan)
    {
    case 1:
        system("cls");
        printf("========== Tambah Antrian ==========\n");
        // jika antrian penuh
        if (isFull(q))
        {
            printf("Antrian Penuh!\n");
        }
        // jika tidak penuh
        else
        {
            printf("Masukkan Nama : ");
            scanf("%s", &nama); // inputkan nama
            // panggil method addData
            // untuk menambah nama ke antrian q
            addData(nama, &q);
        }
        system("pause"); // pause system
        break;

    case 2:
        system("cls");
        printf("========== Hapus Antrian ==========\n");
        // panggil method deleteData
        // untuk menghapus konsumen paling depan
        deleteData(&q);
        system("pause");
        break;

    case 3:
        system("cls");
        printf("========== Cetak Antrian ==========\n");
        // panggil method printQueue
        // untuk mencetak seluruh konsumen dalam antrian
        printQueue(q);
        system("pause");
        break;

    case 4:
        system("pause");
        return 0;
    }

    // jika pilihan bukan 1-4, maka ulangi menu
    goto menu;
}