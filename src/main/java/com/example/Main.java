package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		System.out.println("Starting Spring Boot Application...");
		ConfigurableApplicationContext context=SpringApplication.run(Main.class, args);
		Student s1=context.getBean(Student.class);
		s1.show();
	}

}
