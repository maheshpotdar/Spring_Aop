package com.mahesh.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	// hi ata service tayar zali.
	// LoggingAdvice() hi method run houde @before execution of this method.
	@Before("execution(public void display())")
	public void LoggingAdvice() {
		System.out.println("This is service provider");
	}

}
