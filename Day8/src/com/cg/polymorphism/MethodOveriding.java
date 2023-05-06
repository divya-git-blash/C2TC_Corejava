//Method Overriding
//Having same method name and same no. of parameters
package com.cg.polymorphism;
//to achieve method overriding,Inheritance is required

public class MethodOveriding {
	public float getInterestRate()
	{
		return 7.5f;
	}

}
class SBI extends MethodOveriding
{
//below annotation ensures that the method should be override the parent 
	@Override
	public float getInterestRate() {
		System.out.println("Parent class method:"+super.getInterestRate());
		return 12.5f;
	}
	
}
