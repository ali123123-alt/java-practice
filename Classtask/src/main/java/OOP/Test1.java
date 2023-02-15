/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Dell
 */
class C {

    void m1(String x) {
        System.out.println("One");
    }
}

class D extends C {

    public void m1(String x) {
        System.out.println("Two");
        super.m1(null);
    }
}

public class Test1 {

    public static void main(String[] args) {
        C a = new D();
        a.m1(null);
    }
}
