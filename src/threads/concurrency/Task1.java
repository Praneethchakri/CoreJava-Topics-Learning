package threads.concurrency;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    private static class VegitableCutting implements Runnable {

        @Override
        public void run() {
            System.out.println("Carrot Cutting Task");
        }
    }

    private static class CookingEggs implements Runnable {

        @Override
        public void run() {
            System.out.println("CookingEggs Task");
        }
    }
    private static class Dishwashing implements Runnable {

        @Override
        public void run() {
            System.out.println("Dishwashing Task");
        }
    }

    public static void main(String[] args) {

        List<Runnable> tasks = new ArrayList<>();
            tasks.add(new VegitableCutting());
            tasks.add(new CookingEggs());
            tasks.add(new Dishwashing());
        MultiExecutor multiExecutor = new MultiExecutor(tasks);
        multiExecutor.executeAll();
    }
}
