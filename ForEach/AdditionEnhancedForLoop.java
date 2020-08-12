package foreach;

import java.util.Scanner;

public class AdditionEnhancedForLoop {
	
	int[] a;
	int size;
	Scanner sc;
	
	void acceptArraySize(){
		sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		a=new int[size];
	}
	
	void acceptNumbers() {
		System.out.println("Enter "+size+" no of elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	int addNumbers() {
		int sum=0;
		
		for(int z:a) {
			sum+=z;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		AdditionEnhancedForLoop a=new AdditionEnhancedForLoop();
		a.acceptArraySize();
		a.acceptNumbers();
		System.out.println("Sum is:"+a.addNumbers());
		
		
	}

}
