package com.cg.interfacekeyword;
interface Dad{
	void snoring();
}
interface Mom{
	void snoring();
}
class You implements Dad,Mom{

	@Override
	public void snoring() {
		System.out.println("My Dad and Mom have the habbit");
	}
}
public class MDemo {
	public static void main(String[] args) {
		You y = new You();
		y.snoring();
	}
}
