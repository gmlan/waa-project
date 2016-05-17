/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

import edu.mum.cs545.lms.domain.Author;
import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.service.AuthorService;
import edu.mum.cs545.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mikiyas
 */
@Controller
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private AuthorService authorservice;
    @Autowired
    private BookService bookservice;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getBooks(Model model){
        System.out.println("ALl the books");
        Author a = new Author();
        a.setEmail("write2miki");
        a.setFirstName("Miki");
        a.setLastName("Teshome");
        authorservice.addAuthor(a);
        
        Book b = new Book();
        model.addAttribute("book", b);
        
        return "books";
        
    }
    
}
