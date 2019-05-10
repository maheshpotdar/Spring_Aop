package com.mahesh.model;

public class Circle {
	// primitive variable manaje object mala tayar karav lagnar.
	private String name;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		name="Mahesh";
		return name;
	}

	public void setName(String name) {
		name = "Circle Getname ahe.....";
		this.name = name;
	}

	@Override
	public String toString() {
		return "Circle [name=" + name + "]";
	}

	public void getInfo() {
		System.out.println("Circle madhil getInfo ahe......");
	}
}
