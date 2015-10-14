package platzi;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController //Anotación vista en el curso Platzi para indicar que es un rest service
public class UserRestService {
    
    @Resource //Esta anotación hace que Spring inyecte por inferencia a la implementación de UserService
    UserService service;
    
//    Este es el método que vimos en el curso. Tambien funciona
//    private final UserService service;
    
//    @Autowired
//    public UserRestService(@Qualifier("UserBuildDataServiceImpl")UserService service){
//        this.service = service;
//        service.createData();
//    }
    
    /**
     * Rest controller que responde con una lista de usuarios solo a método get.
     * No es necesario mappear los json.
     * @return una lista de usuarios.
     */
    @RequestMapping(value = "/usuarios",method = RequestMethod.GET)
    public List<User> getUsuarios(){
        System.out.println("Aquí");
        return service.getUsuariosFromData();
    }
}
