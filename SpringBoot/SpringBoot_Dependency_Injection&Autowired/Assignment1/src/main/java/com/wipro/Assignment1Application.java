package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(Assignment1Application.class, args);
		
		Laptop l = c.getBean(Laptop.class);
		l.Show();
	}

}
