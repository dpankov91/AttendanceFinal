/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.model;

import attendanceproject.be.User;
import attendanceproject.bll.BllFacade;

/**
 *
 * @author dpank
 */
public class MainModel 
{
    private BllFacade facade;
    private User loggedInUser;

    public MainModel(BllFacade facade) 
    {
    this.facade = facade;    
    }
    
    public void loginUser(String username, String password)
    {
        loggedInUser =  facade.getUser(username, password);
    } 
}
