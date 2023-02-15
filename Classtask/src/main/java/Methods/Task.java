/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author Dell
 */
class Employee {

    String Name;
    int Salary;
    String Designation;

    Employee(String n, int s, String d) {
        Name = n;
        Salary = s;
        Designation = d;
    }

    public void getter() {
        System.out.println(Name);
        System.out.println(Salary);
        System.out.println(Designation);
    }
}

public class Task {

    public static void main(String[] args) {
        Employee obj = new Employee("ali mirza", 35000, "Developer");
        obj.getter();
    }
}
