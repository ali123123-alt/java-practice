/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Question3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Word");
        String word = console.next();
        System.out.println("Enter Seperator");
        String Seperator = console.next();
        System.out.println("Enter Number");
        int number = console.nextInt();
        for (int i = 0; i < number - 1; i++) {
            System.out.print(word);
            System.out.print(Seperator);
        }
        System.out.println(word);
    }
}
