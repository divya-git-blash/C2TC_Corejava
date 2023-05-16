package collections;

import java.util.SortedSet;
public class LinkedHashSet {

	public static void main(String[] args) {
		SortedSet<String> lhset = new TreeSet<>();
		lhset.add("Java");
		lhset.add("c++");
		lhset.add("C");
		lhset.add("python");
		lhset.add("MYSQL");
		System.out.println(lhset);
		
	}
}
