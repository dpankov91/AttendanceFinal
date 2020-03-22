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
   
     
     //Get an array of all users in the system.
     User[] getAllUsers();
     
     //Login a user with the given credentials.
     User logIn(String userName, String password);
     
     
}
