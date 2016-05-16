/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

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
    public void create(){
    }
    
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public void list(){
    }
}
