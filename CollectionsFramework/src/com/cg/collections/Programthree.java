package com.cg.collections;
import java.util.List;
import java.util.ArrayList;

public class Programthree {

	public static void main(String[] args) {
		List <String> val1 = new ArrayList<>();
		val1.add("Final year");
		
		List <String> val2 = new ArrayList<>();
		val2.add("ISE");
		val1.addAll(val2);
		System.out.println(val1);
	}

}
