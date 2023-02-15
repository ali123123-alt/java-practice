/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;


/**
 *
 * @author Dell
 */
public class Task implements Runnable {

    int n;

    Task(int number) {
        n = number;
    }

    @Override
    public void run() {
        if (n == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.println("a");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } else if (n == 2) {
            for (int i = 0; i < 10; i++) {
                System.out.println("b");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } else if (n == 3) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i+1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task obj = new Task(1);
        Task obj1 = new Task(2);
        Task obj2 = new Task(3);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        Thread t3 = new Thread(obj2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }

}
