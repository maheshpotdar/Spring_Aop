package com.mahesh.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MessagingService {

	// getName() traingle ani circle ani jethe jethe get tithe appy houde.
	// wildcard use kara.
	// getfname,getmname,getlname sagalya get varati apply houde.
	// use wildcard.

	// ata get name
	// new get fname
	// new get mname
	// new get lname saglya warati apply honar.

	// @Before("execution(public * get*(..))")
	// mala return type mahit nahi. public *
	// get pudhe kay ahe mahit nahi.
	// getName or getSchoolName() or getCountryName() i dont know.
	
	@Before("execution(public * **(..))")
	public void msg1() {

		System.out.println("First Service run.");
	}

	/*
	 * @After("execution(com.mahesh.model.Circle.getInfo())") public void msg2() {
	 * System.out.println("Last Service run."); }
	 */

}
