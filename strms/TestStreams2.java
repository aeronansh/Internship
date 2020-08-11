package strms;

import java.util.stream.IntStream;

public class TestStreams2 {

	public static void main(String[] args) {
		System.out.println("Testing stream's lazy  evaluation");
		IntStream in = IntStream.of(10, 45, -19, 40, 30, 45, 27);
		in.filter(i -> {
			System.out.println("1");
			return i > 10;
		}).map(i -> {
			System.out.println("2");
			return i * 2;
		}).forEach(i -> {
			System.out.println("3");
		});
		
		

	}

}
