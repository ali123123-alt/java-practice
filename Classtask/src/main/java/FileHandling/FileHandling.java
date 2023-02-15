/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandling;

import java.io.*;
import java.util.*;

/**
 *
 * @author Dell
 */
public class FileHandling {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream s = new FileOutputStream("out.txt");
        PrintWriter outputStream = new PrintWriter(s);
        Scanner console = new Scanner(System.in);
        System.out.print("What is your Roll Number?");
        int rollno = console.nextInt();
        console.nextLine();
        outputStream.println(rollno);
        System.out.print("What is your name?");
        String name = console.nextLine();
        outputStream.println(name);
        int[] scores = new int[5];
        int marks=0;
        int totalmarks=500;
        double percentage;
        System.out.print("What are your marks?");
        for (int i = 0; i < 5; i++) {
            scores[i] = console.nextInt();
            outputStream.println(scores[i]);
            marks+=scores[i];
        }
        percentage=(marks/totalmarks)*100;
//        System.out.println(rollno);
//        System.out.println(name);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(scores[i]);
//        }
        outputStream.close();
        System.out.println("... written to out.txt.");

        try {
            File myObj = new File("out.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if(percentage>80){
        System.out.println("Excellent");
        }else if(percentage<=79||percentage>=70){
        System.out.println("Good");
        }else if(percentage<=69||percentage>=60){
        System.out.println("Satisfactory");
        }else if(percentage<=59||percentage>=50){
        System.out.println("Pass");
        }else{
        System.out.println("fail");
        }
    }
}
