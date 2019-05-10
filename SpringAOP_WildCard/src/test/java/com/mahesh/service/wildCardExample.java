package com.mahesh.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class wildCardExample {
	// void methodname(parameter)
	// void methodname-saglya class madhal.
	// jar fakt employee madhalya class chi method pahije ahe tar.
	// void packagename.classname.methodname(parameter mihiti nahi kiti ahet so 2
	// dot ..)

	// void => return type mala mahiti nahi void ki int ki float kay boolean so *
	// class name mahiti nahi.

	// wildcard kadhihi pointcut madhe vaparayacha asto.

	// PROBLEM:-
	// @Before("execution(public String com.mahesh.model.Company.getName())")
	// getName() matala ki fakt getName() cha honar getInfo() getWorld() nahi honar.
	// tyasathi wildcard use kara.

	@Before("myPointcut()")
	public void LoggingAdvice() {
		System.out.println("Before LoggingAdvice  this method run successfully.");
	}

	// wildcard pointcut chya aatacha wapar.
	@Pointcut("execution(* com.*.model.*.get*(..))")
	public void myPointcut() {

	}

}
