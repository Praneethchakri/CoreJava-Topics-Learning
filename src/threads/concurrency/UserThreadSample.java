package threads.concurrency;

public class UserThreadSample {
    public static void main(String[] args) {

        Thread userThread = new Thread(()->{
            System.out.println("User thread running..");
        });
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userThread.start();
        System.out.println("Main Thread completed..");
    }
}
