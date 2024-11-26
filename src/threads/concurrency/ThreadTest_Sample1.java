package threads.concurrency;

public class ThreadTest_Sample1 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() ->{
                System.out.println("Thread Name"+Thread.currentThread().getName()+" With Priority :"+Thread.currentThread().getPriority());
                int age = 33;
                int result  = age/0;

            System.out.println("After RunTime/Uncached Exceptions caught !!!");
        });

        Thread thread1 = new Thread(()->{
            System.out.println("Next Thread Started..."+Thread.currentThread().getName());
                String name = null;
            int length  = name.length();
            System.out.println(length);

        });

        System.out.println("Before Main Thread  Starts "+Thread.currentThread().getName());
        thread.setName("Custom Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
//        Thread.sleep(1000);
        thread1.start();
//        thread.setName("Inside Main Thread");
//        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("After Main Thread  Starts "+Thread.currentThread().getName());
//        Thread.sleep(10000);
     Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
         @Override
         public void uncaughtException(Thread t, Throwable e) {
             System.out.println("Thread Name "+ t.getName()+" , Exception Message : "+e.getMessage());
         }
     });
    }

}
