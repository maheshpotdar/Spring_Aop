package com.mahesh.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MessagingService {

	// public String tyanantar package name.method name.
	// Circle chya aadhi call houde.
	// jar mi main madhe trinagle call kela tar he
	// System.out.println("First Service run."); method run honar
	// nahiiiiiiiiiiiiiiiiii.
	// Restiction fakt carName sathi ahe.
	@Before("execution(public String com.mahesh.model.Circle.getName())")
	public void msg1() {

		System.out.println("First Service run.");
	}

	/*
	 * @After("execution(com.mahesh.model.Circle.getInfo())") public void msg2() {
	 * System.out.println("Last Service run."); }
	 */

}
