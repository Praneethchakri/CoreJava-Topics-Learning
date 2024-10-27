package functionalInterface.programs;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample {
	static Predicate<Integer> p1_even = (x) ->{return x%2==0; };
	static Predicate<Integer> p2_odd =(y)-> y%2 != 0;
	public static void main(String[] args) {
		
		System.out.println(p1_even.test(5));
		System.out.println(p1_even.or(p2_odd).negate().test(5));
		
	}

}
