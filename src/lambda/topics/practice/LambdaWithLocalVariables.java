package lambda.topics.practice;

import java.util.function.Consumer;

/**
    Any Method which is declared in side a method is called Local Variable
 --> Lambda's have some restirctions in using the localvariables

    Restriction 1: Not allowed to use the same name of local variable name as the lambda parameter or inside the lambda body
    Restriction 2: Not allowed to reassign the value to a local variable

 No restrcition of change on instance variable
 */
public class LambdaWithLocalVariables {
    static String name = "Praneeth";//instance variable
    static int i=7;
    static double d1 = 4.5;
    public static void main(String[] args) {
        int x=7;
        Consumer<Integer> consumer = (integer)->{
//            Consumer<Integer> consumer = (i)->{ // not Allowed as lambda parameter with the same method/local varible
//            int i = 8; // Not allowed to inside the lambda body as well
            System.out.println(i);
        };
        consumer.accept(i);

        Consumer<String> nameConumser = (name)->{
           name = "Diguvapalem Praneeth";
            System.out.println("Name "+name);
        };
        nameConumser.accept(name);

        Consumer<Integer> consumer1 = (i)->{
            i=9;
            System.out.println("Integer Value "+i);
        };
        consumer1.accept(i);

//        double d1 = 4.3;//if we keep this d1 variable out side the main method
        // we can  do the modification in the lambda body  as well as we can use as lamda parameter

        Consumer<Double> doubleConsumer = (d1)->{
            d1++;
            System.out.println(d1);
        };
        doubleConsumer.accept(d1);





    }
}
