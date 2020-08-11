package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) 
	{
		BankAccount ac1=null,ac2=null;
		 
		 
			try {
				ac1 = new BankAccount(101, "PNG Ltd.",50000);
				System.out.println("ac1 creation succesfull"+ac1);
				ac2=new BankAccount(102, "ABC Ltd.",5000);
				System.out.println("ac2 creation succesfull"+ac2);
			
			} catch (InvalidBalanceException e) {
				System.out.println(e);
				}
			
			try
			{
			  ac1.withdraw(10000);
			  ac2.withdraw(1000);
			}
			catch(LowBalancException e)
			{
				System.out.println();
			}
			
		 System.out.println("all transactions succesfull");
		
		
	
	
	}

}
