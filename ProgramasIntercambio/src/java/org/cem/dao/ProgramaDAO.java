/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cem.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.cem.connection.HibernateUtil;
import org.cem.entities.Asignatura;
import org.cem.entities.Programa;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HaroMC
 */
public class ProgramaDAO {
    
    private Session session;
    
    
    /**
     * Constructor vacío que instancia el DAO para los programas, obteniendo una
     * conexión a la base de datos mediante Hibernate.
     */
    public ProgramaDAO() {
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    
    
    public boolean agregarPrograma(String nombrePrograma, String nombreAsignatura,
            int valor, String tipoPrograma, String paisDestino,
            Date fechaInicio, Date fechaTermino) {
        
        boolean result = false;
               
        /*if (getUltimoCodigo() != null) {
            BigDecimal codigo = (BigDecimal) getUltimoCodigo().get(0).getCodigo();
            
            Asignatura asig = new Asignatura(
            Programa prog = new Programa(codigo, nombreAsignatura, nombrePrograma, fechaInicio, fechaTermino, valor, "No_publicado", null, null);
        }*/
        
        try {
            String hql = "";
        }
        catch (HibernateException hex) {
            System.out.println("Error: " + hex);
        }
        /*finally {
            session.close();
        }*/
        return result;
    }
    
    
    /**
     * Lo que hace este método es buscar el último código que esté regstrado
     * en la base de datos, de tal modo que, al agregar un nuevo programa,
     * sumarle 1 al nuevo código (Este método puede ser reemplazado a futuro
     * por un trigger en la base de datos que simule un atributo autoincremental).
     * 
     * @return Un objeto de tipo java.util.List con un único valor del último
     * código registrado.
     */
    private List<Programa> getUltimoCodigo() {
        
        List result = null;
        try {
            String hql = "select max(codigo) from Programa";
            Transaction tr = session.beginTransaction();
            result = session.createQuery(hql).list();
        }
        catch (HibernateException hex) {
            System.out.println("Error: " + hex);
        }
        /*finally {
            session.close();
        }*/
        return result;
    }
}
