package com.cuidar.app;

import java.util.stream.Stream;

import com.cuidar.app.repository.Cuidar;
import com.cuidar.app.repository.CuidarRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
    ApplicationRunner init(CuidarRepository repository) {
        // Save our starter set of books
        return args -> {
            Stream.of(new Cuidar(null, "Cuidar App"), new Cuidar(null, "Cuidar App 2")).forEach(cuidar -> {
                repository.save(cuidar);
            });
            //retrieve them all, and print so that we see everything is wired up correctly
            repository.findAll().forEach(System.out::println);
        };
    }
}
