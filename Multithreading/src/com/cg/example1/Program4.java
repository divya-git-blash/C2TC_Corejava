package com.cg.example1;

class Gchrome implements Runnable{
	public void run() {
		System.out.println("Gchrome is working");
	}
}
class Zoom implements Runnable{
	public void run() {
		System.out.println("Zoom is running");
	}	
}
public class Program4 {

	public static void main(String[] args) {
		
		Gchrome c1 = new Gchrome();
		
		Thread t = new Thread(c1);
		t.setPriority(1);
		t.start();
		
		Zoom g1 = new Zoom();
		Thread t1 = new Thread(g1);
		t1.setPriority(5);
		t1.start();
	}
}
		
