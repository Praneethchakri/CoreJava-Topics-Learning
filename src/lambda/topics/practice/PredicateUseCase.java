package lambda.topics.practice;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateUseCase {


    public static List<BusinessUser> getData(){
        List<BusinessUser> data = new ArrayList<>();
            data.add(new BusinessUser(123,"Praneeth","India",new BigInteger("1023123"),LocalDate.of(2014,02,24)));
            data.add(new BusinessUser(124,"Suresh","China",new BigInteger("102312323"),LocalDate.of(2015,12,24)));
            data.add(new BusinessUser(125,"Harish","India",new BigInteger("11231232"),LocalDate.of(2016,10,24)));
            data.add(new BusinessUser(126,"Ramesh","USA",new BigInteger("122312323"),LocalDate.of(2017,02,24)));

            return data;

    }
    public static void main(String[] args) {
        /**
         * Predicate  boolean test(T t);
         * Consumer void accept(T t)
         */

        Predicate<BusinessUser> salaryCheck  = (businessUser)-> businessUser.getSalary().compareTo(new BigInteger("12000000"))>0;

        List<BusinessUser> data = PredicateUseCase.getData();

//        data.stream().filter(salaryCheck).forEach(result -> System.out.println(result));

        Predicate<BusinessUser> regionCheck = (businessUser -> businessUser.getRegion().equalsIgnoreCase("India"));

        List<BusinessUser> indianUserWithhighestSalary = data.stream().filter(regionCheck.or(salaryCheck)).collect(Collectors.toList());

                           indianUserWithhighestSalary.forEach(System.out::println);
        System.out.println("Salary Bet Range ");
        Predicate<BusinessUser> salaryBtwRange = (businessUser ->
            businessUser.getSalary().compareTo(new BigInteger("10000000"))>0
                    &&
             businessUser.getSalary().compareTo(new BigInteger("130000000"))<0
        );
        data.stream().filter(salaryBtwRange).forEach(System.out::println);


        System.out.println("Date Range Between ::");

        LocalDate joiningDate = LocalDate.of(2014,02,24);
        LocalDate currentDate = LocalDate.of(2024,11,06);
        Period exp = Period.between(joiningDate,currentDate);

        System.out.println(exp.getYears());
        System.out.println(exp.getMonths());
        System.out.println(exp.getDays());

        Predicate<BusinessUser> joinedEmployees = (businessUser ->  businessUser.getJoiningDate().isAfter(joiningDate) && businessUser.getJoiningDate().isBefore(currentDate));
        data.stream().filter(joinedEmployees).forEach(System.out::println);






    }
}
