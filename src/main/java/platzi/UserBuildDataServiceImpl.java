package platzi;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * Implementacion del servicio UserService
 * 
 * @author ernesto
 */
@Service
public class UserBuildDataServiceImpl implements UserService{

    public List<User> usuarios = new LinkedList<>();

    //Cuando Spring crea una instancia de este bean, ejecuto createData.
    public UserBuildDataServiceImpl() {
        createData();
    }
    
    /**
     * Método que crea dummy data.
     */    
    @Override
    public final void createData() {
        User user1 = new User("user1",26);
        User user2 = new User("user2",26);
        User user3 = new User("user3",26);
        User user4 = new User("user4",26);
        User user5 = new User("user5",26);
        
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);
    }

    /**
     * Método que regresa una lista de usuarios
     * @return lista de usuarios
     */
    @Override
    public List<User> getUsuariosFromData() {
        return usuarios;
    }
    
    
    
}
