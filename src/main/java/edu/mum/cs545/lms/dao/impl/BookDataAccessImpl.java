/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.dao.BookDataAccess;
import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.domain.BookCategory;
import edu.mum.cs545.lms.domain.BookType;
import edu.mum.cs545.lms.util.SessionHelper;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mikiyas
 */
@Repository
public class BookDataAccessImpl implements BookDataAccess{
    
    public BookDataAccessImpl(){
        Book b1 = new Book();
        b1.setBookCategory(BookCategory.FICTION);
        b1.setBookType(BookType.PAPERBACK);
        b1.setDescription("Study Guide");
        b1.setDimension("4.8*8.9*9.9");
        b1.setIsbn("9876534");
        b1.setLanguage("English");
        b1.setPrice(23);
        b1.setQuantity(50);
        b1.setTitle("Spring Hibernate");
        
        Book b3 = new Book();
        b3.setBookCategory(BookCategory.LANGUAGE);
        b3.setBookType(BookType.PAPERBACK);
        b3.setDescription("No Description");
        b3.setDimension("9.8*8.9*9.9");
        b3.setIsbn("9876534");
        b3.setLanguage("English");
        b3.setPrice(23);
        b3.setQuantity(50);
        b3.setTitle("The java programming guide");
        
        Book b2 = new Book();
        b2.setBookCategory(BookCategory.FICTION);
        b2.setBookType(BookType.PAPERBACK);
        b2.setDescription("Nice programming Guide");
        b2.setDimension("9.8*9.2*9.9");
        b2.setIsbn("7892334");
        b2.setLanguage("English");
        b2.setPrice(32);
        b2.setQuantity(90);
        b2.setTitle("Database Management Systems");
        
        addBook(b1);
        addBook(b2);
        addBook(b3);
        
        
    }
    
    public void addBook(Book book){         
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        session.save(book);
        trans.commit();
        session.close();        
    }
    
    public List<Book> getAll() {
        Session session = null;
        Transaction tx = null;
        try {
            session = SessionHelper.getSession();
            tx = session.beginTransaction();
            SQLQuery createSQLQuery = session.createSQLQuery("select * from book").addEntity(Book.class);
            return createSQLQuery.list();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            tx.commit();
            session.close();
        }
    }
    
    public List<Book> getBookByCategory(BookCategory category) {
        Session session = SessionHelper.getSession();
        int cat = category.ordinal();
        Query q = session.createQuery("from Book where bookCategory="+cat);
        //q.setString(0,category);
        List result = q.list();
        if(result.size() > 0) 
            return q.list();
        else 
            return null;
    }
    
}
