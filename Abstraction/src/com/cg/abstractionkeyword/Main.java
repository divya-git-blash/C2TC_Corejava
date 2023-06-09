package com.cg.abstractionkeyword;
//abstract class
abstract class Bikee{
	abstract void run();
	
}//Concrete class
class Star extends Bikee{
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
		Star h= new Star();
		h.run();
		h.show();
		
	}

}
