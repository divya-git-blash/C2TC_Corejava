//using clear method
package com.cg.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Programseven {
	public static void main(String [] args)
	{
	List<String> val = new ArrayList<>();
	val.add("java");
	val.add("is");
	val.add("interesting");
	
	System.out.println("before clear :" +val);
	val.clear();
	
	System.out.println("after clear :" +val);

	}


}

