package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.cem.dao.PersonaDAO;
import org.cem.entities.Persona;
import org.hibernate.HibernateException;


public class PersonasRegistradas extends HttpServlet {

    private PersonaDAO personas;
    
    
    /**
     * 
     */
    @Override
    public void init() {
        personas = new PersonaDAO();
    }
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Persona> listado = personas.getPersonas();
            //request.setAttribute("personas", listado);
            if (listado != null) {
                request.setAttribute("total", listado.size());
            }
            else {
                request.setAttribute("total", 0);
            }
            request.getRequestDispatcher("/WEB-INF/jsp/consultar-personas.jsp")
                   .forward(request, response);
        }
        catch (HibernateException hex) {
            throw new ServletException("Error en la consulta a la base de datos.", hex);
        }
    }
    
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
