package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.service.ShapeService;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = context.getBean(ShapeService.class, ShapeService.class);
		// wild card mule saglya chya adhi service aspect run honar.
		System.out.println("Fname: " + service.getCircle().getFname());
		System.out.println("Mname: " + service.getCircle().getMname());
		System.out.println("lname: " + service.getCircle().getLname());
		System.out.println("Circle Name: " + service.getCircle().getName());

		// car name sathi method @before run
		// traingle sathi honar nahi
		// karan restiction fakt car chya adhi run honar .
		// First Service run.

	}
}
