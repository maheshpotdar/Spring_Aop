package com.mahesh.model;

import com.mahesh.MyCustomAnnotation;

public class Company {

	private String name;

	public Company() {
		// TODO Auto-generated constructor stub
	}
	@MyCustomAnnotation
	public String getName() {
		System.out.println("Company class getter method.");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

}
