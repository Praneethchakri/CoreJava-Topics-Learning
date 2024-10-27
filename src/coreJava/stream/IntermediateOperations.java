package coreJava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("Praneeth", "Chakravarthi", "Diguvapalem", "Germany", "India");

		List<String> result = stringList.stream().filter(name -> name.length() > 3).map(String::toUpperCase)
				.flatMap(name -> Stream.of(name.split("")))
				.distinct()
				.sorted((name1, name2) -> name2.compareTo(name1))
				.limit(10)
				.skip(2)
				.peek(System.out::println).collect(Collectors.toList());

		System.out.println("RESULT OUTPUT " + result);
	}

}
