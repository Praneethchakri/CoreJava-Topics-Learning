package threads.concurrency;

public class NumberCountingTask implements  Runnable{

    @Override
    public void run() {
        System.out.println("Number Count Task...Started");
        for(int i =0;i<10;i++){
            System.out.println("Numbers "+i);
        }
    }

}
