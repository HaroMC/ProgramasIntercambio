/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cem.dao;

import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Asignatura;
import org.hibernate.Session;

/**
 *
 * @author Kevin
 */
public class AsignaturaDAO {
    
    private final Session session;
    
    public AsignaturaDAO() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    
}
