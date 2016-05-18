/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.dao.AuthorDataAccess;
import edu.mum.cs545.lms.domain.Author;
import edu.mum.cs545.lms.util.SessionHelper;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mikiyuas
 */
@Repository
public class AuthorDataAccessImpl implements AuthorDataAccess{
    
    public void addAuthor(Author author){         
        System.out.println("Persisting author into table" + author.getFirstName() + " " + author.getLastName());
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        session.save(author);
        trans.commit();
        session.close();        
    }
    
     public List<Author> getAll() {
        Session session = null;
        Transaction tx = null;
        try {
            session = SessionHelper.getSession();
            tx = session.beginTransaction();
            SQLQuery createSQLQuery = session.createSQLQuery("select * from author").addEntity(Author.class);
            return createSQLQuery.list();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            tx.commit();
            session.close();
        }
    }
     
      public Author getAuthorById(String id) {
        Session session = null;
        Transaction tx = null;
        try {
            session = SessionHelper.getSession();
            tx = session.beginTransaction();
            Query q = session.createQuery("from Author where id=?");
            q.setString(0,id);
            List result = q.list();
            if(result.size() > 0) 
                return (Author)result.get(0);
            else 
                return null;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            tx.commit();
            session.close();
        }
    }
    
}
