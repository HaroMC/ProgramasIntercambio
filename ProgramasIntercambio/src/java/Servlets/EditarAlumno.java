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
import org.cem.entities.Persona;

/**
 *
 * @author David
 */
@WebServlet(name = "EditarAlumno", urlPatterns = {"/EditarAlumno"})
public class EditarAlumno extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Alumno a = new Alumno();
        a.setRutPersona(Integer.parseInt(request.getParameter("rutPersona")));
        //ATRIBUTOS PERSONA
        Persona p =new Persona();
        a.setPersona(p);
        a.setNumeroMatricula(BigDecimal.valueOf(Double.parseDouble(request.getParameter("numeroMatricula"))));
        //Parseo FECHA
        
        //DAO ALUMNO .buscarAlumno(a.getRutPersona)
        if (true) {
            //SI EXISTE
            //DAO ALUMNO .editarAlumno(a)
        }else{
            //SINO EXISTE
            //MENSAJE PERSONA INEXISTENTE
        }
    }

}
