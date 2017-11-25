/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loket_swim;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class NotaController implements Initializable {

    @FXML
    private JFXTextField na;
    @FXML
    private JFXTextField da;
    @FXML
    private JFXTextField usi;
    @FXML
    private JFXTextField pa;
    @FXML
    private JFXTextField ha;
    @FXML
    private JFXButton log;
    @FXML
    private JFXButton log2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO}
    }
        
    void notset(String name, String date, String Usia, String Paket, String total){
          na.setText(name);
          da.setText(date);
          usi.setText(Usia);
           pa.setText(Paket);
           ha.setText(total);
    }
        

    @FXML
    private void keluar(ActionEvent event) {
         try{
                 ((Node) (event.getSource())).getScene().getWindow().hide();
                 
                 FXMLLoader fxmlLoader = new FXMLLoader();
                 fxmlLoader.setLocation(getClass().getResource("Login_awal.fxml"));
                 Scene scene = new Scene(fxmlLoader.load());
                 
                 Stage stage = new Stage();
                 stage.setScene(scene);
                 stage.show();
          
                 
             }catch (IOException e){
                 System.out.println("Failed to create nuw window" +e);
             }
    }

    @FXML
    private void keluar2(ActionEvent event) {
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
    }
    
}

