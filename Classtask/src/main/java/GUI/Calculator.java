/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class Calculator implements ActionListener {

    double num = 0, num2 = 0, result = 0;
    int calculation;

    JFrame frame = new JFrame("Calculator");
    JTextArea textarea = new JTextArea();
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton ten = new JButton("10");
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JButton dot = new JButton(".");
    JButton equal = new JButton("=");
    JButton del = new JButton("CE");
    JButton all = new JButton("AC");

    Calculator() {
        buildgui();
        addcomponents();
        addActionEvent();
    }

    public void buildgui() {
        frame.setSize(500, 600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.blue);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addcomponents() {
        textarea.setBounds(100, 20, 300, 100);
        textarea.setForeground(Color.black);
        textarea.setFont(new Font("Verdana", Font.PLAIN, 18));
        frame.add(textarea);

        del.setBounds(280, 150, 50, 50);
        del.setForeground(Color.black);
        frame.add(del);

        all.setBounds(350, 150, 50, 50);
        all.setForeground(Color.black);
        frame.add(all);

        seven.setBounds(140, 220, 50, 50);
        seven.setForeground(Color.black);
        frame.add(seven);

        eight.setBounds(210, 220, 50, 50);
        eight.setForeground(Color.black);
        frame.add(eight);

        nine.setBounds(280, 220, 50, 50);
        nine.setForeground(Color.black);
        frame.add(nine);

        div.setBounds(350, 220, 50, 50);
        div.setForeground(Color.black);
        frame.add(div);

        four.setBounds(140, 290, 50, 50);
        four.setForeground(Color.black);
        frame.add(four);

        five.setBounds(210, 290, 50, 50);
        five.setForeground(Color.black);
        frame.add(five);

        six.setBounds(280, 290, 50, 50);
        six.setForeground(Color.black);
        frame.add(six);

        mul.setBounds(350, 290, 50, 50);
        mul.setForeground(Color.black);
        frame.add(mul);

        one.setBounds(140, 360, 50, 50);
        one.setForeground(Color.black);
        frame.add(one);

        two.setBounds(210, 360, 50, 50);
        two.setForeground(Color.black);
        frame.add(two);

        three.setBounds(280, 360, 50, 50);
        three.setForeground(Color.black);
        frame.add(three);

        sub.setBounds(350, 360, 50, 50);
        sub.setForeground(Color.black);
        frame.add(sub);

        zero.setBounds(140, 430, 50, 50);
        zero.setForeground(Color.black);
        frame.add(zero);

        dot.setBounds(210, 430, 50, 50);
        dot.setForeground(Color.black);
        frame.add(dot);

        equal.setBounds(280, 430, 50, 50);
        equal.setForeground(Color.black);
        frame.add(equal);

        add.setBounds(350, 430, 50, 50);
        add.setForeground(Color.black);
        frame.add(add);
    }

    public void addActionEvent() {
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        dot.addActionListener(this);
        equal.addActionListener(this);
        del.addActionListener(this);
        all.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == all) {
            textarea.setText("");
        } else if (source == del) {
            int length = textarea.getText().length();
            if (length > 0) {
                StringBuilder text = new StringBuilder(textarea.getText());
                text.deleteCharAt(length - 1);
                textarea.setText(text.toString());
            } else {
                return;
            }
        } else if (source == zero) {
            textarea.append("0");
        } else if (source == one) {
            textarea.append("1");
//        textarea.setText(textarea.getText()+"1");
        } else if (source == two) {
            textarea.append("2");
        } else if (source == three) {
            textarea.append("3");
        } else if (source == four) {
            textarea.append("4");
        } else if (source == five) {
            textarea.append("5");
        } else if (source == six) {
            textarea.append("6");
        } else if (source == seven) {
            textarea.append("7");
        } else if (source == eight) {
            textarea.append("8");
        } else if (source == nine) {
            textarea.append("9");
        } else if (source == dot) {
            if (textarea.getText().contains(".")) {
                return;
            } else if (textarea.getText().endsWith("+")) {
                return;
            } else if (textarea.getText().endsWith("-")) {
                return;
            } else if (textarea.getText().endsWith("*")) {
                return;
            } else if (textarea.getText().endsWith("/")) {
                return;
            } else if (textarea.getText().endsWith(".")) {
                return;
            } else {
                textarea.append(".");
            }
        } else if (source == add) {

            if (textarea.getText().endsWith("+")) {
                return;
            } else if (textarea.getText().endsWith("-")) {
                return;
            } else if (textarea.getText().endsWith("*")) {
                return;
            } else if (textarea.getText().endsWith("/")) {
                return;
            } else if (textarea.getText().endsWith(".")) {
                return;
            } else {
                textarea.append("+");
            }
        } else if (source == sub) {
            if (textarea.getText().endsWith("+")) {
                return;
            } else if (textarea.getText().endsWith("-")) {
                return;
            } else if (textarea.getText().endsWith("*")) {
                return;
            } else if (textarea.getText().endsWith("/")) {
                return;
            } else if (textarea.getText().endsWith(".")) {
                return;
            } else {
                textarea.append("-");
            }
        } else if (source == mul) {
            if (textarea.getText().endsWith("+")) {
                return;
            } else if (textarea.getText().endsWith("-")) {
                return;
            } else if (textarea.getText().endsWith("*")) {
                return;
            } else if (textarea.getText().endsWith("/")) {
                return;
            } else if (textarea.getText().endsWith(".")) {
                return;
            } else {
                textarea.append("*");
            }
        } else if (source == div) {
            if (textarea.getText().endsWith("+")) {
                return;
            } else if (textarea.getText().endsWith("-")) {
                return;
            } else if (textarea.getText().endsWith("*")) {
                return;
            } else if (textarea.getText().endsWith("/")) {
                return;
            } else if (textarea.getText().endsWith(".")) {
                return;
            } else {
                textarea.append("/");
            }
        } else if (source == equal) {
            System.out.println(textarea.getText());
            String num = "5+3";
            Double num1 = Double.parseDouble(num);
            double result = num1 + 3;
            System.out.println(result);
        }
    }
}