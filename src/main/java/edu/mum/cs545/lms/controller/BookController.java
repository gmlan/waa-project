/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

import edu.mum.cs545.lms.domain.Author;
import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.domain.BookCategory;
import edu.mum.cs545.lms.domain.BookType;
import edu.mum.cs545.lms.service.AuthorService;
import edu.mum.cs545.lms.service.BookService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Mikiyas
 */
@Controller
//@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private AuthorService authorservice;
    @Autowired
    private BookService bookservice;
    
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getBooks(Model model){
        System.out.println("ALl the books");
        
        model.addAttribute("book", new Book());
        model.addAttribute("bookTypes", Arrays.asList(BookType.values()));
	model.addAttribute("bookCategories", Arrays.asList(BookCategory.values()));
       
        
        return "books";
        
    }
    
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public String addBooks(@ModelAttribute("book")Book book){
      // this part is problamatic. Book is always coming in as null
        
        bookservice.addBook(book);     
        
        return "redirect:/listbooks";
        
    }
    
    @RequestMapping(value = "/listbooks", method = RequestMethod.GET)
    public String getBookslist(Model model){
        System.out.println("ALl the books");
        return "listbooks";
        
    }
    
    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public String getAuthors(Model model){

        Author a = new Author();
        model.addAttribute("author", a);
        
        return "authors";
        
    }
    
    @RequestMapping(value = "/author/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") String id, Model model) {
        Author author = authorservice.getAuthorById(id);         
        model.addAttribute("author", author);
        return "authors";
    }
    
    @RequestMapping(value = "/book/edit/{id}", method = RequestMethod.GET)
    public String editBook(@PathVariable("id") String id, Model model) {
        Book book = bookservice.getBookById(id);         
        model.addAttribute("book", book);
        return "books";
    }
    
    @RequestMapping(value = "/authors", method = RequestMethod.POST)
    public String add(@ModelAttribute("author") Author author){
            authorservice.addAuthor(author);
            System.out.println("Author info --" + author.getEmail());
            System.out.println("Author info --" + author.getFirstName());
            System.out.println("Author info --" + author.getLastName());
            return "redirect:/listauthors/";		
    }
    
     @RequestMapping(value = "/publishers", method = RequestMethod.GET)
    public String getPublishers(Model model){
        Book b = new Book();
        model.addAttribute("book", b);
        
        return "publishers";
        
    }
     @RequestMapping(value = "/listpublishers", method = RequestMethod.GET)
    public String getPublisherslist(Model model){
        Book b = new Book();
        model.addAttribute("book", b);
        
        return "listpublishers";
        
    }
    
     @RequestMapping(value = "/listauthors", method = RequestMethod.GET)
    public String getAuthorslist(Model model){
       return "listauthors";
        
    }
    @RequestMapping(value="/book/rest/booklist",method=RequestMethod.GET )
    public @ResponseBody List<Book> getBookList(){
       return bookservice.getAll();
    }
    
    @RequestMapping(value="/author/rest/authorlist",method=RequestMethod.GET )
    public @ResponseBody List<Author> getAuthorList(){
       return authorservice.getAll();
    }
    
}
