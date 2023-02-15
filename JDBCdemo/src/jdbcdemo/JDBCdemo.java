/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcdemo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class JDBCdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM student");
            while(rs.next()){
            String name=rs.getString("Name");
            System.out.println(name);
            }
//            int rows=stmt.executeUpdate("INSERT INTO student(Name) VALUES('Umer Harron')");
            rs.close();
            stmt.close();
            con.close();
//            System.out.println(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCdemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
