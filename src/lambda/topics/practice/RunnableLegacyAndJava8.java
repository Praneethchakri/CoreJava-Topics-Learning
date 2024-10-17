package lambda.topics.practice;

public class RunnableLegacyAndJava8 {
	public static void main(String[] args) {

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Before Jave 8 way of Calling funcation interface and its method..");
			}
		};
		new Thread(runnable1).start();

		Runnable runnable2 = () -> {
			System.out.println("With Lambda Expression  a bit simplified version");
		};
		new Thread(runnable2).start();

		new Thread(() -> System.out
				.println("Actual Java 8 version to call the funcational interface using lambda expression")).start();

		new Thread(() -> {
			System.out.println("if multiple lines of exection in lambda expresion..");
			System.out.println("Calling with in the curly braces..");
		}).start();
		;
	}

}
