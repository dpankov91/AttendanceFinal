/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author dpank
 */
public class StudentsOverviewWindowController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private NumberAxis daysAxis;
    @FXML
    private CategoryAxis monthsAxis;
    @FXML
    private BarChart<?, ?> monthlyBarChart;
    @FXML
    private Button btnBack;
    @FXML
    private PieChart pieTuesday;
    @FXML
    private PieChart pieFriday;
    @FXML
    private PieChart pieMonday;
    @FXML
    private PieChart pieWednesday;
    @FXML
    private PieChart pieThursday;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        loadDataPieChartAllAttendance(); 
        loadDataBarChartMonthlyAttendance();
        loadDataPieMonday();
        loadDataPieTuesday();
        loadDataPieWednesday();
        loadDataPieThursday();        
        loadDataPieFriday();
        
    }    
    
    private void loadDataPieChartAllAttendance()
    {
     ObservableList<PieChart.Data>pieCharData = FXCollections.observableArrayList
        (
                new PieChart.Data("Not In Class", 27),
                new PieChart.Data("In Class", 73));
        
        pieChart.setData(pieCharData);     
    }
    
    private void loadDataBarChartMonthlyAttendance()
    {
        XYChart.Series monthStat = new XYChart.Series();
        monthStat.getData().add(new XYChart.Data("September", 20));
        monthStat.getData().add(new XYChart.Data("October", 22));
        monthStat.getData().add(new XYChart.Data("November", 26));
        monthStat.getData().add(new XYChart.Data("December", 14));
        monthStat.getData().add(new XYChart.Data("January", 16));
        monthStat.getData().add(new XYChart.Data("February", 25));
        monthStat.getData().add(new XYChart.Data("March", 0));
        monthStat.getData().add(new XYChart.Data("April", 0));
        monthStat.getData().add(new XYChart.Data("May", 0));
        
        monthlyBarChart.getData().add(monthStat);
    }
    
    private void loadDataPieMonday()
    {
        ObservableList<PieChart.Data>mondayData = FXCollections.observableArrayList
        (
                new PieChart.Data("Not In Class", 3),
                new PieChart.Data("In Class", 9));
        
        pieMonday.setData(mondayData); 
    }
    
    private void loadDataPieTuesday()
    {
        ObservableList<PieChart.Data>tuesdayData = FXCollections.observableArrayList
        (
                new PieChart.Data("Not In Class", 4),
                new PieChart.Data("In Class",8));
        
        pieTuesday.setData(tuesdayData); 
    }
    
    private void loadDataPieWednesday()
    {
        ObservableList<PieChart.Data>wednesdayData = FXCollections.observableArrayList
        (
                new PieChart.Data("Not In Class", 1),
                new PieChart.Data("In Class", 11));
        
        pieWednesday.setData(wednesdayData); 
    }
    
    private void loadDataPieThursday()
    {
        ObservableList<PieChart.Data>thursdayData = FXCollections.observableArrayList
        (
                new PieChart.Data("Not In Class", 2),
                new PieChart.Data("In Class", 10));
        
        pieThursday.setData(thursdayData); 
    }
    
    private void loadDataPieFriday()
    {
        ObservableList<PieChart.Data>fridayData = FXCollections.observableArrayList
        (
                new PieChart.Data("Not In Class", 5),
                new PieChart.Data("In Class", 7));
        
        pieFriday.setData(fridayData); 
    }
            

    @FXML
    private void clickBack(ActionEvent event) 
    {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void closeApp(ActionEvent event) 
    {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void readAboutApp(ActionEvent event) {
    }
    
}
