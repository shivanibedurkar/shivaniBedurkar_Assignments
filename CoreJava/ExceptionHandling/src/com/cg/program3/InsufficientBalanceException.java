package com.cg.program3;

public class InsufficientBalanceException extends Exception{

	private static final long serialVersionUID = 1L;
	InsufficientBalanceException(String exception){
		super(exception);
	}

}
