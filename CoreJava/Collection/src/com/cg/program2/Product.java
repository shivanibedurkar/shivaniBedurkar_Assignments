package com.cg.program2;

public class Product {
	
	private String productName;
	  public Product(String productName){
	      this.productName=productName;
	  }
	  @Override
	  public String toString(){
	      return "Product name: "+productName;
	  }
}
