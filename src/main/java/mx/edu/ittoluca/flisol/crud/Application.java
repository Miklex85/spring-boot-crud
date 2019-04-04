package mx.edu.ittoluca.flisol.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication 
@EnableAutoConfiguration
//@ComponentScan(basePackages={"mx.edu.ittoluca.flisol.crud"})
//@EnableJpaRepositories(basePackages="mx.edu.ittoluca.flisol.crud.repositories")
//@EnableTransactionManagement
//@EntityScan(basePackages="mx.edu.ittoluca.flisol.crud.entities")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
