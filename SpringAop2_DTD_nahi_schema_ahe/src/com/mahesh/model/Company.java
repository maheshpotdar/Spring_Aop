package com.mahesh.model;

public class Company {

	private String compname;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getCompname() {
		return compname;
	}

	@Override
	public String toString() {
		return "Company [compname=" + compname + "]";
	}

}
