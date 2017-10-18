/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cem.dao;

import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Docente;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Kevin
 */
public class DocenteDAO {
    
    private final Session session;
    
    public DocenteDAO() {
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Docente> getDocentes() {
        
        List<Docente> docentes = null;
        try {
            Query hql = session.createQuery("SELECT d FROM Docente d");
            docentes = hql.list();
        }
        catch (HibernateException hex) {
            System.out.println("Error: " + hex);
        }
        /*finally {
            session.close();
        }*/
        return docentes;
    }
}
