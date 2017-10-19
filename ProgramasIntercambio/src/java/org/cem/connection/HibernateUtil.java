package org.cem.connection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author HaroMC
 */
public class HibernateUtil {

    private static final SessionFactory SESSIONFACTORY;
    
    static {
        try {
            SESSIONFACTORY = new AnnotationConfiguration().configure().buildSessionFactory();
        }
        catch (HibernateException ex) {
            //System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return SESSIONFACTORY;
    }
    
    public static Session openSession() {
        return SESSIONFACTORY.openSession();
    }
}
