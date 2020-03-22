/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.be;

import javafx.beans.property.*;

/**
 *
 * @author dpank
 */
public class User {
    
    private final StringProperty fName = new SimpleStringProperty();
    private final StringProperty lName = new SimpleStringProperty();
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final IntegerProperty groupId = new SimpleIntegerProperty();
    
    
    public User(Integer id, String firstName, String secondName, int groupId) 
    {
        this.id.setValue(id);
        this.fName.setValue(firstName);
        this.lName.setValue(secondName);
        this.groupId.setValue(groupId);
        
    }

    public User(int i, String name, Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

        
    

    public int getGroupId() 
    {
        return groupId.get();
    }

    public void setGroupId(int value) 
    {
        groupId.set(value);
    }

    public IntegerProperty groupIdProperty() 
    {
        return groupId;
    }

    public String getlName() {
        return lName.get();
    }

    public void setlName(String value) {
        lName.set(value);
    }

    public StringProperty lNameProperty() {
        return lName;
    }

    public String getfName() {
        return fName.get();
    }

    public void setfName(String value) {
        fName.set(value);
    }

    public StringProperty fNameProperty() {
        return fName;
    }

    public int getId() {
        return id.get();
    }

    public void setId(int value) {
        id.set(value);
    }

    public IntegerProperty idProperty() {
        return id;
    }
    public enum Role {
        Student, Teacher
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", permissionGroup=" + groupId + '}';
    }
}

