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
import org.cem.entities.Antecedente;
import org.cem.entities.FamiliaAnfitriona;

/**
 *
 * @author David
 */
@WebServlet(name = "EliminarAntecedente", urlPatterns = {"/EliminarAntecedente"})
public class EliminarAntecedente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Antecedente a = new Antecedente();
        a.setCodigo(BigDecimal.valueOf(Double.parseDouble(request.getParameter("codigo"))));
        FamiliaAnfitriona f = new FamiliaAnfitriona();
        //AQUI VA LA REFERENCIA DE LA FAMILIA ANFITRIONA
        a.setFamiliaAnfitriona(f);
        a.setDescripcion(request.getParameter("descripcion"));
        //PARSEO FECHA
        //PARSEO DOCUMENTO

        //DAO .buscarAntecedente(a.getCodigo)
        if (true) {
            //SI EXISTE MENSAJE ERRONEO
        } else //SINO
        //.buscarFamilia(f.getCodigo(?))
        {
            if (true) {
                //SI EXISTE
                //.eliminarAntecedente(a)
            } else {
                //SINO MENSAJE NO EXISTE FAMILIA
            }
        }
    }
}
