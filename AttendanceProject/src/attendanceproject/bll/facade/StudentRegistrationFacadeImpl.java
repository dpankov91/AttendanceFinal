/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.bll.facade;

import attendanceproject.be.User;
import attendanceproject.bll.security.ISecurityManager;
import attendanceproject.bll.security.SecurityException;
import attendanceproject.bll.user.IUserFacade;


public class StudentRegistrationFacadeImpl implements IStudentRegistrationFacade {

     private IUserFacade userSystem;
     private ISecurityManager securitySystem;
    
    

    @Override
    public User[] getAllUsers() {
       return userSystem.getAllUsers();
    }

    @Override
    public User logIn(String userName, String password) {
        return userSystem.logIn(userName, password);
    }

    @Override
    public String hashPassword(String password) {
        return securitySystem.hashPassword(password);
    }
    
}
