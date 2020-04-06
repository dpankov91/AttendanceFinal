/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.bll;

import attendanceproject.be.User;
import attendanceproject.bll.security.ISecurityManager;
import attendanceproject.bll.security.SecurityManager;
import attendanceproject.dal.DalController;
import attendanceproject.dal.DalFacade;
import attendanceproject.util.exception.Exceptions;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;

/**
 *
 * @author dpank
 */
public class BllManager implements BllFacade{
    
    private DalFacade dalFacade;
    private ISecurityManager securityManager;

    public BllManager()
    {
        this.dalFacade = new DalController();
        this.securityManager = new SecurityManager();
    }

    @Override
    public User getUser(String username, String password) 
    {
        try {    
            //String hashedPassword = securityManager.hashPassword(password);
            return dalFacade.getUser(username, password);
        } catch (Exceptions ex) {
            

            Logger.getLogger(BllManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void addKey(String todaysKey) 
    {
        dalFacade.addKey(todaysKey);
    }

    @Override
    public boolean confirmKey(String key) {
        dalFacade.confirmKey(key);
        return true;
    }

    @Override
    public List<User> getAllStudents() 
    {
        return dalFacade.getAllStudets();
    }

    @Override
    public List getAllDateForStudent(User us) {
      return dalFacade.getAllDateForStudent(us);
    }
    
}
