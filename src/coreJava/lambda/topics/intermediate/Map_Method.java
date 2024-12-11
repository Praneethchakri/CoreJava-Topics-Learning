package coreJava.lambda.topics.intermediate;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * .map() method which is an intermediate method to transform the data from one form to another form
 */
public class Map_Method {


    public static List<String> nameList(){
        List<Student> studentList = StudentData.getStudentList();

        return studentList.stream()
                .peek((student -> System.out.println(student)))
                .map(Student::getName)
                .peek((name -> System.out.println(name)))
                .map(String::toUpperCase)
                .filter(name->name.length()>5)
                .filter(nameStartsWith -> !nameStartsWith.startsWith("P"))
                .collect(Collectors.toList());
    }

    public static Set<String> namesSet(){
        return StudentData.getStudentList().stream()
                .filter(location->location.getAddress().equalsIgnoreCase("Bangalore"))
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

    }


    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(namesSet());
    }
}
