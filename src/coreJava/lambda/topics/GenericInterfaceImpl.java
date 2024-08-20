package coreJava.lambda.topics;

public class GenericInterfaceImpl {
	public static void main(String[] args) {

		GenericInterface<String> stringReverser = (name) -> {
			String reverseString = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				reverseString = reverseString + name.charAt(i);
			}
			return reverseString;
		};

		System.out.println(stringReverser.process("hteenarP"));

		System.out.println("Test " + reverseStringData("Praneeth"));

		System.out.println(doubleTheInteger(123));

		GenericInterface<Double> dobleTheInteger = (number) -> {
			double d = Double.valueOf(number);
			return d;
		};
		
		

		System.out.println(doubleTheInteger(1234));
	}

	public static String reverseStringData(String str) {
		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		return reverseString;
	}

	public static double doubleTheInteger(int number) {
		double d = Double.valueOf(number);
		return d;
	}

}
