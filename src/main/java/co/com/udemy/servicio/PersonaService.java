
package co.com.udemy.servicio;

import co.com.udemy.domain.Persona;
import java.util.List;

/**
 *
 * @author SantiagoPC
 */
public interface PersonaService {
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
