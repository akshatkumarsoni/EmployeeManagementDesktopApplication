/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SCALive
 */
@SuppressWarnings("CallToPrintStackTrace")
public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "akshat@123");
            JOptionPane.showMessageDialog(null,"Connection opened" , "Success" , JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Cannot open the connection" ,"Error" , JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            //System.exit(0);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Driver Error" , "Error" , JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(0);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Cannot close the connection" , "Error" ,JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
}
