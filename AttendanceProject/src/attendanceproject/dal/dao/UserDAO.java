/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal.dao;

import attendanceproject.be.User;
import attendanceproject.util.exception.Exceptions;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dpank
 */
public class UserDAO {
    
    private final DbConnectionProvider connector;

    public UserDAO()    
    {
        connector = new DbConnectionProvider();
    }

    public User getUser(String username, String password) throws SQLServerException, SQLException
    {
        String sql = "SELECT * FROM [dbo].[User] WHERE username = ? AND password = ? ";
        System.out.println("DAO");
        Connection con = connector.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        System.out.println("DAO2");
        if(!rs.next()){
            return null;
        }else{
        int id = rs.getInt("id");
        String firstName = rs.getString("Fname");
        String lastName = rs.getString("Lname");
        boolean isTeacher = rs.getBoolean("teacher");
        
        User us = new User(id, firstName, lastName, isTeacher);
        
        return us;
}
    }
    
}
