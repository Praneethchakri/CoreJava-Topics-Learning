package coreJava.lambda.topics.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;
import coreJava.lambda.topics.predicate.PredicateWithObject;

public class BiFunctionFunctionalInterface {

	
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = ((students,studentPredicate)->{
		
		Map<String,Double> result = new HashMap<>();
		students.forEach(student->{
			if(studentPredicate.test(student)) {
				result.put(student.getName(), student.getGrade());
			}
		});
		return result;
	});
	
	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentData.getStudentList(), PredicateWithObject.p1));
	}

}
