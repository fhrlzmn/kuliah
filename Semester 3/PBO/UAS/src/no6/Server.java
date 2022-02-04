package no6;

import java.io.*;
import java.net.*;

public class Server {
    public static void main (String[] args){
        String[] questions = {
                "1# Siapa Pembuat Java?",
                "2# JDK 1.0 Pertama Kali Dirilis Tahun Berapa?",
                "3# Siapa Bapak Pendidikan Nasional?",
                "4# Siapa Presiden Pertama Republik Indonesia?",
                "5# Tahun Berapa Indonesia Merdeka?"
        };

        String[] answers = {
                "1# James Gosling",
                "2# 1996",
                "3# Ki Hajar Dewantara",
                "4# Ir. Soekarno",
                "5# 1945"
        };

        // Variable untuk memunculkan pertanyaan random
        int max = 4;
        int min = 0;
        int range = max - min + 1;

        System.out.println("FTI UNIBBA SERVER ");
        try (ServerSocket echoServer = new ServerSocket(8000)) {
            Socket clientSocket= echoServer.accept();
            System.out.println("Berhasil Terhubung ke Client");
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(),true);
            String line;
            while((line = bufferReader.readLine())!= null) {
                System.out.println("Pesan dari Client : " + line);

                switch (line) {
                    case "halo" -> output.println("hai");
                    case "ping" -> output.println("pong");
                    case "permintaan" -> {
                        int rand = (int) (Math.random() * range) + min;
                        output.println(questions[rand]);
                    }
                    case "jawaban" -> output.println("Berikan jawabanmu dengan format: <nomor pertanyaan>#<jawaban Anda>");
                }

                for (String answer : answers) {
                    if (line.equals(answer)) {
                        output.println("Kerja Bagus!");
                    } else {
                        output.println("Jawaban Salah!");
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}