package streamsApi;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsMapFunction {

    public static void main(String[] args) {
        Set<String> nameSet = StudentData.getStudentList().stream().map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(nameSet);

        List<String> nameList  = StudentData.getStudentList().stream().map(Student::getName).map(String::toLowerCase)
                .collect(toList());
        System.out.println(nameList);
    }


}
