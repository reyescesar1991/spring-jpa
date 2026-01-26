package com.example.databaseJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

import com.example.databaseJPA.models.Author;
import com.example.databaseJPA.repositories.AuthorRepository;

@SpringBootApplication
public class DatabaseJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseJpaApplication.class, args);
	}

	//Metodo que se ejecuta al iniciar la aplicacion
	@Bean
	public  CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository
	)
	{
		return args -> {

			var author = Author.builder().
				firstName("cesar")
				.lastName("reyes")
				.age(26)
				.email("reyescesar0712@gmail.com")
				.build();

			authorRepository.save(author);

		};
	}

}
