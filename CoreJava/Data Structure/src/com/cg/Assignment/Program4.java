package com.cg.Assignment;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of sub1: ");
		int sub1 = sc.nextInt();

		System.out.println("Enter marks of sub2: ");
		int sub2 = sc.nextInt();

		System.out.println("Enter marks sub3: ");
		int sub3 = sc.nextInt();

		if (sub1 > 60 && sub2 > 60 && sub3 > 60) 
		{
			System.out.println("You are Passed!");
		}

		else if ((sub1 > 60 && sub2 > 60 && sub3 < 60) || (sub1 > 60 && sub3 > 60 && sub2 < 60)
				|| (sub2 > 60 && sub3 > 60 && sub1 < 60)) 
		{

			System.out.println("You are promoted");
		}

		else 
		{
			System.out.println("Sorry! you are failed");

		}

	}

}
