
package com.cg.generics;

public class GenericMethodEx {
	public <E> void displayElements(E[] elements) {
		for(E a:elements)
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		GenericMethodEx ex = new GenericMethodEx();
		Integer[] i = {10,20,30,40,50};
		ex.displayElements(i);
		
		
		
		/*String name= "Divya";
		ex.displayElements(name);
		ex.displayElements("abc");*/
	}

}
