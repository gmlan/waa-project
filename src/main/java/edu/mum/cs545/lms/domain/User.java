/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.domain;

import java.io.Serializable;

/**
 *
 * @author 985069
 */
public class User implements Serializable{
    String firstName;
    String lastName;
    String email;
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
     public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
     public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    

    public User(String fName, String lName, String mail){
        this.firstName = fName;
        this.lastName = lName;
        this.email = mail;
    }
    
    @Override
    public String toString(){
        return "["+ this.firstName + "," + this.lastName + "," + this.email + "]";
    }
}