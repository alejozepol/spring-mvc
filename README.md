# spring-mvc
Implementación de Rest Service con Dependency Injection en Spring Boot 


El proyecto contiene 2 versiones de Application class y 2 versiones de pom.xml.

1.- Versión Jar ejecutable con Spring Boot.
  Esta versión utiliza el archivo pom-jar.xml (El cual debe ser renombrado por pom.xml para ser reconocido por maven).
  Corre con la Clase ApplicationJar.java descomentando el método main.
  
  ¿Qué incluye el pom.xml?
  
  Estos dos plug in que le permiten a maven ejecutar el código con main.
  <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
    </plugin>		
    
    <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.2</version>
    </plugin>
    
  
  2.- La versión War con Spring Boot.
  
  Es la versión que viene por defecto en el código. Esta versión utiliza el archivo pom.xml el cual no tiene los dos
  plug in anteriormente mencionados e incluye la siguiente dependencia
  
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
      <version>1.2.6.RELEASE</version>
      <scope>provided</scope>
  </dependency>
  
  Esta versión está configurada para correr con Tomcat. Dentro de la carpeta /src/main/java/webapp/META-INF está el
  archivo context.xml el cual tiene el path /spring-mvc para poder ejecutarlo en tomcat.
