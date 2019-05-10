package com.mahesh.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomeAnnotationService {

	// custom annotation lihitana first
	// @Before("@annotaion(packagename.classname.annotation)")

	@Before("@annotation(com.mahesh.anno.MyCustomAnnotation)")
	public void myMethod() {
		System.out.println("Before Run ....... ");
	}

}
 