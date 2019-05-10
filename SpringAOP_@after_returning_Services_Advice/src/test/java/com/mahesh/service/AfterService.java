package com.mahesh.service;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

//navin class yacha oject spring.xml madhe tayar kara tevha spring io container la kalato ki ha pan class ahe. 
//first task create class as @aspect 
@Aspect
public class AfterService {

	@AfterReturning("execution(public String getName())")
	public void first() {
		// first method run houde afterreturning getName() method.
		System.out.println("After return First Run");
	}

}

/*
 * Output
 * 
 * class return method. After return First Run After return First Run SimpleTest
 * [company=TCS, employee=Mahesh Dilip Potdar]
 *
 */