package com.cg.le;
interface Drawing{
	void draw(int length,int width);
}

public class TwoVaribale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawing d = (int length,int width) -> {
			length=length+2;
			width=width+4;
			System.out.println(length+width);
		};
		d.draw(10,12);
	}

}
