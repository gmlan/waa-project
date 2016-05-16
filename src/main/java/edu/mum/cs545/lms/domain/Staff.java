/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.domain;

/**
 *
 * @author gmlan
 */
public class Staff extends User {
    private String userName;
    private String password;
    private StaffType type;
    /**
     * @return the type
     */
    public StaffType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(StaffType type) {
        this.type = type;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
