package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springapp.controller","com.springapp.service"})
public class CrudApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}


}
