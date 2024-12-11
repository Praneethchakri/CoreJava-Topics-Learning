package threads.concurrency;

public class TaskRunner {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new NumberCountingTask());
        Thread thread1 = new Thread(new AlphabatReadingTask("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            thread1.start();

    }
}
