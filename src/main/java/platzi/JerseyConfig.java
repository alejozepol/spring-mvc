package platzi;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración Jersey para registrar Paths con Jersey.
 * 
 * La anotación  Configuration permite a spring boot saber que en esta clase
 * se ejecuta configuración y viene a registrar UserRestServiceJersey como
 * un controlador Rest
 * 
 * @author Ernesto Cantú
 */
//@Configuration
public class JerseyConfig extends ResourceConfig {
    
    public JerseyConfig(){
        register(UserRestServiceJersey.class);
    }
}
