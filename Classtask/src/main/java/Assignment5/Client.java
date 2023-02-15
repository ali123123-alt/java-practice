/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment5;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        while (true) {
            Socket s = new Socket("localhost", 1234);
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            System.out.println("Welcome to our Voter Support System\n 1.how can you cast my vote\n 2.where wll you find personal details\n 3.how many times i can cast my vote ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Client : ");
            String msg = sc.nextLine();
            pw.println("Client : " + msg);
            if (msg.equals("bye")) {
                s.close();
                break;
            }
            String recMsg = br.readLine();
            System.out.println(recMsg);
            s.close();
        }
    }
}
