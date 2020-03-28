/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class TeachersEditPasswordWindowController implements Initializable {

    @FXML
    private JFXTextField txtNewPassword;
    @FXML
    private JFXTextField txtConfirmNewPassword;
    @FXML
    private JFXButton btnSave;
    @FXML
    private Button btnBack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveNewPassword(ActionEvent event) {
    }

    @FXML
    private void clickGoBack(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/LogInWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show(); 
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void closeApp(ActionEvent event) 
    {
       Platform.exit();

    }
    
     private void setUpAlert(String title, String message){
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }
    
    @FXML
    private void readAboutApp(ActionEvent event) throws IOException{
        setUpAlert("About" , "On this window you can change a password");
    }
    @FXML
    private void iCantChangePassword(ActionEvent event) {
        setUpAlert("I can't change the password" , "Please check that both passwords match");

}
}