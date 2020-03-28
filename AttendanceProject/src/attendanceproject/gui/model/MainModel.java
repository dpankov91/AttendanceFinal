/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.gui.model;

import attendanceproject.be.User;
import attendanceproject.bll.BllFacade;
import attendanceproject.bll.BllManager;

/**
 *
 * @author dpank
 */
public class MainModel 
{
    private BllFacade facade;
    private User loggedInUser;

    public MainModel() 
    {
    this.facade = new BllManager();
    }
    
    public User loginUser(String username, String password)
    {
       return loggedInUser =  facade.getUser(username, password);
    } 

    public void insertKey(String todaysKey) 
    {
        facade.addKey(todaysKey);
    }
    
    //public void hasConfirmedKey(boolean isKeyConfirmed) {
    //   facade.hasConfirmedKey(isKeyConfirmed);
    //}
    
    //method for confirming if user passed correct key
    //it will check if users key matches teachers key for today classes
    //returns true if matches and false if not
    public boolean confirmKey(String key) {
        //TO DO - instead of hardcoding correct key, get the correct key from database
        String correctKey = "123456";
        
        if(key.equals(correctKey))
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
    
}
