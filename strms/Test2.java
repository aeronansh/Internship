package strms;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// Create int[] ---> IntStream & display its contents.
		int[] ints= {12,34,2,3,4,56,100,-10};
		ArrayList<Integer> l1=new ArrayList<>();
		for(int i : ints)
			l1.add(i);
		//sequential stream
		System.out.println("Seq stream");
		l1.stream().forEach(i->System.out.print(i+" "));
		System.out.println("\n parallel stream");
		l1.parallelStream().forEach(i->System.out.print(i+" "));

	}

}
