// Tower Of Hanoi

#include <stdio.h>

// Sudah Benar
void towers(int n, char awal, char akhir, char antara)
{
    if (n == 1)
        printf("Pindahkan piringan 1 dari %c ke %c\n", awal, akhir);
    else
    {
        towers(n - 1, awal, antara, akhir);
        printf("Pindahkan piringan %d dari %c ke %c\n", n, awal, akhir);
        towers(n - 1, antara, akhir, awal);
    }
}

// Ganti void main()
// dengan int main()
int main()
{
    // Identitas
    printf("Nama  : Fahrul Zaman\n");
    printf("NIM   : 301200020\n");
    printf("Prodi : Teknik Informatika\n");
    printf("\n=============== Tower Of Hanoi ==============\n");

    int n;
    printf("Berapa piringan ? ");
    scanf("%d", &n);
    towers(n, 'A', 'C', 'B');
}
