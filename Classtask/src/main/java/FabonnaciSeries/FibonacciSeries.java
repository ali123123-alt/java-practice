package FabonnaciSeries;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class FibonacciSeries {

    public static void main(String args[]) {
        int first = 0, second = 1, next;
        if (first == 0) {
            System.out.println(first);
        }
        if (second == 1) {
            System.out.println(second);
        }
        for (int i = 0; i < 10; i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.println(next);
        }
    }
}
