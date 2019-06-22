package com.spring.framework.dt;

public class Shape {
	
	private Circle circle;

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Circle getCircle() {
		return circle;
	}

	public Shape() {
		System.out.println("Inside Shape");
	}

	public Shape(Circle circle) {
		System.out.println("Shape constructor with an arguement for Annotation based Dependency Injection");
		this.circle = circle;
	}

	public void printCircle() {
		circle.print();
	}
}