/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.cem.entities.FamiliaAnfitriona;
import org.cem.entities.Persona;

/**
 *
 * @author David
 */
@WebServlet(name = "AgregarFamilia", urlPatterns = {"/AgregarFamilia"})
public class AgregarFamilia extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        FamiliaAnfitriona f = new FamiliaAnfitriona();
        f.setRutPersona(Integer.parseInt(request.getParameter("rutPersona")));
        Persona p = new Persona();
        //atributos de persona FAMILIA
        f.setPersona(p);
        f.setCantidadIntegrantes(Short.valueOf(request.getParameter("cantidadIntegrantes")));
        f.setEstado("Disponible");
        
        //DAO FAMILIA .buscarFamilia(f) 
        if (true) {
            //SI EXISTE 
            //MENSAJE FAMILIA EXISTENTE
        }else{
            //DAO FAMILIA .agregarFamilia(f);
        }
    
    }

}
