package threads.concurrency;

public class DaemonThreadSample2 {
        public static void main(String[] args) {
            Thread daemonThread = new Thread(() -> {
                while (true) {
                    System.out.println("Daemon thread running...");
                }
            });
            daemonThread.setDaemon(true);
            daemonThread.start();
            System.out.println("Main thread ending...");
        }

}
