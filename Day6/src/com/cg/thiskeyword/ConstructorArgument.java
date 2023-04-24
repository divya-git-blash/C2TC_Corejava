package com.cg.thiskeyword;

class check{
	check(Practise p){
		System.out.println("CheckArgument");
	}
	void display() {
		System.out.println("ConstructorArgument");
		
	}
}
class Practise{
	Practise(){
		check c = new check(this);
		c.display();
		
	}
}

public class ConstructorArgument {

	public static void main(String[] args) {
		Practise p = new Practise();
		System.out.println("Practise");
		
	}

}
