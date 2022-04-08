package com.g.amigoscode;

import com.g.amigoscode.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class AmigoscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(1L,"Mariam",
				"mariam", LocalDate.of(2000, Month.JANUARY,5),21));
	};

}
