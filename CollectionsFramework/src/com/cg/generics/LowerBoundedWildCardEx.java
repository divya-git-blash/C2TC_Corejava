package com.cg.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardEx {
	
	public static void display(List<? super Integer> ll) {
		for(Object n:ll) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		List ll = Arrays.asList(1.0,2.0,3.0,4.0);
		display(ll);
		
		
	}

}
