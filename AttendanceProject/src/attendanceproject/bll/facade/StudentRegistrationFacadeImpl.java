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
    public User createUser(String name, String email, String password, User.Role role) {
        return userSystem.createUser(name, email, password, role);
    }

    @Override
    public void removeUser(User user) {
        userSystem.removeUser(user);
    }

    @Override
    public User[] getAllUsers() {
       return userSystem.getAllUsers();
    }

    @Override
    public User[] getAllUsers(User.Role role) {
        return userSystem.getAllUsers(role);
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
