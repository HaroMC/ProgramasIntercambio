package org.cem.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Persona;
import org.cem.entities.Programa;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ProgramaDAO implements ICrud {
    
    private final Session session;
    
    public ProgramaDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    @Override
    public boolean agregar(Object objParam) {
        boolean resultado = false;
        try {
            Programa objPrograma = (Programa) objParam;
            session.beginTransaction();
            session.save(objPrograma);
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object buscarPorID(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Lo que hace este método es buscar el último código que esté
     * registrado en la base de datos, de tal modo que, al agregar un
     * nuevo programa, sumarle 1 al nuevo código (Este método puede ser
     * reemplazado a futuro por un trigger en la base de datos que supla
     * la función de un atributo autoincremental).
     * 
     * @return Un objeto de tipo java.util.List con un único valor del último
     * código registrado.
     */
    @Override
    public BigDecimal buscarUltimoID() {
        BigDecimal resultado = BigDecimal.ZERO;
        try {
            Programa objPrograma = (Programa) session
                    .createQuery("FROM Programa ORDER BY codigo DESC")
                    .setMaxResults(1)
                    .uniqueResult();
            resultado = objPrograma.getCodigo();
        }
        catch (HibernateException hex) {
            System.out.println("Error: " + hex);
        }
        finally {
            session.close();
        }
        return resultado;
    }
    
    public List<Programa> convertirListado(List<Object> listado) {
        List<Programa> programas = new ArrayList<>();
        for (Object object : listado) {
            if (object instanceof Persona) {
                programas.add((Programa) object);
            }
        }
        return programas;
    }

}
