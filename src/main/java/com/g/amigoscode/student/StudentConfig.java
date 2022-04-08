package com.g.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(1L, "John", "Doe@doe",
                    LocalDate.of(1990, JANUARY, 1), 21);

            Student mariam = new Student(2L, "mariam", "mariam@mariam",
                    LocalDate.of(2000, FEBRUARY, 5), 33);
            studentRepository.saveAll(
                    List.of(john, mariam));

        };
    }
}
