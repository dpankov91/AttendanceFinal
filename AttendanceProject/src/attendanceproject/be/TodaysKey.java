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
public class TodaysKey 
{
    private String key;
    private int id;
    private LocaleDate date;

    public TodaysKey(int id, String key, LocaleDate date) {
        this.id = id;
        this.key = key;
        this.date = date;
    }

    public int getId() {
        return id;
    }
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LocaleDate getDate() {
        return date;
    }

    public void setDate(LocaleDate date) {
        this.date = date;
    }

    
    
    
}
