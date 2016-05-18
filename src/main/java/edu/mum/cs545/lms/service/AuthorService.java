/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service;

import edu.mum.cs545.lms.domain.Author;
import java.util.List;

/**
 *
 * @author Biwota
 */
public interface AuthorService {
    
//    public void create(Author author);
//    public void update(Author author, Long id);
//    public void delete(Long id);
//    List<Author> findByFirstName(String fname);
//    List<Author> findByLastName(String lname);
//    List<Author> findById(long id);
    public void addAuthor(Author a);
    List<Author> getAll(); 
    Author getAuthorById(String id);
    
}
