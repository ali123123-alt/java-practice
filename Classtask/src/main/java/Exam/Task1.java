/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author Dell
 */
public class Task1 implements Runnable {

    int n;

    Task1(int number) {
        n = number;
    }

    @Override
    public void run() {
        if (n == 1) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.yield();
            }
        }
        else if (n == 2) {
            for (int i = 6; i < 10; i++) {
                System.out.println(i);
                Thread.yield();
            }
        }
        else if (n == 3) {
            for (int i = 6; i < 10; i++) {
                System.out.println(i);
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        Task1 obj = new Task1(1);
        Task1 obj1 = new Task1(2);
        Task1 obj2 = new Task1(3);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        Thread t3 = new Thread(obj2);

        t1.start();
        t2.start();
        t3.start();
    }
}
