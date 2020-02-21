/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal;

import attendanceproject.be.Student;
import attendanceproject.be.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author dpank
 */
public class DataMock 
{
    private ObservableList<User> userData = FXCollections.observableArrayList();
    
    public DataMock() 
    {
        // Add some sample data
        userData.add(new User(1, "Antonio", "Cruz", 1));
        userData.add(new User(2, "Conor", "Chicken", 1));
        userData.add(new User(3, "Vale", "Rooth", 2));
        userData.add(new User(4, "Zlata", "Malcom", 2));
    }
    
     public ObservableList<User> getUserData() 
    {
        return userData;
    }
    
}
