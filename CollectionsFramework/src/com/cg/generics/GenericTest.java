package com.cg.generics;

class GenericClassTest<T> {
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
}
public class GenericTest{

	public static void main(String[] args) {
		
		GenericClassTest<String> tt = new GenericClassTest<>();
		tt.add("Hello");
		System.out.println(tt.get());
		
		GenericClassTest<Integer> tt1 = new GenericClassTest<>();
		tt1.add(10);
		System.out.println(tt1.get());

	}

}
