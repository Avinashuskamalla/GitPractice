package com.example.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.blog.stackify.Employee;

import controller.EmployeeController;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeController .class)
public class Java88Application {

	public static void main(String[] args) {
		SpringApplication.run(Java88Application.class, args);
	}

}
