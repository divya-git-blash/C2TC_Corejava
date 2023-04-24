package com.cg.singleinheritance;

public class Citizen {
	private String name;
	private String aadharno;
	private String address;
	private int phoneno;
	public Citizen() {
		super();
	}
	public Citizen(String name, String aadharno, String address, int phoneno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phoneno=" + phoneno
				+ ", getName()=" + getName() + ", getAadharno()=" + getAadharno() + ", getAddress()=" + getAddress()
				+ ", getPhoneno()=" + getPhoneno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}	