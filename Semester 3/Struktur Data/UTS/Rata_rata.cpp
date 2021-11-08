#include <stdio.h>

float hitungRataRata(float array[], int jumlah) {
	float totalNilai = 0;
	for (int i = 0; i < jumlah; i++) {
		totalNilai += array[i];
	}
	
	return totalNilai / jumlah;
}

void printNilai(float array[], int jumlah) {
	// Menggunakan For untuk Menampilkan Semua Data Array
	for (int i = 0; i < jumlah; i++) {
		printf("%.2f  ", array[i]);
	}
	printf("\n");
}

int main() {
	// Identitas
    printf("=============================\n");
    printf("Nama    : Fahrul Zaman\n");
    printf("NIM     : 301200020\n");
    printf("Prodi   : IF Pagi\n");
    printf("UTS No 2B\n");
    printf("=============================\n\n");
    
    // Deklarasi
    float pancasila[3] = {70, 87, 85};
	float algoritma[3] = {89, 79, 77};
	float indonesia[3] = {95, 99, 93};
	
	float iwan[3] = {pancasila[0], algoritma[0], indonesia[0]};
	float adi[3] = {pancasila[1], algoritma[1], indonesia[1]};
	float rani[3] = {pancasila[2], algoritma[2], indonesia[2]};
    
    // Print Semua Nilai
    printf("Nilai Mata Kuliah dan Mahasiswa\n");
    printf("		  Iwan   Adi    Rani\n");
    printf("Pancasila	: ");    printNilai(pancasila, 3);
    printf("Algoritma	: ");    printNilai(algoritma, 3);
    printf("B. Indonesia	: ");    printNilai(indonesia, 3);
    
    // Hitung Nilai Rata-rata
    printf("\nRata-rata Nilai Mata Kuliah\n");
    printf("Pancasila 	= %.2f\n", hitungRataRata(pancasila, 3));
    printf("Algoritma 	= %.2f\n", hitungRataRata(algoritma, 3));
    printf("B. Indonesia 	= %.2f\n", hitungRataRata(indonesia, 3));
	
    printf("\nRata-rata Nilai Mahasiswa\n");
    printf("Iwan 	= %.2f\n", hitungRataRata(iwan, 3));
    printf("Adi 	= %.2f\n", hitungRataRata(adi, 3));
    printf("Rani 	= %.2f\n", hitungRataRata(rani, 3));
	
	return 0;
}