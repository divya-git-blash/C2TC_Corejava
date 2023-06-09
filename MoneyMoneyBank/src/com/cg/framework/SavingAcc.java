package com.cg.framework;

public abstract class SavingAcc extends BankAcc{
	
	private boolean isSalaried;
	private static final float MINBAL=500;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
  
	public void withdraw(float accBal) {
		System.out.println("Amount in the saving account"+accBal);
	}
	

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
