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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //STAND BY HASTA TEST DE INSERCION
    }
}
