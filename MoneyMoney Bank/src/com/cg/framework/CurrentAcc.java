package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit=10000;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal);
	}
	public void withdraw(float  creditLimit)
	{
		System.out.println("Credit Limit:" + creditLimit);
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public float getCreditLimit() {
		return creditLimit;
	}	
}