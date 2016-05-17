/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao;

import edu.mum.cs545.lms.domain.Author;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Biwota
 */
public interface AuthorDataAccess/* extends JpaRepository<Author, Long>*/{
//    List<Author> findByFirstName(String fname);
//    List<Author> findByLastName(String lname);
//    List<Author> findById(long id);
    void addAuthor(Author author);
    
        
}
