package com.cg.thiskeyword;

class Demo{
	Demo(){
		System.out.println("user defined no argument demo constructor");
	}
	Demo(int x){
		this();
		System.out.println(x);
	}
	Demo(int x,int y){
		this(3);
		System.out.println(x + " " + y);
		
	}
}

public class Constructor {
	
	public static void main(String[] args) {
		Demo d =  new Demo(5,10);

	}

}
