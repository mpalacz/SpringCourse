package com.springcourse.SpringCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCourseApplication.class, args);
	}

//  Wersja ze tekstem
//	@GetMapping
//	public String hello() {
//		return "Hello World";
//	}

	// przyklad tworzy z listy JSONa
//	@GetMapping
//	public List<String> hello() {
//		return List.of("Hello","World");
//	}
}
