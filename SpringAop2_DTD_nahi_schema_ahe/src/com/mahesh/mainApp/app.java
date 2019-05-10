package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;

public class app {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Employee e1 = (Employee)context.getBean(Employee.class);
		System.out.println("Company "+e1.getCompany().getCompname());
	}

}
