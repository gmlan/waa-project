/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao;

import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.domain.BookCategory;
import java.util.List;

/**
 *
 * @author Mikiyas
 */
public interface BookDataAccess/* extends JpaRepository<Book,Long>*/{
    //List<Book> findByTitle(String title);
    //List<Book> findByIsbn(String isbn);
    //List<Book> findByCategory(BookCategory category);
    void addBook(Book book);
    public List<Book> getAll();
    public List<Book> getBookByKeyword(String keyword);
    public List<Book> getBookByCategory(BookCategory category);
    Book getBookById(String id);
    public List<Book> availableBooks();
    public Book getBookByIsbn(String isbn);
    public void updateBook(Book book);
}
