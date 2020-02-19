/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class TeachersChoiceWindowController implements Initializable {

    @FXML
    private JFXButton btnLogOut;
    @FXML
    private JFXButton btnGoToOverview;
    @FXML
    private JFXButton btnGoToKey;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickLogOut(ActionEvent event) {
    }

    @FXML
    private void clickGoToOverview(ActionEvent event) {
    }

    @FXML
    private void clickGoToGenKey(ActionEvent event) {
    }
    
}
