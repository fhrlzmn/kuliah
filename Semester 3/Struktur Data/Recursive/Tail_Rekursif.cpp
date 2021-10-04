// Tail Rekursif

#include <stdio.h>

// Pindahkan fiboHelp ke atas
// Agar bisa digunakan di fib4
static long fiboHelp(long x, long y, int n)
{

    if (n == 0)
        return x;
    else if (n == 1)
        return y;
    else
        return fiboHelp(y, x + y, n - 1);
}

// Hapus public
static long fib4(int n)
{
    return fiboHelp(0, 1, n);
}

// Tambahkan main function untuk dijalankan
// Saat program pertama kali dijalankan
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Tail Rekursif ==============\n");

    int fib;
    printf("Masukkan angka Fibonacci ke berapa : ");
    scanf("%d", &fib);
    // Panggil function fibonacci
    printf("Hasil Fibonacci ke %d adalah : %ld\n", fib, fib4(fib));

    return 0;
}
