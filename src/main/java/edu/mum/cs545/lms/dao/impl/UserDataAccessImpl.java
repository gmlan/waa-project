/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.domain.User;
import java.util.List;
import edu.mum.cs545.lms.dao.UserDataAccess;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 985069
 */
@Repository
public class UserDataAccessImpl implements UserDataAccess {

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getAll() {
        Session session = sessionFactory.getCurrentSession();
        SQLQuery createSQLQuery = session.createSQLQuery("select * from user").addEntity(User.class);
        return createSQLQuery.list();

    }

    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        if (user.getUserId().length() != 0) {
            session.update(user);
        } else {
            session.save(user);
        }
    }

    public User getUserByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("from User where userName=?");
        q.setString(0, name);
        List result = q.list();
        if (result.size() > 0) {
            return (User) result.get(0);
        } else {
            return null;
        }
    }

    public User getUserById(String id) {
        Session session = sessionFactory.getCurrentSession();
        Query q = session.createQuery("from User where userId=?");
        q.setString(0, id);
        List result = q.list();
        if (result.size() > 0) {
            return (User) result.get(0);
        } else {
            return null;
        }
    }
}
