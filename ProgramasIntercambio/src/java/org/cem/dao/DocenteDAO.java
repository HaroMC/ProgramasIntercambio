package org.cem.dao;

import java.math.BigDecimal;
import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Docente;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class DocenteDAO implements ICrud {
    
    private final Session session;
    
    public DocenteDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public boolean agregar(Object objParam) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object buscarPorID(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public BigDecimal buscarUltimoID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Docente obtenerDocente() {
        Docente resultado = null;
        try {
            Docente objDocente = (Docente) session
                    .createQuery("FROM Docente ORDER BY rut DESC")
                    .setMaxResults(1)
                    .uniqueResult();
            resultado = objDocente;
        }
        catch (HibernateException hex) {
            System.out.println("Error: " + hex);
        }
        finally {
            session.close();
        }
        return resultado;
    }
}
