//Basic Program

package com.cg.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Programone {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(0);
		num.add(11);
		num.add(34);
		num.add(2,5);
		//Collections.sort(num,Collections.reverseOrder());
	
		System.out.println(num);
	}

}
