/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package StringExcercise;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Dell
 */
public class StringExcercise {

    public static void main(String[] args) {
        String s = "My universty name is Arid, Agriculture University";
        System.out.println(s.toLowerCase());

        s = s.replace(",", "");
        System.out.println(s);

        String uni = "Arid";
        if (s.contains(uni)) {
            System.out.println("Arid");
        } else {
            System.out.println("university name not found");
        }

        StringTokenizer st = new StringTokenizer("My universty name is Arid, Agriculture University");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        StringBuffer sb = new StringBuffer("welcome ");
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = console.nextLine();
        sb.append(name);
        System.out.println(sb);
    }
}
