package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class Employee {

	@Autowired
	private Company company;

//	@Autowired
//	@Qualifier(value = "c1")
//	private Car car;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

//	public void setCar(Car car) {
//		this.car = car;
//	}

	public void setCompany(Company company) {
		this.company = company;
	}

//	public Car getCar() {
//		return car;
//	}

	public Company getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", car=" +  "]";
	}

}
