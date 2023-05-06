package com.cg.interfacekeyword;
interface Inf1{
	void display();
	static void show() {
	
	}
}
public class Demo implements Inf1 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.display();
		Inf1.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
//class to class = extends
//class to implements = implements
//Interface to interface = extends
//Interface to class = not possible = error
