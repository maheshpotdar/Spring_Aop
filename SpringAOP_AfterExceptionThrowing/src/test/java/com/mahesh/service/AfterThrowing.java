package com.mahesh.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AfterThrowing {

//	@Pointcut("execution(public String com.mahesh.model.Company.getName())")
//	public void Test1() {
//		// empty
//	}
	@org.aspectj.lang.annotation.AfterReturning("execution(public String getName())")
	public void Test2() {
		System.out.println("After return Zalyavar hi method run zali.........");
	}

}
