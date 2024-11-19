package coreJava.lambda.topics.function;

import java.util.function.Function;

public class Function_FunctionalInterface {
	static Function<String,String> function1 = (name)->name.concat("TestData");
	
	static Function<String, String> function = (name)->name.toUpperCase();
	public static void main(String[] args) {
		System.out.println(function.andThen(function1).apply("Praneeth"));
		System.out.println(function.compose(function1).apply("Praneeth"));
	}
}
