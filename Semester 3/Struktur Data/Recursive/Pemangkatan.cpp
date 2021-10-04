// Pemangkatan

#include <stdio.h>
#include <iostream>

using namespace std;

// Pemangkatan Iteratif
int power2(int m, int n)
{
    int p = 1;
    for (int i = 1; i <= n; i++)
        p *= m;
    return p;
}

// Pemangkatan Rekursif
int power(int m, int n)
{
    if (n == 1 || n == 0)
        return m;
    else
        return m * power(m, n - 1);
}

// Tambahkan main function untuk dijalankan
// Saat program pertama kali dijalankan
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Pemangkatan ==============\n");

    int m, n;
    printf("Perpangkatan dengan Function Iteratif & Rekursif\n");
    cout << "Masukkan nilai : ";
    cin >> m;
    cout << "Pangkat Berapa? : ";
    cin >> n;

    // Pemanggilan function
    printf("Function Iteratif : %d\n", power2(m, n));
    printf("Function Rekursif : %d\n", power(m, n));
    return 0;
}