/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Dell
 */
class E {
 void m1(String x){
  System.out.println("One");	 
 }
}
class F extends E {	

}
public class Test2{
public static void main(String[] args){
 E a = new F();
 a.m1(new E());
  }
}

