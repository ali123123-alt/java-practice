/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Question1 {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream s = new FileOutputStream("ali.txt");
        PrintWriter outputStream = new PrintWriter(s);
        outputStream.println("My name is Muhammad ALi Mirza");
        outputStream.println("Arid No is:20-Arid-504");
        outputStream.println("Studying in Arid agriculture University");
        outputStream.println("student of BSCS 5th semester");
        outputStream.println("I live in Mangla cantt");
        outputStream.println("I am a Full stack developer and Flutter developer");
        outputStream.println("I am learning java");
        outputStream.println("I love doing Coding");
        outputStream.println("This is the class of Mpl");
        outputStream.println("Html, CSS,  JavaSCript");
        outputStream.close();
        System.out.println("... written to ali.txt.\n Now showing output from ali.txt");
        try {
            File myObj = new File("ali.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String data = myReader.next();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
