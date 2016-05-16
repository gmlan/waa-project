/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service.impl;

import edu.mum.cs545.lms.dao.BookDataAccess;
import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.domain.BookCategory;
import edu.mum.cs545.lms.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Biwota
 */
public class BookServiceImpl implements BookService{

    
    private BookDataAccess bookDao;
    
    @Autowired
    public void setBookDao(BookDataAccess bookDao) {
        this.bookDao = bookDao;
    }
    
    
    public void create(Book book) {
        bookDao.save(book);
    }

    public void update(long id, Book book) {
        bookDao.save(book);
    }

    public void delete(long id) {
        bookDao.delete(id);
    }

    public List<Book> findByTitle(String title) {
        return bookDao.findByTitle(title);
    }

    public List<Book> findByIsbn(String isbn) {
        return bookDao.findByIsbn(isbn);
    }

    public List<Book> findByCategory(BookCategory category) {
        return bookDao.findByCategory(category);
    }
    
}