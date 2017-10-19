package org.cem.dao;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    
    /*public boolean registrarPersona(int rut, String nombreCompleto,
            Date fechaNacimiento, String domicilio, String ciudad, String pais,
            String correo, String telefono, String tipo) {*/
    public boolean registrarPersona() {
        
        boolean resultado = false;
        
        Persona objPersona = new Persona();
        /*objPersona.setRut(rut);
        objPersona.setNombreCompleto(nombreCompleto);
        objPersona.setFechaNacimiento(fechaNacimiento);
        objPersona.setDomicilio(domicilio);
        objPersona.setCiudad(ciudad);
        objPersona.setPais(pais);
        objPersona.setCorreo(correo);
        objPersona.setTelefono(telefono);
        objPersona.setTipo(tipo);*/
        
        try {
            objPersona.setRut(125478966);
            objPersona.setNombreCompleto("Roberto Alejandro García Lopez");
            DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = formateador.parse("1964-06-12");
            objPersona.setFechaNacimiento( fecha );
            objPersona.setDomicilio("Calle 2345");
            objPersona.setCiudad("Barcelona");
            objPersona.setPais("España");
            objPersona.setCorreo("roberto.garcia@correo.com");
            objPersona.setTelefono("2547-6985-32");
            objPersona.setTipo("Alumno");
            session.beginTransaction();
            session.save(objPersona);
            session.getTransaction().commit();
            resultado = true;
        }
        catch (HibernateException hex) {
            throw new HibernateException("Error: ", hex);
        }
        catch (ParseException pex) {
            System.out.println("Hola");
        }
        finally {
            session.close();
        }
        return resultado;
    }
}
