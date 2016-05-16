package edu.mum.cs545.lms.service.impl;


import edu.mum.cs545.lms.domain.User;
import edu.mum.cs545.lms.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mum.cs545.lms.dao.UserDataAccess;

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
        dao.addUser(user);
    }
    
}
