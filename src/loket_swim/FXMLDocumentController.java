/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loket_swim;

import Koneksi.konek;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public class FXMLDocumentController implements Initializable {
    public String usernames, passwords;
    
    @FXML
    private JFXTextField pass;
    @FXML
    private JFXTextField us;
    @FXML
    private JFXButton log;
    
    private Connection conn = null;
    private ResultSet rs = null;

    private PreparedStatement stm = null;
    static final String C_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL ="jdbc:mysql://localhost/locket";
    static final String USER = "root";
    static final String PASS = "";
    @FXML
    private JFXButton log2;
    @Override
    public void initialize(URL url, ResourceBundle rb){
    
            conn = Koneksi.konek.Koneks();   
    }
   

    @FXML
    private void loginan(ActionEvent event) throws ClassNotFoundException, SQLException {  
        usernames = us.getText();
         passwords = pass.getText();
     try{   
         Class.forName(C_DRIVER);
         conn = DriverManager.getConnection(DB_URL, USER, PASS);
         stm = conn.prepareStatement("SELECT * FROM `swimm` WHERE `username` = ? AND `password`=?");
         stm.setString(1,usernames);
         stm.setString(2,passwords);
         ResultSet rs = stm.executeQuery();
         if(rs.next()){
             try{
                 ((Node) (event.getSource())).getScene().getWindow().hide();
                 
                 FXMLLoader fxmlLoader = new FXMLLoader();
                 fxmlLoader.setLocation(getClass().getResource("inputan.fxml"));
                 Scene scene = new Scene(fxmlLoader.load());
                 
                 Stage stage = new Stage();
                 stage.setScene(scene);
                 stage.show();
             }catch (IOException e){
                 System.out.println("Failed to create nuw window" +e);
             }
         }else {
             JOptionPane.showMessageDialog(null, "salah");
             pass.setText("");
             us.requestFocus();
         }
         
     }catch (SQLException s){
                 
         
    }
    }

}
    
      
    
    
  

