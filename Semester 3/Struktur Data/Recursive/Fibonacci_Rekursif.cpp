// Fibonacci Rekursif

#include <stdio.h>

// Sudah Benar tdk ada yang Salah
int fibo_r(int n)
{
    if (n == 1)
        return 1;
    else if (n == 2)
        return 1;
    else
        return fibo_r(n - 2) + fibo_r(n - 1);
}

// Tambahkan main function untuk dijalankan
// Saat program pertama kali dijalankan
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Fibonacci Rekursif ==============\n");

    int fib;
    printf("Masukkan angka Fibonacci ke berapa : ");
    scanf("%d", &fib);
    // Panggil function fibonacci
    printf("Hasil Fibonacci ke %d adalah : %d\n", fib, fibo_r(fib));

    return 0;
}