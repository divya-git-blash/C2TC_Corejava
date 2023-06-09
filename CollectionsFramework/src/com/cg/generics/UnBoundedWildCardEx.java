package com.cg.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardEx {
	public static void display(List<?> ll) {
	}

	public static void main(String[] args) {
		List ll = Arrays.asList(1,2,3);
		display(ll);
		List l2 = Arrays.asList("Hello","Welcome");
		display(l2);
	}
}
