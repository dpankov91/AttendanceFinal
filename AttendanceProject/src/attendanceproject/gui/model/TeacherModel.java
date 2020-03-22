/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.model;

import attendanceproject.be.Teacher;
import attendanceproject.bll.BllFacade;

/**
 *
 * @author dpank
 */
public class TeacherModel 
{
    private BllFacade facade;
    private Teacher teacher;
    
    public TeacherModel(BllFacade facade, Teacher teacher)
    {
        this.facade = facade;
        this.teacher = teacher;
    }
    
    
}
