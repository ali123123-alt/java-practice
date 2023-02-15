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
public class Question2 {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream s = new FileOutputStream("integer.txt");
        PrintWriter outputStream = new PrintWriter(s);
        Scanner console = new Scanner(System.in);
        int sum=0;
        System.out.println("How many integers you want to enter");
        int n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
            outputStream.println(arr[i]);
        }
        outputStream.close();
        System.out.println("... written to integer.txt.\n Showing output from integer.txt");

        try {
            File myObj = new File("integer.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                sum += Integer.parseInt(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("sum of integers are:");
        System.out.println(sum);

    }
}
