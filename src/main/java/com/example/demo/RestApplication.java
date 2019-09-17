package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RestApplication.class);
		System.out.println("Rest Application is started");
		String[] beans = ctx.getBeanDefinitionNames();
		for(String bean:beans) {
			System.out.println("BEAN IS " + bean);
		}
	}
}
