//example for method overloading
//method overloading is nothing but two or more methods 
//having same method with different parameters
package com.cg.polymorphism;
public class Polymorphism {
	
	//by passing different data types of arguments
	public int substraction(int a,int b)
	{
		return a-b;
	}
	public float subtraction(int a,float b)
	{
		return a-b;
	}
	//by passing different no. of parameters
	public String print(String str)
	{
		return str;
	}
	public String print(String str,String strl)
	{
		return str+strl;
	}


}
