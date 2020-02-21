/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    private void clickLogOut(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/LogInWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();  
        
    }

    @FXML
    private void clickGoToOverview(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/TeachersOverviewWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void clickGoToGenKey(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/TeachersGenerateKeyWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
    }

    @FXML
    private void closeApp(ActionEvent event) 
    {
        Stage stage = (Stage) btnLogOut.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void readAboutApp(ActionEvent event) {
    }
    
}
