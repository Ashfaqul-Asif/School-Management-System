/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author RK Anik
 */
public class DatabaseConnection {
    Connection connection = null ;
    
    public static Connection ConnectDB() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SchoolManagementSystem;user=sa;password=465013;");
            return connection ;
        }catch(Exception e ){JOptionPane.showMessageDialog(null, e);return null;}
    }
}
