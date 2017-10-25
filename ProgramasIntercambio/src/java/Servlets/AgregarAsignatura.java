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
import org.cem.entities.Asignatura;

/**
 *
 * @author David
 */
@WebServlet(name = "AgregarAsignatura", urlPatterns = {"/AgregarAsignatura"})
public class AgregarAsignatura extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Asignatura a = new Asignatura();
        a.setCodigo(BigDecimal.valueOf(Double.parseDouble(request.getParameter("codigoAsignatura"))));
        
        //AQUI VA DOCENTE ASIGNADO (RUT DOCENTE)
        
        a.setNombreAsignatura(request.getParameter("nombreAsignatura"));
        a.setDescripcion(request.getParameter("descripcion"));
        a.setCupos(Long.parseLong(request.getParameter("cupos")));
        
        //DAO ASIGNATURA .agregarAsignatura(a)
        
                
        
    }

}
