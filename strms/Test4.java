package strms;

import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		// Creating stream of ints between 1-100 & display all even nos
		IntStream.range(1, 101).filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
		
		// sum of numbers between 10-50.
		System.out.println("\n Sum = " + IntStream.rangeClosed(10, 50).sum());
		
		//average between 10-50.
		 IntStream.rangeClosed(10,50).average().orElse(-100);
		 
		 //output display
		System.out.println("Avg " +IntStream.range(10,10).average().orElse(-100));
		
		//Printing avg of odd numbers between 10-50
		double avgVal=IntStream.rangeClosed(10, 50).filter(i->i % 2 != 0).average().getAsDouble();
		System.out.println(avgVal);
		
		//printing avg of square of all odd numbers between 1-100
		avgVal=IntStream.rangeClosed(1, 100).filter(i-> i%2 != 0).map(i->i*i).average().getAsDouble();
		
		//printing avg of square root of all odd numbers between 1-100
		avgVal=IntStream.rangeClosed(1, 100).filter(i-> i%2 != 0).mapToDouble(i->Math.sqrt(i)).average().getAsDouble();

	}

}
