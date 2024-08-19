package coreJava.lambda.topics;

public class LambdaExpressionPractice {
	public static void main(String[] args) {

		FunctionInterface1 obj1 = () -> System.out.println("checking functional Interface Method ");
		obj1.testDAta();

		FunctionInterfaceAdd adding = (x, y) -> x + y;
		System.out.println(adding.add(5, 6));

		FunctionalInterfaceDivision divisionObject = (arg1, arg2) -> arg1 == 0 ? 0 : arg1 / arg2;

		System.out.println(divisionObject.nonZeroDivision(10, 5));
		
		
		
		FunctionaInterfaceStringReverse stringReverse =(name)->{
			String reversString = "";

			for (int i = name.length() - 1; i >= 0; i--) {
				reversString = reversString + name.charAt(i);
			}
			return reversString;
		};
		
		System.out.println(stringReverse.reverseString("Praneeth"));

	}

	public int add(int i, int j) {
		return i + j;
	}

	public int nonZeroDivide(int arg1, int arg2) {
		if (arg1 == 0) {
			return 0;
		}
		return arg1 / arg2;
	}

	public String reverseString(String name) {
		String reversString = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reversString = reversString + reversString.charAt(i);
		}
		return reversString;
	}
}
