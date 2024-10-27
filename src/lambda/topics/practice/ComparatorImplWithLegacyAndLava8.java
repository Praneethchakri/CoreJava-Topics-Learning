package lambda.topics.practice;

import java.util.Comparator;

public class ComparatorImplWithLegacyAndLava8 {
	public static void main(String[] args) {

		Comparator<Integer> legacyComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Legacy Comparator where o2 > o1  " + legacyComparator.compare(5, 10));// -1 because 02 > 01

		System.out.println("Legacy Comparator where o1> o2 " + legacyComparator.compare(10, 9)); // 1 because o1 > o2
		System.out.println("Legacy Comparator where o1= o2 " + legacyComparator.compare(10, 10)); // 0 because o1 = o2
		
		
		/**
		 * Java 8 with Lambda Impl.
		 */
		
		Comparator<Integer> lambdaComparator = (a,b) ->a.compareTo(b);
		System.out.println("lambdaComparator Comparator where o2 > o1  " + lambdaComparator.compare(5, 10));
		System.out.println("lambdaComparator Comparator where o2 > o1  " + lambdaComparator.compare(10, 9));
		System.out.println("lambdaComparator Comparator where o2 > o1  " + lambdaComparator.compare(10, 10));
	}

}
