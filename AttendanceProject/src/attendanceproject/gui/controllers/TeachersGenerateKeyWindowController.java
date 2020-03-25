    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import attendanceproject.gui.model.MainModel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
    
    MainModel model;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showDate();
        model = new MainModel();
    }    
    
    @FXML
    private void clickSaveNewKey(ActionEvent event) 
    {
        insertTodaysKey();
    }
    
    private void insertTodaysKey()
    {
        if(txtNewKey.getText().trim().length() > 3)
        {
        String todaysKey = txtNewKey.getText().trim();
        model.insertKey(todaysKey);
        txtNewKey.clear();
        setUpAlert("Success", "Todays Key is generated");
        closeWindow();
        } else{
            setUpAlert("Too short key", "Key must be at least 3 letters.");
        }
    }

    @FXML
    private void clickBack(ActionEvent event) 
    {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }
    
    private void closeWindow() 
    {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void closeApp(ActionEvent event) 
    {
        Platform.exit();
    }

    @FXML
    private void readAboutApp(ActionEvent event) {
    }

    public void showDate() 
    {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
        lblTodaysDate.setText(dateFormat.format(date));
    }
    
    private void setUpAlert(String title, String message){
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }
    
    
}
