/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment5;

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Server {
    public static void main (String[] args) throws IOException{
        //Step 2: Create server socket
        ServerSocket ss = new ServerSocket(1234);
        Socket s;
        while(true){
        //Step 3: Listen on this port/ waiting for incoming connections
       // System.out.println("Accepting connections");
         s = ss.accept();
       // System.out.println("Connected with client");

        //Step 4: Read and write streams
        InputStream is = s.getInputStream();
        InputStreamReader isr= new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);  

        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os, true);
        
        // Step 5: send/receive messages
        

        String recMsg = br.readLine(); 
        System.out.println(recMsg);
        String choice=recMsg.substring(recMsg.length()-1);
//        System.out.println(choice);
        String msg="";
        if(choice.equals("1")){
            msg="you can cast your vote by clickling the cast vote button";
        }else if(choice.equals("2")){
            msg="you can see your details in personal details section";
        }else if(choice.equals("3")){
            msg="you can cast your vote only one time";
        }
//        Scanner sc = new Scanner(System.in);
        System.out.print("Server : ");
//        String msg = sc.nextLine();
        pw.println("Server : "+msg);
        pw.println("Welcome to our Voter Support System\n 1.how can you cast my vote\n 2.where wll you find personal details\n 3.how many times i can cast my vote ");
        
        //Step 6: Close socket
        s.close(); 
        
        }
    }
}

