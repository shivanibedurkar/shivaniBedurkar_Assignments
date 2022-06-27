package com.cg.program3;

public class Program3 {

	public static void main(String[] args) {

		SavingAccount cust1 = new SavingAccount(1010, 20000.0);
		System.out.println("Your account created succesfully with your ID " + cust1.getID()
				+ " and your current balance is " + cust1.getBalance());
		
		cust1.Deposite(5000);
		System.out.println("After deposite your balance is: "+cust1.getBalance());
		
		try 
		{
			cust1.withdraw(-50);
		} 
		catch (InsufficientBalanceException e) 
		{
			System.out.println("Insufficient Funds: Unfortunately, You Don't have Sufficient Balance in your account");
		} 
		catch (illeagalBankTransactionException f) 
		{
			System.out.println("Illegal Entry: This is technically an illegal amount. ");
		}

	}

}
