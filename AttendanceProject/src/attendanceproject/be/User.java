/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceproject.be;


/**
 *
 * @author dpank
 */
public class User {
    
    private int id;
    private String Fname;
    private String Lname;
    private boolean isTeacher;
    
    public User(int id, String Fname, String Lname)
    {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
    }

    public User(int id, boolean isTeacher) 
    {
        this.id = id;
        this.isTeacher = isTeacher;
    }
    
    public int getId() {
        return id;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public boolean isIsTeacher() {
        return isTeacher;
    }
    
    

    
}

