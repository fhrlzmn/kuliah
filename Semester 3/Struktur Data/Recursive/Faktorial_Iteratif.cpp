// Faktorial Iteratif

#include <stdio.h>

int fact_it(int n)
{
    // Tambahkan nilai default 1 ke variable fak
    // int i, fak;
    int i, fak = 1;

    // temp Error karena tdk di deklarasikan terlebih dahulu
    // Dan juga tidak digunakan, jdi lebih baik dihapus
    // temp = 1;

    // Tambahkan percabangan jika faktorial 1 atau lebih kecil dari 0
    if (n == 0)
    {
        return 1; // faktorial 0 akan 1
    }
    else if (n < 0)
    {
        return 0; // faktorial <0 error
    }
    else
    {
        for (i = 1; i <= n; i++)
            fak = fak * i;
    }

    // harus return variable
    // return (fak); // Sebelum
    return fak; // Sesudah
}

// void main() harus diganti int main()
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Faktorial Iteratif ==============\n");

    int fac;
    printf("Masukkan berapa faktorial : ");
    scanf("%d", &fac);
    // printf("Hasil faktorial dari adalah : %d\n", fact_it(fac));
    printf("Hasil faktorial dari %d adalah : %d\n", fac, fact_it(fac)); // Ubah
    return 0;                                                           // tambahkan return karena bukan void
}
