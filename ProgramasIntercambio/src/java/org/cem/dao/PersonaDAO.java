package org.cem.dao;

import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Persona;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class PersonaDAO implements ICrud {
    
    private final Session session;
    
    public PersonaDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
        
    @Override
    public boolean agregar(Object objParam) {
        
        boolean resultado = false;
        try {
            Persona objPersona = (Persona) objParam;
            session.beginTransaction();
            session.save(objPersona);
            session.getTransaction().commit();
            resultado = true;
        }
        catch (HibernateException hex) {
            throw new HibernateException("Error: ", hex);
        }
        finally {
            session.close();
        }
        return resultado;
    }

    @Override
    public boolean modificar(Object objParam, int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Object> obtenerListado() {
        List<Object> personas = null;
        try {
            Query hql = session.createQuery("SELECT p FROM Persona p");
            personas = (List<Object>) hql.list();
        }
        catch (HibernateException hex) {
            System.out.println("Error: " + hex);
        }
        finally {
            session.close();
        }
        return personas;
    }

    @Override
    public Object buscarPorID(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int buscarUltimoID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
