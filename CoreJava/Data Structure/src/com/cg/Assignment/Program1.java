package com.cg.Assignment;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		int num, org, rem, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");

		num = sc.nextInt();
		System.out.println("You Entered: " + num);

		org = num;

		while (org != 0) { 	//1
			rem = org % 10; //0
			result += Math.pow(rem, 3);	//27+125
			org /= 10;		//1

		}
		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");

	}

}
