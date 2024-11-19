package coreJava.lambda.topics.function;

public class FunctionReuse {
	public static String printData(String name) {
		
		return Function_FunctionalInterface.function1.compose(Function_FunctionalInterface.function).apply(name);
	}
	public static void main(String[] args) {
		String name = printData("Praneeth");
		System.out.println("Name "+name);
	}

}
