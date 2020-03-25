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
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
        closeWindow();
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
        closeWindow();
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
        closeWindow();
    }
    
    private void closeWindow()
    {
        Stage stage = (Stage) btnLogOut.getScene().getWindow();
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
        setUpAlert("About" , "This is the main window, you can access your overview or generate a key.");
    }
    @FXML
    private void generateKeyHelp(ActionEvent event) {
        setUpAlert("Generate key" , "Press the left circular button to access the generate key window");
    }
    
    @FXML
    private void goToOverviewHelp(ActionEvent event) {
    setUpAlert("Overview" , "Press the right circular button to access your overview window");
    }
}
