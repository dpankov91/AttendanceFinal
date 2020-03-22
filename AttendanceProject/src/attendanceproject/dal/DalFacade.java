/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal;

import attendanceproject.be.User;

/**
 *
 * @author dpank
 */
public interface DalFacade {

    public User getUser(String username, String hashedPassword);
    
}
