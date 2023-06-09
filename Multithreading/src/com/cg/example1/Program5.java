//Priority - Constant

package com.cg.example1;

class Scanner implements Runnable{
	public void run() {
		System.out.println("Scanner is working");
	}
}
class  Whatsappweb implements Runnable{
	public void run() {
		System.out.println("Whatsappweb is running");
	}	
}
public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner();
		
		Thread t = new Thread(sc1);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
		Whatsappweb w1 = new Whatsappweb();
		Thread t1 = new Thread(w1);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
	}
}
	