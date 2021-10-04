// FPB Iteratif

#include <stdio.h>

// Membuat function untuk fpb iterator
int fpb_i(int m, int n)
{
    // Deklarasi
    int r;

    do
    {
        r = m % n;
        if (r != 0)
        {
            m = n;
            n = r;
        }
    } while (r > 0); // Mengubah r == 0 menjadi r > 0

    return n;
}

// Main function untuk dijalankan
// saat pertama kali program dijalankan
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== FPB Iteratif ==============\n");

    int m = 228, n = 90;

    // Panggil function FPB Iterator
    printf("FPB dari %d dan %d adalah : %d\n", m, n, fpb_i(m, n));
    return 0;
}
