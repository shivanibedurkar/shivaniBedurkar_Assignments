package com.cg.Assignment;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		System.out.println("Enter number");
		int num = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Number is at index: " + i);
				break;
			} 
			else {

			}

		}
	}
}
