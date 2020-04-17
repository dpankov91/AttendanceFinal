/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import attendanceproject.be.AttendanceData;
import attendanceproject.be.User;
import attendanceproject.gui.model.MainModel;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class StudentsOverviewWindowController implements Initializable {

    @FXML
    private TableView<AttendanceData> studentTableView;
    @FXML
    private TableColumn<AttendanceData, LocalDate> dateColumn;
    @FXML
    private TableColumn<AttendanceData, Boolean> statusColumn;
    @FXML
    private PieChart statisticsPieChart;
    @FXML
    private Label lblStudentName;

    private User us;

    private MainModel model;

    /**
     * Initializes the controller class.
     *
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        model = MainModel.getInstance();
        setUpTableView();
    }

    private void setUpTableView() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

        loadTableView();
    }

    //Get user 
    //call database and get relevent data
    //populate table view
    private void loadTableView() {
        System.out.println(us);
        studentTableView.getItems().addAll(model.getAllDateForStudent(us));

    }

    void setUser(User us) {
        this.us = us;
    }
}
