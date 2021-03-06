package pruebas;

import java.util.List;
import org.cem.dao.DocenteDAO;
import org.cem.dao.PersonaDAO;
import org.cem.entities.Docente;
import org.cem.entities.Persona;
import org.hibernate.HibernateException;

public class Main {
    
    public static void main(String[] args) {
        
        PersonaDAO daoPersona = new PersonaDAO();
        
        /*try {
            List<Object> listado = daoPersona.obtenerListado();
            List<Persona> personas = daoPersona.convertirListado(listado);
            if (personas != null) {
                System.out.println("\nPERSONAS ENCONTRADAS:\n");
                for (Persona p : personas) {
                    System.out.println(p.toString());
                }
            }
            else {
                System.out.println("\nNO EXISTEN PERSONAS REGISTRADAS.");
            }
        }
        catch (HibernateException hex) {
            System.out.println("NO SE HA PODIDO ESTABLECER LA CONEXIÓN.\n"
                    + "ERROR: " + hex);
        }*/
        
        /*try {
            if (daoPersona.registrarPersona()) {
                System.out.println("\nPERSONA REGISTRADA.");
            }
            else {
                System.out.println("\nERROR EN LA INSERSIÓN.");
            }
        }
        catch (HibernateException hex) {
            throw new HibernateException("ERROR: ", hex);
        }*/
        
        DocenteDAO daoDocente = new DocenteDAO();
        try {
            List<Docente> listado = daoDocente.getListado();
            if (!listado.isEmpty()) {
                System.out.println("\nDOCENTES ENTCONTRADOS\n");
                for (Docente docente : listado) {
                    System.out.println("Rut: " + docente.getRutPersona());
                }
            }
        }
        catch (HibernateException hex) {
            System.out.println("NO SE HA PODIDO ESTABLECER LA CONEXIÓN.\n"
                    + "ERROR: " + hex);
        }
    }
}
