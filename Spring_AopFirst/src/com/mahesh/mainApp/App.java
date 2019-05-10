package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.service.ShapeService;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = context.getBean(ShapeService.class, ShapeService.class);
		System.out.println("<=CIRCLE=> " + service.getCircle().getName());
//		System.out.println("<=TRAINGLE=> " + service.getTraingle().getName());

		// car name sathi method @before run
		// traingle sathi honar nahi
		// karan restiction fakt car chya adhi run honar .
		// First Service run.

	}
}
