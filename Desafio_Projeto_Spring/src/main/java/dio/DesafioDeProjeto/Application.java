package dio.DesafioDeProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/*
 Projeto Spring Boot gerado via Spring Initializr.
 Os seguintes módulos foram selecionados:
 - Spring Data JPA
 - Spring Web
 - H2 Database
 - OpenFeign
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
