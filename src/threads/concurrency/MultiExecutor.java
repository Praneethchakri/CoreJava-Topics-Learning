package threads.concurrency;

import java.util.*;


public class MultiExecutor {

    // Add any necessary member variables here


    private final List<Runnable> tasks;


    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here

        this.tasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
        List<Thread> threadsList = new ArrayList<>(tasks.size());

        for(Runnable runnableTask: tasks){
            Thread thread = new Thread(runnableTask);
            threadsList.add(thread);
        }
        for(Thread thread : threadsList)
            thread.start();


    }
}