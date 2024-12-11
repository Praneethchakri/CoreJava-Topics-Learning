package coreJava.lambda.topics.intermediate;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams_flatMap {
    public static void main(String[] args) {

        System.out.println( studentActivites());
        System.out.println(studentSubjectNames());
        System.out.println(studentSubjectNamesList());


        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,223,23,323,43,45,56,56,45,5,63);
        Function<List<Integer>, Stream<Integer>> functionalStream = numbersList->numbersList.stream();

       StudentData.getStudentList().stream()
               .map(Student::getRollNumbers)
               .flatMap(functionalStream)
               .collect(Collectors.toSet())
               .forEach(System.out::println);


    }

    public static List<String> studentActivites(){
        return StudentData.getStudentList().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
    public static List<String> studentSubjectNamesList(){
        return StudentData.getStudentList().stream()
                .map(Student::getSubjects)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }


    public static Set<String> studentSubjectNames(){
        /**
         * Function functional interface is used to convert using the method R apply(Tt)  to Return Type R
         */
        Function<List<String>,Stream<String>> convertActivities = (subjects)-> subjects.stream();

    return StudentData.getStudentList().stream()
            .map(Student::getSubjects)
            .flatMap(convertActivities)
            .map(String::toUpperCase)
            .collect(Collectors.toSet());
    }
}
