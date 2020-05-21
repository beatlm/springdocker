package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RestController
	static final class MyController{
		@GetMapping("/helloworld")
		public String hello(){
			return "Hello world \n";
		}
		
		@GetMapping("/hello")
		public String hello2(){
			return "Hello Bea\n";
		}
	}

}
