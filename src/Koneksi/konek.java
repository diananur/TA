/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.*;


public class konek {
    static final String C_DRIVER = "com.musql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/locket";
    
    static final String USER = "root";
    static final String PASS = "";
  
    
    public static Connection Koneks() {
        Connection conn = null;
        try{
            Class.forName(C_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
             
        }catch (ClassNotFoundException | SQLException ex){
            
        }
        return conn;
    }

    public static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
