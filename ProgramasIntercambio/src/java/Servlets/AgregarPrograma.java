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
import org.cem.entities.Programa;
import org.cem.entities.Usuario;

/**
 *
 * @author David
 */
/*
AQUI SE ESPECIFICA EL NOMBRE DEL SERVLET CON EL CUAL DEBE SER LLAMADO
*/
@WebServlet(name = "AgregarPrograma", urlPatterns = {"/AgregarPrograma"})
public class AgregarPrograma extends HttpServlet {

    //Como el formulario lo solicita por post, salta directamente a este sector
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Instancio
        Programa p = new Programa();
        //le asigno los valores que recibo desde el formulario
        p.setNombre(request.getParameter("nombreDePrograma"));
        //faltan los demàs
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Probaremos si hemos recibido correctamente los datos al servlet mostrandolos por pantalla */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgregarPrograma</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nombre del programa: " + p.getNombre() + "</h1>");
            //aqui lo mismo pero con los parametros distintos.
            out.println("</body>");
            out.println("</html>");
            
            
            
            // en vez de mostrar por pantalla, aqui va la conecc al DAO, el cual realiza 
            // las solicitudes a la conn para realizar los cambios.
        }
    }

}
