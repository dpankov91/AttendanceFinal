/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.be;

import java.time.LocalDate;

/**
 *
 * @author hp
 */
public class AttendanceData {
    
    private String fName;
    private String lName;
    private int userId;
    private boolean present;
    private LocalDate date;

    public AttendanceData(String fName, String lName, int userId, boolean present, LocalDate date) {
        this.fName = fName;
        this.lName = lName;
        this.userId = userId;
        this.present = present;
        this.date = date;
    }

    public AttendanceData(LocalDate now, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    

    
    
}
