/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class Gui {

    JFrame frame;
    JPanel panel;
    JPanel panel1;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;

    Gui() {
        frame = new JFrame("Swing practice");

        one = new JButton("1");
        one.setFocusable(false);
        two = new JButton("2");
        two.setFocusable(false);
        three = new JButton("3");
        three.setFocusable(false);
        four = new JButton("4");
        four.setFocusable(false);
        five = new JButton("5");
        five.setBounds(300, 300, 100, 100);

        panel = new JPanel();
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        
                panel.setBounds(20, 20, 200, 200);
        panel.setBackground(Color.red);
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        panel1=new JPanel();
        panel1.setBounds(110, 110, 50, 50);
        panel1.setBackground(Color.green);

        frame.getContentPane().add(panel);
//        frame.getContentPane().add(panel1);
//frame.add(one,BorderLayout.NORTH);
//frame.add(two,BorderLayout.SOUTH);
//frame.add(three,BorderLayout.EAST);
//frame.add(four,BorderLayout.WEST);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
    }

    public static void main(String[] args) {
        Gui obj = new Gui();
    }
}
