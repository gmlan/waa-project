/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.dao.MemberDataAccess;
import edu.mum.cs545.lms.domain.Member;
import edu.mum.cs545.lms.util.SessionHelper;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 984986
 */
@Repository
public class MemberDataAccessImpl implements MemberDataAccess {

    public List<Member> getAll() {
        Session session = SessionHelper.getSession();
        Query query = session.createQuery("from Member");
        List<Member> list = query.list();

        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addMember(Member member) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        session.save(member);
        trans.commit();
        session.close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Member getMemberById(String userId) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        Query query = session.createQuery("from Member where memberId = :id");
        query.setString("id", userId);
        Object queryResult = query.uniqueResult();
        Member member = (Member) queryResult;
        trans.commit();
        //session.getTransaction().commit();

        return member;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMember(Member member) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        session.merge(member);
        trans.commit();
        session.close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteMember(Member member) {
        Session session = SessionHelper.getSession();
        Transaction trans = session.beginTransaction();
        try {
            session.delete(member);
        } catch (RuntimeException re) {
            throw re;
        } finally {
            trans.commit();
            session.close();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
