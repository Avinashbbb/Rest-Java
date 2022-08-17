package net.javaguides.restApi;

import net.javaguides.restApi.models.User;
import net.javaguides.restApi.services.UserServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@SpringBootApplication
@ComponentScan({"net.javaguides.restApi.*"})
@EntityScan("net.javaguides.restApi")
@Configuration
@EnableJpaRepositories("net.javaguides.restApi.repositories")
public



public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
