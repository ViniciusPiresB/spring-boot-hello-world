package com.vinicius.catsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vinicius.catsapi")
public class CatsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsApiApplication.class, args);
	}

}
