package com.cg.example1;
class Chrome implements Runnable{
	public void run() {
		System.out.println("Chrome is working");
	}
}
class Gmeet implements Runnable{
	public void run() {
		System.out.println("Gmeet is running");
	}	
}
public class Program2 {

	public static void main(String[] args) {
		
		Chrome c = new Chrome();
		Thread t = new Thread(c);
		t.start();
	}

}
