/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service;

import edu.mum.cs545.lms.domain.Book;
import java.util.List;

/**
 *
 * @author Biwota
 */
public interface BookService {
    void create(Book book);
    void update(long id,Book book);
    void delete(long id);
    List<Book> findByTitle(String title);
    
    
}
