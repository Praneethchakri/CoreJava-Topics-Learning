package threads.concurrency;

public class DaemonThreadTologMessage implements Runnable{

    @Override
    public void run() {
        System.out.println("Running Daemon Thread!!!");

    }
}
