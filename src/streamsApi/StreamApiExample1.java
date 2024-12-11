package streamsApi;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiExample1 {

    public static void main(String[] args) {

        Predicate<Student> filterByGrade = (student -> student.getGrade()>=3);

        Predicate<Student> filterByAddress = (
                student -> {
            return student.getAddress().equalsIgnoreCase("Bangalore");
                }
        );
        Map<String, List<String>> studWithActivites = StudentData.getStudentList().stream()
                .filter(filterByGrade)
                .filter(filterByAddress)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studWithActivites);
    }
}
