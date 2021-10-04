// Dynamic Programming

#include <stdio.h>

int fibo2(int n)
{
    // Masukkan ke dalam if
    if (n < 1)
        return 0;
    else if (n <= 2)
        return 1;
    else
    {
        int result[n]; // mengubah isi result sesuai dengan input n
        result[0] = 0;
        result[1] = 1;

        // mengubah ubah ii ke i
        for (int i = 2; i <= n; i++)
        {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}

// Membuat main function untuk menjalankan program utama
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Dynamic Programming ==============\n");

    int fib;
    printf("Masukkan angka Fibonacci ke berapa : ");
    scanf("%d", &fib);
    // Panggil function fibonacci
    printf("Hasil Fibonacci ke %d adalah : %d\n", fib, fibo2(fib));

    return 0;
}