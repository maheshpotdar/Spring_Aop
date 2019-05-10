package com.mahesh.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//navin class yacha oject spring.xml madhe tayar kara tevha spring io container la kalato ki ha pan class ahe. 
//first task create class as @aspect 
@Aspect
public class AfterService {

	@After("execution(public String getName())")
	public void first() {
		// first method execute ho after execution of public void getName()
		System.out.println("After First Run");
	}

}

/*
 * After First Run After First Run SimpleTest [company=TCS, employee=Mahesh
 * Dilip Potdar]
 *
 */