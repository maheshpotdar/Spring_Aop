package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SimpleTest {
	private Company company;

	private Employee employee;

	public SimpleTest() {
		// TODO Auto-generated constructor stub
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "SimpleTest [company=" + company.getName() + ", employee=" + employee.getName() + "]";
	}

}
