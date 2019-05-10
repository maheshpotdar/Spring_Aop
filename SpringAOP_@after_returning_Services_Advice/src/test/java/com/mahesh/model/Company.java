package com.mahesh.model;

public class Company {

	private String name;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		System.out.println("class return method.");
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
