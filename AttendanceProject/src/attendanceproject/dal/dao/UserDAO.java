/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal.dao;

import attendanceproject.be.AttendanceData;
import attendanceproject.dal.DbConnectionProvider;
import attendanceproject.be.User;
import attendanceproject.util.exception.Exceptions;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dpank
 */
public class UserDAO {
    
    private final DbConnectionProvider connector;

    public UserDAO(DbConnectionProvider connector)    
    {
        this.connector = connector;
        //connector = new DbConnectionProvider();
    }

    public User getUser(String username, String password) throws SQLServerException, SQLException
    {
        String sql = "SELECT * FROM [dbo].[User] WHERE username = ? AND password = ? ";
       
        Connection con = connector.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        
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
    
    public boolean checkForTodaysDate(LocalDate date) throws SQLException
    {
        String sql = "SELECT * FROM [dbo].[KeyHold] WHERE date = CURDATE()";
        
        Connection con = connector.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.setDate(2, Date.valueOf(date));
        
        ResultSet rs = pstmt.executeQuery();
        return rs.next();
    }

    public void addKey(String todaysKey, LocalDate dateNow) throws SQLServerException, SQLException
    {
        String sql = "INSERT INTO [dbo].[KeyHold]([key], [date]) VALUES (?, ?)";
       
        Connection con = connector.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        Date date = java.sql.Date.valueOf(dateNow);
        
        pstmt.setString(1, todaysKey);
        pstmt.setDate(2, date);
        
        pstmt.execute();

    }

    public List<User> getAllStudents() throws SQLException 
    {
        ArrayList<User> allStudents = new ArrayList<>();
        
        String sql = "SELECT * FROM [dbo].[User]";
        
        Connection con = connector.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) 
            {
                Integer id = rs.getInt("id");
                String Fname = rs.getString("Fname");
                String Lname = rs.getString("Lname");
                boolean isTeacher = rs.getBoolean("teacher");
                if(isTeacher == false){
                     allStudents.add(new User(id, Fname, Lname, isTeacher));
                }  
            }
                return allStudents;
               
        
    }

    public List getAllDateForStudent(User us) {
    ArrayList<AttendanceData> specifiedData = new ArrayList<>(); 
    specifiedData.add(new AttendanceData( LocalDate.now()  , false));
    specifiedData.add(new AttendanceData( LocalDate.now()  , true));
    specifiedData.add(new AttendanceData( LocalDate.now()  , true));
    specifiedData.add(new AttendanceData( LocalDate.now()  , false));
    specifiedData.add(new AttendanceData( LocalDate.now()  , false));
    return specifiedData;
    }

}
