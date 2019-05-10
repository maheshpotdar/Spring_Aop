package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mahesh.*;
import com.mahesh.model.AllClass;
import com.mahesh.model.Company;
import com.mahesh.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/spring.xml");
		AllClass allClass = (AllClass) context.getBean("allclass");

		System.out.println(allClass.getCompany().getName());
	}
}
