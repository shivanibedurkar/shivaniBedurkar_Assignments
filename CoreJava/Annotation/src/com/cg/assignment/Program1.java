package com.cg.assignment;

import java.lang.annotation.*;

//Meta Annotation 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//Single value 
@interface test{
	  int testCaseNo();
	}

	public class Program1 {
	@test(testCaseNo = 1)
	public static void main(String[] args) {
	}
}
