package com.zensar.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zensar.day1.beans.Student;

@SpringBootApplication
public class Example2 {

	public static void main(String[] args) {
			ApplicationContext context= SpringApplication.run(Example2.class, args);
			Student student = context.getBean(Student.class);
			
			System.out.println(student);
		}

}
