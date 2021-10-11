#include <stdio.h>

// Function Pencarian Metode Interpolasi
void interpolationSearch(int data[], int cari, int awal, int akhir)
{
    bool ketemu = false;
    int pos;

    do
    {
        pos = awal + ((cari - data[awal]) / (data[akhir] - data[awal])) * (akhir - awal); // Rumus Interpolasi
        if (data[pos] == cari)
        {
            ketemu = true;
            break;
        }
        if (data[pos] > cari)
            akhir = pos - 1;
        else if (data[pos] < cari)
            awal = pos + 1;

    } while (cari >= data[awal] && cari <= data[akhir]);

    if (ketemu)
    {
        printf("\nData Ditemukan pada Indeks ke-%d\n", pos);
    }
    else
    {
        printf("\nData Tidak Ditemukan\n");
    }
}

int main()
{
    // Identitas
    printf("=============================\n");
    printf("Nama    : Fahrul Zaman\n");
    printf("NIM     : 301200020\n");
    printf("Prodi   : IF Pagi\n");
    printf("=============================\n\n");

    // Deklarasi Variable
    int jumlah, tkr, cari,
        posisi, awal, akhir;

    // Input Jumlah Data
    printf("Masukkan Jumlah Data : ");
    scanf("%d", &jumlah);

    // Input setiap data
    int data[jumlah];

    for (int i = 0; i < jumlah; i++)
    {
        printf("Data ke-%d : ", i + 1);
        scanf("%d", &data[i]);
    }

    // Pengurutan Data
    for (int i = 0; i < jumlah; i++)
    {
        for (int j = i + 1; j < jumlah; j++)
        {
            if (data[i] > data[j])
            {
                tkr = data[i];
                data[i] = data[j];
                data[j] = tkr;
            }
        }
    }

    // Print Data Yang Sudah Diurutkan
    printf("\nData Yang Sudah Diurutkan : \n");
    for (int k = 0; k < jumlah; k++)
    {
        printf("%d  ", data[k]);
    }
    printf("\n\n");

    // Pencarian Data
    printf("Masukkan data yang dicari : ");
    scanf("%d", &cari);

    awal = 0;
    akhir = jumlah - 1;

    // Panggil Fungsi Interpolasi
    interpolationSearch(data, cari, awal, akhir);

    return 0;
}
