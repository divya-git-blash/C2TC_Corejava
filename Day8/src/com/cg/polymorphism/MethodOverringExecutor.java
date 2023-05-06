package com.cg.polymorphism;

public class MethodOverringExecutor {

	public static void main(String[] args) {
		//should call the child class
		MethodOveriding m1 = new MethodOveriding();
		System.out.println(m1.getInterestRate());

	}

}
