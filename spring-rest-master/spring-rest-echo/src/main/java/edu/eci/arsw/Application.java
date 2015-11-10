package edu.eci.arsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
       // SpringApplication.run(Application.class, args);
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }
}

@Configuration
@ImportResource("classpath:/manejadorOrdenesAppContext.xml")
class XmlImportingConfiguration {
    
}

