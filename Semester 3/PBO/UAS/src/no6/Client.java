package no6;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        System.out.println("Client FTI UNIBBA");
        try{
            InetAddress localHost = InetAddress.getLocalHost();
            Socket socket = new Socket(localHost,8000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println ("Berhasil Terhubung ke Server FTI UNIBBA");
            Scanner scanner = new Scanner (System.in);
            while (true){
                System.out.print("Kirim Pesan Ke Server : ");
                String input = scanner.nextLine();
                if ("Exit".equalsIgnoreCase(input)){
                    break;
                }
                out.println(input);
                String response = buffer.readLine();
                System.out.println("Pesan dari Server : \n" + response);
            }
        }
        catch(Exception e){
            System.out.println(e);;
        }
    }
}