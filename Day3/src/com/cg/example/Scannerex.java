package com.cg.example; 
public class Scannerex {
	public static void main(String[] args) {
			// Scanner is a class that has methods, which can take types of inputs from the user during runtime.
			
			// If we want to to use Scanner class, we have to make an object System.in as an input source(keyboard).
		Scannerex sc = new Scannerex(System.in);
			
			// In accordance to the data type we want, we use different methods.
			// the method's name is in camel case and usually in the form of next 'Data type'.
			// for integer input:
		int integerInput= sc.nextInt();
			// for float input:
		float floatInput= sc.nextFloat();
			// and so on... for primitive data types.
			
			// for string input
		String str= sc.next();// will stop taking input once it encounters a space.
			// or
		String strLine= sc.nextLine();// will take the whole line as input including spaces.
			
			//------------------------------------------------
		System.out.println(integerInput);
		System.out.println(floatInput);
		System.out.println(str);
		System.out.println(strLine);

		}

}
