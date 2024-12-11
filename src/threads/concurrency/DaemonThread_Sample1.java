package threads.concurrency;

public class DaemonThread_Sample1 {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Thread Executing....");
        });
        thread.setName("Thread-1 Praneeth");
        thread.start();
        thread.setDaemon(true);
        System.out.println(Thread.currentThread().getName());
        System.out.println(thread.getState());
    }
}
