/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loket_swim;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static loket_swim.FXMLDocumentController.C_DRIVER;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class InputanController implements Initializable {
 
    @FXML
    private JFXComboBox pak;
    @FXML
    private JFXTextArea AKHIR;
    @FXML
    private JFXComboBox us;
    @FXML
    private JFXButton or;
    @FXML
    private JFXTextField nam;
    @FXML
    private DatePicker dat;
    
    @FXML
    private JFXTextField tal;

    ObservableList<String> usiaL = FXCollections.observableArrayList("Balita","Remaja","Dewasa");
    ObservableList<String> paketL = FXCollections.observableArrayList("Low + wahana air low","Middle + wahana waterboom","Combo + Gelombang ombak pantai");
    @FXML
    private JFXRadioButton k5;
    @FXML
    private ToggleGroup pilihorang;
    @FXML
    private JFXRadioButton pas5;
    @FXML
    private JFXRadioButton l5;
    @FXML
    private JFXButton hap;
    @FXML
    private JFXButton log;
    
    
    
    
  /*   private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement stm = null;
    static final String C_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL ="jdbc:mysql://localhost/locket";
    static final String USER = "root";
    static final String PASS = "";*/
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        us.setValue("Choose age");
        us.setItems(usiaL);
        pak.setValue("Choose pack");
        pak.setItems(paketL);
        
       /*  conn = Koneksi.konek.Koneks();   */
    }    

    String NAM,DATE,USIA,PAKET,BANYAK,HARGATOTAL;
    @FXML
    private void orderan(ActionEvent event) throws ClassNotFoundException {
       
        if(nam.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan nama Anda");
        }else if (dat.getValue().equals("")){
            JOptionPane.showMessageDialog(null, "Harap pilih waktu pemesanan Anda");
        }else{
        
        String nm = nam.getText();
        String tgl = dat.getValue().toString();
        String usia =us.getValue().toString();
        String pkt = pak.getValue().toString();
        String hrg = tal.getText();
        
        if(k5.isSelected()){
            String harga1 = "Rp. 200.000,00";

        }else if(pas5.isSelected()){
            String harga1 = "Rp. 500.000,00";
           
        }else if(l5.isSelected()){
            String harga1 = "Rp. 1.000.000,00";
           
        }else{
        
        JOptionPane.showMessageDialog(null, "Harap pilih waktu pemesanan Anda");
        }
    
        AKHIR.setText("Nama            : "+nm+"\nDate              : "+tgl+"\nUsia               : "+usia+"\nPaket SWIM  :"
                + " "+pkt+"\nHarga Total   : "+hrg);
        
        
        }
        }

    @FXML
    private void kk5(ActionEvent event) {
        String harga1 = "";
        
        if(k5.isSelected()){
            harga1 = "Rp. 200.000,00";

        }else if(pas5.isSelected()){
            harga1="Rp. 500.000,00";
           
        }else if(l5.isSelected()){
            harga1="Rp. 1.000.000,00";
           
        }else{
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan!!");
        }
        
        tal.setText(harga1);
    }

    @FXML
    private void pass5(ActionEvent event) {
        String harga1 = "";
        
        if(k5.isSelected()){
            harga1 = "Rp. 200.000,00";

        }else if(pas5.isSelected()){
            harga1="Rp. 500.000,00";
           
        }else if(l5.isSelected()){
            harga1="Rp. 1.000.000,00";
           
        }else{
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan!!");
        }
        
        tal.setText(harga1);
    }

    @FXML
    private void ll5(ActionEvent event) {
        String harga1 = "";
        
        if(k5.isSelected()){
            harga1 = "Rp. 200.000,00";

        }else if(pas5.isSelected()){
            harga1="Rp. 500.000,00";
           
        }else if(l5.isSelected()){
            harga1="Rp. 1.000.000,00";
           
        }else{
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan!!");
        }
        
        tal.setText(harga1);
    }

    @FXML
    private void hapus(ActionEvent event) {
        nam.setText("");
        dat.setValue(LocalDate.of(2017, Month.MAY, 10));
        us.setValue("Choose age");
        pak.setValue("Choose pack");
        k5.setSelected(false);
        pas5.setSelected(false);
        l5.setSelected(false);
        tal.setText("");
        AKHIR.setText("");
        
    }

    @FXML
    private void out(ActionEvent event) throws ClassNotFoundException {
       /* String nm1=nam.getText();
        String tgl1 = dat.getValue().toString();
        String usia1 =us.getValue().toString();
        String pkt1 = pak.getValue().toString();
        String hrg1 = tal.getText();
        String sql = "INSERT INTO `input`(`nama`, `date`, `usia`, `paket`, `harga`) VALUES (?,?,?,?,?)";
        try{   
         Class.forName(C_DRIVER);
         conn = DriverManager.getConnection(DB_URL, USER, PASS);
         stm = conn.prepareStatement(sql);
         stm.setString(1,nm1);
         stm.setString(2,tgl1);
         stm.setString(3,usia1);
         stm.setString(4,pkt1);
         stm.setString(5,hrg1);
         ResultSet rs = stm.executeQuery();
         if(rs.next()){
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
         
     }catch (SQLException s){ 
    }
         
        
        */
        
        try{
                 ((Node) (event.getSource())).getScene().getWindow().hide();
                 
                 FXMLLoader fxmlLoader = new FXMLLoader();
                 fxmlLoader.setLocation(getClass().getResource("nota.fxml"));
                 Scene scene = new Scene(fxmlLoader.load());
                 
                 Stage stage = new Stage();
                 stage.setScene(scene);
                 stage.show();
                 
            NAM = nam.getText();
            DATE = dat.getValue().toString();
            USIA =us.getValue().toString();
            PAKET = pak.getValue().toString();
            HARGATOTAL = tal.getText();
            
            NotaController nota = new NotaController();
            nota = fxmlLoader.getController();
            
            nota.notset(NAM,DATE,USIA,PAKET,HARGATOTAL);
                 
             }catch (IOException e){
                 System.out.println("Failed to create nuw window" +e);
             }
    }
    
}
