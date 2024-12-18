package coreJava.lambda.topics.supplier;

import java.util.Arrays;
import java.util.function.Supplier;

import coreJava.lambda.topics.consumer.Student;

public class SupplierFIExample {
	public static void main(String[] args) {
		Supplier<Student> getStudent = () -> {
			return new Student(1, "Praneeth", "Germany", 76.3, (short) 4,
					Arrays.asList("Coding", "Medication", "ReadingBooks"),Arrays.asList("Social", "Science", "Maths"),Arrays.asList(1,23,23,32));
		};
		System.out.println(getStudent.get());

	}

}
