package com.cg.singledemo;

class Animal {
		void eat() {
			System.out.println("Eating");
		}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
public class Example{
	public static void main(String[] args) {
		Dog d1 = new Dog();
	    d1.eat();
	    d1.bark();
	}
}




