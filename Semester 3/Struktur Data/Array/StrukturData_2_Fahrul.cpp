// Tugas 2 Struktur Data

#include <stdio.h>

int main() {
  // Identitas
  printf("Nama  : Fahrul Zaman\nProdi : Teknik Informatika\nNIM   : 301200020\n");
  
  printf("\n=============== Array 2 Dimensi ==============\n");
  // Membuat Array 2 Dimensi 
  // nama_array[baris][kolom]
  int matriks[5][5] = {
    {51, 72, 23, 44, 95}, 
    {26, 47, 86, 91, 10}, 
    {17, 42, 14, 98, 85},
    {46, 57, 88, 29, 25},
    {51, 42, 73, 46, 12}
  };

  // Mencetak semua isi array 2 dimensi
  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      printf("%d ", matriks[i][j]);
    }
    printf("\n");
  }

  // Mencetak isi array matriks[2][3]
  printf("\nIsi dari matriks[2][3] adalah : %d", matriks[2][3]);
  
  return 0;
}