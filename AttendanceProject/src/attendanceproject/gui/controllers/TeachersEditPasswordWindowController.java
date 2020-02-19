/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

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
    private void clickGoBack(ActionEvent event) {
    }

    @FXML
    private void closeApp(ActionEvent event) {
    }

    @FXML
    private void readAboutApp(ActionEvent event) {
    }
    
}
