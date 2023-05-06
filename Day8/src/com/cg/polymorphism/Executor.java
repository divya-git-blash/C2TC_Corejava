package com.cg.polymorphism;

public class Executor {

	public static void main(String[] args) {
		Polymorphism p= new Polymorphism();
		
		//Method overloading
		System.out.println(p.subtraction(10, 5));
		System.out.println(p.subtraction(10, 5.0f));
		System.out.println(p.print("Divya"));
		System.out.println(p.print("Divya","ISE"));
		
		//ConstructorOverloading
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(10);
		ConstructorOverloading c3 = new ConstructorOverloading(12,13);
		



	}

}
