/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author Dell
 */
class Calculator {

    int x, y;

    Calculator(int a, int b) {
        x = a;
        y = b;
    }

    public void Add() {
        System.out.println(x + y);
    }

    public void Sub() {
        System.out.println(x - y);
    }

    public void Multiply() {
        System.out.println(x * y);
    }

    public void Divide() {
        System.out.println(x / y);
    }
}

public class Task1 {

    public static void main(String[] args) {
        Calculator obj = new Calculator(8, 2);
        obj.Add();
        obj.Sub();
        obj.Multiply();
        obj.Divide();
    }
}
