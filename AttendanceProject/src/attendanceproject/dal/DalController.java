/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal;

import attendanceproject.be.User;
import attendanceproject.dal.dao.StudentDAO;
import attendanceproject.dal.dao.TeacherDAO;
import attendanceproject.dal.dao.UserDAO;
import attendanceproject.util.exception.Exceptions;
import attendanceproject.util.exception.Exceptions.ErrorType;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dpank
 */
public class DalController implements DalFacade {
    
    private UserDAO userDao;
    private TeacherDAO teacherDao;
    private StudentDAO studentDao;

    public DalController() 
    {
        userDao = new UserDAO();
        teacherDao = new TeacherDAO();
        studentDao = new StudentDAO();
    }
    
    

    @Override
    public User getUser(String username, String password) throws Exceptions
    {
            User user =  userDao.getUser(username, password);
            if(user == null)
            {
                try {
                    throw new Exceptions(ErrorType.USER_NOT_FOUND, "Cannot find user with given credentials.");
                } catch (Exceptions ex) {
                    Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return user;
    }

}
