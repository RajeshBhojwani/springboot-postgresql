package com.example.springposgres;

import com.example.springposgres.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	CustomerRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}

