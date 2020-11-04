/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saifali
 * 
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
    Connection db;
    Statement st;
    
    public DatabaseConnection(){
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
     db=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CABI_SERVICE;user=Saif Ali;password=12345");
     st= db.createStatement();
     
   //  JOptionPane.showMessageDialog(null, "connected");

        
        }
        catch(Exception ex){
        System.out.println(ex);
        }
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
