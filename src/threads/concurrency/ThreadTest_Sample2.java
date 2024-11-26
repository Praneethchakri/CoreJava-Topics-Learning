package threads.concurrency;

public class ThreadTest_Sample2 {
    public static void main(String[] args) {

        Thread t1 = new Thread("ThreadOne");
        t1.setName("Test123");
        System.out.println(t1.getState());
        t1.run();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread());
        System.out.println(t1.getState());

    }
}
