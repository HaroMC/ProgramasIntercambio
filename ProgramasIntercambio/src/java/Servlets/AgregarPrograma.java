package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.cem.dao.AsignaturaDAO;
import org.cem.dao.DocenteDAO;
import org.cem.dao.ProgramaDAO;
import org.cem.entities.Asignatura;
import org.cem.entities.Programa;

@WebServlet(name = "AgregarPrograma", urlPatterns = {"/AgregarPrograma"})
public class AgregarPrograma extends HttpServlet {

    private ProgramaDAO daoPrograma;
    private AsignaturaDAO daoAsignatura;
    private DocenteDAO daoDocente;

    @Override
    public void init() {
        daoPrograma = new ProgramaDAO();
        daoAsignatura = new AsignaturaDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Agregar un programa
        ProgramaDAO pDAO = new ProgramaDAO();
        Programa p = new Programa();
        p.setCodigo(pDAO.buscarUltimoID().add(BigDecimal.ONE));
        //LA ASIGNATURA VA DESPUES (LA CREA EL CEL)
        p.setNombre(request.getParameter("nombrePrograma"));
        //FECHA INICIO
        String tempDate = request.getParameter("fecha");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = new Date();
        try {
            fecha = sdf.parse(tempDate);
        } catch (ParseException ex) {

        }
        //FECHA TERMINO
        String tempDate2 = request.getParameter("fecha2");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha2 = new Date();
        try {
            fecha2 = sdf2.parse(tempDate2);
        } catch (ParseException ex) {
        }
        p.setValor(Integer.parseInt(request.getParameter("valor")));
        p.setEstado("Sin CEL asignado");
        if (pDAO.agregar(p)) {
            request.setAttribute("mensaje", "Programa agregado correctamente "
                    + "al sistema");
            request.getRequestDispatcher("agregarPrograma.jsp").
                    forward(request, response);
        } else {
            request.setAttribute("mensaje", "Error al llegar al DAO");
            request.getRequestDispatcher("agregarPrograma.jsp").
                    forward(request, response);
        }

        /**
         * try {
         *
         * DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
         * Programa objPrograma = new Programa(); String nom =
         * request.getParameter("nombreDePrograma");
         *
         * //<editor-fold defaultstate="collapsed" desc=" Datos de prueba en crudo ">
         * Asignatura objAsignatura = daoAsignatura.obtenerAsignatura();
         * //</editor-fold>
         *
         * //<editor-fold defaultstate="collapsed" desc=" Datos de prueba en crudo ">
         * objPrograma.setCodigo(BigDecimal.ZERO);
         * objPrograma.setNombre(request.getParameter("nombreDePrograma")); Date
         * fechaInicio =
         * formatoFecha.parse(request.getParameter("fechaInicio"));
         * objPrograma.setFechaInicio(fechaInicio); Date fechaTermino =
         * formatoFecha.parse(request.getParameter("fechaTermino"));
         * objPrograma.setFechaTermino(fechaTermino);
         * objPrograma.setValor(Integer.parseInt(request.getParameter("valor")));
         * objPrograma.setEstado("No publicado"); //</editor-fold>
         *
         * PrintWriter out = response.getWriter(); if
         * (daoPrograma.agregar(objPrograma)) { out.println("Programa agregado
         * correctamente."); } else { out.println("No se pudo agregar el
         * programa."); } } catch (NumberFormatException | ParseException ex) {}
         * }
         *
         */
    }
}
