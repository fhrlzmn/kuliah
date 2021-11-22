// Identitas
// Nama 	: Fahrul Zaman
// NIM  	: 301200020
// Prodi	: IF Pagi

#include <stdio.h> // mengimport library stdio.h
#include <stdlib.h> // mengimport library stdlib.h
#include <string.h> // mengimport library string.h (untuk tulisan)

// Membuat Variable dengan Tipe Data Struct
// Struct dataMatkul
typedef struct
{
    // dataMatkul berisi :
    char kode_matkul[5];  // array char kode_matkul yang isinya 5
    char nama_matkul[30]; // array char nama_matkul yang isinya 30
    int sks;              // variable integer untuk sks
} dataMatkul;

// Struct elemen
typedef struct
{
    // elemen berisi :
    dataMatkul elmt; //  struct dataMatkul yang namanya elmt
    int next;        // integer next untuk linked list
} elemen;

// Struct list
typedef struct
{
    // list berisi :
    int first;       // integer first untuk linked list
    elemen data[20]; // struct elemen (array) yang namanya data yang isinya 20
} list;

// Method/Structure create_list
// dengan parameter dengan tipe list isinya pointer L
// Untuk membuat list kosong
void create_list(list *L)
{
    int i;           // int i untuk variable for
    (*L).first = -1; // menentukan pointer L yang isinya first menjadi -1

    // Perulangan untuk menentukan isi dari next menjadi -2
    for (i = 0; i <= 20; i++)
    {
        (*L).data[i].next = -2;
        // mengubah isi dari data ke-i yang ada next menjadi -2
    }
}

// Method/Function count_elemen
// dengan parameter dengan tipe list isinya L
int count_elemen(list L)
{
    int hasil = 0;
    // deklarasi dan menentukan nilai awal dari variable hasil

    // jika L.first tidak sama dengan -1, maka
    if (L.first != -1)
    {
        int elmt;       // membuat variable integer elmt
        elmt = L.first; // elmt berisi nilai dari L.first

        while (elmt != -1)
        {                      // saat elmt tidak sama dengan -1, lakukan :
            hasil = hasil + 1; // nilai pada hasil tambah 1
            elmt = L.data[elmt].next;
            // nilai pada elmt adalah L.data ke elmt yang next
        }
    }
    return hasil; // function ini mengembalikan nilai hasil
}

// Method/Function empty_elemen
// dengan parameter dengan tipe list isinya L
int empty_elemen(list L)
{
    int hasil = -1; // delkarasi dan menentukan nilai awal dari variable hasil

    // jika hasil dari function count_elemen(L) kurang dari 20, maka :
    if (count_elemen(L) < 20)
    {
        int ketemu = 0; // deklarasi variable ketemu = 0
        int i = 0;      // deklarasi variable i = 0

        // pada saat ketemu sama dengan 0 dan i kurang dari atau sama dengan 20,
        // lakukan :
        while ((ketemu == 0) && (i <= 20))
        {
            // jika nilai L.data ke i yang didalamnya next sama dengan -2, maka
            if (L.data[i].next == -2)
            {
                hasil = i;  // hasil = i
                ketemu = 1; // ketemu = 1
            }
            else
            {              // selain itu
                i = i + 1; // tambah nilai 1 dengan 1
            }
        }
    }
    return hasil; // function ini mengembalikan nilai dari hasil
}

// Method/Structure add_first
// Untuk menambah data di list awal
// dengan parameter dengan tipe list pointer L, array char kode_matkul
// array char nama_matkul, dan integer sks
void add_first(list *L, char kode_matkul[], char nama_matkul[], int sks)
{
    // jika hasil dari function count_elemen(*L) kurang dari 20, maka
    if (count_elemen(*L) < 20)
    {
        int index = empty_elemen(*L);
        // variable index berisi hasil dari function empty_elemen(*L)
        strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
        // copy isi dari kode_matkul ke list (*L).data[index].elmt.kode_matkul
        strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
        // copy isi dari nama_matkul ke list (*L).data[index].elmt.nama_matkul
        (*L).data[index].elmt.sks = sks;
        // isi list (*L).data[index].elmt.sks dengan sks dari parameter

        // jika *L.first sama dengan -1, maka :
        if ((*L).first == -1)
        {                               // list kosong
            (*L).data[index].next = -1; // isi (*L).data[index].next = -1
        }
        else
        {                                       // selain itu
            (*L).data[index].next = (*L).first; // isi (*L).data[index].next = first
            (*L).data[(*L).first].next;         // isi (*L).data[(*L).first].next;
        }
        (*L).first = index; // isi (*L).first = index
    }
    else
    { // selain itu
        // Jika array penuh
        printf("Sudah tidak dapat ditambah lagi\n");
    }
}

// Method/Structure add_after
// Untuk menambah data setelah list yang ditentukan
// dengan parameter dengan tipe list pointer L, integer prec,
// array char kode_matkul ,array char nama_matkul, dan integer sks
void add_after(list *L, int prec, char kode_matkul[], char nama_matkul[], int sks)
{
    // jika hasil dari function count_element(*L) kurang dari 20, maka
    if (count_elemen(*L) < 20)
    {
        int index = empty_elemen(*L);
        // isi dari integer index = function empty_elemen(*L)
        strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
        // copy isi dari kode_matkul ke list (*L).data[index].elmt.kode_matkul
        strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
        // copy isi dari nama_matkul ke list (*L).data[index].elmt.nama_matkul
        (*L).data[index].elmt.sks = sks;
        // isi list (*L).data[index].elmt.sks dengan sks dari parameter

        // jika prec lebih kecil dari hasil function count_elemen(*L)
        if (prec < count_elemen(*L))
        {
            int jumlah = 0;           // isi dari jumlah = 0
            int sebelum = (*L).first; // isi dari sebeleum = (*L).first

            // saat jumlah kurang dari (prec - 1), lakukan :
            while (jumlah < (prec - 1))
            {
                jumlah++;                          // tambah jumlah dengan 1
                sebelum = (*L).data[sebelum].next; // isi dari sebelum = (*L).data[sebelum].next
            }

            // isi dari (*L).data[index].next = (*L).data[sebelum].next
            (*L).data[index].next = (*L).data[sebelum].next;
            (*L).data[sebelum].next = index; // isi dari (*L).data[sebelum].next = index
        }
        else
        {                          // selain itu
            int last = (*L).first; // isi dari last = (*L).first

            // saat (*L).data[last].next tidak sama dengan -1, lakukan :
            while ((*L).data[last].next != -1)
            {
                // isi last = (*L).data[last].next
                last = (*L).data[last].next;
            }

            (*L).data[last].next = index; // isi dari (*L).data[last].next = index
            (*L).data[index].next = -1;   // isi dari (*L).data[index].next = -1
        }
    }
    else
    { // selain itu
        // Jika Data Penuh
        printf("Data penuh tidak dapat ditambah");
    }
}

// Method/Structure add_last
// Untuk menambah data pada list akhir
// dengan parameter dengan tipe list pointer L
// array char kode_matkul, array char nama_matkul, dan integer sks
void add_last(list *L, char kode_matkul[], char nama_matkul[], int sks)
{
    int last; // deklarasi variable last

    // jika (*L).first sama dengan -1, maka :
    if ((*L).first == -1)
    {
        int index = 0; // isi index = 0
        strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
        // copy isi dari kode_matkul ke list (*L).data[index].elmt.kode_matkul
        strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
        // copy isi dari nama_matkul ke list (*L).data[index].elmt.nama_matkul
        (*L).data[index].elmt.sks = sks;
        // isi list (*L).data[index].elmt.sks dengan sks dari parameter

        (*L).data[index].next = -1;
        // isi dari (*L).data[index].next = -1
        (*L).first = index;
        // isi dari (*L).first = index
    }
    else
    { // selain itu
        // jika hasil dari function count_elemen(*L) kurang dari 20, maka
        if (count_elemen(*L) < 20)
        {
            int index = empty_elemen(*L);
            // isi dari index = hasil dari function empty_elemen(*L)
            strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
            // copy isi dari kode_matkul ke list (*L).data[index].elmt.kode_matkul
            strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
            // copy isi dari nama_matkul ke list (*L).data[index].elmt.nama_matkul
            (*L).data[index].elmt.sks = sks;
            // isi list (*L).data[index].elmt.sks dengan sks dari parameter
            (*L).data[index].next = -1;
            // isi dari list (*L).data[index].next = -1
            last = (*L).first;
            // isi dari last = (*L).first

            // saat list (*L).data[last].next tidak sama dengan -1, lakukan :
            while ((*L).data[last].next != -1)
            {
                // isi dari last = (*L).data[last].next
                last = (*L).data[last].next;
            }
            // isi dari (*L).data[last].next = index
            (*L).data[last].next = index;
        }
        else
        { // selain itu
            // Jika data Penuh
            printf("Data Penuh, tidak dapat ditambahkan");
        }
    }
}

// Method/Structure delete_first
// Untuk menghapus data pada list awal
// dengan parameter dengan tipe list pointer L
void delete_first(list *L)
{
    // jika isi dari (*L).first tidak sama dengan -1, maka :
    if ((*L).first != -1)
    {
        int elmt = (*L).first; // isi dari elmt = (*L).first
        // isi dari (*L).first = (*L).data[(*L).first].next
        (*L).first = (*L).data[(*L).first].next;
        (*L).data[elmt].next = -2; // mengosongkan
    }
    else
    { // selain itu
        // jika data kosong
        printf("List Kosong");
    }
}

// Method/Structure delete_after
// Untuk menghapus data setelah list yang ditentukan
// dengan parameter dengan tipe list pointer L, integer prec,
void delete_after(list *L, int prec)
{
    int temp; // deklarasi variable temp

    // jika prec kurang dari hasil function count_element(*L), maka :
    if (prec < count_elemen(*L))
    {
        int count = 1;            // count = 1
        int sebelum = (*L).first; // isi dari sebelum = (*L).first

        // saat count kurang dari prec, lakukan :
        while (count < prec)
        {
            count++; // tambah count dengan 1
            // isi dari sebelum = (*L).data[sebelum].next
            sebelum = (*L).data[sebelum].next;
        }

        // isi dari temp = (*L).data[sebelum].next
        temp = (*L).data[sebelum].next;
        // isi dari (*L).data[sebelum].next = (*L).data[temp].next
        (*L).data[sebelum].next = (*L).data[temp].next;
        temp = -2; // isi dari temp = -2
    }
    else
    {                          // selain itu
        int last = (*L).first; // isi dari int last = (*L).first
        int beforeLast;        // deklarasi variable beforeLast

        // saat (*L).data[last].next tidak sama dengan -1
        while ((*L).data[last].next != -1)
        {
            beforeLast = last;           // isi dari beforeLast = last
            last = (*L).data[last].next; // isi dari last = (*L).data[last].next
        }
        (*L).data[beforeLast].next = -1; // isi dari (*L).data[beforeLast].next = -1
        (*L).data[last].next = -2;       // isi dari (*L).data[last].next = -2
    }
}

// Method/Structure delete_last
// Untuk menghapus data pada list akhir
// dengan parameter dengan tipe list pointer L
void delete_last(list *L)
{
    // jika (*L).first tidak sama dengan -1
    if ((*L).first != -1)
    {
        // jika hasil dari function count_elemen(*L) sama dengan 1, maka
        if (count_elemen(*L) == 1)
        {
            delete_first(L); // jalankan fungsi delete_first(L)
        }
        else
        {                          // selain itu
            int last = (*L).first; // isi dari last = (*L).first
            int beforeLast;        // deklarasi variable beforeLast

            // saat (*L).data[last].next tidak sama dengan -1, maka :
            while ((*L).data[last].next != -1)
            {
                beforeLast = last;           // isi dari beforeLast = last
                last = (*L).data[last].next; // isi dari last = (*L).data[last].next
            }
            (*L).data[beforeLast].next = -1; // isi dari (*L).data[beforeLast].next = -1
            (*L).data[last].next = -2;       // isi dari (*L).data[last].next = -2
        }
    }
    else
    { // selain itu
        // jika data kosong
        printf("Data Kosong\n");
    }
}

// Method/Structure printElement
// yang berisi parameter list L
//  Berfungsi untuk print isi semua data
void printElemen(list L)
{
    // Jika L.first tidak sama dengan -1
    // Jika data nya tidak kosong
    if (L.first != -1)
    {
        int elmt = L.first; // Simpan nilai L.first dalam elmt
        int i = 1;          // variable untuk perulangan

        // saat elmt tidak sama dengan -1
        while (elmt != -1)
        {
            // Print Data
            printf("DATA KE : %d\n\n", i);
            printf("Kode Mata Kuliah : %s\n", L.data[elmt].elmt.kode_matkul);
            printf("Nama Mata Kuliah : %s\n", L.data[elmt].elmt.nama_matkul);
            printf("SKS : %d\n", L.data[elmt].elmt.sks);
            //printf("next : %d\n",L.data[elmt].next);
            printf("\n=============================================\n");
            elmt = L.data[elmt].next; // elmt = L.data[elmt].next
            i = i + 1;                // tambah i dengan 1
        }
    }
    else
    { // selain itu
        // jika data nya kosong atau L.first = -1
        printf("Data Kosong\n");
    }
}

// Main function sebagai program utama
int main()
{
    // Deklarasi Variable
    int pilihan, tambah, hapus,
        sisipan, del;
    char kode_matkul[10];
    char nama_matkul[50];
    int sks;
    list L; // membuat struct list baru dengan nama L

    // Membuat list kosong
    // Jalankan method create_list dengan isinya adalah pointer dari L
    create_list(&L);

    // Membuat Menu dengan menggunakan perulangan do
    // dan switch case
    do
    {
        printf("\n====================MENU MATA KULIAH=====================\n");
        printf("[1] Input data\n");
        printf("[2] Hapus Data\n");
        printf("[3] Lihat Data\n");
        printf("[4] Exit\n");
        printf("\n");
        printf("Masukkan Pilihan Anda : ");
        scanf("%d", &pilihan);

        // Switch case untuk menu awal
        switch (pilihan)
        {
        case 1:
        {                  // jika Memilih menu 1
            system("cls"); // clear screen DOS
            do
            { // perulangan untuk menu no 1
                printf("\n====================MENU MATA KULIAH=====================\n");
                printf("\n");
                printf("Pilihan Input : \n");
                printf("[1] Input di awal\n");
                printf("[2] Input di tengah\n");
                printf("[3] Input di akhir\n");
                printf("[4] Exit\n");
                printf("\n");
                printf("masukan pilihan anda : ");
                scanf("%d", &tambah);

                // Switch case untuk menu Input
                switch (tambah)
                {
                case 1:
                {                  // jika Memilih menu 1
                    system("cls"); // clear screen DOS
                    printf("Masukan Data Terlebih Dahulu !!\n");
                    printf("\n");
                    printf("Kode Mata kuliah : ");
                    fflush(stdin);     // membersihkan output buffer
                    gets(kode_matkul); // input dari keyboard untuk variable kode_matkul
                    printf("Nama Mata Kuliah : ");
                    fflush(stdin);     // membersihkan output buffer
                    gets(nama_matkul); // input dari keyboard untuk variable nama_matkul
                    printf("SKS : ");
                    scanf("%d", &sks); // input dari keyboard untuk variable sks
                                       // menjalankan method add_first untuk menambah data di awal
                    add_first(&L, kode_matkul, nama_matkul, sks);
                    printf("Data Berhasil Diisi\n");
                    system("pause"); // pause untuk dos
                    system("cls");   // clear screen untuk dos
                }
                break; // break switch case

                case 2:
                {                  // jika menu yang dipilih 2
                    system("cls"); // clear screen untuk DOS
                    printf("Masukkan Pilihan Sisipan : ");
                    scanf("%d", &sisipan); // input untuk variable sisipan
                    printf("\n");
                    printf("masukan data terlebih dahulu !!\n");
                    printf("kode Mata kuliah : ");
                    fflush(stdin);     // membersihkan output buffer
                    gets(kode_matkul); // input untuk variable kode_matkul
                    printf("Nama Mata Kuliah : ");
                    fflush(stdin);     // membersihkan output buffer
                    gets(nama_matkul); // input untuk variable nama_matkul
                    printf("SKS : ");
                    scanf("%d", &sks); // input untuk variable sks

                    // menjalankan method add_after untuk menambah data setelah inputan sisipan
                    add_after(&L, sisipan, kode_matkul, nama_matkul, sks);
                    printf("Data Berhasil Diisi\n");
                    system("pause"); // pause untuk DOS
                    system("cls");   // clear screen untuk DOS
                }
                break; // break switch case

                case 3:
                {                  // jika menu yang dipilih 3
                    system("cls"); // clear screen untuk DOS
                    printf("Masukkan Data Terlebih Dahulu !!\n");
                    printf("Kode Mata kuliah : ");
                    fflush(stdin);     // membersihkan output buffer
                    gets(kode_matkul); // input untuk variable kode_matkul
                    printf("Nama Mata Kuliah : ");
                    fflush(stdin);     // membersihkan output buffer
                    gets(nama_matkul); // input untuk variable nama_matkul
                    printf("SKS : ");
                    scanf("%d", &sks); // input untuk variable sks

                    // menjalankan method add_last untuk menambah data di akhir
                    add_last(&L, kode_matkul, nama_matkul, sks);
                    printf("Data Berhasil Diisi\n");
                    system("pause"); // pause untuk DOS
                    system("cls");   // clear screen untuk DOS
                }
                break; // break switch case
                }
                system("cls");     // clear screen untuk DOS
            } while (tambah != 4); // jalankan jika tambah tidak sama dengan 4
        }
        break;

        case 2:
        {                  // jika menu yang dipilih 2
            system("cls"); // clear screen untuk DOS
            // perulangan untuk menu 2
            do
            {
                printf("\n====================MENU MATA KULIAH=====================\n");
                printf("\n");
                printf("Pilihan Hapus : \n");
                printf("[1] Hapus di awal\n");
                printf("[2] Hapus di tengah\n");
                printf("[3] Hapus di akhir\n");
                printf("[4] Exit\n");
                printf("\n");
                printf("Masukkan Pilihan Anda : ");
                scanf("%d", &hapus); // input untuk pilihan switch case

                // switch case untuk menu hapus
                switch (hapus)
                {
                case 1:
                {                  // jika memilih 1
                    system("CLS"); // clear screen untuk DOS
                    printf("Hapus Data Di Awal\n");
                    // jalankan method delete_first untuk menghapus data di awal
                    delete_first(&L);
                    printf("Berhasil dihapus\n");
                    system("PAUSE");
                    system("cls"); // clear screen untuk DOS
                }
                break; // hentikan switch case

                case 2:
                {                  // jika memilih 2
                    system("CLS"); // clear screen untuk DOS
                    printf("Hapus Data Tengah\n");
                    printf("Masukkan Elemen Ke berapa : \n");
                    scanf("%d", &del); // input untuk menentukan elemen ke berapa yang dihapus
                    // jalankan method delete_after dengan parameter input yang tadi
                    delete_after(&L, del);
                    printf("Berhasil \n");
                    system("PAUSE");
                }
                break; // hentikan switch case

                case 3:
                {                  // jika memilih 3
                    system("cls"); // clear screen untuk DOS

                    // jalankan method delete_last untuk menghapus data di akhir
                    delete_last(&L);
                    printf("Data Berhasil Dihapus\n");
                    system("pause"); // pause untuk dos
                    system("cls");   // clear screen untuk DOS
                }
                break; // hentikan switch case
                }
                system("cls");    // clear screen untuk DOS
            } while (hapus != 4); // jalankan perulangan jika hapus tidak sama dengan 4
        }
        break; // hentikan switch case menu utama

        case 3:
        {                  // jika memilih menu 3
            system("cls"); // clear screen
            printf("\n=====================MATA KULIAH===================\n");
            printf("\n");
            printf("\n-DATA MATA KULIAH-\n");
            printElemen(L); // jalankan method printElemen untuk print semua data
            system("pause");
            system("cls"); // clear screen untuk DOS
        }
        break; // hentikan switch case
        }
        system("cls");      // clear screen
    } while (pilihan != 4); // jalankan perulangan jika pilihan tidak sama dengan 4

    return 0; // main function tidak mengembalikan apa2
}