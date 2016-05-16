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
 * @author Mikiyas
 */
@Controller
public class BookController {
    
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getBooks(){
        System.out.println("ALl the books");
        return "Books";
        
    }
    
}
