//contains method - boolean output

package com.cg.collections;
import java.util.List;
import java.util.ArrayList;

public class Programeight {

	public static void main(String [] args)
	{
	List<String> var = new ArrayList<String>();
	var.add("pen");
	var.add("pencil");
	var.add("eraser");
    System.out.println("List " +var);

	boolean res= var.contains("pencil");

	System.out.println("Is pencil present in the list: " + res);

	}

}
