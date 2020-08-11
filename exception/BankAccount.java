package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class BankAccount {
private int acNo;
private String acName;
private int balance;

public BankAccount() {

}

public BankAccount(int acNo, String acName, int balance) throws InvalidBalanceException
{
	super();
	this.acNo = acNo;
	this.acName = acName;
	if(balance <5000)
	{
		throw new InvalidBalanceException("Please enter valid balance >5000");
	}
	else
	{
	  this.balance = balance;
	}
}

public int getAcNo() {
	return acNo;
}

public void setAcNo(int acNo) {
	this.acNo = acNo;
}

public String getAcName() {
	return acName;
}

public void setAcName(String acName) {
	this.acName = acName;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

@Override
public String toString() {
	return "BankAccount [acNo=" + acNo + ", acName=" + acName + ", balance=" + balance + "]";
}



void withdraw(int amt) 
{
  if(this.balance-amt <1000)
  {
      throw new LowBalancException("low balance ... withdraw failed") ;
  }
  else
  {
	  this.balance=this.balance-amt;
	  System.out.println("withdraw succefull new balance is "+this.balance);
  }

}


}
