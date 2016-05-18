/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author 985069
 */

@Entity
@Table(name="user")
public class User implements Serializable{
    @Id    
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="uuid2")
    @Column(name="userId", unique = true)
    private String userId;
    
    @Size(min=4, message="At least 4 characters")
    @Column(name="userName")  
    private String userName;
    
    @Size(min=8, message="At least 8 characters")
    @Column(name="password")
    private String password;
    
    @Column(name="type")
    private UserType type;
        
    @Column(name="enabled")
    private boolean enabled;
    
    @Transient
    private boolean rememberme;
    
    @Transient
    private boolean loggedIn;
    
    @Size(min=4, message="At least 4 characters")
    @Column(name="firstName")
    String firstName;
    
    @Size(min=4, message="At least 4 characters")
    @Column(name="lastName")
    String lastName;
    
    @Email(message = "Bad email format")
    @Column(name="email")
    String email;
    
    @Column(name="address")
    private String address;
    
    
    @Column(name="phone")
    private String phone;
        
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
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

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
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

    /**
     * @return the rememberme
     */
    public boolean isRememberme() {
        return rememberme;
    }

    /**
     * @param rememberme the rememberme to set
     */
    public void setRememberme(boolean rememberme) {
        this.rememberme = rememberme;
    }

    /**
     * @return the loggedIn
     */
    public boolean isLoggedIn() {
        return loggedIn;
    }

    /**
     * @param loggedIn the loggedIn to set
     */
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * @return the type
     */
    public UserType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(UserType type) {
        this.type = type;
    }

    /**
     * @return the enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
}