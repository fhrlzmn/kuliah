.model small
.code

org 100h

proses:
mov ah,02h      ; nilai servis
mov dl,50h      ; dl=ascii code huruf 'P'
mov cx,7h       ; banyak perulangan
                
ulang:
int 21h         ; cetak karakter
inc dl          ; dl+1
loop ulang      ; ulangi ulang
int 20h
end proses