package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.userscrud.entity.Post;
import com.example.userscrud.entity.User;
import com.fasterxml.jackson.databind.type.ArrayType;

@SpringBootApplication
public class UserscrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserscrudApplication.class, args);
	}

}
