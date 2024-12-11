package functionalInterfaces.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateFunctionalInterface{
    public static void main(String[] args) {

//        List<String> names = Arrays.asList("Praneeth","Test","Life");

        Supplier<List<String>> listOfNames = ()->Arrays.asList("Praneeth","Test","Life");
        List<String> nameList = listOfNames.get();

        Consumer<String> conusmer = (name -> System.out.println("Names: "+name));
         nameList.stream().forEach(conusmer);

        Supplier<List<String>> supplier  = ()->{
            return nameList;
        };
        System.out.println(supplier.get());


        Predicate<String> predicate = (name) -> name.length()>4;
        nameList.stream().filter(predicate).forEach(conusmer);

        Function<String,String> function = (name)->name.toUpperCase();

        nameList.stream().filter(predicate)
                .map(function)
                .forEach(conusmer);

        /**
         *
         * Intermediate Operations
         *          -->NoParameter for Supplier's get() method return type  Supplier<List<String>> supplier = ()->Arrays.asList("test","test1","tst2");
         * filter() -->parameter:: predicate
         * map() --> parameter::function
         * forEach()-->parameter::consumer
         */


    }
}