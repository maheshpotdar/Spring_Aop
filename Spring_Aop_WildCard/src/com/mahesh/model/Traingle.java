package com.mahesh.model;

public class Traingle {
	// primitive variable manaje object mala tayar karav lagnar.
	private String name;

	public Traingle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		name = "Potdar";
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Traingle [name=" + name + "]";
	}

}
