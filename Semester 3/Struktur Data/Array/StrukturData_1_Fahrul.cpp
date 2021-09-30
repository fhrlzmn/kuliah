// Tugas 1 Struktur Data

#include <stdio.h>

int main() {
  // Identitas
  printf("Nama  : Fahrul Zaman\nProdi : Teknik Informatika\nNIM   : 301200020\n");

  printf("\n=============== Array 1 Dimensi ==============\n");
  // Membuat array 1 Dimensi
  // nama_array[isi]
  int nilai[15] = {12, 21, 53, 34, 45, 96, 57, 38, 29, 10, 42, 123, 894, 21, 77};

  // Mencetak semua isi array 1 Dimensi
  for (int i = 0; i < 15; i++) {
    printf("Nilai ke - %d: %d\n", i+1, nilai[i]);
  }
  
  return 0;
}