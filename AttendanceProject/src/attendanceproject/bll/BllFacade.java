/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.bll;

import attendanceproject.be.User;

/**
 *
 * @author dpank
 */
public interface BllFacade {

    public User getUser(String username, String password);

    public void addKey(String todaysKey);
    
}
