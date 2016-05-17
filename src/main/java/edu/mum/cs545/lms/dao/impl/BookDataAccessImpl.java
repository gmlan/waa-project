/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.dao.BookDataAccess;
import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.util.SessionHelper;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mikiyas
 */
@Repository
public class BookDataAccessImpl implements BookDataAccess{
    
    public void addBook(Book book){         
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        session.save(book);
        trans.commit();
        session.close();        
    }
    
}
