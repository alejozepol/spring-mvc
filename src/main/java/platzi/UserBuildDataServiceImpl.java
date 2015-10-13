package platzi;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ernesto
 */
@Service
public class UserBuildDataServiceImpl implements UserService{

    public List<User> usuarios = new LinkedList<>();

    public UserBuildDataServiceImpl() {
        createData();
    }
    
    
    
    @Override
    public final void createData() {
        User user1 = new User("ernesto",26);
        User user2 = new User("daniela",26);
        User user3 = new User("jcv",26);
        User user4 = new User("acv",26);
        User user5 = new User("lv",26);
        
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);
    }

    @Override
    public List<User> getUsuariosFromData() {
        return usuarios;
    }
    
    
    
}
