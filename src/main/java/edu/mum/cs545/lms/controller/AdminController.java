/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

import edu.mum.cs545.lms.domain.User;
import edu.mum.cs545.lms.service.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author gmlan
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(){
        System.out.println("edu.mum.cs545.lms.controller.AdminController.add()");       
    
        return "adduser";
    }
    
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String create(HttpServletRequest request){        
        User user = new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName("cat");
        user.setAddress("New York City");
        user.setEmail("tom.cat@gmail.com");
        user.setPhone("626-123-3456");
        userService.addUser(user);
        
        return "listuser";
    }
    
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String list(){
        return "listuser";
    }
    
     @RequestMapping(value="/rest/list",method=RequestMethod.GET )
    public @ResponseBody List<User> getUsreList(){
       return userService.getAll();
    }
}
