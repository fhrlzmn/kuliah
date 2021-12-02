.Model small
.Code
Org 100h

Text: JMP Mulai                     ; lompat ke mulai
Tulis db 'UNIVERSITAS BALE BANDUNG' ; 24 karakter dengan space

Mulai:
XOR BX,BX           ; BX=0 untuk petunjuk offset
MOV CX,33           ; Counter LOOP

Ulang:
MOV DL,TULIS[BX]    ; Ambil karakter ke BX
MOV AH,02           ; Servis untuk cetak karakter
INT 21h             ; cetak karakter
INC BX              ; BX++
LOOP Ulang          ; ulangi Ulang sampai CX=0
INT 20h             ; selesai, kembali ke dos
END Text