package com.cg.abstractionkeyword;
abstract class Animall{
	abstract void eat();	
}
class Dog extends Animall{

	@Override
	void eat() {
		System.out.println("Eating");	
	}
}
class Puppy extends Dog{
	
}
public class Animal {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();
		Dog d = new Dog();
		d.eat();
		

	}

}
