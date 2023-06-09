//Abstract keyword is used to create a abstract class and method
//It provides a base for subclasses to extend and implement the abstract methods and override the implemented methods in abstract class.


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
	@Override
	void eat() {
		System.out.println("Eating cookies");	
	}
}
public class Animal {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		Puppy p = new Puppy();
		p.eat();
		

	}

}
