package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;

public class AllClass {
	@Autowired
	private Employee employee;
	@Autowired
	private Company company;

	public AllClass() {
		// TODO Auto-generated constructor stub
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "AllClass [employee=" + employee + ", company=" + company + "]";
	}

}
