package com.myproject.SpringProject;

import com.myproject.SpringProject.entity.Gamers;
import com.myproject.SpringProject.repository.GamersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

/*
	// Seed the gamer database
	@Bean
	public CommandLineRunner run(GamersRepository repository) {
		return (args -> {
			insertGamers(repository);
			System.out.println(repository.findAll());
		});
	}

	private void insertGamers(GamersRepository repository)  {
		repository.save(new Gamers("Tommy", "tommyfahey@gmail.com"));
		repository.save(new Gamers("Carl", "Carlman@gmail.com"));
	}

 */
}
