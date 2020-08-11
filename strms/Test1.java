package strms;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// Creating an integer Stream and displaying its content by for each
		int[] ints= {12,34,2,3,4,56,100,-10};
		Arrays.stream(ints).forEach(i->System.out.println(i));
		
		//using method reference
		Arrays.stream(ints).forEach(System.out::println);
		
		System.out.println("Average "+Arrays.stream(ints).average());
		
		System.out.println(Arrays.stream(ints).count());
		
		System.out.println(Arrays.stream(ints).sum());
		
		System.out.println(Arrays.stream(ints).min());
		
		System.out.println(Arrays.stream(ints).max());
		
		
		

	}

}
