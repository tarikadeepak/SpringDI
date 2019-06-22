package com.spring.framework.dt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ShapeAnnotationConfig {
	@Bean
	@Lazy
	public Triangle triangle() {
		return new Triangle();
	}
	
	@Bean
	@Lazy
	public Circle circle() {
		return new Circle();
	}
	
	@Bean
	@Lazy
	public Shape shape() {
		return new Shape(circle());
	}

}
