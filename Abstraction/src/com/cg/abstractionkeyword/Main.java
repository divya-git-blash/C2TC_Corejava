package com.cg.abstractionkeyword;
//abstract class
abstract class Bike{
	abstract void run();
	
}//Concrete class
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("Hond Bike");
	}
	void show() {
		System.out.println("Void show");
	}
}

public class Main {
	public static void main(String[] args){
		Honda h= new Honda();
		h.run();
		h.show();
		
	}

}
