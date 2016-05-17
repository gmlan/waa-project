package edu.mum.cs545.lms.service.impl;


import edu.mum.cs545.lms.domain.User;
import edu.mum.cs545.lms.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mum.cs545.lms.dao.UserDataAccess;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 985069
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDataAccess dao;
    
    public List<User> getAll() {
        return dao.getAll();                
    }
    
    public void addUser(User user){
        try {
            //Encypt the user's password
            user.setPassword(encrypt(user.getPassword()));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        dao.addUser(user);
    }
    
    public boolean authentication(User user){
        User savedUser = dao.getUserByName(user.getUserName());
        try {
            if(savedUser != null &&  savedUser.getPassword().equals(encrypt(user.getPassword())))
                return true;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private String encrypt(String source) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(source.getBytes());
        
        byte byteData[] = md.digest();
        
        StringBuilder sb= new StringBuilder();
        for(int i = 0 ; i < byteData.length; i++){
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        return sb.toString();
        
    }

    public User getUserById(String id) {
        return dao.getUserById(id);
    }
}
