package com.cg.abstractionkeyword;

abstract class Shapee{
	 abstract void draw();
}

class Rectangle extends Shapee{
	@Override
	void draw() {	 
		System.out.println("Rectangle");
	}
	
}
class Circle extends Shapee {
	    @Override
        void draw() {
		System.out.println("Circle");
	}
}

public class Shape {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.draw();
		r.draw();
		
	}
}
