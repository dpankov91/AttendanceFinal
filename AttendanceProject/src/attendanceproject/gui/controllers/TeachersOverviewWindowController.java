

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import attendanceproject.be.User;
import attendanceproject.gui.model.MainModel;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class TeachersOverviewWindowController implements Initializable {

    @FXML
    private TableView<User> studentsTable;
    @FXML
    private TableColumn<User, String> firstNameCol;
    @FXML
    private TableColumn<User, String> secondNameCol;
    @FXML
    private TableColumn<?, ?> attendanceCol;
    @FXML
    private Button btnBack;

    /**
     * Initializes the controller class.
     */
    
    MainModel mainModel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        mainModel = new MainModel();
        
        setUpTableView();
    }    

    @FXML
    private void clickGoBack(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/TeachersChoiceWindow.fxml"));
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
    private void studentsAreMissing(ActionEvent event) {
        setUpAlert("Some students are missing" , "Please contact the team so they can add your students to the database");
}

    @FXML
    private void dataIsIncorrectTeacher(ActionEvent event) {
         setUpAlert("Data is incorrect" , "Please contact the team so they can correct the mistakes in the database");
    }
    
    private void setUpTableView()
    {
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("Fname"));
        secondNameCol.setCellValueFactory(new PropertyValueFactory<>("Lname"));
        attendanceCol.setCellValueFactory(new PropertyValueFactory<>(""));
        loadTableView();
    }
    
    public void loadTableView()
    {
        studentsTable.getItems().clear();
        List<User> allStudents = mainModel.getAllStudents();
        ObservableList<User> students = FXCollections.observableArrayList();
        students.addAll(allStudents);
        studentsTable.setItems(students);
    }
}
