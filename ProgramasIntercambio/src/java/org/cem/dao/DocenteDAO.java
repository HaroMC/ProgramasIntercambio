package org.cem.dao;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import oracle.jdbc.OracleTypes;
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
    
    
    /**
     * Método que hace uso de procedimiento almacenado de Oracle.
     * 
     * @return Listado de docentes entregado por el procedimiento almacenado.
     */
    public List<Docente> getListado() {
        List<Docente> listado = null;
        try {
            // Query de llamada al procedimiento almacenado.
            String query = "{ call CEM.DOCENTE_LISTAR() }";
            
            // Hibernate no tiene métodos para trabajar con procedimientos
            // almacenados, por ende, se castea la sesión de hibernate a una
            // conexión de SQL.
            Connection con = (Connection) HibernateUtil.getSessionFactory();
            
            // Se prepara la query de llamada al procedimiento almacenado.
            CallableStatement llamada = con.prepareCall(query);
            
            // Se indica que se capturen los datos retornados por el
            // procedimiento. El procedimiento almacenado de oracle retorna un
            // objeto de tipo Cursor, en el que se encuentran todas las filas
            // que encontró el procedimiento.
            llamada.registerOutParameter(1, OracleTypes.CURSOR);
            
            // Se ejecuta la llamada al procedimiento.
            llamada.executeUpdate();
            
            // Se obtiene el Cursor con los resultados y se castean a un
            // ResultSet para extraer los datos de las columnas.
            ResultSet resultado = (ResultSet) llamada.getObject(1);
            
            // Se recorren los resultados, se van transformando en objetos
            // Docente y se van añadiendo al listado que será retornado.
            while (resultado.next()) {
                Docente docente = new Docente();
                int rutPersona = Integer.parseInt(resultado.getString("RUT_PERSONA"));
                String estado = resultado.getString("ESTADO");
                String observaciones = resultado.getString("OBSERVACIONES");
                docente.setRutPersona(rutPersona);
                docente.setEstado(estado);
                docente.setObservaciones(observaciones);
                listado.add(docente);
            }
        }
        catch (HibernateException | SQLException ex) {
        }
        finally {
            session.close();
        }
        return listado;
    }
}
