package threads.concurrency;

import java.math.BigInteger;

public class ThreadInteruption_Topic {
    public static void main(String[] args) {

        Thread t = new Thread(new BlockingTask());
        t.start();
        t.interrupt();

        Thread t1 = new Thread(new LongComputationTask(new BigInteger(String.valueOf(20000000)),new BigInteger(String.valueOf(1000000))));
        t1.start();
    }

    private static class BlockingTask implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Exiting Block Thread ...");
            }

        }
    }
    private static class LongComputationTask implements Runnable{
        private  BigInteger base;
        private  BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base+"^"+power+" = "+pow(base,power));

        }

        private BigInteger pow(BigInteger base,BigInteger power){
            BigInteger result = BigInteger.ONE;
            for(BigInteger i = BigInteger.ZERO; i.compareTo(power)!=0 ;i=i.add(BigInteger.ONE)){
                result = result.multiply(base);
            }
            return result;
        }
    }

}
