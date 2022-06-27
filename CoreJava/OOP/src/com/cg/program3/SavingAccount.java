package com.cg.program3;

public class SavingAccount extends Account{
public static final double fixedDeposit=10000;
	
	public SavingAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}

	public double getBalance()
	{
		return balance+fixedDeposit;
	}

}
