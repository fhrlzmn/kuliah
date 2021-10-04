// FPB Rekursif

#include <stdio.h>

// Sudah Benar
int FPB(int m, int n)
{
    if (m == 0)
        return n;
    else if (m < n)
        return FPB(n, m);
    else
        return FPB(m % n, n);
}

// Main function untuk dijalankan
// saat pertama kali program dijalankan
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== FPB Rekursif ==============\n");

    int m = 228, n = 90;

    // Panggil function FPB Rekursif
    printf("FPB dari %d dan %d adalah : %d\n", m, n, FPB(m, n));
    return 0;
}