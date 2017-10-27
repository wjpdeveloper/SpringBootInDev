package com.wjpdev.springboot.springbootindev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootindevApplication {

	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	String index(){
		return "book name is: " + bookName + ", and book author is: " + bookAuthor;
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootindevApplication.class);
		app.run(args);
	}
}