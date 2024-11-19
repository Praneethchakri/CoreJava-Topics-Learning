package coreJava.lambda.topics.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;
import coreJava.lambda.topics.predicate.PredicateWithObject;

public class FunctionFI_WithhStudentExample {

	static Function<List<Student>, Map<String, Double>> studentFunctional1 = (students -> {
		Map<String, Double> map = new HashMap();

		students.forEach(student -> {
			if (PredicateWithObject.p1.test(student)) {
				map.put(student.getName(), student.getGrade());
			}
		});

		return map;

	});

	public static void main(String[] args) {
		System.out.println(FunctionFI_WithhStudentExample.studentFunctional1.apply(StudentData.getStudentList()));
	}
}
