package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = context.getBean("student1", Student.class);
		Student s2 = context.getBean("student2", Student.class);
		s1.display();
		s2.display();

	}

}
