package collections;

import java.util.ArrayList;

public class List{
	public static void main(String[] args) {
	ArrayList list1 = new ArrayList();
	System.out.println(list1.size());
	System.out.println(list1.isEmpty());
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
	System.out.println(list1);
	
	list1.add(true);
	list1.add(false);
	System.out.println(list1);
	
	list1.remove(true);
	System.out.println(list1);
	list1.add(3,50);
	System.out.println(list1);
	
	System.out.println(list1.get(5));
}

}