package org.cem.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Persona;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Clase pública que se encarga de manipular los objetos tipo
 * <code>Persona</code> dentro de la base de datos.
 * 
 * @author HaroMC
 * @version 1.1
 */
public class PersonaDAO implements ICrud {
    
    private final Session session;
    
    /**
     * Constructor vacío que inicializa la conexión al momento de instanciar
     * el DAO.
     */
    public PersonaDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    /**
     * Este método de encarga de agregar un objeto, recibido por parámetro,
     * a la base de datos. Al implementar Hibernate, este método no requiere
     * ejecutar ninguna sentencia HQL, sino que, sólamente, se vale del método
     * <code>.save(Object)</code> para realizar la inserción.
     * 
     * @param objParam Objeto que recibe el método para ser agregado a la
     * base de datos. Este objeto puede ser de cualquier tipo de las clases
     * definidas por Hibernate.
     * @return <code>true</code> si el objeto fue insertado correctamente o
     * <code>false</code> en el caso de que no se pueda agregar.
     */
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
    
    /**
     * 
     * @param objParam
     * @param id
     * @return 
     */
    @Override
    public boolean modificar(Object objParam, int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }

    /**
     * 
     * @return 
     */
    @Override
    public List<Object> obtenerListado() {
        List<Object> personas = null;
        try {
            Query hql = session.createQuery("SELECT p FROM Persona p");
            personas = (List<Object>) hql.list();
        }
        catch (HibernateException hex) {
            throw new HibernateException("Error: ", hex);
        }
        finally {
            session.close();
        }
        return personas;
    }

    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public Object buscarPorID(int id) {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public BigDecimal buscarUltimoID() {
        throw new UnsupportedOperationException("Método aún no implementado.");
    }
    
    /**
     * Método que transforma el listado de objetos tipo <code>Object</code>
     * que genera el método <code>obtenerListado</code> a una lista de objetos
     * de tipo <code>Persona</code>.
     * 
     * @param listado <code>List</code> de tipo <code>Object</code>.
     * @return <code>List</code> de tipo <code>Persona</code>.
     */
    public List<Persona> convertirListado(List<Object> listado) {
        List<Persona> personas = new ArrayList<>();
        for (Object object : listado) {
            if (object instanceof Persona) {
                personas.add((Persona) object);
            }
        }
        return personas;
    }
}
