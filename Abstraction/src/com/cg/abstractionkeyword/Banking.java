package com.cg.abstractionkeyword;
abstract class Bank{
	abstract int rateofinterest();
}
class SBI extends Bank{

	@Override
	int rateofinterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}
class HDFC extends Bank{
	@Override
	int rateofinterest() {
		return 8;
		
	}
}
public class Banking {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		System.out.println(h.rateofinterest());
	}
	
}
