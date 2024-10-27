package functionalInterface.programs;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionaInterface_accept {

	static Consumer<Student> consumer1 = (student) -> System.out.println(student.getGcp() >= 3 ? student : " ");
	static Consumer<String> consumer2 = (s) -> System.out.println(s.toUpperCase());

	public static void printStudent() {
		List<Student> studentList = StudentData.getStudentList();
		studentList.forEach(consumer1);
	}

	public static void main(String[] args) {

		printStudent();

	}

}
