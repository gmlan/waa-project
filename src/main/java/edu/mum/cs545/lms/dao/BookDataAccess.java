/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao;

import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.domain.BookCategory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Biwota
 */
public interface BookDataAccess extends JpaRepository<Book,Long>{
    List<Book> findByTitle(String title);
    List<Book> findByIsbn(String isbn);
    List<Book> findByCategory(BookCategory category);
}
