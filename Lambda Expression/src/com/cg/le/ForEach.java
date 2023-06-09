package com.cg.le;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		
		obj.forEach( i -> System.out.println(i));
		

	}

}
