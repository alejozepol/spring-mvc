package platzi;

import java.util.List;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.stereotype.Component;

@Component
@Path("/jersey")
public class UserRestServiceJersey {
    
    @Resource //Esta anotación hace que Spring inyecte por inferencia a la implementación de UserService
    UserService service;

    /**
     * Rest controller Jersey que responde con una lista de usuarios solo a método get.
     * No es necesario mappear los json.
     * @return una lista de usuarios.
     */
    @GET
    @Produces("application/json")
    public List<User> getUsuarios(){
        System.out.println("Aquí");
        return service.getUsuariosFromData();
    }
}
