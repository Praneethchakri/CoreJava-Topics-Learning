package functionalInterface.programs;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateExample {

	Predicate<Student> p1 = (s) -> s.getGrade() > 75;
	Predicate<Student> p2 = (s1) -> s1.getGcp() >=4;

	BiConsumer<String, List<String>> result = (name, activites) -> System.out
			.println(String.format("NAME: %s, ACTIVITES::%s", name, activites));

	Consumer<Student> studentConsumer = (student -> {
		if (p1.and(p2).test(student)) {
			result.accept(student.getName(), student.getActivities());
		}
	});

	public void printStudentDetails(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> data = StudentData.getStudentList();
		new ConsumerAndPredicateExample().printStudentDetails(data);

	}

}
