package edu.mum.cs545.lms.service.impl;


import edu.mum.cs545.lms.dao.UsersDataAccess;
import edu.mum.cs545.lms.domain.User;
import edu.mum.cs545.lms.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

//    @Autowired
//    private UsersDataAccess userDao;
    
    public List<User> getAll() {
       // return (List<User>) userDao.findAll();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
