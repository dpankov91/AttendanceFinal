/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal.dao;

import attendanceproject.be.User;
import java.io.IOException;
import java.sql.Connection;

/**
 *
 * @author dpank
 */
public class UserDAO {
    
    private final DbConnectionProvider connector;

    public CatMovDAO() throws IOException
    {
        connector = new dbConnectionProvider();
    }

    public User getUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
