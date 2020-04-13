/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.dal;

import attendanceproject.be.User;
import attendanceproject.util.exception.Exceptions;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author dpank
 */
public interface DalFacade {

    public User getUser(String username, String password) throws Exceptions;

    public void addKey(String todaysKey, LocalDate dateNow);
    
    public void hasConfirmedKey(boolean isKeyConfirmed);

    public void confirmKey(String key);

    public List<User> getAllStudets();

    public List getAllDateForStudent(User us);

    public boolean checkTodaysDateInDB();

    public String getLastKey();
    
}
