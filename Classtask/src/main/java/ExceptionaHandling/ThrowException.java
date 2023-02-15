/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionaHandling;

/**
 *
 * @author Dell
 */
public class ThrowException {
    public static void main(String[] args) {
    try {
      throw new Exception("Throwing an exception.");
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    } finally {
      System.out.println("The finally block executed");
    }

    System.out.println("Program Finished");
  }
}
