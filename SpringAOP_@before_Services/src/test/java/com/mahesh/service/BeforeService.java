package com.mahesh.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//navin class yacha oject spring.xml madhe tayar kara tevha spring io container la kalato ki ha pan class ahe. 
//first task create class as @aspect 
@Aspect
public class BeforeService {

	@Before("execution(public String getName())")
	public void first() {
		// first method execute ho before execution of public void getName()
		System.out.println("Before First Run... then next methods runs...");
	}

	/*
	 * Before First Run... then next methods runs... Before First Run... then next
	 * methods runs... SimpleTest [company=TCS, employee=Mahesh Dilip Potdar]
	 * 
	 * 2 vela before first run karan 1st ahe te spring ioc container setter inject
	 * ahe .ani second mi pathavleli service.
	 * 
	 */

}
