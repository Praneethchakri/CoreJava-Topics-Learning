package threads.concurrency;

public class Threading_Creation {

	public static void main(String[] args) {

		Task task = new Task();
		task.start();
		System.out.println("Hello!!");
		task.start();
		// if we try to start the same thread again, it is an illegal process to start
		// thread ,,which already started.
		// Exception is :: IlleagalThreadStateException
	}

}

class Task extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}

}
