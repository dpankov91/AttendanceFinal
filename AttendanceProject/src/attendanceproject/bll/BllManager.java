/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.bll;

import attendanceproject.be.User;
import attendanceproject.dal.DalFacade;

/**
 *
 * @author dpank
 */
public class BllManager implements BllFacade{
    
    private DalFacade dalfacade;

    public BllManager(DalFacade facade)
    {
        this.dalfacade = dalfacade;
    }

    @Override
    public User getUser(String username, String password) 
    {
        return dalfacade.getUser(username, password);    
    }
    
}
