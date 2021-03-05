package com.cuidar;

import java.util.Calendar;
import java.util.stream.Stream;

import com.cuidar.model.FamilyMember;
import com.cuidar.repository.FamilyMemberRepo;

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
    ApplicationRunner init(FamilyMemberRepo repository) {
        // Save our starter set of books
        return args -> {
            Stream.of(new FamilyMember(null, "José", "123", Calendar.getInstance().getTime())).forEach(cuidar -> {
                repository.save(cuidar);
            });
            //retrieve them all, and print so that we see everything is wired up correctly
            repository.findAll().forEach(System.out::println);
        };
    }
}
