package com.mahesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.mahesh.model.Circle;
import com.mahesh.model.Traingle;
@Component
public class ShapeService {

	@Autowired
	private Circle circle;

	@Autowired
	private Traingle traingle;

	public Circle getCircle() {
		return circle;
	}

	public Traingle getTraingle() {
		return traingle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setTraingle(Traingle traingle) {
		this.traingle = traingle;
	}

	@Override
	public String toString() {
		return "ShapeService [circle=" + circle + ", traingle=" + traingle + "]";
	}

}
