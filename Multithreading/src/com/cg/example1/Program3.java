package com.cg.example1;

class Chromee implements Runnable{
	public void run() {
		System.out.println("Chromee is working");
	}
}
class Gmeett implements Runnable{
	public void run() {
		System.out.println("Gmeett is running");
	}	
}
public class Program3 {

	public static void main(String[] args) {
		
		Chromee c1 = new Chromee();
		
		Thread t = new Thread(c1);
		
		t.start();
		
		Gmeett g1 = new Gmeett();
		Thread t1 = new Thread(g1);
		
		t1.start();
		
	}

}
