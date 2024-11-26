package threads.concurrency;

public class ThreadTest_Sample3 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Name "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadTest_Sample3 threadTest_sample3 = new ThreadTest_Sample3();
        Thread threadCreated = new Thread(threadTest_sample3);
        threadCreated.start();
    }
}
