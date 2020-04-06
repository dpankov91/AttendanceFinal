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
    private LocalDate date;
    private boolean Status;

    public AttendanceData(LocalDate date, boolean Status) {
        this.date = date;
        this.Status = Status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
}
