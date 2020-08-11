package com.exception;

public class InvalidBalanceException extends Exception{

	public InvalidBalanceException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
	return "customesed msg";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
