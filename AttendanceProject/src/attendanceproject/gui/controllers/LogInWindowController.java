/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import attendanceproject.be.User;
import attendanceproject.gui.model.MainModel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class LogInWindowController implements Initializable {

    @FXML
    private JFXButton btnLogIn;
    @FXML
    private JFXTextField txtUsername;
    @FXML
    private JFXPasswordField txtPassword;
    private MainModel model;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
  
        
    }    
    
    public void injectModel(MainModel model)
    {
        this.model = model;
    }

    @FXML
    private void closeApp(ActionEvent event) {
       Platform.exit();
    }

    @FXML
    private void readAboutApp(ActionEvent event) {
    }

    @FXML
    private void clickLogIn(ActionEvent event) throws IOException 
    {
        checkIfFieldsAreEmpty();
        model.loginUser(txtUsername.getText(), txtPassword.getText());
        
    }
    
        
        private void checkIfFieldsAreEmpty()
    {
        if(txtUsername.getText() == null || txtUsername.getText().isEmpty() )
        {
            setUpAlert("No Username Error" , "Please insert Username.");
        }
        else if(txtPassword.getText() == null || txtPassword.getText().isEmpty() )
        {
            setUpAlert("No Password Error" , "Please insert Password.");    
        }
    }
        
    private void setUpAlert(String title, String message){
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }
    
    private void checkTeacherOrStudent()
    {
        
    }
}
