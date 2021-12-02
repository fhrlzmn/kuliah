DATA SEGMENT
        STR1 DB "Masukkan Nama : $"
        STR2 DB "Nama Kamu : $"
        STR3 DB "Huruf Pertama : $"
        STR4 DB "Huruf Terakhir : $"
        INSTR1 DB 20 DUP("$")
        NEWLINE DB 10,13,"$"
        N DB "$"
        S DB ?

DATA ENDS

CODE SEGMENT
        ASSUME DS:DATA,CS:CODE
START:

        MOV AX,DATA
        MOV DS,AX

        LEA SI,INSTR1

;Dapatkan String
        MOV AH,09H
        LEA DX,STR1
        INT 21H

        MOV AH,0AH
        MOV DX,SI
        INT 21H


        MOV AH,09H
        LEA DX,NEWLINE
        INT 21H

;Print String

        MOV AH,09H
        LEA DX,STR2
        INT 21H

        MOV AH,09H
        LEA DX,INSTR1+2
        INT 21H

        MOV AH,09H
        LEA DX,NEWLINE
        INT 21H

;Print Huruf Pertama

        MOV AH,09H
        LEA DX,STR3
        INT 21H

        MOV AH,02H
        MOV DL,INSTR1+2
        INT 21H

        MOV AH,09H
        LEA DX,NEWLINE
        INT 21H

;Print Huruf Terakhir

        MOV AH,09H
        LEA DX,STR4
        INT 21H

        ADD SI,3

     L1:
        DEC SI
        MOV BL,BYTE PTR[SI]

        ADD SI,2
        CMP BYTE PTR[SI],"$"
        JNE L1

        MOV AH,02H
        MOV DL,BL
        INT 21H

        MOV AH,4CH
        INT 21H


CODE ENDS
END START