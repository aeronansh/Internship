package lab1;

import java.util.Scanner;

public class Client {
	
	Scanner sc;
	
	void acceptOperation() {
		sc=new Scanner(System.in);
		
		System.out.println("Enter the number of Persons you want to create");
		int size=sc.nextInt();
		Person[] p=new Person[size];
		
		String repeat;
		do {
			
		System.out.println("Enter the object you want to create");
		System.out.println("1. Person 2. Employee 3. Manager 4. Display");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter person details name age");
				String name=sc.next();
				int age=sc.nextInt();
				p[0]=new Person(name,age);
				break;
		
		case 2: System.out.println("Enter emp details name age eid basicsal");
				p[1]=new Employee(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
				break;
				
		case 3: System.out.println("Enter manager details name age eid basicsal allowance");
				p[2]=new Manager(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
				break;
				
		case 4: 	for(Person x:p)
					{
						System.out.println(x.toString());
					}
					break;
		
		default : System.out.println("Incorrect choice");
				  break;
		}
		
		System.out.println("Do you want to repeat operation??(Y/N)");
		repeat=sc.next();
		}while(repeat.equalsIgnoreCase("Y"));
		
		System.out.println("BYE BYE!!!");
	}
	
	public static void main(String[] args) {
		
		Client c=new Client();
		c.acceptOperation();
		
		
		
	}

}
