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
import org.cem.entities.Docente;

/**
 *
 * @author David
 */
@WebServlet(name = "EditarAsignatura", urlPatterns = {"/EditarAsignatura"})
public class EditarAsignatura extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Asignatura a = new Asignatura();
        a.setCodigo(BigDecimal.valueOf(Double.parseDouble(request.getParameter("codigoAsignatura"))));

        //AQUI VA DOCENTE ASIGNADO (RUT DOCENTE)
        Docente d = new Docente();
        a.setDocente(d);
        a.setNombreAsignatura(request.getParameter("nombreAsignatura"));
        a.setDescripcion(request.getParameter("descripcion"));
        a.setCupos(Long.parseLong(request.getParameter("cupos")));

        //DAO .buscarAsignatura
        if (true) {
            //SI EXISTE MENSAJE ERRONEO    
            // SINO DAO .buscarDocente
        } else if (true) {

            //SI EXISTE .agregarAsignatura
        } else {
            //SINO MENSAJE ERRONEO
        }

    }

}
