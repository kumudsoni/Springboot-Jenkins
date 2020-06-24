package com.zensar.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zensar.day1.beans.Product;

@SpringBootApplication
public class Example3 {
	
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Example3.class, args);
	
		Product product1 = context.getBean(Product.class);

		System.out.println(product1);
		
		Product product2 = context.getBean(Product.class);
		
		System.out.println(product2);
		
		if(product1==product2) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
			
			
	}
		
}
