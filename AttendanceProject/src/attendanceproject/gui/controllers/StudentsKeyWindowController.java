/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import attendanceproject.gui.model.MainModel;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class StudentsKeyWindowController implements Initializable {

    @FXML
    private TextField txtTodaysKey;
    @FXML
    private JFXButton btnConfirmStudents;
    
    MainModel model;
    
    private boolean isKeyConfirmed;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       model = new MainModel();
       btnConfirmStudents.setId("btnConfirmStudents");
    }    

    @FXML
    private void closeApp(ActionEvent event) 
    {
       Platform.exit(); 
    }


    @FXML
    private void clickLogOut(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/LogInWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
        Stage stage = (Stage) btnConfirmStudents.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void clickEnterTodaysKey(ActionEvent event) 
    {
      boolean isKeyCorrect = model.confirmKey(txtTodaysKey.getText());
      if(isKeyCorrect)
      {
          //show alert that attendance is confirmed
      }
      else
      {
          //show alert that user entered incorrect key
      }
      
    }

    @FXML
    private void clickGoToStudentsOverview(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/StudentsOverviewWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
    }
     
    private void setUpAlert(String title, String message){
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }
    
    @FXML
    private void readAboutApp(ActionEvent event) throws IOException{
        setUpAlert("About" , "On this window, you need to enter the key in order to check attendance.");
    }
    
     @FXML
    private void keyIsNotWorking(ActionEvent event) throws IOException{
        setUpAlert("Key is not working" , "Please check for spelling mistakes. Contact the team if the problem persists.");
    }
}
