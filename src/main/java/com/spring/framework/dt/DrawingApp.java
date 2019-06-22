package com.spring.framework.dt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext contextC = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangleC = (Triangle) contextC.getBean("triangle");
		triangleC.setType("Equilateral");
		triangleC.draw();
		
		ApplicationContext contextF = new FileSystemXmlApplicationContext("/src/main/java/Spring.xml");
		Triangle triangleF = (Triangle) contextF.getBean("triangle");
		triangleF.setType("SomeType");
		triangleF.draw();

		Shape shapeC = (Shape) contextC.getBean("shape");
		shapeC.printCircle();

		ApplicationContext contextA = new AnnotationConfigApplicationContext(ShapeAnnotationConfig.class);
		Triangle triangleAnnotation = (Triangle) contextA.getBean("triangle");
		triangleAnnotation.print();
		
		Shape shapeA = (Shape) contextA.getBean("shape");
		shapeA.printCircle();
	}

}
