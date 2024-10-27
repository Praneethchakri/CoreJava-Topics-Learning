package coreJava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractical {
	
	public static void main(String[] args) {
//		range(int startRange, int endRange)
		IntStream.range(1, 10)// non inclusive of last value
		.skip(5)// intermediate operation, which skips first 5 elements from source
		.forEach(x->System.out.println(x));
		
		
//		sum()
		int sum = IntStream.range(1, 10)
				.sum();
		
		System.out.println("Sum of Integers "+sum);
		
		
		
		Stream.of("Praneeth","PrajnaSri","Sushma")
		.sorted()
		.findFirst()
		.ifPresent(name->System.out.println(name));
		
		
		System.out.println("\n");
		String[] nameArrays = {"Germany","Praneeth","Sushma","Chakravarthi","Prajnasri","Diguvapalem"};
		
		Stream.of(nameArrays)
		.filter(name-> name.startsWith("P"))//intermediate operation
		.sorted()// intermediate operation
		.forEach(System.out::println);//terminal Operation
		
		
		
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(x -> x*x)//intermediate operation
		.average()//terminal Operation
		.ifPresent(n->System.out.println(n));
		
		
		List<String> names = Arrays.asList("Praneeth","America","Germany","China","Finland","India","PrajnaSri");
		
		names.stream()
		.map(name->name.toLowerCase())
		.filter(name->name.startsWith("p"))
		.sorted()
		.forEach(name->System.out.println(name));
		
		
		
	}
	
	

}
