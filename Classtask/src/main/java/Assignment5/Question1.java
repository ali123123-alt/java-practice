/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment5;

import java.util.*;

public class Question1 implements Runnable {
    
    private static ArrayList<Integer> arraylist = new ArrayList<Integer>();
    private static Queue<Integer> queue = new LinkedList<>();
    Scanner console = new Scanner(System.in);
    int number,n1, n2, result = 0;
    String choice;

    @Override
    public synchronized void run() {
        if (arraylist.isEmpty() && queue.isEmpty()) {
            System.out.println("Thread : " + Thread.currentThread().getName());
            System.out.println("Enter first number ");
            number = console.nextInt();
            arraylist.add(number);
            System.out.println("Enter Second number ");
            number = console.nextInt();
            arraylist.add(number);
        } else if (queue.isEmpty()) {
            System.out.println("Thread : " + Thread.currentThread().getName());
            n1 = arraylist.remove(1);
            n2 = arraylist.remove(0);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter operator to perform: ");
            choice = s.next();
            switch (choice) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;
            }
            queue.add(result);
        } else {
            System.out.println("Thread : " + Thread.currentThread().getName());
            System.out.println("Queue Element : " + queue.element());
        }
    }

    public static void main(String[] args) {

        Question1 obj = new Question1();
        Thread t1 = new Thread(obj, "A");
        Thread t2 = new Thread(obj, "C");
        Thread t3 = new Thread(obj, "B");
        t1.start();
        t2.start();
        t3.start();
    }

}
