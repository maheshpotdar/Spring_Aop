package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mahesh.*;
import com.mahesh.model.Company;
import com.mahesh.model.Employee;
import com.mahesh.model.SimpleTest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/spring.xml");
		SimpleTest simpleTest = (SimpleTest) context.getBean("s1");
		System.out.println(simpleTest);
		Employee employee = context.getBean("e1", Employee.class);
		Company company = context.getBean("c1", Company.class);

	}
}
