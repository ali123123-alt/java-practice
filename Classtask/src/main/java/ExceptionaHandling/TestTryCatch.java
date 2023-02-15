/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionaHandling;

/**
 *
 * @author Dell
 */
public class TestTryCatch {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        try {
            System.out.println("Try block entered " + "i = "+ i + " j = "+j);
            System.out.println(i/j); // Divide by 0 - exception thrown
            System.out.println("Ending try block");
        } 
        catch(ArithmeticException e) { // Catch the exception
            System.out.println("Arithmetic exception caught");
        }
        System.out.println("After try block");
    }
}
