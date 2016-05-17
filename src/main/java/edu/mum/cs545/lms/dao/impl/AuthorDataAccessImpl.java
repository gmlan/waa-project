/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.dao.AuthorDataAccess;
import edu.mum.cs545.lms.domain.Author;
import edu.mum.cs545.lms.util.SessionHelper;
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
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        session.save(author);
        trans.commit();
        session.close();        
    }
    
}
