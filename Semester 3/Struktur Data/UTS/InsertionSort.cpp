#include <stdio.h>

// Function untuk Menampilkan semua Array
void printArray(int array[], int jumlah) {
	printf("\nArray Setelah di Urutkan :\n");
	
	// Menggunakan For untuk Menampilkan Semua Data Array
	for (int i = 0; i < jumlah; i++) {
		printf("%d  ", array[i]);
	}
}

// Function input Array
int *inputArray(int jumlah) {
	// Membuat Variable Pointer Array berjumlah yang diinputkan
	int* array = new int[jumlah]; 
	
	// Input Masing-masing index dengan for
	for (int i = 0; i < jumlah; i++) {
		printf("Data ke-%d : ", i + 1);
		scanf("%d", &array[i]);
	}
	
	// Function ini mengembalikan nilai pada variable array
	return array; 
}

// Function untuk Selection Sort
int *insertionSort(int jumlah) {
	// Deklarasi Variable
	// Pointer Array berisi kembalian dari function inputArray
	int *array = inputArray(jumlah); 
	int indexAwal, indexPilihan, indexSementara;
	
	for (int i = 0; i < jumlah; i++) {
		indexPilihan = i; // indexPilihan berisi i awalnya
		
		while (indexPilihan > 0) {
			if (array[indexPilihan] < array[indexPilihan-1]) {
				indexSementara = array[indexPilihan];
				array[indexPilihan] = array[indexPilihan-1];
				array[indexPilihan-1] = indexSementara;
			}
			
			indexPilihan--;
		}
	}
	
	return array; // Function ini mengembalikan Array yang sudah di Sorting
}

// Main Function sebagai program utama
int main() {	
	// Identitas
    printf("=============================\n");
    printf("Nama    : Fahrul Zaman\n");
    printf("NIM     : 301200020\n");
    printf("Prodi   : IF Pagi\n");
    printf("UTS No 1B\n");
    printf("=============================\n\n");
    
    // Deklarasi Variabel
    int jumlah, cari, awal, akhir;
    
    // Input Jumlah Data
    printf("Masukkan Jumlah Data : ");
    scanf("%d", &jumlah);
    
    // Program Utama
    // Membuat variable pointer array yang berisi
    // nilai kembalian dari function insertionSort();
	int* array = insertionSort(jumlah);
	printArray(array, jumlah); // panggil function printArray()
	
	return 0; 
	// main function mengembalikan nilai 0 untuk mengakhiri program
	// dan mengembalikan nilai 0
}