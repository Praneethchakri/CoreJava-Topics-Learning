package coreJava.lambda.topics.predicate;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;

import java.util.List;
import java.util.function.Predicate;

public class PredicateWithObject {

	static Predicate<Student> p1 = (s) -> s.getGrade() <= 61.0;
	static Predicate<Student> p2 = (s1) -> s1.getGcp() < 2;

	public static void getStudentList() {
		List<Student> list = StudentData.getStudentList();

		list.forEach(student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void getStudentListByGcp() {

		List<Student> studentList = StudentData.getStudentList();

		studentList.forEach(student -> {
			if (p2.test(student)) {
				System.out.println(student);
			}

		});
	}

	public static void topGradeStudents() {
		List<Student> data = StudentData.getStudentList();
		data.forEach(toppers -> {

			if (p2.negate().test(toppers)) {
				System.out.println("Toppers >2 " + toppers);
			}
		});

	}

	public static void main(String[] args) {
		getStudentList();
		getStudentListByGcp();
		topGradeStudents();
	}

}
