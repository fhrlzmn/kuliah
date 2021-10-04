// Faktorial Rekursif

#include <stdio.h>

int fact_rec(int n)
{
    if (n < 0)
        return 0;
    else if (n == 0)
        return 1;
    else if (n == 1)
        return 1;
    else
        return n * fact_rec(n - 1);
}

// Harus int main()
// void main() // Sebelum
int main() // Sesudah
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Faktorial Rekursif ==============\n");

    int fac;
    printf("Masukkan berapa faktorial : ");
    scanf("%d", &fac);
    printf("Hasil faktorial dari adalah : %d\n", fact_rec(fac));

    // Tambahkan return 0
    return 0;
}
