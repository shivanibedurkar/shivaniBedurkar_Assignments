package com.cg.program2;

import java.util.HashSet;

public class Program2 {
	
	 public static void main(String[] args) {
	      Product x1=new Product("soap");
	      Product x2=new Product("Brush");
	      Product x3=new Product("Bucket");
	      Product x4=new Product("Plate");
	      
	      HashSet<Product> no_duplicate=new HashSet<Product>();
	      no_duplicate.add(x1);
	      no_duplicate.add(x2);
	      no_duplicate.add(x3);
	      no_duplicate.add(x4);
	      
	      //the duplicate object addition
	      no_duplicate.add(x2);
	      System.out.println(no_duplicate);
	  }
}
