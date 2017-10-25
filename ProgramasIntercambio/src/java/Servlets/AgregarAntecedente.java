/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Blob;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.cem.entities.Antecedente;

/**
 *
 * @author David
 */
@WebServlet(name = "AgregarAntecedente", urlPatterns = {"/AgregarAntecedente"})
public class AgregarAntecedente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Antecedente a = new Antecedente();
        //Parseo codigo
        a.setCodigo(BigDecimal.valueOf(Double.parseDouble(request.getParameter("codigoAntecedente"))));
        //AQUI VA DATOS DE FAMILIA ANFITRIONA
        
        a.setDescripcion(request.getParameter("descripcion"));
        //AQUI VA PARSEO FECHA CADUCIDAD
        
        //AQUI VA PARSEO DEL DOCUMENTO
        
        
        //DAO ANTECEDENTE .agregarAntecedente(a)
    }

}
