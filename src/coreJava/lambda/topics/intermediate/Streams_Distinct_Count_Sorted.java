package coreJava.lambda.topics.intermediate;

import coreJava.lambda.topics.consumer.Student;
import coreJava.lambda.topics.consumer.StudentData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams_Distinct_Count_Sorted {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Praneeth","Pramaesh","Prameshwar","Anurag","Ankit","Humera","TazeenSaba","Mohammadii","Praneeth","Humera");

             long nameCount = names.stream().count();
        System.out.println(nameCount);
        System.out.println("Distinct Names");
             names.stream().distinct().forEach(System.out::println);
        System.out.println("Sorted Names-Natural Sorting Order");
             names.stream().sorted().forEach(System.out::println);
        System.out.println(StudentData.getStudentList().stream()
                .map(Student::getName)
                .sorted()
                .distinct()
                .count());
        System.out.println("Sort By Address ");
        StudentData.getStudentList().stream()
                .sorted(Comparator.comparing(Student::getAddress))
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Sort By Grade ");
        StudentData.getStudentList().stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);




    }
}
