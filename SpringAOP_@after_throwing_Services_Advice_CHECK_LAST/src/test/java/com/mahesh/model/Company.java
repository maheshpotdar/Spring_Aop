package com.mahesh.model;

public class Company {

	private String name;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw new RuntimeException();
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

}
