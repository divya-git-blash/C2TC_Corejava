package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.SavingAcc;
import com.cg.framework.CurrentAcc;

public class MMBankFactory extends BankFactory{
	
	
	public MMSavingAcc getNewSavingAcc(int AccNo,String accNm,float accBal,boolean isSalaried) {
		MMSavingAcc mmsav = new MMSavingAcc(AccNo,accNm,accBal,isSalaried);
		
		return mmsav;
	}
	public MMCurrentAcc getNewCurrentAcc(int AccNo,String accNm,float accBal,float creditLimit) {
		MMCurrentAcc mmcur = new MMCurrentAcc(AccNo,accNm,accBal,creditLimit);
		
		return mmcur;
	}
	
}
