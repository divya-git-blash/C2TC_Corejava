package com.cg.mutlilevel;


class Animal {
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class Puppy extends Dog{
	void weep() {
		System.out.println("weeping");
	}
}
public class Mutlilevel{	
	public static void main(String[] args) {
		Puppy p= new Puppy();
		p.weep();
		p.bark();
		p.eat();
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		Dog d1 = new Dog();
		d1.bark();
		d1.eat();
		

	}

}
