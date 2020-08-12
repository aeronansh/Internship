package lab1;

import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		Addition a=new Addition();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two int values");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("addition of int"+a.add(x, y));
		System.out.println("addition of float and int"+a.add(2.3f, 6));
		System.out.println("enter a string");
		String s1=sc.next();
		System.out.println(a.add(s1,"ll", "o"));
	}

}
