package com.cg.example;

public class Constructor{
	public String defaultObjectSetOne;
	public int defaultObjectSetTwo;
	
	public  Constructor() {
		// Constructors are a special type of method that are used to initialize objects as oppose to normal methods that also returns.
		
		// They are of two types:
		// default and user defined
		
		// default type constructors are made automatically if a constructor is not defined,
		// it does not have any parameters in it and is used as a tool to set defaults for objects.
		
		// This ConstructorDemo class is an example:
		// Here, public ConstructorsDemo() {} is not required to mention,
		// I defined it for demonstration purpose.
		defaultObjectSetOne="";
		defaultObjectSetTwo=0;
		
		System.out.println("defaultObjectSetOne \""+ defaultObjectSetOne+"\"");
		System.out.println("defaultObjectSetTwo \""+ defaultObjectSetTwo+"\"");
		

	}

	public String getDefaultObjectSetOne() {
		return defaultObjectSetOne;
	}

	public void setDefaultObjectSetOne(String defaultObjectSetOne) {
		this.defaultObjectSetOne = defaultObjectSetOne;
	}

	public int getDefaultObjectSetTwo() {
		return defaultObjectSetTwo;
	}

	public void setDefaultObjectSetTwo(int defaultObjectSetTwo) {
		this.defaultObjectSetTwo = defaultObjectSetTwo;
	}
}

	

