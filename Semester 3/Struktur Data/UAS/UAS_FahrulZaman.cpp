#include <iostream>
#include <queue>
#include <stdlib.h>
#include <string>
#include <windows.h>

using namespace std;

void gotoxy(int x, int y) {
    COORD coord;
     
    coord.X = x;
    coord.Y = y;
     
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}

int pq_display(priority_queue <int> pq, int id_komputer, int posisiX) {
	int number = 0;

	gotoxy(posisiX, 3); cout << "Komputer " << id_komputer << endl;
    while (!pq.empty())
    {
    	if (pq.top() == 3) {
    		gotoxy(posisiX, number + 4);cout << ++number << ". Teks Hitam" << endl;
		} else if (pq.top() == 2) {
    		gotoxy(posisiX, number + 4);cout << ++number << ". Teks Warna" << endl;
		} else if (pq.top() == 1) {
    		gotoxy(posisiX, number + 4);cout << ++number << ". Gambar HT/W" << endl;
		}
        pq.pop();
    }
    cout << '\n';
    return 0;
}

void list_antrian() {
	cout << endl << "Tambah Antrian berupa : " << endl;
    cout << "1. Teks Hitam" << endl;
    cout << "2. Teks Warna" << endl;
    cout << "3. Gambar HT/W" << endl;
    cout << "Pilih : ";
}

int main () {
    priority_queue <int> pq1, pq2, pq3;
    int num, pilih_menu, pilih_komputer;
    
    // Data Untuk tampilan Awal
    // ID Besar menentukan prioritas
    // ID 3 = Teks Hitam
    // ID 2 = Teks Warna
    // ID 1 = Gambar HT/W

    // Komputer 1
    pq1.push(3);
    pq1.push(1);

    // Komputer 2
    pq2.push(3);
    pq2.push(2);
    pq2.push(1);

    // Komputer 3
    pq3.push(1);
    
    menu:
    	system("cls");
    	cout << "Saya Berjanji Akan Menyelesaikan UAS ini Sendiri tanpa bantuan dari Orang Lain" << endl;
	    cout << "                                                                  Fahrul Zaman" << endl;
	    
    	// List Antrian pada Setiap Komputer
    	cout << "\tAntrian yang Akan Dicetak" << endl;
	    pq_display(pq1, 1, 0);
	    pq_display(pq2, 2, 20);
	    pq_display(pq3, 3, 40);
	    
    	// Menu	        
	    gotoxy(0, pq1.size() + 10); cout << "Menu : " << endl;
		cout << "1. Tambah Antrian" << endl;
	    cout << "2. Cetak" << endl;
	    cout << "3. Exit" << endl;
	    
        cout << endl << "Silahkan Pilih Menu : ";
        cin >> pilih_menu;
        switch (pilih_menu) {
        case 1:
        	cout << "Tambah Antrian pada : " << endl;
        	cout << "1. Komputer 1" << endl;
            cout << "2. Komputer 2" << endl;
            cout << "3. Komputer 3" << endl;
            cout << "Pilih : ";
            cin >> pilih_komputer;
            
            komputer:
				switch (pilih_komputer) {
	            	case 1:
	            		list_antrian();
	            		cin >> num;
	            		data1: 
					        if (num == 1) {
					            pq1.push(3);
					        } else if (num == 2) {
					            pq1.push(2);
					        } else if (num == 3) {
					            pq1.push(1);
					        } else {
					            cout << "Masukkan pilihan yang benar!" << endl;
					            goto data1;
					        }
	            	
	            		cout << endl << "Tambah Antrian Sukses!!!" << endl;
            			system("pause");
	            		break;
	            	case 2:
	            		list_antrian();
	            		cin >> num;
	            		data2: 
					        if (num == 1) {
					            pq2.push(3);
					        } else if (num == 2) {
					            pq2.push(2);
					        } else if (num == 3) {
					            pq2.push(1);
					        } else {
					            cout << "Masukkan pilihan yang benar!" << endl;
					            goto data2;
					        }
	            		
	            		cout << endl << "Tambah Antrian Sukses!!!" << endl;
            			system("pause");
	            		break;
	            	case 3:
	            		list_antrian();
	            		cin >> num;
	            		data3: 
					        if (num == 1) {
					            pq3.push(3);
					        } else if (num == 2) {
					            pq3.push(2);
					        } else if (num == 3) {
					            pq3.push(1);
					        } else {
					            cout << "Masukkan pilihan yang benar!" << endl;
					            goto data3;
					        }
	            		
	            		cout << endl << "Tambah Antrian Sukses!!!" << endl;
            			system("pause");
	            		break;
	            	default:
	            		cout << "Pilih Komputer yang Benar!" << endl;
	            		system("pause");
	            		break;
				}
            break;
        case 2:
        	if (pq1.empty() == true) {
        		if (pq2.empty() == true) {
        			if (pq3.empty()) {
        				cout << "Antrian Kosong, Silahkan Tambah Antrian Lagi!" << endl;
        				system("pause");
					} else {
        				pq3.pop();
					}
				} else {
					if (pq2.top() >= pq3.top()) {
						pq2.pop();
					} else if (pq3.top() > pq3.top()) {
						pq3.pop();
					}
				}
			} else {
				if (pq1.top() >= pq2.top()) {
					pq1.pop();
				} else if (pq2.top() > pq1.top()) {
					if (pq2.top() >= pq3.top()) {
						pq2.pop();
					} else if (pq3.top() > pq3.top()) {
						pq3.pop();
					}
				}
			}
            break;
        case 3:
            exit(0);
        default:
            cout << "Pilih menu yang benar";
            system("pause");
        }
    goto menu;
    return 0;
}
