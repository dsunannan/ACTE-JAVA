package com.acte.generics;

import java.util.*;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

class GenericTest {
	//creating a method that accepts only child class of Shape  
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String args[]) {
		
		List<Rectangle> list1 = new ArrayList<Rectangle>(); // Generics way of declaration
		list1.add(new Rectangle());
		list1.get(0);

		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		/*
		 * List list3 = new ArrayList(); list3.add(new Circle()); list3.add(new
		 * Rectangle()); Shape sh =(new Rectangle())list3.get(0);
		 */
		
		
		drawShapes(list1);
		drawShapes(list2);
	}
}
