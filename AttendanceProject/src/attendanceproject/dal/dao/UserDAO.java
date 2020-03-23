/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal.dao;

import attendanceproject.be.User;
import attendanceproject.dal.DbConnectionProvider;
import java.io.IOException;
import java.sql.Connection;

/**
 *
 * @author dpank
 */
public class UserDAO {
    
    private final DbConnectionProvider connector;

    public UserDAO() throws Exceptions
    {
        connector = new DbConnectionProvider();
    }

    public User getUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
