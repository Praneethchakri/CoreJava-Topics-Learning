package coreJava.lambda.topics.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;

public class BiPredicateFunctionalInterface {

	BiPredicate<Double, Short> biPredicate = (grade, gcp) -> grade >= 75 && gcp >= 4;

	BiConsumer<String, List<String>> biConuserData = (name, activites) -> System.out
			.println(String.format("Name:: %s, Activites :%s ", name, activites));

	Consumer<Student> consumerData = (student->{
		if(biPredicate.test(student.getGrade(), student.getGcp())) {
			biConuserData.accept(student.getName(), student.getActivities());
		}
	});

	public void printData(List<Student> studentList) {
		studentList.forEach(consumerData);
	}

	public static void main(String[] args) {
		new BiPredicateFunctionalInterface().printData(StudentData.getStudentList());
	}

}
