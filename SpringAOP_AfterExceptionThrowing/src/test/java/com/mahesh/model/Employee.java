package com.mahesh.model;

public class Employee {

	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		System.out.println("Employee class getter method.");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}
