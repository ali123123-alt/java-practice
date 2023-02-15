package Assignment4;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

public class RegistrationForm implements ActionListener,ItemListener{

    JFrame frame;
    JPanel panel1,panel2;
    JLabel name, address, phone, email,check;
    JTextField nametxt,phonetxt, emailtxt;
    JTextArea addresstxt;
    JCheckBox checkbox;
    JButton submit;

    RegistrationForm() {
        frame = new JFrame("Registration Form");
        name = new JLabel("Enter your Name");
        nametxt = new JTextField();
        address = new JLabel("Enter your Address");
        addresstxt = new JTextArea();
        phone = new JLabel("Enter your Phone");
        phonetxt = new JTextField();
        email = new JLabel("Enter your Email");
        emailtxt = new JTextField();
        checkbox=new JCheckBox();
        check=new JLabel("Accept All Terms And Conditions");
        submit=new JButton("Submit");
        
        name.setBounds(10, 2, 100, 30);
        nametxt.setBounds(140, 2, 150, 30);
        address.setBounds(10, 40, 100, 30);
        addresstxt.setBounds(140, 40, 150, 50);
        phone.setBounds(10, 100, 100, 30);
        phonetxt.setBounds(140, 100, 150, 30);
        email.setBounds(10, 140, 100, 30);
        emailtxt.setBounds(140, 140, 150, 30);
        checkbox.setBounds(80, 180, 20, 20);
        check.setBounds(100, 180, 200, 20);
        submit.setBounds(120, 210, 100, 50);
        submit.setFocusable(false);
        
        frame.add(name);
        frame.add(nametxt);
        frame.add(address);
        frame.add(addresstxt);
        frame.add(phone);
        frame.add(phonetxt);
        frame.add(email);
        frame.add(emailtxt);
        frame.add(checkbox);
        frame.add(check);
        frame.add(submit);
        
        submit.addActionListener(this);
        checkbox.addActionListener(this);

        frame.setSize(400, 400);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        frame.getContentPane().setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        RegistrationForm obj = new RegistrationForm();
    }
    
    boolean aggrement=false;

    @Override
    public void actionPerformed(ActionEvent e) {
        String name,address,phone,email;
        String s = e.getActionCommand();
        if (s.equals("submit")) {
          name =  nametxt.getText();
          address = addresstxt.getText();
          phone =  phonetxt.getText();
          email =  emailtxt.getText();
          
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeesmanagementsystem", "root", "" );
            Statement statement = connection.createStatement();
            //int i = statement.executeUpdate("insert into employees values('','name','address','phone','email','aggrement')");
             //System.out.println(i);
           PreparedStatement Pstatement =connection.prepareStatement("insert into Employees(Name,Address,Phone,Email,Aggrement) values(?,?,?,?,?)");
                Pstatement.setString(1,name);
                Pstatement.setString(2,address);
                Pstatement.setString(3,phone);
                Pstatement.setString(4,email);
                Pstatement.setBoolean(5,aggrement);
                Pstatement.executeUpdate();

             ResultSet resultSet = statement.executeQuery("select * from employees");
            while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3)+ " " + resultSet.getString(4)+ " " + resultSet.getString(5)+ " " + resultSet.getString(6));   
            
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()=="checkbox"){
          aggrement = e.getStateChange()==1?true:false;
             
      }

    }
}
