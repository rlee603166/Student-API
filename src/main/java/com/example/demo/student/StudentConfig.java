package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commmandLineRunner(StudentRepository repository) {
        return args -> {
            Student ryan = new Student(
                    "ryan.lee@gmail.com",
                    "Ryan",
                    LocalDate.of(2004, Month.MAY, 24)
            );

            Student alex = new Student(
                    "alex@gmail.com",
                    "Alex",
                    LocalDate.of(2001, Month.FEBRUARY, 4)
            );

            repository.saveAll(
                    List.of(ryan, alex)
            );
        };
    }
}
