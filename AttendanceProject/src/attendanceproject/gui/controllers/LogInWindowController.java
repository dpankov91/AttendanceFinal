/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

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


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        checkWhatGroup(); 
    }
    
    private void checkWhatGroup() throws IOException
    {
        if (txtUsername.getText().equals("Antonio")&& txtPassword.getText().equals("security") || txtUsername.getText().equals("Conor")&& txtPassword.getText().equals("safety"))
        {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/StudentsKeyWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
        }
        else if(txtUsername.getText().equals("Vale") || txtUsername.getText().equals("Zlata"))
        {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/TeachersChoiceWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();  
        }
        

    }
    
}
