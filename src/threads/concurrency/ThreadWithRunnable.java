package threads.concurrency;

public class ThreadWithRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Creating  the Thread by implementing the Runnable Interface");
    }

    public static void main(String[] args) {
        ThreadWithRunnable tr = new ThreadWithRunnable();
        tr.run();
    }
}
