package com.cg.collections;
import java.util.List;
import java.util.ArrayList;


public class ProgramTwo {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(0);
		num.add(11);
		num.add(22);
		num.add(33);
		
		num.remove(1);//index value 1
		num.add(2,5);// at index value 2 , 5 will be inserted
		
		System.out.println("ArrayList : " +num);

	}

}
