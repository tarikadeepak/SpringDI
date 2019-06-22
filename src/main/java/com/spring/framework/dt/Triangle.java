package com.spring.framework.dt;

public class Triangle {
	private String type; 
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println("Drawing Triangle " + getType());
	}
	
	public void print() {
		System.out.println("Printing Triangle");
	}
}