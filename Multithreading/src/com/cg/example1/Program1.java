package com.cg.example1;
class PPT extends Thread{
	public void run() {
		System.out.println("PPT is working");
	}
}
class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse is working");
	}
	
}
public class Program1 {

	public static void main(String[] args) {
		PPT p= new PPT();
		p.start();
		
		Eclipse e = new Eclipse();
		e.start();

	}

}
