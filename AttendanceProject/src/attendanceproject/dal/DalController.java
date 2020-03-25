/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal;

import attendanceproject.be.User;
import attendanceproject.dal.dao.UserDAO;
import attendanceproject.util.exception.Exceptions;
import attendanceproject.util.exception.Exceptions.ErrorType;
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

    public DalController() 
    {
        userDao = new UserDAO();
    }
    
    @Override
    public User getUser(String username, String password) throws Exceptions
    {
        try {
            User user =  userDao.getUser(username, password);
            if(user == null)
            {
                try {
                    throw new Exceptions(ErrorType.USER_NOT_FOUND, "Cannot find user");
                } catch (Exceptions ex) {
                    Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return user;
        } catch (SQLException ex) {
            Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
            
        return null;
        }
    }

    @Override
    public void addKey(String todaysKey) 
    {
        try {
            userDao.addKey(todaysKey);
        } catch (SQLException ex) {
            Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
