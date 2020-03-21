/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class TeachersGenerateKeyWindowController implements Initializable {

    @FXML
    private Label lblTodaysDate;
    @FXML
    private JFXTextField txtNewKey;
    @FXML
    private JFXButton btnSaveKey;
    @FXML
    private JFXButton btnBack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void clickSaveNewKey(ActionEvent event) {
    }

    @FXML
    private void clickBack(ActionEvent event) 
    {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void closeApp(ActionEvent event) 
    {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void readAboutApp(ActionEvent event) {
    }

    public void showDate() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat ("dd-mm-yyyy");
        lblTodaysDate.setText(dateFormat.format(date));
    }
    
}
