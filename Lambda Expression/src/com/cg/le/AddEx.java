package com.cg.le;
interface Addition{
	int add();
}
public class AddEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a = () -> (10+20+30+40/2); {
			System.out.println(a.add());
		}
		

	};

}
