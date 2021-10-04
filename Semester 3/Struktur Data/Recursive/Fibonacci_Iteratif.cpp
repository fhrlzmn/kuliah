// Fibonacci Iteratif

#include <stdio.h>

int fibonacci(int n)
{
    // Deret Fibonacci
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987...
    int f1 = 1, f2 = 0, fibo; // dari f2 = 1 menjadi 0

    // Sebelum
    // if (n == 1 || n == 2)
    //     fibo = 1;
    // else
    if (n == 1)
        return 0;
    else if (n == 2)
        return 1;
    else
    {
        for (int i = 1; i < n; i++) // dari i = 2; i <= n
        {
            fibo = f1 + f2;
            f2 = f1;   // dari f1 = f2
            f1 = fibo; // dari f2 = f1
        }
        return fibo;
    }
}

// Tambahkan main function untuk dijalankan
// Saat program pertama kali dijalankan
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Fibonacci Iteratif ==============\n");

    int fib;
    printf("Masukkan angka Fibonacci ke berapa : ");
    scanf("%d", &fib);
    // Panggil function fibonacci
    printf("Hasil Fibonacci ke %d adalah : %d\n", fib, fibonacci(fib));

    return 0;
}