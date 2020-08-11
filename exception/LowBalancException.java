package com.exception;

public class LowBalancException extends RuntimeException {

	
	public LowBalancException(String msg) {
	super(msg);
	}
	
	@Override
	public String getMessage() {
	  return "sorry balance is very low ..withdraw failed";
	}
}
