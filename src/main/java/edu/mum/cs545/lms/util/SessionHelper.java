package edu.mum.cs545.lms.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionHelper {
    private static SessionFactory sessionFactory;
    private static Object lockObj = new Object();

    public static Session getSession(){

        if(sessionFactory == null){
            synchronized (lockObj) {
                if(sessionFactory == null){
                        sessionFactory = new Configuration().configure().buildSessionFactory();
                }
            }
        }

        return sessionFactory.openSession();
    }
}
