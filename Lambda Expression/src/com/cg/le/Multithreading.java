package com.cg.le;

interface Book{
	void run();
}

public class Multithreading {

	public static void main(String[] args) {
		
		new Thread(() -> { System.out.println("I am running");}).start();
	}

}
