package com.cg.maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapDemo {
	
	public static void main(String[] args) {
	
	HashMap<String,Integer> books = new HashMap<String,Integer>();
	books.put("C Programming", 350);
	books.put("The Complete Java", 500);
	books.put("The Reference of C++", 300);
	books.put("DevOps", 600);
	System.out.println("Book and its prizes are:"+books);
	
	Set set = books.entrySet();
	Iterator i =set.iterator();
	while(i.hasNext()) {
		Map.Entry me= (Map.Entry)i.next();
		System.out.println(me);
	}
	
	}
}
