package coreJava.lambda.topics.consumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer1 = (a, b) -> System.out
				.println("FirstParam:  " + a + ", Second Param:: " + b);

		biConsumer1.accept("Practice", "Patience");

		BiConsumer<Integer, Integer> addtion = (x, y) -> System.out.println("Addtion :" + (x + y));
		BiConsumer<Integer, Integer> substration = (x, y) -> System.out.println("Substraction " + (x - y));
		BiConsumer<Integer, Integer> multiplcation = (x, y) -> System.out.println("Multiplication " + (x * y));
		BiConsumer<Integer, Integer> division = (x, y) -> System.out.println("Division " + (x / y));

		addtion.andThen(substration).andThen(multiplcation).andThen(division).accept(10, 20);
//		30,-10,200,0

		
		
		BiConsumer<String, List<String>> studentConsumer = (name, activites) -> System.out
				.println(String.format("Name : %s, Activites:  %s", name, activites));

		List<Student> data = StudentData.getStudentList();

		data.forEach(student -> studentConsumer.accept(student.getName(), student.getActivities()));

	}

}
