#include <stdio.h>
#include <iostream>
#include <string.h>

using namespace std;

// Membuat variable struct
struct Mahasiswa {
	string nama;
	string golDar;
	unsigned int jumlahSdr;
};

int main() {
	// Identitas
    printf("=============================\n");
    printf("Nama    : Fahrul Zaman\n");
    printf("NIM     : 301200020\n");
    printf("Prodi   : IF Pagi\n");
    printf("UTS No 3B\n");
    printf("=============================\n\n");
	
	// Membuat struct mhs01 dan mhs02 dari Mahasiswa
	struct Mahasiswa mhs01;
	struct Mahasiswa mhs02;

	// Menentukan mhs01
	mhs01.nama = "Ujang";
	mhs01.golDar = "AB";
	mhs01.jumlahSdr = 4;
	
	// Menentukan mhs02
	mhs02.nama = "Yatno";
	mhs02.golDar = "O";
	mhs02.jumlahSdr = 2;

	// Print Struct Mahasiswa
	cout << "Membuat Daftar Mahasiswa dengan Record pada C++" << endl;
	cout << "===============================================" << endl;
	cout << "Nama		Golongan Darah		Jumlah Saudara" << endl;
	cout << mhs01.nama << "		";
	cout << mhs01.golDar << "			";
	cout << mhs01.jumlahSdr << endl;
	
	cout << mhs02.nama << "		";
	cout << mhs02.golDar << "			";
	cout << mhs02.jumlahSdr << endl;
	
	return 0;
}