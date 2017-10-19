package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.cem.dao.PersonaDAO;
import org.cem.entities.Persona;
import org.hibernate.HibernateException;

public class AgregarPersona extends HttpServlet {

    private PersonaDAO daoPersona;
    
    @Override
    public void init() {
        daoPersona = new PersonaDAO();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            Persona objPersona = new Persona();
            
            //<editor-fold defaultstate="collapsed" desc=" Datos de prueba en crudo ">
            objPersona.setRut(125478966);
            objPersona.setNombreCompleto("Roberto Alejandro García Lopez");
            DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = formateador.parse("1964-06-12");
            objPersona.setFechaNacimiento(fecha);
            objPersona.setDomicilio("Calle 2345");
            objPersona.setCiudad("Barcelona");
            objPersona.setPais("España");
            objPersona.setCorreo("roberto.garcia@correo.com");
            objPersona.setTelefono("2547-6985-32");
            objPersona.setTipo("Alumno");
            //</editor-fold>
            
            PrintWriter out = response.getWriter();
            if (daoPersona.agregar(objPersona)) {
                out.println("Persona agregada correctamente.");
            }
            else {
                out.println("No se pudo agregar la persona.");
            }
        }
        catch (HibernateException | ParseException ex) {}
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
