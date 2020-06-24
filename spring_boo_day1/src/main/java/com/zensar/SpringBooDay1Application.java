package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zensar.day1.beans.Course;

@SpringBootApplication
public class SpringBooDay1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBooDay1Application.class, args);
		Course course = context.getBean(Course.class);
		System.out.println(course);
	}

}
