/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.bll.user;

import attendanceproject.be.User;

/**
 *
 * @author mario
 */
public interface IUserFacade {
   
    //Creates a new user with the given name, email and password. User.Role role might be subject to change.)
     User createUser(String name, String email, String password, User.Role role);
    
     
     //Removes the given User from the system.
     void removeUser(User user);
     
     
     //Get an array of all users in the system.
     User[] getAllUsers();
     
     
     //Gets all users by a specific role. (not final)
     User[] getAllUsers(User.Role role);
     
     
     //Login a user with the given credentials.
     User logIn(String userName, String password);
     
}
