package coreJava.lambda.topics.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionI {
	static Comparator<Integer> binaryOpertor = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {

		Integer i = BinaryOperator.minBy(binaryOpertor).apply(2, 5);
		System.out.println("Result " + i);

		Integer i1 = BinaryOperator.maxBy(binaryOpertor).apply(4, 7);
		System.out.println("Result i1 " + i1);

	}

}
