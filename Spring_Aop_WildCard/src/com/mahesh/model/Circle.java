package com.mahesh.model;

public class Circle {
	// primitive variable manaje object mala tayar karav lagnar.
	private String name;
	private String fname;
	private String mname;
	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		name = "Mahesh";
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
