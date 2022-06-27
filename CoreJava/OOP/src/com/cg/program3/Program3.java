package com.cg.program3;

public class Program3 {

	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount(101,"Pallavi",50000);
		SavingAccount s2 = new SavingAccount(102,"Priti",70000);
		CurrentAccount c1 = new CurrentAccount(201, "Mona", 50000);
		CurrentAccount c2 = new CurrentAccount(202, "Neha", 100000);
		
		System.out.println("Account Holder:" +s1.getAccountHolder()+"----"+"Balance:"+ s1.getBalance());
		System.out.println("Account Holder:" +s2.getAccountHolder()+"----"+"Balance:"+ s2.getBalance());
		System.out.println("Account Holder:" +c1.getAccountHolder()+"----"+"Balance:"+ c1.getBalance());
		System.out.println("Account Holder:" +c2.getAccountHolder()+"----"+"Balance:"+ c2.getBalance());
		


	}

}
