package com.cg.bankapplication;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public  class MMBankFactory extends BankFactory {
	
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc sa= new MMSavingAcc(accNo,accNm,accBal,isSalary);
	
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		return null;
	}
	}
