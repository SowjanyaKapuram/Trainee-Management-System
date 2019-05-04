package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.mycontroller")
@ComponentScan("com.dao")
@ComponentScan("com.service")
@ComponentScan("com.model")
@EntityScan(basePackages = {"com.model"})
@SpringBootApplication
public class DemoBootNew1Application {
	public static void main(String[] args) {
		SpringApplication.run(DemoBootNew1Application.class, args);
	}
}
