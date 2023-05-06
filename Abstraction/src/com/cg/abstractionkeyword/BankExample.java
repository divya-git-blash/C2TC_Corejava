package com.cg.abstractionkeyword;
abstract class Bike{
	Bike() {
		System.out.println("Bike is running");
	}
	abstract void run();
	void changeGear(){
		System.out.println("Gear Changed");
		
	}
}
class H15 extends Bike{

	@Override
	void run() {
		System.out.println("Breaking");		
	}
	
}
public class BankExample {

	public static void main(String[] args) {
		H15 obj = new H15();

		obj.run();
		

	}

}
