/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author gmlan
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String add(){
        System.out.println("edu.mum.cs545.lms.controller.AdminController.add()");
        return "adduser";
    }
    
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String create(HttpServletRequest request){
        System.out.println(request.getParameter("firstName"));
        return "listuser";
    }
    
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String list(){
        return "listuser";
    }
}
