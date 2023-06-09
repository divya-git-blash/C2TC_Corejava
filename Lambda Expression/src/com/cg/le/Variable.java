package com.cg.le;
interface Drawable{

	void draw(int radius);
}
public class Variable {

	public static void main(String[] args) {
		Drawable d = (int radius) -> {
			System.out.println("Draw radius of a circle : "+radius);
			
		};
		d.draw(5);

	}

}

