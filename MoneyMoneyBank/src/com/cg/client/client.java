package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMSavingAcc;
import com.cg.application.MMCurrentAcc;
import com.cg.framework.BankAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.SavingAcc;
import com.cg.framework.CurrentAcc;


public class client {

	public static void main(String[] args) {
		
		BankFactory bf = new MMBankFactory();
		SavingAcc sa new MMSavingAcc(12,"Divya",120,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca = new CurrentAcc(13,"siri",700,1000);
		ca.withdraw(ca.getAccBal());
		ca.toString();
		
		

	}

}
