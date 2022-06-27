package com.cg.program3;

public class SavingAccount {
	int id;
	double balance;

	public SavingAccount() {

	}

	public SavingAccount(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public void Deposite(double deposite) {
		balance = balance + deposite;
	}

	public long getID() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(int Withdrawl_amount) throws InsufficientBalanceException, illeagalBankTransactionException {
		if (Withdrawl_amount > balance || balance == 0) {
			throw new InsufficientBalanceException("Exception");
		} else if (Withdrawl_amount < 0) {
			throw new illeagalBankTransactionException("Exception");
		}
		balance = balance - Withdrawl_amount;
		System.out.println("You've received " + (int) (Withdrawl_amount) + " in cash:");

	}
}
