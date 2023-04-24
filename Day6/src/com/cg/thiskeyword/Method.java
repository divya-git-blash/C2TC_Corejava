package com.cg.thiskeyword;
class Test{
	void show(Test t) {
		System.out.println("hello world");
		
	}
}

public class Method {

	public static void main(String[] args) {
		Test t1 =  new Test();
		Test t2 =  new Test();
		t2.show(t1);
		
	}

}
