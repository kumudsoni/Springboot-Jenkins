package com.zensar.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zensar.day1.beans.Employee;

@SpringBootApplication
public class Example4 {
	
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Example4.class, args);
	
			Employee employee = context.getBean(Employee.class);
			System.out.println(employee);
	}
		
}
