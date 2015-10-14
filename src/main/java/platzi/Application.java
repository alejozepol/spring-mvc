package platzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Clase principal del proyecto en su versión war.
 * 
 * La primera en ser ejecutada
 * 
 * Esta clase crea una instancia de si misma y se la da al SpringApplicationBuilder.
 * El es quien levanta esta clase.
 * 
 * con las anotaciones de esta clase, spring configura todo.
 * 
 * @author Ernesto Cantú
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer{
    
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }

    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationJar.class);
    }
}
