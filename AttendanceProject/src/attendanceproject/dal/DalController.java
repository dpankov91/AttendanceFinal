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
import java.time.LocalDate;
import java.util.List;
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
        DbConnectionProvider connector = new DbConnectionProvider();
        userDao = new UserDAO(connector);
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
    public void addKey(String todaysKey, LocalDate dateNow) 
    {
        try {
            userDao.addKey(todaysKey, dateNow);
        } catch (SQLException ex) {
            Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    @Override
//    public void hasConfirmedKey(boolean isKeyConfirmed) {
//        
//        userDao.hasConfirmedKey(isKeyConfirmed);
//    }

    @Override
    public void confirmKey(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAllStudets() 
    {
        try {
            List<User> allStudents = userDao.getAllStudents(); 
            return allStudents;
        } catch (SQLException ex) {
            Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List getAllDateForStudent(User us) {
    List allStudents = userDao.getAllDateForStudent(us); 
      return allStudents;
    }

    @Override
    public void hasConfirmedKey(boolean isKeyConfirmed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkTodaysDateInDB() 
    {
        try {
            return userDao.checkTodaysDateInDB();
        } catch (SQLException ex) {
            Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public String getLastKey() 
    {
        try {
            return userDao.getLastKey();
        } catch (SQLException ex) {
            Logger.getLogger(DalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   

}
