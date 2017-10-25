/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.cem.dao.ProgramaDAO;
import org.cem.entities.Programa;

/**
 *
 * @author David
 */
@WebServlet(name = "EditarPrograma", urlPatterns = {"/EditarPrograma"})
public class EditarPrograma extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditarPrograma</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditarPrograma at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        /**
         * Instanciar Programa
         **/
        Programa p = new Programa();
        //Parseo de codigo string a Big Decimal
        String cod = request.getParameter("codigoPrograma");
        BigDecimal codigo = new BigDecimal(cod);
        
        p.setCodigo(codigo);
        p.setNombre(request.getParameter("nombrePrograma"));
        //TODOS LOS RESTANTES CON SUS DATOS DESDE EL JSP
        
        //SE INSTANCIA EL DAO
        
        ProgramaDAO pDAO = new ProgramaDAO();
       //SE LLAMA BUSQUEDA POR LA ID RESCATADA
       
        
       //SI EXISTE, SE REALIZA METODO DE EDICION EN EL DAO
    }
}
