package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mahesh.model.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = context.getBean("s", Student.class);
		// donhi method chya adhi aop run honar.
		System.out.println(student.getAge());
		System.out.println(student.getName());
		
	}
}
