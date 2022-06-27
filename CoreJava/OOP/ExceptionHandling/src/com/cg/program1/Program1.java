package com.cg.program1;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.printf("Enter the values of numerator and denominator: ");
		 
		 int numerator=sc.nextInt();
         int denominator=sc.nextInt();
	        try{
	            double result=divide(numerator,denominator);
	            System.out.println("The Result is "+result);   
	        }
	        catch (ArithmeticException e){
	            System.out.printf("Can't divide by zero");
	            e.printStackTrace();
	        }
	    }
	    public static double divide(int numerator , int denominator){
	        return numerator/denominator;

	}

}
