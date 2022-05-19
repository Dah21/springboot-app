package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
//@ComponentScan({"com.springapp.controller","com.springapp.service","com.springapp"})
//@EntityScan("com.springapp.entity")
//@EnableJpaRepositories("com.springapp.repository")
public class CrudApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}


}
