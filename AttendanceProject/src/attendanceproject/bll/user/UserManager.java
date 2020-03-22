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
public class UserManager implements IUserFacade {

    @Override
    public User[] getAllUsers() {
        return new User[0];
    }

    @Override
    public User logIn(String userName, String password) {
        return null;
    }
    
}
