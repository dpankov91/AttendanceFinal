/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.model;

import attendanceproject.be.Student;
import attendanceproject.bll.BllFacade;

/**
 *
 * @author dpank
 */
public class StudentsModel {
    
    private Student student;
    private BllFacade facade;
    
    public StudentsModel(BllFacade facade, Student student)
    {
        this.facade = facade;
        this.student = student;
    }
    
  
    
}
