/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import java.net.URL;
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
    private TableView<?> studentTableView;
    @FXML
    private TableColumn<?, ?> dateColumn;
    @FXML
    private TableColumn<?, ?> statusColumn;
    @FXML
    private PieChart statisticsPieChart;
    @FXML
    private Label lblStudentName;
    

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    private void setUpTableView()
    {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("DATE"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("STATUS"));
       
        loadTableView();
    }

    private void loadTableView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
