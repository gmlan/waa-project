/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.dao.CheckOutRecordDataAccess;
import edu.mum.cs545.lms.domain.CheckOutRecord;
import edu.mum.cs545.lms.util.SessionHelper;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mike
 */
@Component
public class CheckOutRecordDataAccessImpl implements CheckOutRecordDataAccess {

    public List<CheckOutRecord> getAll() {

        Session session = null;
        Transaction tx = null;
        try {
            session = SessionHelper.getSession();
            tx = session.beginTransaction();
            SQLQuery createSQLQuery = session.createSQLQuery("select * from t_checkout").addEntity(CheckOutRecord.class);
            return createSQLQuery.list();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            tx.commit();
            session.close();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CheckOutRecord findById(Long id) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        Query query = session.createQuery("from CheckOutRecord where id = :id");
        query.setLong("id", id);
        Object queryResult = query.uniqueResult();
        CheckOutRecord checkout = (CheckOutRecord) queryResult;
        trans.commit();
        //session.getTransaction().commit();

        return checkout;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteCheckOutRecord(CheckOutRecord checkOutRecord) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        try {
            session.delete(checkOutRecord);
        } catch (RuntimeException re) {
            throw re;
        } finally {
            trans.commit();
            session.close();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void createCheckOutRecord(CheckOutRecord checkOutRecord) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        try {
            session.save(checkOutRecord);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            trans.commit();
            session.close();
        }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateCheckOutRecord(CheckOutRecord checkOutRecord) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        session.merge(checkOutRecord);
        trans.commit();
        session.close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
