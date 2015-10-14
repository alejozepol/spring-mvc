package platzi;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Versión del proyecto SpringBoot MVC en el que creo un jar y ejecuto
 * directamente desde linea de comandos.
 * 
 * Arranco directamente con public static void main()
 * 
 * Para ejecutar con esta versión es necesario renombrar los pom.xml y pom-jar.xml
 * para usar el pom correspondiente.
 * 
 * @author Ernesto Cantú
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationJar { 
    
//    public static void main(String[] args) {
//        SpringApplication.run(ApplicationJar.class, args);
//    }
}
