package strms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestStreams {

	public static void main(String[] args) {
		//Collections vs streams
		List<Integer> l1=Arrays.asList(10,45,-19,40,30,45,27);
		System.out.println("Printing list ");
		l1.forEach(i->System.out.println(i));
		System.out.println("Printing list again ");
		l1.forEach(i->System.out.println(i));
	
		
		IntStream in=IntStream.of(10,45,-19,40,30,45,27);
		System.out.println("Printing nums > 20");
		in.filter(i->i>20).forEach(i->System.out.println(i));
		System.out.println("Printing all nums");
		in.forEach(i->System.out.println(i));
		
		
	}

}
