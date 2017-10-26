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
import org.cem.entities.Calificacion;

/**
 *
 * @author David
 */
@WebServlet(name = "AgregarCalificacion", urlPatterns = {"/AgregarCalificacion"})
public class AgregarCalificacion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Calificacion c = new Calificacion();
        c.setCodigo(BigDecimal.valueOf(Double.parseDouble(request.getParameter("codigoCalificación"))));
        //Aqui va el alumno (rut)
        Alumno a = new Alumno();
        a.setRutPersona(Integer.parseInt(request.getParameter("rutAlumno")));
        //DAO ALUMNO .buscarAlumno(a)
        if (true) {
        //SI EXISTE
            c.setAlumno(a);
            //AQUI VA FECHA PARSEADA
            c.setNota(BigDecimal.valueOf(Double.parseDouble(request.getParameter("notaCalificacion"))));
            
        }else{//SINO MENSAJE DE ALUMNO INEXISTENTE
        
        }
    }
}
