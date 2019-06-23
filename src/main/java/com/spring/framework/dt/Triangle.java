package com.spring.framework.dt;

public class Triangle {
	private String type; 
	private String msg;
	
	public String getType() {
		return type;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println("Drawing Triangle " + getType());
		System.out.println("Printing Message from Spring.XML " + getMsg());
	}
	
	public void print() {
		System.out.println("Printing Triangle");
	}
}