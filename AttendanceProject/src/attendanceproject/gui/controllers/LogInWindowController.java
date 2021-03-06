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
import static javafx.application.Platform.exit;
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
    MainModel model;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        model = MainModel.getInstance();
    }    

    @FXML
    private void closeApp(ActionEvent event) 
    {
        Platform.exit();
    }

    @FXML
    private void clickLogIn(ActionEvent event) throws IOException 
    {
        checkIfFieldsAreEmpty();
        login();
   
        
        
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
    
    private void login() throws IOException
    {
        User us = model.loginUser(txtUsername.getText(), txtPassword.getText());
        if(us.getIsTeacher())
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/TeachersChoiceWindow.fxml"));
            Parent z = loader.load();
            Scene scene = new Scene(z);
            Stage s = new Stage();
            s.setScene(scene);
            s.show();
            closeWindow();
        }else
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/StudentsKeyWindow.fxml"));
            Parent z = loader.load();
            Scene scene = new Scene(z);
            Stage s = new Stage();
                loader.<StudentsKeyWindowController>getController().setUser(us); //Sets controler by default for both creating and editing categories
       
            s.setScene(scene);
            s.show();
            closeWindow();
        }
    }
    
    private void closeWindow()
    {
        Stage stage = (Stage) btnLogIn.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void forgotYourPassword(ActionEvent event) {
        setUpAlert("Forgot your password?" , "If you forgot your password, please contact the team as soon as possible, so they can help you in that regard.");
    }
    @FXML
    private void readAboutApp(ActionEvent event) throws IOException{
        setUpAlert("About" , "On this window, you need to log in using your individual username and password.");
    }
}
