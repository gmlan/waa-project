/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service;

import edu.mum.cs545.lms.domain.User;
import java.util.List;

/**
 *
 * @author 985069
 */
public interface UserService {
    List<User> getAll();
    void addUser(User user);
    User getUserById(String id);
    boolean authentication(User user);    
}
