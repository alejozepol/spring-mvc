package platzi;

import java.util.List;

/**
 *
 * Definicion basica de un servicio de prueba para usuarios.
 * Spring busca una implementacion y la inyecta.
 * 
 * @author ernesto
 */
public interface UserService {
 
    public void createData();
    
    public List<User> getUsuariosFromData();
}
