/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Dell
 */
class A {

    void m1(A a) {
        System.out.println("m1 method in class A");
    }
}

class B extends A {

    public void m1(A a) {
        System.out.println("m1 method in class B");
    }
}

public class Test {

    public static void main(String[] args) {
        A a = new A();
        a.m1(a);
        a.m1(new B());

        B b = new B();
        b.m1(null);

        a = b;
        a.m1(null);
        a.m1(new A());
    }
}
