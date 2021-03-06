/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import attendanceproject.gui.model.MainModel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class TeachersGenerateKeyWindowController implements Initializable {

    @FXML
    private Label lblTodaysDate;
    @FXML
    private JFXTextField txtNewKey;
    @FXML
    private JFXButton btnSaveKey;
    @FXML
    private JFXButton btnBack;

    /**
     * Initializes the controller class.
     */
    MainModel model;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showDate();
        model = MainModel.getInstance();
    }

    @FXML
    private void clickSaveNewKey(ActionEvent event) throws IOException {
        if (!isTodayDateInDatabase()) {
            insertTodaysKey();
        } else {
            setUpAlert("Key was already generated", "You already generated key for today");
        }
    }

    private boolean isTodayDateInDatabase() {
        return model.checkTodaysDateInDB();
    }

    private void insertTodaysKey() throws IOException {
        String todaysKey = txtNewKey.getText().trim();
        LocalDate dateNow = LocalDate.now();
        model.insertKey(todaysKey, dateNow);
        txtNewKey.clear();
        setUpAlert("Success", "Todays Key is generated");
        goBack();
    }

    @FXML
    private void clickBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/TeachersChoiceWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
        closeWindow();
    }

    private void goBack() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendanceproject/gui/view/TeachersChoiceWindow.fxml"));
        Parent z = loader.load();
        Scene scene = new Scene(z);
        Stage s = new Stage();
        s.setScene(scene);
        s.show();
        closeWindow();
    }

    private void closeWindow() {
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void closeApp(ActionEvent event) {
        Platform.exit();
    }

    public void showDate() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        lblTodaysDate.setText(dateFormat.format(date));
    }

    private void setUpAlert(String title, String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }

    @FXML
    private void readAboutApp(ActionEvent event) throws IOException {
        setUpAlert("About", "On this window you can generate a key");
    }

    @FXML
    private void cantGenerateAKey(ActionEvent event) {
    }

}
