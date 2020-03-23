/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       btnConfirmStudents.setId("btnConfirmStudents");
    }    

    @FXML
    private void closeApp(ActionEvent event) 
    {
        
    }

    @FXML
    private void readAboutApp(ActionEvent event) {
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

    private void clickGoBack(ActionEvent event) 
    {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void clickEnterTodaysKey(ActionEvent event) {
       try{
           Connection con = DatabaseName.getConnection(url);
           String query = "INSERT INTO"; //needs name of database here on both lines
           PreparedStatement pst = con.prepareStatement(query);
           pst.setString(1, password.getText());
           
       } 
       catch (SQLException ex) {          
            Logger.getLogger(StudentsKeyWindowController.class.getName()).log(Level.SEVERE, null, ex);
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
    
}
