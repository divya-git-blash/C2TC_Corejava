package com.cg.statickeyword;

public class Student {
	//Instance Variables
	private int id=1;;
	private String name;
	private static String collegename="PES";
	//Constructor with argumented parameters
	public Student(int id,String name){
		super();
		this.id=id;
		this.name=name;
	}
	//Static method can only access only static data
	//If you try to access non static data it cannot make a static reference
	public void change() {
		id=2;
		collegename="CCC";
	}
	
//Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCollegename() {
		return collegename;
	}


	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
//To string

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collegename=" + collegename + "]";
	}


	public static void main(String[] args) {
		

	}

}
