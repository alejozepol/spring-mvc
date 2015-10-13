package platzi;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestService {
    
    @Resource
    UserService service;
    
//    private final UserService service;
    
//    @Autowired
//    public UserRestService(@Qualifier("UserBuildDataServiceImpl")UserService service){
//        this.service = service;
//        service.createData();
//    }
    
    @RequestMapping(value = "/usuarios",method = RequestMethod.GET)
    public List<User> getUsuarios(){
        System.out.println("Aquí");
        return service.getUsuariosFromData();
    }
}
