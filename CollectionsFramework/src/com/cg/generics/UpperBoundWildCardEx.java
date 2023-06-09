package com.cg.generics;

import java.util.ArrayList;

public class UpperBoundWildCardEx {
	
	public static Float sum(ArrayList<? extends Number> al) {
		Float sum = 0.0f;
		for(Number n :al) {
			sum = sum + n.floatValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(40);
		System.out.println(sum(al));
		
		

	}

}
