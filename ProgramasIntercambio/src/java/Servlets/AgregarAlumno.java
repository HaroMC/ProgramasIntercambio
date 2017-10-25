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
import org.cem.entities.Alumno;

/**
 *
 * @author David
 */
@WebServlet(name = "AgregarAlumno", urlPatterns = {"/AgregarAlumno"})
public class AgregarAlumno extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Alumno a = new Alumno();
        //AQUI VA PERSONA
        a.setRutPersona(Integer.parseInt(request.getParameter("rutPersona")));
        //Matricula parseada
        a.setNumeroMatricula(BigDecimal.valueOf(Double.parseDouble(request.getParameter("numeroMatricula"))));
        //AQUI VA EL PARSEO DE LA FECHA MATRICULA
        
        
        
        
        //-------DAO
        
        //1.- DAO ALUMNO
        //INSERTAR ALUMNO a 
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
