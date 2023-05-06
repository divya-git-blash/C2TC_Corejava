package com.cg.abstractionkeyword;

abstract class Shape{
	void draw() {
		System.out.println("Drawing");
	}
	
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle");
	}
	
}
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Circle");
	}
}

public class Cilent {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.draw();
		r.draw();
		
	}

}
