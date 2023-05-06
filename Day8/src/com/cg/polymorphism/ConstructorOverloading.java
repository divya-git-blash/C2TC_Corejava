//constructor overloading

package com.cg.polymorphism;
public class ConstructorOverloading {
	//private data type
	private int x;
	private int y;
	
	//constructor overloading
	public ConstructorOverloading() {
		System.out.println("Default constructor");
	}
	public ConstructorOverloading(int x) {
		System.out.println("Parameterized constructor" +x);
	}
	public ConstructorOverloading(int x,int y) {
		System.out.println("Parameterized constructor" +x+ " " +y);
	}

}
