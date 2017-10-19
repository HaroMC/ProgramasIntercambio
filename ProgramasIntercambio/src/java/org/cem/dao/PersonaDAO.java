package org.cem.dao;

import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Persona;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class PersonaDAO {
    
    private final Session session;
    
    public PersonaDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public List<Persona> getPersonas() {
        List<Persona> personas = null;
        try {
            Query hql = session.createQuery("SELECT p FROM Persona p");
            personas = (List<Persona>) hql.list();
        }
        catch (HibernateException hex) {
            System.out.println("Error: " + hex);
        }
        finally {
            session.close();
        }
        return personas;
    }
}
