package threads.concurrency;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VaultProgram {
private static final int MAX_NUMBER = 9999;


    public static void main(String[] args) {
        Random random = new Random();
        Vault v = new Vault(random.nextInt(MAX_NUMBER));
        List<Thread> threadList = new ArrayList<>();
            threadList.add(new AscendingThread(v));
            threadList.add(new DescendingThread(v));
            threadList.add(new PoliceThread());

            for(Thread t : threadList)
                    t.start();



    }

    public static class Vault{
        private int passcode;

        public Vault(int passcode) {
            this.passcode = passcode;
        }
        public boolean isCorrectPasscode(int guess){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           return this.passcode == guess;
        }
    }

    private abstract static class HackerThread extends Thread{
        protected Vault vault;

        public HackerThread( Vault vault) {
            this.vault = vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(MAX_PRIORITY);
        }

        @Override
        public void start() {
            System.out.println("Thread Name "+this.getName());
            super.start();
        }
    }
    private static class AscendingThread extends  HackerThread{

        public AscendingThread(Vault vault) {
            super(vault);
        }
        @Override
        public void run() {
            for(int guess = 0;guess<=MAX_NUMBER;guess++){
                if(vault.isCorrectPasscode(guess)){
                    System.out.println("Thread Name "+this.getName()+" Gussed PassCode "+guess);
                    System.exit(0);
                }

            }
        }
    }
    private  static class DescendingThread extends HackerThread{
        public DescendingThread(Vault vault) {
            super(vault);
        }
        @Override
        public void run() {
            for(int guess =MAX_NUMBER;guess>0;guess--){
                if(vault.isCorrectPasscode(guess)){
                    System.out.println("Thread Name "+this.getName()+" Guessed PassCode :: "+guess);
                }
            }
        }
    }

    private static class PoliceThread extends  Thread{
        @Override
        public void run() {
            for(int i=10;i>0;i--){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
            System.out.println("Game Over ... Police Thread Caught");
            System.exit(0);
        }
    }

}
